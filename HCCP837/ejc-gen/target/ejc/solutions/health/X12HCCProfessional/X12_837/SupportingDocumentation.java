/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.util.Date;    
import org.milyn.javabean.decoders.DateDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.io.StringWriter;    
import java.util.List;    
import java.util.ArrayList;    
import org.milyn.edisax.util.EDIUtils;    
import org.milyn.edisax.model.internal.DelimiterType;    

public class SupportingDocumentation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String assignedID;
    private String yesNoCondRespCode;
    private String referenceID;
    private Date date;
    private DateDecoder dateEncoder;
    private String allowChrgPercent;

    public SupportingDocumentation() {
        
        dateEncoder = new DateDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(assignedID != null) {
            nodeWriter.write(delimiters.escape(assignedID.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(yesNoCondRespCode != null) {
            nodeWriter.write(delimiters.escape(yesNoCondRespCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceID != null) {
            nodeWriter.write(delimiters.escape(referenceID.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(date != null) {
            nodeWriter.write(delimiters.escape(dateEncoder.encode(date)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(allowChrgPercent != null) {
            nodeWriter.write(delimiters.escape(allowChrgPercent.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getAssignedID() {
        return assignedID;
    }

    public SupportingDocumentation setAssignedID(String assignedID) {
        this.assignedID = assignedID;  return this;
    }

    public String getYesNoCondRespCode() {
        return yesNoCondRespCode;
    }

    public SupportingDocumentation setYesNoCondRespCode(String yesNoCondRespCode) {
        this.yesNoCondRespCode = yesNoCondRespCode;  return this;
    }

    public String getReferenceID() {
        return referenceID;
    }

    public SupportingDocumentation setReferenceID(String referenceID) {
        this.referenceID = referenceID;  return this;
    }

    public Date getDate() {
        return date;
    }

    public SupportingDocumentation setDate(Date date) {
        this.date = date;  return this;
    }

    public String getAllowChrgPercent() {
        return allowChrgPercent;
    }

    public SupportingDocumentation setAllowChrgPercent(String allowChrgPercent) {
        this.allowChrgPercent = allowChrgPercent;  return this;
    }
}