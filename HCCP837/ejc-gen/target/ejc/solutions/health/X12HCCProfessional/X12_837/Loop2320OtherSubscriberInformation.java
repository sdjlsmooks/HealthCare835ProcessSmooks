/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.util.List;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Loop2320OtherSubscriberInformation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private List<OtherSubscriberInformation> otherSubscriberInformation;
    private List<ClaimLevelAdjustment> claimLevelAdjustment;
    private List<CobPayerPaid> cobPayerPaid;
    private CobTotalNonCovered cobTotalNonCovered;
    private RemainingPatientLiability remainingPatientLiability;
    private OsPatientDemographicInfo osPatientDemographicInfo;
    private OtherInsuranceCoverageInfo otherInsuranceCoverageInfo;
    private OutPatientAdjudicationInformation outPatientAdjudicationInformation;
    private Loop2330AOtherSubscriberName loop2330AOtherSubscriberName;
    private Loop2330BOtherPayerName loop2330BOtherPayerName;
    private List<Loop2330COtherPayerReferringProvider> loop2330COtherPayerReferringProvider;
    private Loop2330DOtherPayerRenderingProvider loop2330DOtherPayerRenderingProvider;
    private Loop2330EOtherProvideServiceFacilityLocation loop2330EOtherProvideServiceFacilityLocation;
    private Loop2330FOtherPayerSupervisingProvider loop2330FOtherPayerSupervisingProvider;
    private Loop2330GOtherPayerBillingProvider loop2330GOtherPayerBillingProvider;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(otherSubscriberInformation != null && !otherSubscriberInformation.isEmpty()) {
            for(OtherSubscriberInformation otherSubscriberInformationInst : otherSubscriberInformation) {
                nodeWriter.write("SBR");
                nodeWriter.write(delimiters.getField());
                otherSubscriberInformationInst.write(nodeWriter, delimiters);
            }
        }
        if(claimLevelAdjustment != null && !claimLevelAdjustment.isEmpty()) {
            for(ClaimLevelAdjustment claimLevelAdjustmentInst : claimLevelAdjustment) {
                nodeWriter.write("CAS");
                nodeWriter.write(delimiters.getField());
                claimLevelAdjustmentInst.write(nodeWriter, delimiters);
            }
        }
        if(cobPayerPaid != null && !cobPayerPaid.isEmpty()) {
            for(CobPayerPaid cobPayerPaidInst : cobPayerPaid) {
                nodeWriter.write("SDJLAMT2");
                nodeWriter.write(delimiters.getField());
                cobPayerPaidInst.write(nodeWriter, delimiters);
            }
        }
        if(cobTotalNonCovered != null) {
            nodeWriter.write("SDJLAMT3");
            nodeWriter.write(delimiters.getField());
            cobTotalNonCovered.write(nodeWriter, delimiters);
        }
        if(remainingPatientLiability != null) {
            nodeWriter.write("SDJLAMT4");
            nodeWriter.write(delimiters.getField());
            remainingPatientLiability.write(nodeWriter, delimiters);
        }
        if(osPatientDemographicInfo != null) {
            nodeWriter.write("SDJLDMG_3");
            nodeWriter.write(delimiters.getField());
            osPatientDemographicInfo.write(nodeWriter, delimiters);
        }
        if(otherInsuranceCoverageInfo != null) {
            nodeWriter.write("OI");
            nodeWriter.write(delimiters.getField());
            otherInsuranceCoverageInfo.write(nodeWriter, delimiters);
        }
        if(outPatientAdjudicationInformation != null) {
            nodeWriter.write("MOA");
            nodeWriter.write(delimiters.getField());
            outPatientAdjudicationInformation.write(nodeWriter, delimiters);
        }
        if(loop2330AOtherSubscriberName != null) {
            loop2330AOtherSubscriberName.write(nodeWriter, delimiters);
        }
        if(loop2330BOtherPayerName != null) {
            loop2330BOtherPayerName.write(nodeWriter, delimiters);
        }
        if(loop2330COtherPayerReferringProvider != null && !loop2330COtherPayerReferringProvider.isEmpty()) {
            for(Loop2330COtherPayerReferringProvider loop2330COtherPayerReferringProviderInst : loop2330COtherPayerReferringProvider) {
                loop2330COtherPayerReferringProviderInst.write(nodeWriter, delimiters);
            }
        }
        if(loop2330DOtherPayerRenderingProvider != null) {
            loop2330DOtherPayerRenderingProvider.write(nodeWriter, delimiters);
        }
        if(loop2330EOtherProvideServiceFacilityLocation != null) {
            loop2330EOtherProvideServiceFacilityLocation.write(nodeWriter, delimiters);
        }
        if(loop2330FOtherPayerSupervisingProvider != null) {
            loop2330FOtherPayerSupervisingProvider.write(nodeWriter, delimiters);
        }
        if(loop2330GOtherPayerBillingProvider != null) {
            loop2330GOtherPayerBillingProvider.write(nodeWriter, delimiters);
        }
    }

    public List<OtherSubscriberInformation> getOtherSubscriberInformation() {
        return otherSubscriberInformation;
    }

    public Loop2320OtherSubscriberInformation setOtherSubscriberInformation(List<OtherSubscriberInformation> otherSubscriberInformation) {
        this.otherSubscriberInformation = otherSubscriberInformation;  return this;
    }

    public List<ClaimLevelAdjustment> getClaimLevelAdjustment() {
        return claimLevelAdjustment;
    }

    public Loop2320OtherSubscriberInformation setClaimLevelAdjustment(List<ClaimLevelAdjustment> claimLevelAdjustment) {
        this.claimLevelAdjustment = claimLevelAdjustment;  return this;
    }

    public List<CobPayerPaid> getCobPayerPaid() {
        return cobPayerPaid;
    }

    public Loop2320OtherSubscriberInformation setCobPayerPaid(List<CobPayerPaid> cobPayerPaid) {
        this.cobPayerPaid = cobPayerPaid;  return this;
    }

    public CobTotalNonCovered getCobTotalNonCovered() {
        return cobTotalNonCovered;
    }

    public Loop2320OtherSubscriberInformation setCobTotalNonCovered(CobTotalNonCovered cobTotalNonCovered) {
        this.cobTotalNonCovered = cobTotalNonCovered;  return this;
    }

    public RemainingPatientLiability getRemainingPatientLiability() {
        return remainingPatientLiability;
    }

    public Loop2320OtherSubscriberInformation setRemainingPatientLiability(RemainingPatientLiability remainingPatientLiability) {
        this.remainingPatientLiability = remainingPatientLiability;  return this;
    }

    public OsPatientDemographicInfo getOsPatientDemographicInfo() {
        return osPatientDemographicInfo;
    }

    public Loop2320OtherSubscriberInformation setOsPatientDemographicInfo(OsPatientDemographicInfo osPatientDemographicInfo) {
        this.osPatientDemographicInfo = osPatientDemographicInfo;  return this;
    }

    public OtherInsuranceCoverageInfo getOtherInsuranceCoverageInfo() {
        return otherInsuranceCoverageInfo;
    }

    public Loop2320OtherSubscriberInformation setOtherInsuranceCoverageInfo(OtherInsuranceCoverageInfo otherInsuranceCoverageInfo) {
        this.otherInsuranceCoverageInfo = otherInsuranceCoverageInfo;  return this;
    }

    public OutPatientAdjudicationInformation getOutPatientAdjudicationInformation() {
        return outPatientAdjudicationInformation;
    }

    public Loop2320OtherSubscriberInformation setOutPatientAdjudicationInformation(OutPatientAdjudicationInformation outPatientAdjudicationInformation) {
        this.outPatientAdjudicationInformation = outPatientAdjudicationInformation;  return this;
    }

    public Loop2330AOtherSubscriberName getLoop2330AOtherSubscriberName() {
        return loop2330AOtherSubscriberName;
    }

    public Loop2320OtherSubscriberInformation setLoop2330AOtherSubscriberName(Loop2330AOtherSubscriberName loop2330AOtherSubscriberName) {
        this.loop2330AOtherSubscriberName = loop2330AOtherSubscriberName;  return this;
    }

    public Loop2330BOtherPayerName getLoop2330BOtherPayerName() {
        return loop2330BOtherPayerName;
    }

    public Loop2320OtherSubscriberInformation setLoop2330BOtherPayerName(Loop2330BOtherPayerName loop2330BOtherPayerName) {
        this.loop2330BOtherPayerName = loop2330BOtherPayerName;  return this;
    }

    public List<Loop2330COtherPayerReferringProvider> getLoop2330COtherPayerReferringProvider() {
        return loop2330COtherPayerReferringProvider;
    }

    public Loop2320OtherSubscriberInformation setLoop2330COtherPayerReferringProvider(List<Loop2330COtherPayerReferringProvider> loop2330COtherPayerReferringProvider) {
        this.loop2330COtherPayerReferringProvider = loop2330COtherPayerReferringProvider;  return this;
    }

    public Loop2330DOtherPayerRenderingProvider getLoop2330DOtherPayerRenderingProvider() {
        return loop2330DOtherPayerRenderingProvider;
    }

    public Loop2320OtherSubscriberInformation setLoop2330DOtherPayerRenderingProvider(Loop2330DOtherPayerRenderingProvider loop2330DOtherPayerRenderingProvider) {
        this.loop2330DOtherPayerRenderingProvider = loop2330DOtherPayerRenderingProvider;  return this;
    }

    public Loop2330EOtherProvideServiceFacilityLocation getLoop2330EOtherProvideServiceFacilityLocation() {
        return loop2330EOtherProvideServiceFacilityLocation;
    }

    public Loop2320OtherSubscriberInformation setLoop2330EOtherProvideServiceFacilityLocation(Loop2330EOtherProvideServiceFacilityLocation loop2330EOtherProvideServiceFacilityLocation) {
        this.loop2330EOtherProvideServiceFacilityLocation = loop2330EOtherProvideServiceFacilityLocation;  return this;
    }

    public Loop2330FOtherPayerSupervisingProvider getLoop2330FOtherPayerSupervisingProvider() {
        return loop2330FOtherPayerSupervisingProvider;
    }

    public Loop2320OtherSubscriberInformation setLoop2330FOtherPayerSupervisingProvider(Loop2330FOtherPayerSupervisingProvider loop2330FOtherPayerSupervisingProvider) {
        this.loop2330FOtherPayerSupervisingProvider = loop2330FOtherPayerSupervisingProvider;  return this;
    }

    public Loop2330GOtherPayerBillingProvider getLoop2330GOtherPayerBillingProvider() {
        return loop2330GOtherPayerBillingProvider;
    }

    public Loop2320OtherSubscriberInformation setLoop2330GOtherPayerBillingProvider(Loop2330GOtherPayerBillingProvider loop2330GOtherPayerBillingProvider) {
        this.loop2330GOtherPayerBillingProvider = loop2330GOtherPayerBillingProvider;  return this;
    }
}