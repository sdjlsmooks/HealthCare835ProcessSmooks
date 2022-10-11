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

public class FileInformation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String fixedFormInformation;
    private String recordFormatCode;
    private String compositeUnitOfMeasure;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(fixedFormInformation != null) {
            nodeWriter.write(delimiters.escape(fixedFormInformation.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(recordFormatCode != null) {
            nodeWriter.write(delimiters.escape(recordFormatCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(compositeUnitOfMeasure != null) {
            nodeWriter.write(delimiters.escape(compositeUnitOfMeasure.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getFixedFormInformation() {
        return fixedFormInformation;
    }

    public FileInformation setFixedFormInformation(String fixedFormInformation) {
        this.fixedFormInformation = fixedFormInformation;  return this;
    }

    public String getRecordFormatCode() {
        return recordFormatCode;
    }

    public FileInformation setRecordFormatCode(String recordFormatCode) {
        this.recordFormatCode = recordFormatCode;  return this;
    }

    public String getCompositeUnitOfMeasure() {
        return compositeUnitOfMeasure;
    }

    public FileInformation setCompositeUnitOfMeasure(String compositeUnitOfMeasure) {
        this.compositeUnitOfMeasure = compositeUnitOfMeasure;  return this;
    }
}