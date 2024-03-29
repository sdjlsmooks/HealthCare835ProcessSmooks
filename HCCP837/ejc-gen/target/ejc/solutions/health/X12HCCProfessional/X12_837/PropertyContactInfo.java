/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

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

public class PropertyContactInfo implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String contactFunctionCode;
    private String name;
    private String commNumberQualifier;
    private String commNumber;
    private String commNumberQualifier2;
    private String commNumber2;
    private String commNumberQualifier3;
    private String commNumber3;
    private String contactInqReference;

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
        if(commNumberQualifier != null) {
            nodeWriter.write(delimiters.escape(commNumberQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(commNumber != null) {
            nodeWriter.write(delimiters.escape(commNumber.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(commNumberQualifier2 != null) {
            nodeWriter.write(delimiters.escape(commNumberQualifier2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(commNumber2 != null) {
            nodeWriter.write(delimiters.escape(commNumber2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(commNumberQualifier3 != null) {
            nodeWriter.write(delimiters.escape(commNumberQualifier3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(commNumber3 != null) {
            nodeWriter.write(delimiters.escape(commNumber3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(contactInqReference != null) {
            nodeWriter.write(delimiters.escape(contactInqReference.toString()));
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

    public PropertyContactInfo setContactFunctionCode(String contactFunctionCode) {
        this.contactFunctionCode = contactFunctionCode;  return this;
    }

    public String getName() {
        return name;
    }

    public PropertyContactInfo setName(String name) {
        this.name = name;  return this;
    }

    public String getCommNumberQualifier() {
        return commNumberQualifier;
    }

    public PropertyContactInfo setCommNumberQualifier(String commNumberQualifier) {
        this.commNumberQualifier = commNumberQualifier;  return this;
    }

    public String getCommNumber() {
        return commNumber;
    }

    public PropertyContactInfo setCommNumber(String commNumber) {
        this.commNumber = commNumber;  return this;
    }

    public String getCommNumberQualifier2() {
        return commNumberQualifier2;
    }

    public PropertyContactInfo setCommNumberQualifier2(String commNumberQualifier2) {
        this.commNumberQualifier2 = commNumberQualifier2;  return this;
    }

    public String getCommNumber2() {
        return commNumber2;
    }

    public PropertyContactInfo setCommNumber2(String commNumber2) {
        this.commNumber2 = commNumber2;  return this;
    }

    public String getCommNumberQualifier3() {
        return commNumberQualifier3;
    }

    public PropertyContactInfo setCommNumberQualifier3(String commNumberQualifier3) {
        this.commNumberQualifier3 = commNumberQualifier3;  return this;
    }

    public String getCommNumber3() {
        return commNumber3;
    }

    public PropertyContactInfo setCommNumber3(String commNumber3) {
        this.commNumber3 = commNumber3;  return this;
    }

    public String getContactInqReference() {
        return contactInqReference;
    }

    public PropertyContactInfo setContactInqReference(String contactInqReference) {
        this.contactInqReference = contactInqReference;  return this;
    }
}