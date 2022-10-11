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

public class SubPatientInformation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String payerRespSeqNoCode;
    private String individualRelatCode;
    private String referenceIndentification;
    private String name;
    private String insuranceTypeCode;
    private String benefCoordCode;
    private String yesNoCondRespCode;
    private String employmentStatusCode;
    private String claimFileIndCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(payerRespSeqNoCode != null) {
            nodeWriter.write(delimiters.escape(payerRespSeqNoCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(individualRelatCode != null) {
            nodeWriter.write(delimiters.escape(individualRelatCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(referenceIndentification != null) {
            nodeWriter.write(delimiters.escape(referenceIndentification.toString()));
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
        if(insuranceTypeCode != null) {
            nodeWriter.write(delimiters.escape(insuranceTypeCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(benefCoordCode != null) {
            nodeWriter.write(delimiters.escape(benefCoordCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(yesNoCondRespCode != null) {
            nodeWriter.write(delimiters.escape(yesNoCondRespCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(employmentStatusCode != null) {
            nodeWriter.write(delimiters.escape(employmentStatusCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(claimFileIndCode != null) {
            nodeWriter.write(delimiters.escape(claimFileIndCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getPayerRespSeqNoCode() {
        return payerRespSeqNoCode;
    }

    public SubPatientInformation setPayerRespSeqNoCode(String payerRespSeqNoCode) {
        this.payerRespSeqNoCode = payerRespSeqNoCode;  return this;
    }

    public String getIndividualRelatCode() {
        return individualRelatCode;
    }

    public SubPatientInformation setIndividualRelatCode(String individualRelatCode) {
        this.individualRelatCode = individualRelatCode;  return this;
    }

    public String getReferenceIndentification() {
        return referenceIndentification;
    }

    public SubPatientInformation setReferenceIndentification(String referenceIndentification) {
        this.referenceIndentification = referenceIndentification;  return this;
    }

    public String getName() {
        return name;
    }

    public SubPatientInformation setName(String name) {
        this.name = name;  return this;
    }

    public String getInsuranceTypeCode() {
        return insuranceTypeCode;
    }

    public SubPatientInformation setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;  return this;
    }

    public String getBenefCoordCode() {
        return benefCoordCode;
    }

    public SubPatientInformation setBenefCoordCode(String benefCoordCode) {
        this.benefCoordCode = benefCoordCode;  return this;
    }

    public String getYesNoCondRespCode() {
        return yesNoCondRespCode;
    }

    public SubPatientInformation setYesNoCondRespCode(String yesNoCondRespCode) {
        this.yesNoCondRespCode = yesNoCondRespCode;  return this;
    }

    public String getEmploymentStatusCode() {
        return employmentStatusCode;
    }

    public SubPatientInformation setEmploymentStatusCode(String employmentStatusCode) {
        this.employmentStatusCode = employmentStatusCode;  return this;
    }

    public String getClaimFileIndCode() {
        return claimFileIndCode;
    }

    public SubPatientInformation setClaimFileIndCode(String claimFileIndCode) {
        this.claimFileIndCode = claimFileIndCode;  return this;
    }
}