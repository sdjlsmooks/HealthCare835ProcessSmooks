/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class ForeignCurrencyInformation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String entityIDCode;
    private String currencyCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(entityIDCode != null) {
            nodeWriter.write(delimiters.escape(entityIDCode.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(currencyCode != null) {
            nodeWriter.write(delimiters.escape(currencyCode.toString()));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getEntityIDCode() {
        return entityIDCode;
    }

    public ForeignCurrencyInformation setEntityIDCode(String entityIDCode) {
        this.entityIDCode = entityIDCode;  return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public ForeignCurrencyInformation setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;  return this;
    }
}