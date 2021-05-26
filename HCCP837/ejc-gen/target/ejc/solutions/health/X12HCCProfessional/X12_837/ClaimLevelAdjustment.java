/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import org.milyn.javabean.decoders.DoubleDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.io.StringWriter;    
import java.util.List;    
import java.util.ArrayList;    
import org.milyn.edisax.util.EDIUtils;    
import org.milyn.edisax.model.internal.DelimiterType;    

public class ClaimLevelAdjustment implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String claimAdjustmentGroupCode;
    private String claimAdjustmentReasonCode;
    private String monetaryAmount;
    private Double quantity;
    private DoubleDecoder quantityEncoder;
    private String claimAdjustmentReasonCode2;
    private String monetaryAmount2;
    private Double quantity2;
    private DoubleDecoder quantity2Encoder;
    private String claimAdjustmentReasonCode4;
    private String monetaryAmount4;
    private Double quantity4;
    private DoubleDecoder quantity4Encoder;
    private String claimAdjustmentReasonCode5;
    private String monetaryAmount5;
    private Double quantity5;
    private DoubleDecoder quantity5Encoder;
    private String claimAdjustmentReasonCode6;
    private String monetaryAmount6;
    private Double quantity6;
    private DoubleDecoder quantity6Encoder;
    private String claimAdjustmentReasonCode7;
    private String monetaryAmount7;
    private Double quantity7;
    private DoubleDecoder quantity7Encoder;

    public ClaimLevelAdjustment() {
        
        quantityEncoder = new DoubleDecoder();
        quantity2Encoder = new DoubleDecoder();
        quantity4Encoder = new DoubleDecoder();
        quantity5Encoder = new DoubleDecoder();
        quantity6Encoder = new DoubleDecoder();
        quantity7Encoder = new DoubleDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(claimAdjustmentGroupCode != null) {
            nodeWriter.write(delimiters.escape(claimAdjustmentGroupCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(claimAdjustmentReasonCode != null) {
            nodeWriter.write(delimiters.escape(claimAdjustmentReasonCode.toString()));
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
        if(quantity != null) {
            nodeWriter.write(delimiters.escape(quantityEncoder.encode(quantity)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(claimAdjustmentReasonCode2 != null) {
            nodeWriter.write(delimiters.escape(claimAdjustmentReasonCode2.toString()));
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
        if(quantity2 != null) {
            nodeWriter.write(delimiters.escape(quantity2Encoder.encode(quantity2)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(claimAdjustmentReasonCode4 != null) {
            nodeWriter.write(delimiters.escape(claimAdjustmentReasonCode4.toString()));
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
        if(quantity4 != null) {
            nodeWriter.write(delimiters.escape(quantity4Encoder.encode(quantity4)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(claimAdjustmentReasonCode5 != null) {
            nodeWriter.write(delimiters.escape(claimAdjustmentReasonCode5.toString()));
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
        if(quantity5 != null) {
            nodeWriter.write(delimiters.escape(quantity5Encoder.encode(quantity5)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(claimAdjustmentReasonCode6 != null) {
            nodeWriter.write(delimiters.escape(claimAdjustmentReasonCode6.toString()));
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
        if(quantity6 != null) {
            nodeWriter.write(delimiters.escape(quantity6Encoder.encode(quantity6)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(claimAdjustmentReasonCode7 != null) {
            nodeWriter.write(delimiters.escape(claimAdjustmentReasonCode7.toString()));
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
        if(quantity7 != null) {
            nodeWriter.write(delimiters.escape(quantity7Encoder.encode(quantity7)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getClaimAdjustmentGroupCode() {
        return claimAdjustmentGroupCode;
    }

    public ClaimLevelAdjustment setClaimAdjustmentGroupCode(String claimAdjustmentGroupCode) {
        this.claimAdjustmentGroupCode = claimAdjustmentGroupCode;  return this;
    }

    public String getClaimAdjustmentReasonCode() {
        return claimAdjustmentReasonCode;
    }

    public ClaimLevelAdjustment setClaimAdjustmentReasonCode(String claimAdjustmentReasonCode) {
        this.claimAdjustmentReasonCode = claimAdjustmentReasonCode;  return this;
    }

    public String getMonetaryAmount() {
        return monetaryAmount;
    }

    public ClaimLevelAdjustment setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;  return this;
    }

    public Double getQuantity() {
        return quantity;
    }

    public ClaimLevelAdjustment setQuantity(Double quantity) {
        this.quantity = quantity;  return this;
    }

    public String getClaimAdjustmentReasonCode2() {
        return claimAdjustmentReasonCode2;
    }

    public ClaimLevelAdjustment setClaimAdjustmentReasonCode2(String claimAdjustmentReasonCode2) {
        this.claimAdjustmentReasonCode2 = claimAdjustmentReasonCode2;  return this;
    }

    public String getMonetaryAmount2() {
        return monetaryAmount2;
    }

    public ClaimLevelAdjustment setMonetaryAmount2(String monetaryAmount2) {
        this.monetaryAmount2 = monetaryAmount2;  return this;
    }

    public Double getQuantity2() {
        return quantity2;
    }

    public ClaimLevelAdjustment setQuantity2(Double quantity2) {
        this.quantity2 = quantity2;  return this;
    }

    public String getClaimAdjustmentReasonCode4() {
        return claimAdjustmentReasonCode4;
    }

    public ClaimLevelAdjustment setClaimAdjustmentReasonCode4(String claimAdjustmentReasonCode4) {
        this.claimAdjustmentReasonCode4 = claimAdjustmentReasonCode4;  return this;
    }

    public String getMonetaryAmount4() {
        return monetaryAmount4;
    }

    public ClaimLevelAdjustment setMonetaryAmount4(String monetaryAmount4) {
        this.monetaryAmount4 = monetaryAmount4;  return this;
    }

    public Double getQuantity4() {
        return quantity4;
    }

    public ClaimLevelAdjustment setQuantity4(Double quantity4) {
        this.quantity4 = quantity4;  return this;
    }

    public String getClaimAdjustmentReasonCode5() {
        return claimAdjustmentReasonCode5;
    }

    public ClaimLevelAdjustment setClaimAdjustmentReasonCode5(String claimAdjustmentReasonCode5) {
        this.claimAdjustmentReasonCode5 = claimAdjustmentReasonCode5;  return this;
    }

    public String getMonetaryAmount5() {
        return monetaryAmount5;
    }

    public ClaimLevelAdjustment setMonetaryAmount5(String monetaryAmount5) {
        this.monetaryAmount5 = monetaryAmount5;  return this;
    }

    public Double getQuantity5() {
        return quantity5;
    }

    public ClaimLevelAdjustment setQuantity5(Double quantity5) {
        this.quantity5 = quantity5;  return this;
    }

    public String getClaimAdjustmentReasonCode6() {
        return claimAdjustmentReasonCode6;
    }

    public ClaimLevelAdjustment setClaimAdjustmentReasonCode6(String claimAdjustmentReasonCode6) {
        this.claimAdjustmentReasonCode6 = claimAdjustmentReasonCode6;  return this;
    }

    public String getMonetaryAmount6() {
        return monetaryAmount6;
    }

    public ClaimLevelAdjustment setMonetaryAmount6(String monetaryAmount6) {
        this.monetaryAmount6 = monetaryAmount6;  return this;
    }

    public Double getQuantity6() {
        return quantity6;
    }

    public ClaimLevelAdjustment setQuantity6(Double quantity6) {
        this.quantity6 = quantity6;  return this;
    }

    public String getClaimAdjustmentReasonCode7() {
        return claimAdjustmentReasonCode7;
    }

    public ClaimLevelAdjustment setClaimAdjustmentReasonCode7(String claimAdjustmentReasonCode7) {
        this.claimAdjustmentReasonCode7 = claimAdjustmentReasonCode7;  return this;
    }

    public String getMonetaryAmount7() {
        return monetaryAmount7;
    }

    public ClaimLevelAdjustment setMonetaryAmount7(String monetaryAmount7) {
        this.monetaryAmount7 = monetaryAmount7;  return this;
    }

    public Double getQuantity7() {
        return quantity7;
    }

    public ClaimLevelAdjustment setQuantity7(Double quantity7) {
        this.quantity7 = quantity7;  return this;
    }
}