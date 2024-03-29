/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Interchange implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private InterchangeControlHeader interchangeControlHeader;
    private FunctionalGroup functionalGroup;
    private InterchangeControlTrailer interchangeControlTrailer;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(interchangeControlHeader != null) {
            nodeWriter.write("ISA");
            nodeWriter.write(delimiters.getField());
            interchangeControlHeader.write(nodeWriter, delimiters);
        }
        if(functionalGroup != null) {
            functionalGroup.write(nodeWriter, delimiters);
        }
        if(interchangeControlTrailer != null) {
            nodeWriter.write("IEA");
            nodeWriter.write(delimiters.getField());
            interchangeControlTrailer.write(nodeWriter, delimiters);
        }
    }

    public InterchangeControlHeader getInterchangeControlHeader() {
        return interchangeControlHeader;
    }

    public Interchange setInterchangeControlHeader(InterchangeControlHeader interchangeControlHeader) {
        this.interchangeControlHeader = interchangeControlHeader;  return this;
    }

    public FunctionalGroup getFunctionalGroup() {
        return functionalGroup;
    }

    public Interchange setFunctionalGroup(FunctionalGroup functionalGroup) {
        this.functionalGroup = functionalGroup;  return this;
    }

    public InterchangeControlTrailer getInterchangeControlTrailer() {
        return interchangeControlTrailer;
    }

    public Interchange setInterchangeControlTrailer(InterchangeControlTrailer interchangeControlTrailer) {
        this.interchangeControlTrailer = interchangeControlTrailer;  return this;
    }
}