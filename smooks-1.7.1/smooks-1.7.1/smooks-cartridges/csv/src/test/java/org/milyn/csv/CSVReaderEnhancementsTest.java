/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, JBoss Inc., and others contributors as indicated
 * by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 *
 * (C) 2005-2006, JBoss Inc.
 */
package org.milyn.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import org.milyn.Smooks;
import org.milyn.payload.StringResult;
import org.xml.sax.SAXException;

import javax.xml.transform.stream.StreamSource;
import java.io.IOException;

/**
 * @author <a href="mailto:julien.sirocchi@gmail.com">julien.sirocchi@gmail.com</a>
 */
public class CSVReaderEnhancementsTest {

    @Test
    public void testInvalidLines() throws IOException, SAXException {
        Smooks smooks = new Smooks(getClass().getResourceAsStream("smooks-config-invalidlines.xml"));

        try {
            StringResult result = new StringResult();
            smooks.filterSource(new StreamSource(getClass().getResourceAsStream("input-message-invalidlines.csv")), result);
            assertEquals("<csv-set><csv-record number=\"1\"><firstname>Tom</firstname><lastname>Fennelly</lastname><gender>Male</gender><age>4</age><country>Ireland</country></csv-record>" +
                    "<csv-record number=\"2\"><firstname>Mike</firstname><lastname>Fennelly</lastname><gender>Male</gender><age>2</age><country>Ireland</country></csv-record>" +
                    "<csv-record number=\"3\" truncated=\"true\"><firstname>Julien</firstname><lastname>Sirocchi</lastname><gender>Male</gender></csv-record></csv-set>", result.getResult());
        } finally {
            smooks.close();
        }
    }

}
