/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Loop2400HAmbulanceDropOffLocation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private AdoName adoName;
    private AdoAddress adoAddress;
    private AdoCityStateZipCode adoCityStateZipCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(adoName != null) {
            nodeWriter.write("SDJLNM1_7");
            nodeWriter.write(delimiters.getField());
            adoName.write(nodeWriter, delimiters);
        }
        if(adoAddress != null) {
            nodeWriter.write("SDJLN3_3");
            nodeWriter.write(delimiters.getField());
            adoAddress.write(nodeWriter, delimiters);
        }
        if(adoCityStateZipCode != null) {
            nodeWriter.write("SDJLN4_4");
            nodeWriter.write(delimiters.getField());
            adoCityStateZipCode.write(nodeWriter, delimiters);
        }
    }

    public AdoName getAdoName() {
        return adoName;
    }

    public Loop2400HAmbulanceDropOffLocation setAdoName(AdoName adoName) {
        this.adoName = adoName;  return this;
    }

    public AdoAddress getAdoAddress() {
        return adoAddress;
    }

    public Loop2400HAmbulanceDropOffLocation setAdoAddress(AdoAddress adoAddress) {
        this.adoAddress = adoAddress;  return this;
    }

    public AdoCityStateZipCode getAdoCityStateZipCode() {
        return adoCityStateZipCode;
    }

    public Loop2400HAmbulanceDropOffLocation setAdoCityStateZipCode(AdoCityStateZipCode adoCityStateZipCode) {
        this.adoCityStateZipCode = adoCityStateZipCode;  return this;
    }
}