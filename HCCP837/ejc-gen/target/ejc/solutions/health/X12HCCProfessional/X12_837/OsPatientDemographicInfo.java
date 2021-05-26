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

public class OsPatientDemographicInfo implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String dateTimeFormatQualifier;
    private String dateTimePeriod;
    private String genderCode;
    private String maritalStatusCode;
    private String compRaqceEthnInfo;
    private String citizenStatusCode;
    private String countryCode;
    private String basisVerifCode;
    private String quantity;
    private String codeListQualifierCode;
    private String industryCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

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
        nodeWriter.write(delimiters.getField());
        if(genderCode != null) {
            nodeWriter.write(delimiters.escape(genderCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(maritalStatusCode != null) {
            nodeWriter.write(delimiters.escape(maritalStatusCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(compRaqceEthnInfo != null) {
            nodeWriter.write(delimiters.escape(compRaqceEthnInfo.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(citizenStatusCode != null) {
            nodeWriter.write(delimiters.escape(citizenStatusCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(countryCode != null) {
            nodeWriter.write(delimiters.escape(countryCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(basisVerifCode != null) {
            nodeWriter.write(delimiters.escape(basisVerifCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(quantity != null) {
            nodeWriter.write(delimiters.escape(quantity.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(codeListQualifierCode != null) {
            nodeWriter.write(delimiters.escape(codeListQualifierCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(industryCode != null) {
            nodeWriter.write(delimiters.escape(industryCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getDateTimeFormatQualifier() {
        return dateTimeFormatQualifier;
    }

    public OsPatientDemographicInfo setDateTimeFormatQualifier(String dateTimeFormatQualifier) {
        this.dateTimeFormatQualifier = dateTimeFormatQualifier;  return this;
    }

    public String getDateTimePeriod() {
        return dateTimePeriod;
    }

    public OsPatientDemographicInfo setDateTimePeriod(String dateTimePeriod) {
        this.dateTimePeriod = dateTimePeriod;  return this;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public OsPatientDemographicInfo setGenderCode(String genderCode) {
        this.genderCode = genderCode;  return this;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public OsPatientDemographicInfo setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;  return this;
    }

    public String getCompRaqceEthnInfo() {
        return compRaqceEthnInfo;
    }

    public OsPatientDemographicInfo setCompRaqceEthnInfo(String compRaqceEthnInfo) {
        this.compRaqceEthnInfo = compRaqceEthnInfo;  return this;
    }

    public String getCitizenStatusCode() {
        return citizenStatusCode;
    }

    public OsPatientDemographicInfo setCitizenStatusCode(String citizenStatusCode) {
        this.citizenStatusCode = citizenStatusCode;  return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public OsPatientDemographicInfo setCountryCode(String countryCode) {
        this.countryCode = countryCode;  return this;
    }

    public String getBasisVerifCode() {
        return basisVerifCode;
    }

    public OsPatientDemographicInfo setBasisVerifCode(String basisVerifCode) {
        this.basisVerifCode = basisVerifCode;  return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public OsPatientDemographicInfo setQuantity(String quantity) {
        this.quantity = quantity;  return this;
    }

    public String getCodeListQualifierCode() {
        return codeListQualifierCode;
    }

    public OsPatientDemographicInfo setCodeListQualifierCode(String codeListQualifierCode) {
        this.codeListQualifierCode = codeListQualifierCode;  return this;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public OsPatientDemographicInfo setIndustryCode(String industryCode) {
        this.industryCode = industryCode;  return this;
    }
}