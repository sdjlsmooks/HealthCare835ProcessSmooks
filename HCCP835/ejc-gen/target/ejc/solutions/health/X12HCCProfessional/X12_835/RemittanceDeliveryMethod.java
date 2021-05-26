/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

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

public class RemittanceDeliveryMethod implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String reportTransmissionCode;
    private String name;
    private String communicationNumber;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(reportTransmissionCode != null) {
            nodeWriter.write(delimiters.escape(reportTransmissionCode.toString()));
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
        if(communicationNumber != null) {
            nodeWriter.write(delimiters.escape(communicationNumber.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getReportTransmissionCode() {
        return reportTransmissionCode;
    }

    public RemittanceDeliveryMethod setReportTransmissionCode(String reportTransmissionCode) {
        this.reportTransmissionCode = reportTransmissionCode;  return this;
    }

    public String getName() {
        return name;
    }

    public RemittanceDeliveryMethod setName(String name) {
        this.name = name;  return this;
    }

    public String getCommunicationNumber() {
        return communicationNumber;
    }

    public RemittanceDeliveryMethod setCommunicationNumber(String communicationNumber) {
        this.communicationNumber = communicationNumber;  return this;
    }
}