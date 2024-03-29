/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import org.milyn.javabean.decoders.IntegerDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class FunctionalGroupTrailer implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String numberIncludedTransactionSets;
    private Integer groupControlNumber;
    private IntegerDecoder groupControlNumberEncoder;

    public FunctionalGroupTrailer() {
        
        groupControlNumberEncoder = new IntegerDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(numberIncludedTransactionSets != null) {
            nodeWriter.write(delimiters.escape(numberIncludedTransactionSets.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(groupControlNumber != null) {
            nodeWriter.write(delimiters.escape(groupControlNumberEncoder.encode(groupControlNumber)));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getNumberIncludedTransactionSets() {
        return numberIncludedTransactionSets;
    }

    public FunctionalGroupTrailer setNumberIncludedTransactionSets(String numberIncludedTransactionSets) {
        this.numberIncludedTransactionSets = numberIncludedTransactionSets;  return this;
    }

    public Integer getGroupControlNumber() {
        return groupControlNumber;
    }

    public FunctionalGroupTrailer setGroupControlNumber(Integer groupControlNumber) {
        this.groupControlNumber = groupControlNumber;  return this;
    }
}