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

public class DurMedEquipCert implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String certificateTypeCode;
    private String unitBasisMeasurementCode;
    private Double quantity;
    private DoubleDecoder quantityEncoder;
    private String insulinDependentCode;
    private String description;

    public DurMedEquipCert() {
        
        quantityEncoder = new DoubleDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(certificateTypeCode != null) {
            nodeWriter.write(delimiters.escape(certificateTypeCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(unitBasisMeasurementCode != null) {
            nodeWriter.write(delimiters.escape(unitBasisMeasurementCode.toString()));
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
        if(insulinDependentCode != null) {
            nodeWriter.write(delimiters.escape(insulinDependentCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(description != null) {
            nodeWriter.write(delimiters.escape(description.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getCertificateTypeCode() {
        return certificateTypeCode;
    }

    public DurMedEquipCert setCertificateTypeCode(String certificateTypeCode) {
        this.certificateTypeCode = certificateTypeCode;  return this;
    }

    public String getUnitBasisMeasurementCode() {
        return unitBasisMeasurementCode;
    }

    public DurMedEquipCert setUnitBasisMeasurementCode(String unitBasisMeasurementCode) {
        this.unitBasisMeasurementCode = unitBasisMeasurementCode;  return this;
    }

    public Double getQuantity() {
        return quantity;
    }

    public DurMedEquipCert setQuantity(Double quantity) {
        this.quantity = quantity;  return this;
    }

    public String getInsulinDependentCode() {
        return insulinDependentCode;
    }

    public DurMedEquipCert setInsulinDependentCode(String insulinDependentCode) {
        this.insulinDependentCode = insulinDependentCode;  return this;
    }

    public String getDescription() {
        return description;
    }

    public DurMedEquipCert setDescription(String description) {
        this.description = description;  return this;
    }
}