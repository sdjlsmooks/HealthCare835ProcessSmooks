/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.io.StringWriter;    
import java.util.List;    
import java.util.ArrayList;    
import org.milyn.edisax.util.EDIUtils;    
import org.milyn.edisax.model.internal.DelimiterType;    

public class PayerBusinessContactInformation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String contactFunctionCode;
    private String name;
    private String communicationNumberQualifier;
    private String communicationNumber;
    private String communicationNumberQualifier2;
    private String communicationNumber2;
    private String communicationNumberQualifier3;
    private String communicationNumber3;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(contactFunctionCode != null) {
            nodeWriter.write(delimiters.escape(contactFunctionCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(name != null) {
            nodeWriter.write(delimiters.escape(name.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(communicationNumberQualifier != null) {
            nodeWriter.write(delimiters.escape(communicationNumberQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(communicationNumber != null) {
            nodeWriter.write(delimiters.escape(communicationNumber.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(communicationNumberQualifier2 != null) {
            nodeWriter.write(delimiters.escape(communicationNumberQualifier2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(communicationNumber2 != null) {
            nodeWriter.write(delimiters.escape(communicationNumber2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(communicationNumberQualifier3 != null) {
            nodeWriter.write(delimiters.escape(communicationNumberQualifier3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(communicationNumber3 != null) {
            nodeWriter.write(delimiters.escape(communicationNumber3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getContactFunctionCode() {
        return contactFunctionCode;
    }

    public PayerBusinessContactInformation setContactFunctionCode(String contactFunctionCode) {
        this.contactFunctionCode = contactFunctionCode;  return this;
    }

    public String getName() {
        return name;
    }

    public PayerBusinessContactInformation setName(String name) {
        this.name = name;  return this;
    }

    public String getCommunicationNumberQualifier() {
        return communicationNumberQualifier;
    }

    public PayerBusinessContactInformation setCommunicationNumberQualifier(String communicationNumberQualifier) {
        this.communicationNumberQualifier = communicationNumberQualifier;  return this;
    }

    public String getCommunicationNumber() {
        return communicationNumber;
    }

    public PayerBusinessContactInformation setCommunicationNumber(String communicationNumber) {
        this.communicationNumber = communicationNumber;  return this;
    }

    public String getCommunicationNumberQualifier2() {
        return communicationNumberQualifier2;
    }

    public PayerBusinessContactInformation setCommunicationNumberQualifier2(String communicationNumberQualifier2) {
        this.communicationNumberQualifier2 = communicationNumberQualifier2;  return this;
    }

    public String getCommunicationNumber2() {
        return communicationNumber2;
    }

    public PayerBusinessContactInformation setCommunicationNumber2(String communicationNumber2) {
        this.communicationNumber2 = communicationNumber2;  return this;
    }

    public String getCommunicationNumberQualifier3() {
        return communicationNumberQualifier3;
    }

    public PayerBusinessContactInformation setCommunicationNumberQualifier3(String communicationNumberQualifier3) {
        this.communicationNumberQualifier3 = communicationNumberQualifier3;  return this;
    }

    public String getCommunicationNumber3() {
        return communicationNumber3;
    }

    public PayerBusinessContactInformation setCommunicationNumber3(String communicationNumber3) {
        this.communicationNumber3 = communicationNumber3;  return this;
    }
}