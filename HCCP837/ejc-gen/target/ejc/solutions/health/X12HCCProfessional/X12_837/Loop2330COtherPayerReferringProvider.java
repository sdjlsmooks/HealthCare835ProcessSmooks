/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Loop2330COtherPayerReferringProvider implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private OpReferringProvider opReferringProvider;
    private OpClaimControlNumber opClaimControlNumber;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(opReferringProvider != null) {
            nodeWriter.write("SDJLNM1_8");
            nodeWriter.write(delimiters.getField());
            opReferringProvider.write(nodeWriter, delimiters);
        }
        if(opClaimControlNumber != null) {
            nodeWriter.write("SDJLREF14");
            nodeWriter.write(delimiters.getField());
            opClaimControlNumber.write(nodeWriter, delimiters);
        }
    }

    public OpReferringProvider getOpReferringProvider() {
        return opReferringProvider;
    }

    public Loop2330COtherPayerReferringProvider setOpReferringProvider(OpReferringProvider opReferringProvider) {
        this.opReferringProvider = opReferringProvider;  return this;
    }

    public OpClaimControlNumber getOpClaimControlNumber() {
        return opClaimControlNumber;
    }

    public Loop2330COtherPayerReferringProvider setOpClaimControlNumber(OpClaimControlNumber opClaimControlNumber) {
        this.opClaimControlNumber = opClaimControlNumber;  return this;
    }
}