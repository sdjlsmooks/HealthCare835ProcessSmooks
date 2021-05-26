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

public class PurchaseServInfo implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String referenceID;
    private String monetaryAmount;
    private String stateOrProvCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(referenceID != null) {
            nodeWriter.write(delimiters.escape(referenceID.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(stateOrProvCode != null) {
            nodeWriter.write(delimiters.escape(stateOrProvCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getReferenceID() {
        return referenceID;
    }

    public PurchaseServInfo setReferenceID(String referenceID) {
        this.referenceID = referenceID;  return this;
    }

    public String getMonetaryAmount() {
        return monetaryAmount;
    }

    public PurchaseServInfo setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;  return this;
    }

    public String getStateOrProvCode() {
        return stateOrProvCode;
    }

    public PurchaseServInfo setStateOrProvCode(String stateOrProvCode) {
        this.stateOrProvCode = stateOrProvCode;  return this;
    }
}