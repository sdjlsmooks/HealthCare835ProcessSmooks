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

public class AmbulancePatientCount implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String quantityQualifier;
    private Double quantity;
    private DoubleDecoder quantityEncoder;

    public AmbulancePatientCount() {
        
        quantityEncoder = new DoubleDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(quantityQualifier != null) {
            nodeWriter.write(delimiters.escape(quantityQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(quantity != null) {
            nodeWriter.write(delimiters.escape(quantityEncoder.encode(quantity)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getQuantityQualifier() {
        return quantityQualifier;
    }

    public AmbulancePatientCount setQuantityQualifier(String quantityQualifier) {
        this.quantityQualifier = quantityQualifier;  return this;
    }

    public Double getQuantity() {
        return quantity;
    }

    public AmbulancePatientCount setQuantity(Double quantity) {
        this.quantity = quantity;  return this;
    }
}