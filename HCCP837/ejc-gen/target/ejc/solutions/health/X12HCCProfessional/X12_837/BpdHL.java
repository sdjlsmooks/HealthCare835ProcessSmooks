/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import org.milyn.javabean.decoders.DoubleDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class BpdHL implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private Double hierarchicalIDNumber;
    private DoubleDecoder hierarchicalIDNumberEncoder;
    private Double hlParentIDNumber;
    private DoubleDecoder hlParentIDNumberEncoder;
    private Double hlCode;
    private DoubleDecoder hlCodeEncoder;
    private Double hlChildCode;
    private DoubleDecoder hlChildCodeEncoder;

    public BpdHL() {
        
        hierarchicalIDNumberEncoder = new DoubleDecoder();
        hlParentIDNumberEncoder = new DoubleDecoder();
        hlCodeEncoder = new DoubleDecoder();
        hlChildCodeEncoder = new DoubleDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(hierarchicalIDNumber != null) {
            nodeWriter.write(delimiters.escape(hierarchicalIDNumberEncoder.encode(hierarchicalIDNumber)));
        }
        nodeWriter.write(delimiters.getField());
        if(hlParentIDNumber != null) {
            nodeWriter.write(delimiters.escape(hlParentIDNumberEncoder.encode(hlParentIDNumber)));
        }
        nodeWriter.write(delimiters.getField());
        if(hlCode != null) {
            nodeWriter.write(delimiters.escape(hlCodeEncoder.encode(hlCode)));
        }
        nodeWriter.write(delimiters.getField());
        if(hlChildCode != null) {
            nodeWriter.write(delimiters.escape(hlChildCodeEncoder.encode(hlChildCode)));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public Double getHierarchicalIDNumber() {
        return hierarchicalIDNumber;
    }

    public BpdHL setHierarchicalIDNumber(Double hierarchicalIDNumber) {
        this.hierarchicalIDNumber = hierarchicalIDNumber;  return this;
    }

    public Double getHlParentIDNumber() {
        return hlParentIDNumber;
    }

    public BpdHL setHlParentIDNumber(Double hlParentIDNumber) {
        this.hlParentIDNumber = hlParentIDNumber;  return this;
    }

    public Double getHlCode() {
        return hlCode;
    }

    public BpdHL setHlCode(Double hlCode) {
        this.hlCode = hlCode;  return this;
    }

    public Double getHlChildCode() {
        return hlChildCode;
    }

    public BpdHL setHlChildCode(Double hlChildCode) {
        this.hlChildCode = hlChildCode;  return this;
    }
}