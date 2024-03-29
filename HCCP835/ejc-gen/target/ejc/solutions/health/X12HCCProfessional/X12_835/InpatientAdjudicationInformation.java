/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import org.milyn.javabean.decoders.IntegerDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.io.StringWriter;    
import java.util.List;    
import java.util.ArrayList;    
import org.milyn.edisax.util.EDIUtils;    
import org.milyn.edisax.model.internal.DelimiterType;    

public class InpatientAdjudicationInformation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String quantity;
    private String monetaryAmount;
    private Integer quantity2;
    private IntegerDecoder quantity2Encoder;
    private String monetaryAmount2;
    private String referenceIdentifier;
    private String monetaryAmount3;
    private String monetaryAmount4;
    private String monetaryAmount5;
    private String monetaryAmount6;
    private String monetaryAmount7;
    private String monetaryAmount8;
    private String monetaryAmount9;
    private String monetaryAmount10;
    private String monetaryAmount11;
    private Integer quantity3;
    private IntegerDecoder quantity3Encoder;
    private String monetaryAmount12;
    private String monetaryAmount13;
    private String monetaryAmount14;
    private String monetaryAmount15;
    private String referenceIdentifier2;
    private String referenceIdentifier3;
    private String referenceIdentifier4;
    private String referenceIdentifier5;
    private String monetaryAmount16;

    public InpatientAdjudicationInformation() {
        
        quantity2Encoder = new IntegerDecoder();
        quantity3Encoder = new IntegerDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(quantity != null) {
            nodeWriter.write(delimiters.escape(quantity.toString()));
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
        if(quantity2 != null) {
            nodeWriter.write(delimiters.escape(quantity2Encoder.encode(quantity2)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount2 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentifier != null) {
            nodeWriter.write(delimiters.escape(referenceIdentifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount3 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount4 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount4.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount5 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount5.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount6 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount6.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount7 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount7.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount8 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount8.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount9 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount9.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount10 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount10.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount11 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount11.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(quantity3 != null) {
            nodeWriter.write(delimiters.escape(quantity3Encoder.encode(quantity3)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount12 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount12.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount13 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount13.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount14 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount14.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount15 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount15.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentifier2 != null) {
            nodeWriter.write(delimiters.escape(referenceIdentifier2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentifier3 != null) {
            nodeWriter.write(delimiters.escape(referenceIdentifier3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentifier4 != null) {
            nodeWriter.write(delimiters.escape(referenceIdentifier4.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentifier5 != null) {
            nodeWriter.write(delimiters.escape(referenceIdentifier5.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(monetaryAmount16 != null) {
            nodeWriter.write(delimiters.escape(monetaryAmount16.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getQuantity() {
        return quantity;
    }

    public InpatientAdjudicationInformation setQuantity(String quantity) {
        this.quantity = quantity;  return this;
    }

    public String getMonetaryAmount() {
        return monetaryAmount;
    }

    public InpatientAdjudicationInformation setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;  return this;
    }

    public Integer getQuantity2() {
        return quantity2;
    }

    public InpatientAdjudicationInformation setQuantity2(Integer quantity2) {
        this.quantity2 = quantity2;  return this;
    }

    public String getMonetaryAmount2() {
        return monetaryAmount2;
    }

    public InpatientAdjudicationInformation setMonetaryAmount2(String monetaryAmount2) {
        this.monetaryAmount2 = monetaryAmount2;  return this;
    }

    public String getReferenceIdentifier() {
        return referenceIdentifier;
    }

    public InpatientAdjudicationInformation setReferenceIdentifier(String referenceIdentifier) {
        this.referenceIdentifier = referenceIdentifier;  return this;
    }

    public String getMonetaryAmount3() {
        return monetaryAmount3;
    }

    public InpatientAdjudicationInformation setMonetaryAmount3(String monetaryAmount3) {
        this.monetaryAmount3 = monetaryAmount3;  return this;
    }

    public String getMonetaryAmount4() {
        return monetaryAmount4;
    }

    public InpatientAdjudicationInformation setMonetaryAmount4(String monetaryAmount4) {
        this.monetaryAmount4 = monetaryAmount4;  return this;
    }

    public String getMonetaryAmount5() {
        return monetaryAmount5;
    }

    public InpatientAdjudicationInformation setMonetaryAmount5(String monetaryAmount5) {
        this.monetaryAmount5 = monetaryAmount5;  return this;
    }

    public String getMonetaryAmount6() {
        return monetaryAmount6;
    }

    public InpatientAdjudicationInformation setMonetaryAmount6(String monetaryAmount6) {
        this.monetaryAmount6 = monetaryAmount6;  return this;
    }

    public String getMonetaryAmount7() {
        return monetaryAmount7;
    }

    public InpatientAdjudicationInformation setMonetaryAmount7(String monetaryAmount7) {
        this.monetaryAmount7 = monetaryAmount7;  return this;
    }

    public String getMonetaryAmount8() {
        return monetaryAmount8;
    }

    public InpatientAdjudicationInformation setMonetaryAmount8(String monetaryAmount8) {
        this.monetaryAmount8 = monetaryAmount8;  return this;
    }

    public String getMonetaryAmount9() {
        return monetaryAmount9;
    }

    public InpatientAdjudicationInformation setMonetaryAmount9(String monetaryAmount9) {
        this.monetaryAmount9 = monetaryAmount9;  return this;
    }

    public String getMonetaryAmount10() {
        return monetaryAmount10;
    }

    public InpatientAdjudicationInformation setMonetaryAmount10(String monetaryAmount10) {
        this.monetaryAmount10 = monetaryAmount10;  return this;
    }

    public String getMonetaryAmount11() {
        return monetaryAmount11;
    }

    public InpatientAdjudicationInformation setMonetaryAmount11(String monetaryAmount11) {
        this.monetaryAmount11 = monetaryAmount11;  return this;
    }

    public Integer getQuantity3() {
        return quantity3;
    }

    public InpatientAdjudicationInformation setQuantity3(Integer quantity3) {
        this.quantity3 = quantity3;  return this;
    }

    public String getMonetaryAmount12() {
        return monetaryAmount12;
    }

    public InpatientAdjudicationInformation setMonetaryAmount12(String monetaryAmount12) {
        this.monetaryAmount12 = monetaryAmount12;  return this;
    }

    public String getMonetaryAmount13() {
        return monetaryAmount13;
    }

    public InpatientAdjudicationInformation setMonetaryAmount13(String monetaryAmount13) {
        this.monetaryAmount13 = monetaryAmount13;  return this;
    }

    public String getMonetaryAmount14() {
        return monetaryAmount14;
    }

    public InpatientAdjudicationInformation setMonetaryAmount14(String monetaryAmount14) {
        this.monetaryAmount14 = monetaryAmount14;  return this;
    }

    public String getMonetaryAmount15() {
        return monetaryAmount15;
    }

    public InpatientAdjudicationInformation setMonetaryAmount15(String monetaryAmount15) {
        this.monetaryAmount15 = monetaryAmount15;  return this;
    }

    public String getReferenceIdentifier2() {
        return referenceIdentifier2;
    }

    public InpatientAdjudicationInformation setReferenceIdentifier2(String referenceIdentifier2) {
        this.referenceIdentifier2 = referenceIdentifier2;  return this;
    }

    public String getReferenceIdentifier3() {
        return referenceIdentifier3;
    }

    public InpatientAdjudicationInformation setReferenceIdentifier3(String referenceIdentifier3) {
        this.referenceIdentifier3 = referenceIdentifier3;  return this;
    }

    public String getReferenceIdentifier4() {
        return referenceIdentifier4;
    }

    public InpatientAdjudicationInformation setReferenceIdentifier4(String referenceIdentifier4) {
        this.referenceIdentifier4 = referenceIdentifier4;  return this;
    }

    public String getReferenceIdentifier5() {
        return referenceIdentifier5;
    }

    public InpatientAdjudicationInformation setReferenceIdentifier5(String referenceIdentifier5) {
        this.referenceIdentifier5 = referenceIdentifier5;  return this;
    }

    public String getMonetaryAmount16() {
        return monetaryAmount16;
    }

    public InpatientAdjudicationInformation setMonetaryAmount16(String monetaryAmount16) {
        this.monetaryAmount16 = monetaryAmount16;  return this;
    }
}