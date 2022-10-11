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

public class RpSpeciality implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String providerCode;
    private String referenceIDQualifier;
    private String referenceIdentification;
    private String stateOrProvinceCode;
    private String providerSpecalityInfo;
    private String providerOrgCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(providerCode != null) {
            nodeWriter.write(delimiters.escape(providerCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIDQualifier != null) {
            nodeWriter.write(delimiters.escape(referenceIDQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIdentification != null) {
            nodeWriter.write(delimiters.escape(referenceIdentification.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(stateOrProvinceCode != null) {
            nodeWriter.write(delimiters.escape(stateOrProvinceCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(providerSpecalityInfo != null) {
            nodeWriter.write(delimiters.escape(providerSpecalityInfo.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(providerOrgCode != null) {
            nodeWriter.write(delimiters.escape(providerOrgCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getProviderCode() {
        return providerCode;
    }

    public RpSpeciality setProviderCode(String providerCode) {
        this.providerCode = providerCode;  return this;
    }

    public String getReferenceIDQualifier() {
        return referenceIDQualifier;
    }

    public RpSpeciality setReferenceIDQualifier(String referenceIDQualifier) {
        this.referenceIDQualifier = referenceIDQualifier;  return this;
    }

    public String getReferenceIdentification() {
        return referenceIdentification;
    }

    public RpSpeciality setReferenceIdentification(String referenceIdentification) {
        this.referenceIdentification = referenceIdentification;  return this;
    }

    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    public RpSpeciality setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;  return this;
    }

    public String getProviderSpecalityInfo() {
        return providerSpecalityInfo;
    }

    public RpSpeciality setProviderSpecalityInfo(String providerSpecalityInfo) {
        this.providerSpecalityInfo = providerSpecalityInfo;  return this;
    }

    public String getProviderOrgCode() {
        return providerOrgCode;
    }

    public RpSpeciality setProviderOrgCode(String providerOrgCode) {
        this.providerOrgCode = providerOrgCode;  return this;
    }
}