/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

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

public class PatientCondition implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String codeCategory;
    private String yesNoCodeRespCode;
    private String certificateCondCode1;
    private String certificateCondCode2;
    private String certificateCondCode3;
    private String certificateCondCode4;
    private String certificateCondCode5;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(codeCategory != null) {
            nodeWriter.write(delimiters.escape(codeCategory.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(yesNoCodeRespCode != null) {
            nodeWriter.write(delimiters.escape(yesNoCodeRespCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(certificateCondCode1 != null) {
            nodeWriter.write(delimiters.escape(certificateCondCode1.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(certificateCondCode2 != null) {
            nodeWriter.write(delimiters.escape(certificateCondCode2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(certificateCondCode3 != null) {
            nodeWriter.write(delimiters.escape(certificateCondCode3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(certificateCondCode4 != null) {
            nodeWriter.write(delimiters.escape(certificateCondCode4.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(certificateCondCode5 != null) {
            nodeWriter.write(delimiters.escape(certificateCondCode5.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getCodeCategory() {
        return codeCategory;
    }

    public PatientCondition setCodeCategory(String codeCategory) {
        this.codeCategory = codeCategory;  return this;
    }

    public String getYesNoCodeRespCode() {
        return yesNoCodeRespCode;
    }

    public PatientCondition setYesNoCodeRespCode(String yesNoCodeRespCode) {
        this.yesNoCodeRespCode = yesNoCodeRespCode;  return this;
    }

    public String getCertificateCondCode1() {
        return certificateCondCode1;
    }

    public PatientCondition setCertificateCondCode1(String certificateCondCode1) {
        this.certificateCondCode1 = certificateCondCode1;  return this;
    }

    public String getCertificateCondCode2() {
        return certificateCondCode2;
    }

    public PatientCondition setCertificateCondCode2(String certificateCondCode2) {
        this.certificateCondCode2 = certificateCondCode2;  return this;
    }

    public String getCertificateCondCode3() {
        return certificateCondCode3;
    }

    public PatientCondition setCertificateCondCode3(String certificateCondCode3) {
        this.certificateCondCode3 = certificateCondCode3;  return this;
    }

    public String getCertificateCondCode4() {
        return certificateCondCode4;
    }

    public PatientCondition setCertificateCondCode4(String certificateCondCode4) {
        this.certificateCondCode4 = certificateCondCode4;  return this;
    }

    public String getCertificateCondCode5() {
        return certificateCondCode5;
    }

    public PatientCondition setCertificateCondCode5(String certificateCondCode5) {
        this.certificateCondCode5 = certificateCondCode5;  return this;
    }
}