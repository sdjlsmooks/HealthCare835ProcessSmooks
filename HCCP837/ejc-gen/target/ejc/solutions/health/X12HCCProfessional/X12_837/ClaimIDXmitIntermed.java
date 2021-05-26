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

public class ClaimIDXmitIntermed implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String referenceIdentificationQualifier;
    private String referenceIdentification;
    private String description;
    private String referenceIdentifier;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(referenceIdentificationQualifier != null) {
            nodeWriter.write(delimiters.escape(referenceIdentificationQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentification != null) {
            nodeWriter.write(delimiters.escape(referenceIdentification.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(description != null) {
            nodeWriter.write(delimiters.escape(description.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentifier != null) {
            nodeWriter.write(delimiters.escape(referenceIdentifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getReferenceIdentificationQualifier() {
        return referenceIdentificationQualifier;
    }

    public ClaimIDXmitIntermed setReferenceIdentificationQualifier(String referenceIdentificationQualifier) {
        this.referenceIdentificationQualifier = referenceIdentificationQualifier;  return this;
    }

    public String getReferenceIdentification() {
        return referenceIdentification;
    }

    public ClaimIDXmitIntermed setReferenceIdentification(String referenceIdentification) {
        this.referenceIdentification = referenceIdentification;  return this;
    }

    public String getDescription() {
        return description;
    }

    public ClaimIDXmitIntermed setDescription(String description) {
        this.description = description;  return this;
    }

    public String getReferenceIdentifier() {
        return referenceIdentifier;
    }

    public ClaimIDXmitIntermed setReferenceIdentifier(String referenceIdentifier) {
        this.referenceIdentifier = referenceIdentifier;  return this;
    }
}