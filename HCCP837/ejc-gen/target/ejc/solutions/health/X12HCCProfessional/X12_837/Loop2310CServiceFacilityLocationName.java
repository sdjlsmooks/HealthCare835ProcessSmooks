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

public class Loop2310CServiceFacilityLocationName implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private SflName sflName;
    private SflAddress sflAddress;
    private SflCityStateZipCode sflCityStateZipCode;
    private List<SflSecondaryID> sflSecondaryID;
    private SflContactInformation sflContactInformation;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(sflName != null) {
            nodeWriter.write("SDJLNM1_7");
            nodeWriter.write(delimiters.getField());
            sflName.write(nodeWriter, delimiters);
        }
        if(sflAddress != null) {
            nodeWriter.write("SDJLN3_3");
            nodeWriter.write(delimiters.getField());
            sflAddress.write(nodeWriter, delimiters);
        }
        if(sflCityStateZipCode != null) {
            nodeWriter.write("SDJLN4_4");
            nodeWriter.write(delimiters.getField());
            sflCityStateZipCode.write(nodeWriter, delimiters);
        }
        if(sflSecondaryID != null && !sflSecondaryID.isEmpty()) {
            for(SflSecondaryID sflSecondaryIDInst : sflSecondaryID) {
                nodeWriter.write("SDJLREF14");
                nodeWriter.write(delimiters.getField());
                sflSecondaryIDInst.write(nodeWriter, delimiters);
            }
        }
        if(sflContactInformation != null) {
            nodeWriter.write("SDJLPER3");
            nodeWriter.write(delimiters.getField());
            sflContactInformation.write(nodeWriter, delimiters);
        }
    }

    public SflName getSflName() {
        return sflName;
    }

    public Loop2310CServiceFacilityLocationName setSflName(SflName sflName) {
        this.sflName = sflName;  return this;
    }

    public SflAddress getSflAddress() {
        return sflAddress;
    }

    public Loop2310CServiceFacilityLocationName setSflAddress(SflAddress sflAddress) {
        this.sflAddress = sflAddress;  return this;
    }

    public SflCityStateZipCode getSflCityStateZipCode() {
        return sflCityStateZipCode;
    }

    public Loop2310CServiceFacilityLocationName setSflCityStateZipCode(SflCityStateZipCode sflCityStateZipCode) {
        this.sflCityStateZipCode = sflCityStateZipCode;  return this;
    }

    public List<SflSecondaryID> getSflSecondaryID() {
        return sflSecondaryID;
    }

    public Loop2310CServiceFacilityLocationName setSflSecondaryID(List<SflSecondaryID> sflSecondaryID) {
        this.sflSecondaryID = sflSecondaryID;  return this;
    }

    public SflContactInformation getSflContactInformation() {
        return sflContactInformation;
    }

    public Loop2310CServiceFacilityLocationName setSflContactInformation(SflContactInformation sflContactInformation) {
        this.sflContactInformation = sflContactInformation;  return this;
    }
}