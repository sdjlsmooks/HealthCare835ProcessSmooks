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

public class ConditionInformation implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String healthCareCodeInfo1;
    private String healthCareCodeInfo2;
    private String healthCareCodeInfo3;
    private String healthCareCodeInfo4;
    private String healthCareCodeInfo5;
    private String healthCareCodeInfo6;
    private String healthCareCodeInfo7;
    private String healthCareCodeInfo8;
    private String healthCareCodeInfo9;
    private String healthCareCodeInfo10;
    private String healthCareCodeInfo11;
    private String healthCareCodeInfo12;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(healthCareCodeInfo1 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo1.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo2 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo3 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo4 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo4.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo5 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo5.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo6 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo6.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo7 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo7.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo8 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo8.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo9 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo9.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo10 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo10.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo11 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo11.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(healthCareCodeInfo12 != null) {
            nodeWriter.write(delimiters.escape(healthCareCodeInfo12.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getHealthCareCodeInfo1() {
        return healthCareCodeInfo1;
    }

    public ConditionInformation setHealthCareCodeInfo1(String healthCareCodeInfo1) {
        this.healthCareCodeInfo1 = healthCareCodeInfo1;  return this;
    }

    public String getHealthCareCodeInfo2() {
        return healthCareCodeInfo2;
    }

    public ConditionInformation setHealthCareCodeInfo2(String healthCareCodeInfo2) {
        this.healthCareCodeInfo2 = healthCareCodeInfo2;  return this;
    }

    public String getHealthCareCodeInfo3() {
        return healthCareCodeInfo3;
    }

    public ConditionInformation setHealthCareCodeInfo3(String healthCareCodeInfo3) {
        this.healthCareCodeInfo3 = healthCareCodeInfo3;  return this;
    }

    public String getHealthCareCodeInfo4() {
        return healthCareCodeInfo4;
    }

    public ConditionInformation setHealthCareCodeInfo4(String healthCareCodeInfo4) {
        this.healthCareCodeInfo4 = healthCareCodeInfo4;  return this;
    }

    public String getHealthCareCodeInfo5() {
        return healthCareCodeInfo5;
    }

    public ConditionInformation setHealthCareCodeInfo5(String healthCareCodeInfo5) {
        this.healthCareCodeInfo5 = healthCareCodeInfo5;  return this;
    }

    public String getHealthCareCodeInfo6() {
        return healthCareCodeInfo6;
    }

    public ConditionInformation setHealthCareCodeInfo6(String healthCareCodeInfo6) {
        this.healthCareCodeInfo6 = healthCareCodeInfo6;  return this;
    }

    public String getHealthCareCodeInfo7() {
        return healthCareCodeInfo7;
    }

    public ConditionInformation setHealthCareCodeInfo7(String healthCareCodeInfo7) {
        this.healthCareCodeInfo7 = healthCareCodeInfo7;  return this;
    }

    public String getHealthCareCodeInfo8() {
        return healthCareCodeInfo8;
    }

    public ConditionInformation setHealthCareCodeInfo8(String healthCareCodeInfo8) {
        this.healthCareCodeInfo8 = healthCareCodeInfo8;  return this;
    }

    public String getHealthCareCodeInfo9() {
        return healthCareCodeInfo9;
    }

    public ConditionInformation setHealthCareCodeInfo9(String healthCareCodeInfo9) {
        this.healthCareCodeInfo9 = healthCareCodeInfo9;  return this;
    }

    public String getHealthCareCodeInfo10() {
        return healthCareCodeInfo10;
    }

    public ConditionInformation setHealthCareCodeInfo10(String healthCareCodeInfo10) {
        this.healthCareCodeInfo10 = healthCareCodeInfo10;  return this;
    }

    public String getHealthCareCodeInfo11() {
        return healthCareCodeInfo11;
    }

    public ConditionInformation setHealthCareCodeInfo11(String healthCareCodeInfo11) {
        this.healthCareCodeInfo11 = healthCareCodeInfo11;  return this;
    }

    public String getHealthCareCodeInfo12() {
        return healthCareCodeInfo12;
    }

    public ConditionInformation setHealthCareCodeInfo12(String healthCareCodeInfo12) {
        this.healthCareCodeInfo12 = healthCareCodeInfo12;  return this;
    }
}