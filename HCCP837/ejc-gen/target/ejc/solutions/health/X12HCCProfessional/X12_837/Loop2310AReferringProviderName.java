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

public class Loop2310AReferringProviderName implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private RpName rpName;
    private List<RpSecondaryID> rpSecondaryID;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(rpName != null) {
            nodeWriter.write("SDJLNM1_6");
            nodeWriter.write(delimiters.getField());
            rpName.write(nodeWriter, delimiters);
        }
        if(rpSecondaryID != null && !rpSecondaryID.isEmpty()) {
            for(RpSecondaryID rpSecondaryIDInst : rpSecondaryID) {
                nodeWriter.write("SDJLREF14");
                nodeWriter.write(delimiters.getField());
                rpSecondaryIDInst.write(nodeWriter, delimiters);
            }
        }
    }

    public RpName getRpName() {
        return rpName;
    }

    public Loop2310AReferringProviderName setRpName(RpName rpName) {
        this.rpName = rpName;  return this;
    }

    public List<RpSecondaryID> getRpSecondaryID() {
        return rpSecondaryID;
    }

    public Loop2310AReferringProviderName setRpSecondaryID(List<RpSecondaryID> rpSecondaryID) {
        this.rpSecondaryID = rpSecondaryID;  return this;
    }
}