/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Loop2010BASubscriberName implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private PatientName patientName;
    private PatientAddress patientAddress;
    private PatientCityStateZipCode patientCityStateZipCode;
    private PatientDemographicInfo patientDemographicInfo;
    private SubSecondaryInfo subSecondaryInfo;
    private PropCasualClaimNumber propCasualClaimNumber;
    private PropCasuSubscriberContactInfo propCasuSubscriberContactInfo;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(patientName != null) {
            nodeWriter.write("SDJLNM1_8a29");
            nodeWriter.write(delimiters.getField());
            patientName.write(nodeWriter, delimiters);
        }
        if(patientAddress != null) {
            nodeWriter.write("SDJLN5_230");
            nodeWriter.write(delimiters.getField());
            patientAddress.write(nodeWriter, delimiters);
        }
        if(patientCityStateZipCode != null) {
            nodeWriter.write("SDJLN5_2a31");
            nodeWriter.write(delimiters.getField());
            patientCityStateZipCode.write(nodeWriter, delimiters);
        }
        if(patientDemographicInfo != null) {
            nodeWriter.write("SDJLDMG_3a32");
            nodeWriter.write(delimiters.getField());
            patientDemographicInfo.write(nodeWriter, delimiters);
        }
        if(subSecondaryInfo != null) {
            nodeWriter.write("SDJLREF4a33");
            nodeWriter.write(delimiters.getField());
            subSecondaryInfo.write(nodeWriter, delimiters);
        }
        if(propCasualClaimNumber != null) {
            nodeWriter.write("SDJLREF5a34");
            nodeWriter.write(delimiters.getField());
            propCasualClaimNumber.write(nodeWriter, delimiters);
        }
        if(propCasuSubscriberContactInfo != null) {
            nodeWriter.write("SDJLPER2a35");
            nodeWriter.write(delimiters.getField());
            propCasuSubscriberContactInfo.write(nodeWriter, delimiters);
        }
    }

    public PatientName getPatientName() {
        return patientName;
    }

    public Loop2010BASubscriberName setPatientName(PatientName patientName) {
        this.patientName = patientName;  return this;
    }

    public PatientAddress getPatientAddress() {
        return patientAddress;
    }

    public Loop2010BASubscriberName setPatientAddress(PatientAddress patientAddress) {
        this.patientAddress = patientAddress;  return this;
    }

    public PatientCityStateZipCode getPatientCityStateZipCode() {
        return patientCityStateZipCode;
    }

    public Loop2010BASubscriberName setPatientCityStateZipCode(PatientCityStateZipCode patientCityStateZipCode) {
        this.patientCityStateZipCode = patientCityStateZipCode;  return this;
    }

    public PatientDemographicInfo getPatientDemographicInfo() {
        return patientDemographicInfo;
    }

    public Loop2010BASubscriberName setPatientDemographicInfo(PatientDemographicInfo patientDemographicInfo) {
        this.patientDemographicInfo = patientDemographicInfo;  return this;
    }

    public SubSecondaryInfo getSubSecondaryInfo() {
        return subSecondaryInfo;
    }

    public Loop2010BASubscriberName setSubSecondaryInfo(SubSecondaryInfo subSecondaryInfo) {
        this.subSecondaryInfo = subSecondaryInfo;  return this;
    }

    public PropCasualClaimNumber getPropCasualClaimNumber() {
        return propCasualClaimNumber;
    }

    public Loop2010BASubscriberName setPropCasualClaimNumber(PropCasualClaimNumber propCasualClaimNumber) {
        this.propCasualClaimNumber = propCasualClaimNumber;  return this;
    }

    public PropCasuSubscriberContactInfo getPropCasuSubscriberContactInfo() {
        return propCasuSubscriberContactInfo;
    }

    public Loop2010BASubscriberName setPropCasuSubscriberContactInfo(PropCasuSubscriberContactInfo propCasuSubscriberContactInfo) {
        this.propCasuSubscriberContactInfo = propCasuSubscriberContactInfo;  return this;
    }
}