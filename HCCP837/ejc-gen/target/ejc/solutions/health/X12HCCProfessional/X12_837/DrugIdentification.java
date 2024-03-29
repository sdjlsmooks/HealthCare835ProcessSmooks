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

public class DrugIdentification implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String assignedID;
    private String productServiceIDQualifier1;
    private String productServiceID;
    private String productServiceIDQualifier2;
    private String productServiceID2;
    private String productServiceIDQualifier3;
    private String productServiceID3;
    private String productServiceIDQualifier4;
    private String productServiceID4;
    private String productServiceIDQualifier5;
    private String productServiceID5;
    private String productServiceIDQualifier6;
    private String productServiceID6;
    private String productServiceIDQualifier7;
    private String productServiceI7;
    private String productServiceIDQualifier8;
    private String productServiceID8;
    private String productServiceIDQualifier9;
    private String productServiceID9;
    private String productServiceIDQualifier10;
    private String productServiceID10;
    private String productServiceIDQualifier11;
    private String productServiceID11;
    private String productServiceIDQualifier12;
    private String productServiceID12;
    private String productServiceIDQualifier13;
    private String productServiceID13;
    private String productServiceIDQualifier14;
    private String productServiceID14;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(assignedID != null) {
            nodeWriter.write(delimiters.escape(assignedID.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier1 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier1.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID != null) {
            nodeWriter.write(delimiters.escape(productServiceID.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier2 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID2 != null) {
            nodeWriter.write(delimiters.escape(productServiceID2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier3 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID3 != null) {
            nodeWriter.write(delimiters.escape(productServiceID3.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier4 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier4.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID4 != null) {
            nodeWriter.write(delimiters.escape(productServiceID4.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier5 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier5.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID5 != null) {
            nodeWriter.write(delimiters.escape(productServiceID5.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier6 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier6.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID6 != null) {
            nodeWriter.write(delimiters.escape(productServiceID6.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier7 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier7.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceI7 != null) {
            nodeWriter.write(delimiters.escape(productServiceI7.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier8 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier8.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID8 != null) {
            nodeWriter.write(delimiters.escape(productServiceID8.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier9 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier9.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID9 != null) {
            nodeWriter.write(delimiters.escape(productServiceID9.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier10 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier10.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID10 != null) {
            nodeWriter.write(delimiters.escape(productServiceID10.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier11 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier11.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID11 != null) {
            nodeWriter.write(delimiters.escape(productServiceID11.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier12 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier12.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID12 != null) {
            nodeWriter.write(delimiters.escape(productServiceID12.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier13 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier13.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID13 != null) {
            nodeWriter.write(delimiters.escape(productServiceID13.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceIDQualifier14 != null) {
            nodeWriter.write(delimiters.escape(productServiceIDQualifier14.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productServiceID14 != null) {
            nodeWriter.write(delimiters.escape(productServiceID14.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getAssignedID() {
        return assignedID;
    }

    public DrugIdentification setAssignedID(String assignedID) {
        this.assignedID = assignedID;  return this;
    }

    public String getProductServiceIDQualifier1() {
        return productServiceIDQualifier1;
    }

    public DrugIdentification setProductServiceIDQualifier1(String productServiceIDQualifier1) {
        this.productServiceIDQualifier1 = productServiceIDQualifier1;  return this;
    }

    public String getProductServiceID() {
        return productServiceID;
    }

    public DrugIdentification setProductServiceID(String productServiceID) {
        this.productServiceID = productServiceID;  return this;
    }

    public String getProductServiceIDQualifier2() {
        return productServiceIDQualifier2;
    }

    public DrugIdentification setProductServiceIDQualifier2(String productServiceIDQualifier2) {
        this.productServiceIDQualifier2 = productServiceIDQualifier2;  return this;
    }

    public String getProductServiceID2() {
        return productServiceID2;
    }

    public DrugIdentification setProductServiceID2(String productServiceID2) {
        this.productServiceID2 = productServiceID2;  return this;
    }

    public String getProductServiceIDQualifier3() {
        return productServiceIDQualifier3;
    }

    public DrugIdentification setProductServiceIDQualifier3(String productServiceIDQualifier3) {
        this.productServiceIDQualifier3 = productServiceIDQualifier3;  return this;
    }

    public String getProductServiceID3() {
        return productServiceID3;
    }

    public DrugIdentification setProductServiceID3(String productServiceID3) {
        this.productServiceID3 = productServiceID3;  return this;
    }

    public String getProductServiceIDQualifier4() {
        return productServiceIDQualifier4;
    }

    public DrugIdentification setProductServiceIDQualifier4(String productServiceIDQualifier4) {
        this.productServiceIDQualifier4 = productServiceIDQualifier4;  return this;
    }

    public String getProductServiceID4() {
        return productServiceID4;
    }

    public DrugIdentification setProductServiceID4(String productServiceID4) {
        this.productServiceID4 = productServiceID4;  return this;
    }

    public String getProductServiceIDQualifier5() {
        return productServiceIDQualifier5;
    }

    public DrugIdentification setProductServiceIDQualifier5(String productServiceIDQualifier5) {
        this.productServiceIDQualifier5 = productServiceIDQualifier5;  return this;
    }

    public String getProductServiceID5() {
        return productServiceID5;
    }

    public DrugIdentification setProductServiceID5(String productServiceID5) {
        this.productServiceID5 = productServiceID5;  return this;
    }

    public String getProductServiceIDQualifier6() {
        return productServiceIDQualifier6;
    }

    public DrugIdentification setProductServiceIDQualifier6(String productServiceIDQualifier6) {
        this.productServiceIDQualifier6 = productServiceIDQualifier6;  return this;
    }

    public String getProductServiceID6() {
        return productServiceID6;
    }

    public DrugIdentification setProductServiceID6(String productServiceID6) {
        this.productServiceID6 = productServiceID6;  return this;
    }

    public String getProductServiceIDQualifier7() {
        return productServiceIDQualifier7;
    }

    public DrugIdentification setProductServiceIDQualifier7(String productServiceIDQualifier7) {
        this.productServiceIDQualifier7 = productServiceIDQualifier7;  return this;
    }

    public String getProductServiceI7() {
        return productServiceI7;
    }

    public DrugIdentification setProductServiceI7(String productServiceI7) {
        this.productServiceI7 = productServiceI7;  return this;
    }

    public String getProductServiceIDQualifier8() {
        return productServiceIDQualifier8;
    }

    public DrugIdentification setProductServiceIDQualifier8(String productServiceIDQualifier8) {
        this.productServiceIDQualifier8 = productServiceIDQualifier8;  return this;
    }

    public String getProductServiceID8() {
        return productServiceID8;
    }

    public DrugIdentification setProductServiceID8(String productServiceID8) {
        this.productServiceID8 = productServiceID8;  return this;
    }

    public String getProductServiceIDQualifier9() {
        return productServiceIDQualifier9;
    }

    public DrugIdentification setProductServiceIDQualifier9(String productServiceIDQualifier9) {
        this.productServiceIDQualifier9 = productServiceIDQualifier9;  return this;
    }

    public String getProductServiceID9() {
        return productServiceID9;
    }

    public DrugIdentification setProductServiceID9(String productServiceID9) {
        this.productServiceID9 = productServiceID9;  return this;
    }

    public String getProductServiceIDQualifier10() {
        return productServiceIDQualifier10;
    }

    public DrugIdentification setProductServiceIDQualifier10(String productServiceIDQualifier10) {
        this.productServiceIDQualifier10 = productServiceIDQualifier10;  return this;
    }

    public String getProductServiceID10() {
        return productServiceID10;
    }

    public DrugIdentification setProductServiceID10(String productServiceID10) {
        this.productServiceID10 = productServiceID10;  return this;
    }

    public String getProductServiceIDQualifier11() {
        return productServiceIDQualifier11;
    }

    public DrugIdentification setProductServiceIDQualifier11(String productServiceIDQualifier11) {
        this.productServiceIDQualifier11 = productServiceIDQualifier11;  return this;
    }

    public String getProductServiceID11() {
        return productServiceID11;
    }

    public DrugIdentification setProductServiceID11(String productServiceID11) {
        this.productServiceID11 = productServiceID11;  return this;
    }

    public String getProductServiceIDQualifier12() {
        return productServiceIDQualifier12;
    }

    public DrugIdentification setProductServiceIDQualifier12(String productServiceIDQualifier12) {
        this.productServiceIDQualifier12 = productServiceIDQualifier12;  return this;
    }

    public String getProductServiceID12() {
        return productServiceID12;
    }

    public DrugIdentification setProductServiceID12(String productServiceID12) {
        this.productServiceID12 = productServiceID12;  return this;
    }

    public String getProductServiceIDQualifier13() {
        return productServiceIDQualifier13;
    }

    public DrugIdentification setProductServiceIDQualifier13(String productServiceIDQualifier13) {
        this.productServiceIDQualifier13 = productServiceIDQualifier13;  return this;
    }

    public String getProductServiceID13() {
        return productServiceID13;
    }

    public DrugIdentification setProductServiceID13(String productServiceID13) {
        this.productServiceID13 = productServiceID13;  return this;
    }

    public String getProductServiceIDQualifier14() {
        return productServiceIDQualifier14;
    }

    public DrugIdentification setProductServiceIDQualifier14(String productServiceIDQualifier14) {
        this.productServiceIDQualifier14 = productServiceIDQualifier14;  return this;
    }

    public String getProductServiceID14() {
        return productServiceID14;
    }

    public DrugIdentification setProductServiceID14(String productServiceID14) {
        this.productServiceID14 = productServiceID14;  return this;
    }
}