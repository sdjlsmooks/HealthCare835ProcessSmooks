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

public class AdlAddress implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String addressInformation;
    private String additionalAddressInformation;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(addressInformation != null) {
            nodeWriter.write(delimiters.escape(addressInformation.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(additionalAddressInformation != null) {
            nodeWriter.write(delimiters.escape(additionalAddressInformation.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getAddressInformation() {
        return addressInformation;
    }

    public AdlAddress setAddressInformation(String addressInformation) {
        this.addressInformation = addressInformation;  return this;
    }

    public String getAdditionalAddressInformation() {
        return additionalAddressInformation;
    }

    public AdlAddress setAdditionalAddressInformation(String additionalAddressInformation) {
        this.additionalAddressInformation = additionalAddressInformation;  return this;
    }
}