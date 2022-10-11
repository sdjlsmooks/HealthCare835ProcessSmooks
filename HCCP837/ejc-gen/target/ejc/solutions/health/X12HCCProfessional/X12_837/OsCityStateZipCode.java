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

public class OsCityStateZipCode implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String city;
    private String state;
    private String postalCode;
    private String countryCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(city != null) {
            nodeWriter.write(delimiters.escape(city.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(state != null) {
            nodeWriter.write(delimiters.escape(state.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(postalCode != null) {
            nodeWriter.write(delimiters.escape(postalCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(countryCode != null) {
            nodeWriter.write(delimiters.escape(countryCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getCity() {
        return city;
    }

    public OsCityStateZipCode setCity(String city) {
        this.city = city;  return this;
    }

    public String getState() {
        return state;
    }

    public OsCityStateZipCode setState(String state) {
        this.state = state;  return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public OsCityStateZipCode setPostalCode(String postalCode) {
        this.postalCode = postalCode;  return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public OsCityStateZipCode setCountryCode(String countryCode) {
        this.countryCode = countryCode;  return this;
    }
}