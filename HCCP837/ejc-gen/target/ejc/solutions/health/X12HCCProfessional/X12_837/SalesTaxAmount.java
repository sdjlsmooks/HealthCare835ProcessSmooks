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

public class SalesTaxAmount implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String amountQualifierCode;
    private String monetaryAmount;
    private String creditDebitFlagCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(amountQualifierCode != null) {
            nodeWriter.write(delimiters.escape(amountQualifierCode.toString()));
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
        if(creditDebitFlagCode != null) {
            nodeWriter.write(delimiters.escape(creditDebitFlagCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getAmountQualifierCode() {
        return amountQualifierCode;
    }

    public SalesTaxAmount setAmountQualifierCode(String amountQualifierCode) {
        this.amountQualifierCode = amountQualifierCode;  return this;
    }

    public String getMonetaryAmount() {
        return monetaryAmount;
    }

    public SalesTaxAmount setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;  return this;
    }

    public String getCreditDebitFlagCode() {
        return creditDebitFlagCode;
    }

    public SalesTaxAmount setCreditDebitFlagCode(String creditDebitFlagCode) {
        this.creditDebitFlagCode = creditDebitFlagCode;  return this;
    }
}