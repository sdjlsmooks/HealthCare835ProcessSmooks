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

public class SpinalManiupServiceInfo implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String count;
    private String quantity;
    private String subluxationLevelCode;
    private String subluxationLevelCode2;
    private String unitBasisMeasureCode;
    private String quantity2;
    private String natureOfCondCode;
    private String yesnoCondRespCode;
    private String description;
    private String description2;
    private String yesNoRespCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(count != null) {
            nodeWriter.write(delimiters.escape(count.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(quantity != null) {
            nodeWriter.write(delimiters.escape(quantity.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(subluxationLevelCode != null) {
            nodeWriter.write(delimiters.escape(subluxationLevelCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(subluxationLevelCode2 != null) {
            nodeWriter.write(delimiters.escape(subluxationLevelCode2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(unitBasisMeasureCode != null) {
            nodeWriter.write(delimiters.escape(unitBasisMeasureCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(quantity2 != null) {
            nodeWriter.write(delimiters.escape(quantity2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(natureOfCondCode != null) {
            nodeWriter.write(delimiters.escape(natureOfCondCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(yesnoCondRespCode != null) {
            nodeWriter.write(delimiters.escape(yesnoCondRespCode.toString()));
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
        if(description2 != null) {
            nodeWriter.write(delimiters.escape(description2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(yesNoRespCode != null) {
            nodeWriter.write(delimiters.escape(yesNoRespCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getCount() {
        return count;
    }

    public SpinalManiupServiceInfo setCount(String count) {
        this.count = count;  return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public SpinalManiupServiceInfo setQuantity(String quantity) {
        this.quantity = quantity;  return this;
    }

    public String getSubluxationLevelCode() {
        return subluxationLevelCode;
    }

    public SpinalManiupServiceInfo setSubluxationLevelCode(String subluxationLevelCode) {
        this.subluxationLevelCode = subluxationLevelCode;  return this;
    }

    public String getSubluxationLevelCode2() {
        return subluxationLevelCode2;
    }

    public SpinalManiupServiceInfo setSubluxationLevelCode2(String subluxationLevelCode2) {
        this.subluxationLevelCode2 = subluxationLevelCode2;  return this;
    }

    public String getUnitBasisMeasureCode() {
        return unitBasisMeasureCode;
    }

    public SpinalManiupServiceInfo setUnitBasisMeasureCode(String unitBasisMeasureCode) {
        this.unitBasisMeasureCode = unitBasisMeasureCode;  return this;
    }

    public String getQuantity2() {
        return quantity2;
    }

    public SpinalManiupServiceInfo setQuantity2(String quantity2) {
        this.quantity2 = quantity2;  return this;
    }

    public String getNatureOfCondCode() {
        return natureOfCondCode;
    }

    public SpinalManiupServiceInfo setNatureOfCondCode(String natureOfCondCode) {
        this.natureOfCondCode = natureOfCondCode;  return this;
    }

    public String getYesnoCondRespCode() {
        return yesnoCondRespCode;
    }

    public SpinalManiupServiceInfo setYesnoCondRespCode(String yesnoCondRespCode) {
        this.yesnoCondRespCode = yesnoCondRespCode;  return this;
    }

    public String getDescription() {
        return description;
    }

    public SpinalManiupServiceInfo setDescription(String description) {
        this.description = description;  return this;
    }

    public String getDescription2() {
        return description2;
    }

    public SpinalManiupServiceInfo setDescription2(String description2) {
        this.description2 = description2;  return this;
    }

    public String getYesNoRespCode() {
        return yesNoRespCode;
    }

    public SpinalManiupServiceInfo setYesNoRespCode(String yesNoRespCode) {
        this.yesNoRespCode = yesNoRespCode;  return this;
    }
}