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

public class Loop2420BPurchasedServiceProviderName implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private PsName psName;
    private List<PsSecondaryID> psSecondaryID;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(psName != null) {
            nodeWriter.write("SDJLNM1_6");
            nodeWriter.write(delimiters.getField());
            psName.write(nodeWriter, delimiters);
        }
        if(psSecondaryID != null && !psSecondaryID.isEmpty()) {
            for(PsSecondaryID psSecondaryIDInst : psSecondaryID) {
                nodeWriter.write("SDJLREF14");
                nodeWriter.write(delimiters.getField());
                psSecondaryIDInst.write(nodeWriter, delimiters);
            }
        }
    }

    public PsName getPsName() {
        return psName;
    }

    public Loop2420BPurchasedServiceProviderName setPsName(PsName psName) {
        this.psName = psName;  return this;
    }

    public List<PsSecondaryID> getPsSecondaryID() {
        return psSecondaryID;
    }

    public Loop2420BPurchasedServiceProviderName setPsSecondaryID(List<PsSecondaryID> psSecondaryID) {
        this.psSecondaryID = psSecondaryID;  return this;
    }
}