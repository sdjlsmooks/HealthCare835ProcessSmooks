/*
	Milyn - Copyright (C) 2006 - 2010

	This library is free software; you can redistribute it and/or
	modify it under the terms of the GNU Lesser General Public
	License (version 2.1) as published by the Free Software
	Foundation.

	This library is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

	See the GNU Lesser General Public License for more details:
	http://www.gnu.org/licenses/lgpl.txt
*/
package org.milyn.delivery.lifecyclecleanup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.delivery.ExecutionLifecycleCleanable;
import org.milyn.delivery.dom.DOMVisitAfter;
import org.milyn.delivery.dom.Phase;
import org.milyn.delivery.dom.VisitPhase;
import org.w3c.dom.Element;

/**
 * @author <a href="mailto:tom.fennelly@gmail.com">tom.fennelly@gmail.com</a>
 */
@Phase(value = VisitPhase.PROCESSING)
public class DomProcessingAfter implements DOMVisitAfter, ExecutionLifecycleCleanable {

    public static boolean cleaned;

    public void visitAfter(Element element, ExecutionContext executionContext) throws SmooksException {
        if(cleaned) {
            fail("Resource shouldn't be cleaned yet!");
        }
    }

    public void executeExecutionLifecycleCleanup(ExecutionContext executionContext) {
        cleaned = true;
    }
}