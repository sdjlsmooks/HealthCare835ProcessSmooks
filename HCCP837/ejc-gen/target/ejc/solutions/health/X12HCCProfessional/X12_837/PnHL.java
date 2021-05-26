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
import java.io.StringWriter;    
import java.util.List;    
import java.util.ArrayList;    
import org.milyn.edisax.util.EDIUtils;    
import org.milyn.edisax.model.internal.DelimiterType;    

public class PnHL implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private Double hierarchicalIDNumber;
    private DoubleDecoder hierarchicalIDNumberEncoder;
    private Double hlParentIDNumber;
    private DoubleDecoder hlParentIDNumberEncoder;
    private Double hlCode;
    private DoubleDecoder hlCodeEncoder;
    private Double hlChildCode;
    private DoubleDecoder hlChildCodeEncoder;

    public PnHL() {
        
        hierarchicalIDNumberEncoder = new DoubleDecoder();
        hlParentIDNumberEncoder = new DoubleDecoder();
        hlCodeEncoder = new DoubleDecoder();
        hlChildCodeEncoder = new DoubleDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(hierarchicalIDNumber != null) {
            nodeWriter.write(delimiters.escape(hierarchicalIDNumberEncoder.encode(hierarchicalIDNumber)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(hlParentIDNumber != null) {
            nodeWriter.write(delimiters.escape(hlParentIDNumberEncoder.encode(hlParentIDNumber)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(hlCode != null) {
            nodeWriter.write(delimiters.escape(hlCodeEncoder.encode(hlCode)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(hlChildCode != null) {
            nodeWriter.write(delimiters.escape(hlChildCodeEncoder.encode(hlChildCode)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public Double getHierarchicalIDNumber() {
        return hierarchicalIDNumber;
    }

    public PnHL setHierarchicalIDNumber(Double hierarchicalIDNumber) {
        this.hierarchicalIDNumber = hierarchicalIDNumber;  return this;
    }

    public Double getHlParentIDNumber() {
        return hlParentIDNumber;
    }

    public PnHL setHlParentIDNumber(Double hlParentIDNumber) {
        this.hlParentIDNumber = hlParentIDNumber;  return this;
    }

    public Double getHlCode() {
        return hlCode;
    }

    public PnHL setHlCode(Double hlCode) {
        this.hlCode = hlCode;  return this;
    }

    public Double getHlChildCode() {
        return hlChildCode;
    }

    public PnHL setHlChildCode(Double hlChildCode) {
        this.hlChildCode = hlChildCode;  return this;
    }
}