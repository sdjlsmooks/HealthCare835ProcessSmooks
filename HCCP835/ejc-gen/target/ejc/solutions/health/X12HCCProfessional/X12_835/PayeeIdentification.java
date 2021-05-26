/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.io.StringWriter;    
import java.util.List;    
import java.util.ArrayList;    
import org.milyn.edisax.util.EDIUtils;    
import org.milyn.edisax.model.internal.DelimiterType;    

public class PayeeIdentification implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String entityIDCode;
    private String name;
    private String idCodeQualifier;
    private String idCode;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(entityIDCode != null) {
            nodeWriter.write(delimiters.escape(entityIDCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(name != null) {
            nodeWriter.write(delimiters.escape(name.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(idCodeQualifier != null) {
            nodeWriter.write(delimiters.escape(idCodeQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(idCode != null) {
            nodeWriter.write(delimiters.escape(idCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getEntityIDCode() {
        return entityIDCode;
    }

    public PayeeIdentification setEntityIDCode(String entityIDCode) {
        this.entityIDCode = entityIDCode;  return this;
    }

    public String getName() {
        return name;
    }

    public PayeeIdentification setName(String name) {
        this.name = name;  return this;
    }

    public String getIdCodeQualifier() {
        return idCodeQualifier;
    }

    public PayeeIdentification setIdCodeQualifier(String idCodeQualifier) {
        this.idCodeQualifier = idCodeQualifier;  return this;
    }

    public String getIdCode() {
        return idCode;
    }

    public PayeeIdentification setIdCode(String idCode) {
        this.idCode = idCode;  return this;
    }
}