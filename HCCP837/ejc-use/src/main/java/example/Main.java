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
package example;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.Result;

import org.milyn.io.FileUtils;
import org.xml.sax.SAXException;

import solutions.health.X12HCCProfessional.X12_837.Interchange;
import solutions.health.X12HCCProfessional.X12_837.InterchangeControlTrailer;
import solutions.health.X12HCCProfessional.X12_837.X12837;
import solutions.health.X12HCCProfessional.X12_837.X12837Factory;

/**
 * Simple example of how to use an EJC generated Factory class.
 *
 * @author bardl
 */
public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws SAXException
     */
    public static void main(String[] args) throws IOException, SAXException {

    	System.out.println("File: "+args[0]);
        String ediMessage = new String(FileUtils.readFile(new File(args[0])));
        StringReader ediStream = new StringReader(ediMessage);

        
        // Create the Factory class instance.  This should normally be cached
        // and reused...
        X12837Factory x12837Factory = X12837Factory.getInstance();
        

        // Bind the EDI message stream data into the EJC generated Order model...
        
        Result[] additionalResults = new Result[1000];
        X12837 x12Message = new X12837();
        try {
        	x12Message = x12837Factory.fromEDI(ediStream, additionalResults);
        	System.out.println("Successfully Parsed");
        	//System.exit(0);
        }
        catch (Exception e) {
        	System.out.println("!!!!!!!ERROR Results: "+additionalResults);
        	e.printStackTrace();
        	//System.exit(1);
        }
        //Order order = orderFactory.fromEDI(ediStream);

       // Print some of the populated Order object...
//        InterchangeControl isa = x12Message.getInterchangeControl();
//        System.out.println("ISA: Author"+isa.getAutherInfoQualifier());
//        String authorInforomation = isa.getAuthorInformation();
//        String isacontrol = isa.getInterchangeControlNumber();
//        System.out.println("ISO isacontrol: "+isacontrol);
        
        Interchange isa = x12Message.getInterchange();
        InterchangeControlTrailer iea = isa.getInterchangeControlTrailer();
       
        
        System.out.println();
        System.out.println("Input EDI Message:");
        System.out.println(ediMessage.replaceAll("~", ""));
        System.out.println();
        System.out.println("Populated EJC Generated Model:");
        System.out.println("\tISA.authorInformation:       " + isa.getInterchangeControlHeader().getAuthorInformation());
        System.out.println("\tIEA.InterchangeControlNumber: " + iea.getInterchangeControlNumber());
        System.out.println();

        System.out.println();
        System.out.println("Make some modifications to the model and add an additional OrderItem ...");
        System.out.println();
        x12Message.getInterchange().getInterchangeControlHeader().setAuthorInfoQualifier("99");
        x12Message.getInterchange().getInterchangeControlTrailer().setInterchangeControlNumber(445);
        

        System.out.println();
        System.out.println("Write the modified model to System.out ...");
        System.out.println();

        StringWriter stringWriter = new StringWriter();
        
        x12837Factory.toEDI(x12Message, stringWriter);
        String outputEDI = stringWriter.toString();
        String newOutputEDI = outputEDI.replaceAll("~","~\n");
        System.out.println("OutputEDI: '\n"+newOutputEDI+"'");
    }
}
