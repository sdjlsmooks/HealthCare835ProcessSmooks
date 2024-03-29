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

public class RepricerReceivedDate implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String dateTimeQualifier;
    private String dateTimeFormatQualifier;
    private String dateTimePeriod;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(dateTimeQualifier != null) {
            nodeWriter.write(delimiters.escape(dateTimeQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(dateTimeFormatQualifier != null) {
            nodeWriter.write(delimiters.escape(dateTimeFormatQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(dateTimePeriod != null) {
            nodeWriter.write(delimiters.escape(dateTimePeriod.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getDateTimeQualifier() {
        return dateTimeQualifier;
    }

    public RepricerReceivedDate setDateTimeQualifier(String dateTimeQualifier) {
        this.dateTimeQualifier = dateTimeQualifier;  return this;
    }

    public String getDateTimeFormatQualifier() {
        return dateTimeFormatQualifier;
    }

    public RepricerReceivedDate setDateTimeFormatQualifier(String dateTimeFormatQualifier) {
        this.dateTimeFormatQualifier = dateTimeFormatQualifier;  return this;
    }

    public String getDateTimePeriod() {
        return dateTimePeriod;
    }

    public RepricerReceivedDate setDateTimePeriod(String dateTimePeriod) {
        this.dateTimePeriod = dateTimePeriod;  return this;
    }
}