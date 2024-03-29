/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.util.List;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Loop1000APayerIdentification implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private PayerIdentification payerIdentification;
    private PayerAddress payerAddress;
    private PayerCityStateZipCode payerCityStateZipCode;
    private List<AdditionalPayerIdentification> additionalPayerIdentification;
    private PayerBusinessContactInformation payerBusinessContactInformation;
    private PayerTechnicalContactInformation payerTechnicalContactInformation;
    private PayerWEBSite payerWEBSite;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(payerIdentification != null) {
            nodeWriter.write("N1");
            nodeWriter.write(delimiters.getField());
            payerIdentification.write(nodeWriter, delimiters);
        }
        if(payerAddress != null) {
            nodeWriter.write("N3");
            nodeWriter.write(delimiters.getField());
            payerAddress.write(nodeWriter, delimiters);
        }
        if(payerCityStateZipCode != null) {
            nodeWriter.write("N4");
            nodeWriter.write(delimiters.getField());
            payerCityStateZipCode.write(nodeWriter, delimiters);
        }
        if(additionalPayerIdentification != null && !additionalPayerIdentification.isEmpty()) {
            for(AdditionalPayerIdentification additionalPayerIdentificationInst : additionalPayerIdentification) {
                nodeWriter.write("REF");
                nodeWriter.write(delimiters.getField());
                additionalPayerIdentificationInst.write(nodeWriter, delimiters);
            }
        }
        if(payerBusinessContactInformation != null) {
            nodeWriter.write("PER");
            nodeWriter.write(delimiters.getField());
            payerBusinessContactInformation.write(nodeWriter, delimiters);
        }
        if(payerTechnicalContactInformation != null) {
            nodeWriter.write("PER");
            nodeWriter.write(delimiters.getField());
            payerTechnicalContactInformation.write(nodeWriter, delimiters);
        }
        if(payerWEBSite != null) {
            nodeWriter.write("3");
            nodeWriter.write(delimiters.getField());
            payerWEBSite.write(nodeWriter, delimiters);
        }
    }

    public PayerIdentification getPayerIdentification() {
        return payerIdentification;
    }

    public Loop1000APayerIdentification setPayerIdentification(PayerIdentification payerIdentification) {
        this.payerIdentification = payerIdentification;  return this;
    }

    public PayerAddress getPayerAddress() {
        return payerAddress;
    }

    public Loop1000APayerIdentification setPayerAddress(PayerAddress payerAddress) {
        this.payerAddress = payerAddress;  return this;
    }

    public PayerCityStateZipCode getPayerCityStateZipCode() {
        return payerCityStateZipCode;
    }

    public Loop1000APayerIdentification setPayerCityStateZipCode(PayerCityStateZipCode payerCityStateZipCode) {
        this.payerCityStateZipCode = payerCityStateZipCode;  return this;
    }

    public List<AdditionalPayerIdentification> getAdditionalPayerIdentification() {
        return additionalPayerIdentification;
    }

    public Loop1000APayerIdentification setAdditionalPayerIdentification(List<AdditionalPayerIdentification> additionalPayerIdentification) {
        this.additionalPayerIdentification = additionalPayerIdentification;  return this;
    }

    public PayerBusinessContactInformation getPayerBusinessContactInformation() {
        return payerBusinessContactInformation;
    }

    public Loop1000APayerIdentification setPayerBusinessContactInformation(PayerBusinessContactInformation payerBusinessContactInformation) {
        this.payerBusinessContactInformation = payerBusinessContactInformation;  return this;
    }

    public PayerTechnicalContactInformation getPayerTechnicalContactInformation() {
        return payerTechnicalContactInformation;
    }

    public Loop1000APayerIdentification setPayerTechnicalContactInformation(PayerTechnicalContactInformation payerTechnicalContactInformation) {
        this.payerTechnicalContactInformation = payerTechnicalContactInformation;  return this;
    }

    public PayerWEBSite getPayerWEBSite() {
        return payerWEBSite;
    }

    public Loop1000APayerIdentification setPayerWEBSite(PayerWEBSite payerWEBSite) {
        this.payerWEBSite = payerWEBSite;  return this;
    }
}