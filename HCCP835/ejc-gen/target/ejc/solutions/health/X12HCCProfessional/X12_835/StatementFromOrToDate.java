/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.util.Date;    
import org.milyn.javabean.decoders.DateDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.util.Properties;    

public class StatementFromOrToDate implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String dateTimeQualifier;
    private Date date;
    private DateDecoder dateEncoder;

    public StatementFromOrToDate() {
        
        dateEncoder = new DateDecoder();
        Properties dateEncoderProperties = new Properties();
        dateEncoderProperties.setProperty("format", "yyyyMMdd");
        dateEncoder.setConfiguration(dateEncoderProperties);
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(dateTimeQualifier != null) {
            nodeWriter.write(delimiters.escape(dateTimeQualifier.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(date != null) {
            nodeWriter.write(delimiters.escape(dateEncoder.encode(date)));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getDateTimeQualifier() {
        return dateTimeQualifier;
    }

    public StatementFromOrToDate setDateTimeQualifier(String dateTimeQualifier) {
        this.dateTimeQualifier = dateTimeQualifier;  return this;
    }

    public Date getDate() {
        return date;
    }

    public StatementFromOrToDate setDate(Date date) {
        this.date = date;  return this;
    }
}