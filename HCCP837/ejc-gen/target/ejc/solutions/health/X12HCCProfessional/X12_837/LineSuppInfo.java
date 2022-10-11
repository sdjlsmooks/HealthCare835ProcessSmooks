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

public class LineSuppInfo implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String recordTypeCode;
    private String reportTransmitCode;
    private Double reportCopiesNeeded;
    private DoubleDecoder reportCopiesNeededEncoder;
    private String entityIDCode;
    private String idCodeQualifier;
    private String idCode;
    private String description;
    private String actionsIndicated;
    private String requestCategoryCode;

    public LineSuppInfo() {
        
        reportCopiesNeededEncoder = new DoubleDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(recordTypeCode != null) {
            nodeWriter.write(delimiters.escape(recordTypeCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(reportTransmitCode != null) {
            nodeWriter.write(delimiters.escape(reportTransmitCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(reportCopiesNeeded != null) {
            nodeWriter.write(delimiters.escape(reportCopiesNeededEncoder.encode(reportCopiesNeeded)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(entityIDCode != null) {
            nodeWriter.write(delimiters.escape(entityIDCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(idCodeQualifier != null) {
            nodeWriter.write(delimiters.escape(idCodeQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(idCode != null) {
            nodeWriter.write(delimiters.escape(idCode.toString()));
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
        if(actionsIndicated != null) {
            nodeWriter.write(delimiters.escape(actionsIndicated.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(requestCategoryCode != null) {
            nodeWriter.write(delimiters.escape(requestCategoryCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getRecordTypeCode() {
        return recordTypeCode;
    }

    public LineSuppInfo setRecordTypeCode(String recordTypeCode) {
        this.recordTypeCode = recordTypeCode;  return this;
    }

    public String getReportTransmitCode() {
        return reportTransmitCode;
    }

    public LineSuppInfo setReportTransmitCode(String reportTransmitCode) {
        this.reportTransmitCode = reportTransmitCode;  return this;
    }

    public Double getReportCopiesNeeded() {
        return reportCopiesNeeded;
    }

    public LineSuppInfo setReportCopiesNeeded(Double reportCopiesNeeded) {
        this.reportCopiesNeeded = reportCopiesNeeded;  return this;
    }

    public String getEntityIDCode() {
        return entityIDCode;
    }

    public LineSuppInfo setEntityIDCode(String entityIDCode) {
        this.entityIDCode = entityIDCode;  return this;
    }

    public String getIdCodeQualifier() {
        return idCodeQualifier;
    }

    public LineSuppInfo setIdCodeQualifier(String idCodeQualifier) {
        this.idCodeQualifier = idCodeQualifier;  return this;
    }

    public String getIdCode() {
        return idCode;
    }

    public LineSuppInfo setIdCode(String idCode) {
        this.idCode = idCode;  return this;
    }

    public String getDescription() {
        return description;
    }

    public LineSuppInfo setDescription(String description) {
        this.description = description;  return this;
    }

    public String getActionsIndicated() {
        return actionsIndicated;
    }

    public LineSuppInfo setActionsIndicated(String actionsIndicated) {
        this.actionsIndicated = actionsIndicated;  return this;
    }

    public String getRequestCategoryCode() {
        return requestCategoryCode;
    }

    public LineSuppInfo setRequestCategoryCode(String requestCategoryCode) {
        this.requestCategoryCode = requestCategoryCode;  return this;
    }
}