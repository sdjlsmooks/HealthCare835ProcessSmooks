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

public class Loop2000Detail implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private List<HeaderNumber> headerNumber;
    private List<ProviderSummaryInformation> providerSummaryInformation;
    private List<ProviderSupplementalSummaryInformation> providerSupplementalSummaryInformation;
    private List<Loop2100ClaimPaymentInformation> loop2100ClaimPaymentInformation;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(headerNumber != null && !headerNumber.isEmpty()) {
            for(HeaderNumber headerNumberInst : headerNumber) {
                nodeWriter.write("LX");
                nodeWriter.write(delimiters.getField());
                headerNumberInst.write(nodeWriter, delimiters);
            }
        }
        if(providerSummaryInformation != null && !providerSummaryInformation.isEmpty()) {
            for(ProviderSummaryInformation providerSummaryInformationInst : providerSummaryInformation) {
                nodeWriter.write("TS3");
                nodeWriter.write(delimiters.getField());
                providerSummaryInformationInst.write(nodeWriter, delimiters);
            }
        }
        if(providerSupplementalSummaryInformation != null && !providerSupplementalSummaryInformation.isEmpty()) {
            for(ProviderSupplementalSummaryInformation providerSupplementalSummaryInformationInst : providerSupplementalSummaryInformation) {
                nodeWriter.write("TS2");
                nodeWriter.write(delimiters.getField());
                providerSupplementalSummaryInformationInst.write(nodeWriter, delimiters);
            }
        }
        if(loop2100ClaimPaymentInformation != null && !loop2100ClaimPaymentInformation.isEmpty()) {
            for(Loop2100ClaimPaymentInformation loop2100ClaimPaymentInformationInst : loop2100ClaimPaymentInformation) {
                loop2100ClaimPaymentInformationInst.write(nodeWriter, delimiters);
            }
        }
    }

    public List<HeaderNumber> getHeaderNumber() {
        return headerNumber;
    }

    public Loop2000Detail setHeaderNumber(List<HeaderNumber> headerNumber) {
        this.headerNumber = headerNumber;  return this;
    }

    public List<ProviderSummaryInformation> getProviderSummaryInformation() {
        return providerSummaryInformation;
    }

    public Loop2000Detail setProviderSummaryInformation(List<ProviderSummaryInformation> providerSummaryInformation) {
        this.providerSummaryInformation = providerSummaryInformation;  return this;
    }

    public List<ProviderSupplementalSummaryInformation> getProviderSupplementalSummaryInformation() {
        return providerSupplementalSummaryInformation;
    }

    public Loop2000Detail setProviderSupplementalSummaryInformation(List<ProviderSupplementalSummaryInformation> providerSupplementalSummaryInformation) {
        this.providerSupplementalSummaryInformation = providerSupplementalSummaryInformation;  return this;
    }

    public List<Loop2100ClaimPaymentInformation> getLoop2100ClaimPaymentInformation() {
        return loop2100ClaimPaymentInformation;
    }

    public Loop2000Detail setLoop2100ClaimPaymentInformation(List<Loop2100ClaimPaymentInformation> loop2100ClaimPaymentInformation) {
        this.loop2100ClaimPaymentInformation = loop2100ClaimPaymentInformation;  return this;
    }
}