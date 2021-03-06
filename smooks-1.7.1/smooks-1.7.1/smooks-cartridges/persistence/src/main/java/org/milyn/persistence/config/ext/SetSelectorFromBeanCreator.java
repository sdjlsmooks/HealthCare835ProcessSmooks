/*
 * Milyn - Copyright (C) 2006 - 2010
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License (version 2.1) as published by the Free Software
 *  Foundation.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 *  See the GNU Lesser General Public License for more details:
 *  http://www.gnu.org/licenses/lgpl.txt
 */

package org.milyn.persistence.config.ext;

import org.milyn.SmooksException;
import org.milyn.cdr.ConfigSearch;
import org.milyn.cdr.Parameter;
import org.milyn.cdr.SmooksConfigurationException;
import org.milyn.cdr.SmooksResourceConfiguration;
import org.milyn.cdr.annotation.ConfigParam;
import org.milyn.cdr.extension.ExtensionContext;
import org.milyn.container.ExecutionContext;
import org.milyn.delivery.dom.DOMVisitBefore;
import org.milyn.javabean.BeanInstanceCreator;
import org.w3c.dom.Element;

import java.util.List;

/**
 * This resource tries to find a sensible default selector if no selector
 * is set on the resource.
 *
 * It does this by searching for the resource that creates the bean which the current resource
 * affects.
 *
 * For instance for the EntityInserter this means that it will set the selector to the same value
 * as the bean creator that creates the bean that needs to be inserted.
 *
 * @author <a href="mailto:maurice.zeijen@smies.com">maurice.zeijen@smies.com</a>
 */
public class SetSelectorFromBeanCreator implements DOMVisitBefore {

    @ConfigParam
    private String selectorAttrName;

    public void visitBefore(Element element, ExecutionContext executionContext) throws SmooksException {
        ExtensionContext extensionContext = ExtensionContext.getExtensionContext(executionContext);
        SmooksResourceConfiguration config = extensionContext.getResourceStack().peek();

        if(config.getSelector() == null || config.getSelector().equals("none")) {
            Parameter beanIdParam = config.getParameter("beanId");
            String beanId = beanIdParam.getValue();

            SmooksResourceConfiguration beanCreatorConfig = findBeanCreatorConfig(beanId, extensionContext);

            if(beanCreatorConfig == null) {
                throw new SmooksConfigurationException("No <jb:bean> configurations is found yet for beanId '" + beanId + "'. " +
                        "This can mean that no <jb:bean> is present that creates the bean with the bean id or that it is configured after the <" + element.getNodeName() + ">. " +
                         "In this case you must set the selector in the '" + selectorAttrName + "' attribute.");
            } else {
                config.setSelector(beanCreatorConfig.getSelector());
            }
        }
    }

    public SmooksResourceConfiguration findBeanCreatorConfig(String beanId, ExtensionContext extensionContext) {
        List<SmooksResourceConfiguration> creatorConfigs = extensionContext.lookupResource(new ConfigSearch().resource(BeanInstanceCreator.class.getName()).param("beanId", beanId));

        if(creatorConfigs.size() > 1) {
            throw new SmooksConfigurationException("Multiple <jb:bean> configurations exist for beanId '" + beanId + "'. " +
                        "In this case you must set the selector in the '" + selectorAttrName + "' attribute because Smooks can't select a sensible default.");
        }
        if(creatorConfigs.size() == 1) {
            return creatorConfigs.get(0);
        }
        return null;
    }
    
}
