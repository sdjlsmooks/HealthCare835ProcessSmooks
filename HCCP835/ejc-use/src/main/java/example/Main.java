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

import org.milyn.io.FileUtils;
import org.xml.sax.SAXException;

import solutions.health.X12HCCProfessional.X12_835.ClaimSIQuantity;
import solutions.health.X12HCCProfessional.X12_835.ClaimSPI;
import solutions.health.X12HCCProfessional.X12_835.FunctionalGroup;
import solutions.health.X12HCCProfessional.X12_835.Interchange;
import solutions.health.X12HCCProfessional.X12_835.InterchangeControlTrailer;
import solutions.health.X12HCCProfessional.X12_835.Loop2000Detail;
import solutions.health.X12HCCProfessional.X12_835.Loop2100ClaimPaymentInformation;
import solutions.health.X12HCCProfessional.X12_835.Loop2110SPI;
import solutions.health.X12HCCProfessional.X12_835.TransactionSet;
import solutions.health.X12HCCProfessional.X12_835.X12835;
import solutions.health.X12HCCProfessional.X12_835.X12835Factory;

/**
 * Simple example of how to use an EJC generated Factory class.
 *
 * @author bardl
 */
public class Main {

    public static void main(String[] args) throws IOException, SAXException {
    	System.out.println("SDJL BEGIN: FileName: '"+args[0]+"'");
        String ediMessage = new String(FileUtils.readFile(new File(args[0])));
        //String woTilde = ediMessage.replace("~", "");
        StringReader ediStream = new StringReader(ediMessage);
        
        
        // Create the Factory class instance.  This should normally be cached
        // and reused...
        
        X12835Factory x12835Factory = X12835Factory.getInstance();
        

        // Bind the EDI message stream data into the EJC generated Order model...
        try {
        	X12835 x12Message = x12835Factory.fromEDI(ediStream);
            System.out.println("Successfully parsed");
        }
        catch (Exception e) {        	
        	System.out.println("*****ERROR*****");
        	System.out.println(e.getCause().toString());
        	e.printStackTrace();
        	System.out.println("SDJL ERROR END");
        	System.exit(1);
        }
        finally {
        	System.out.println("SDJL END");
        }

        //Order order = orderFactory.fromEDI(ediStream);

        
        /*
       // Print some of the populated Order object...
        Interchange isa = x12Message.getInterchange();
        InterchangeControlTrailer iea = isa.getInterchangeControlTrailer();

        
        System.out.println();
        System.out.println("Input EDI Message:");
        System.out.println(ediMessage);
        System.out.println();
        System.out.println("Populated EJC Generated Model:");
        System.out.println("\tISA.authorInformation:       " + isa.getInterchangeControlHeader().getAutherInfoQualifier());
        System.out.println("\tIEA.InterchangeControlNumber: " + iea.getInterchangeControlNumber());
        System.out.println("BPR: "+isa.getFunctionalGroup().getTransactionSet().getFinancialInformation().getAccountNumber());
        System.out.println("BPR: "+isa.getFunctionalGroup().getTransactionSet().getFinancialInformation().getDate());
        System.out.println();

        System.out.println();
        System.out.println("Make some modifications to the model and add an additional OrderItem ...");
        System.out.println();
        x12Message.getInterchange().getInterchangeControlHeader().setAutherInfoQualifier("99");
        x12Message.getInterchange().getInterchangeControlTrailer().setInterchangeControlNumber(445);
        
        
        Interchange isa2Mod = x12Message.getInterchange();
        FunctionalGroup fg2Mod = isa2Mod.getFunctionalGroup();
        TransactionSet ts2Mod = fg2Mod.getTransactionSet();
        Loop2000Detail dl2000 = ts2Mod.getLoop2000Detail().get(0);
        Loop2100ClaimPaymentInformation l2100 = dl2000.getLoop2100ClaimPaymentInformation().get(0);
        
        ClaimSIQuantity csiq = l2100.getClaimSIQuantity();
        csiq.setQuantity(987);
        
        Loop2110SPI l2spi2 = l2100.getLoop2110SPI().get(0);
        ClaimSPI cspi = l2spi2.getClaimSPI().setAmountPaid("999.99");
        cspi.setAmountPaid("12388.45");
        l2spi2.getServiceAdjustment().get(0).setClaimAdjGroupCode("AIR");
        l2spi2.getServiceAdjustment().get(0).setMonetaryAmount("987.65");
        l2spi2.getServiceAdjustment().get(0).setClaimAdjReasonCode("WF");
        System.out.println("");
        
        
        
        System.out.println("Write the modified model to System.out ...");
        System.out.println();
         
        StringWriter stringWriter = new StringWriter();
        
        x12835Factory.toEDI(x12Message, stringWriter);
        String outputEDI = stringWriter.toString();
        String newOutputEDI = (outputEDI.replaceAll("~","~\r\n"));
        System.out.println("OutputEDI: '\n"+newOutputEDI+"'");
        */
    }
}
