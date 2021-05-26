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

public class HeaderSection implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private List<BpSpecialityInformation> bpSpecialityInformation;
    private List<ForeignCurrencyInformation> foreignCurrencyInformation;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(bpSpecialityInformation != null && !bpSpecialityInformation.isEmpty()) {
            for(BpSpecialityInformation bpSpecialityInformationInst : bpSpecialityInformation) {
                nodeWriter.write("SDJLPRVa9");
                nodeWriter.write(delimiters.getField());
                bpSpecialityInformationInst.write(nodeWriter, delimiters);
            }
        }
        if(foreignCurrencyInformation != null && !foreignCurrencyInformation.isEmpty()) {
            for(ForeignCurrencyInformation foreignCurrencyInformationInst : foreignCurrencyInformation) {
                nodeWriter.write("SDJLCURa10");
                nodeWriter.write(delimiters.getField());
                foreignCurrencyInformationInst.write(nodeWriter, delimiters);
            }
        }
    }

    public List<BpSpecialityInformation> getBpSpecialityInformation() {
        return bpSpecialityInformation;
    }

    public HeaderSection setBpSpecialityInformation(List<BpSpecialityInformation> bpSpecialityInformation) {
        this.bpSpecialityInformation = bpSpecialityInformation;  return this;
    }

    public List<ForeignCurrencyInformation> getForeignCurrencyInformation() {
        return foreignCurrencyInformation;
    }

    public HeaderSection setForeignCurrencyInformation(List<ForeignCurrencyInformation> foreignCurrencyInformation) {
        this.foreignCurrencyInformation = foreignCurrencyInformation;  return this;
    }
}