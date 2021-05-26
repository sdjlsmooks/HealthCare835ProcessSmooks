/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import org.milyn.javabean.decoders.IntegerDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.io.StringWriter;    
import java.util.List;    
import java.util.ArrayList;    
import org.milyn.edisax.util.EDIUtils;    
import org.milyn.edisax.model.internal.DelimiterType;    

public class ClaimSPI implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String compositeMPI;
    private String submittedServiceCharge;
    private String amountPaid;
    private String productID;
    private Integer paidUnitsOfService;
    private IntegerDecoder paidUnitsOfServiceEncoder;
    private String compositeMedicalProcedureIdentifier2;
    private Integer originalSubmittedUnits;
    private IntegerDecoder originalSubmittedUnitsEncoder;

    public ClaimSPI() {
        
        paidUnitsOfServiceEncoder = new IntegerDecoder();
        originalSubmittedUnitsEncoder = new IntegerDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(compositeMPI != null) {
            nodeWriter.write(delimiters.escape(compositeMPI.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(submittedServiceCharge != null) {
            nodeWriter.write(delimiters.escape(submittedServiceCharge.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(amountPaid != null) {
            nodeWriter.write(delimiters.escape(amountPaid.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(productID != null) {
            nodeWriter.write(delimiters.escape(productID.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(paidUnitsOfService != null) {
            nodeWriter.write(delimiters.escape(paidUnitsOfServiceEncoder.encode(paidUnitsOfService)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(compositeMedicalProcedureIdentifier2 != null) {
            nodeWriter.write(delimiters.escape(compositeMedicalProcedureIdentifier2.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(originalSubmittedUnits != null) {
            nodeWriter.write(delimiters.escape(originalSubmittedUnitsEncoder.encode(originalSubmittedUnits)));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getCompositeMPI() {
        return compositeMPI;
    }

    public ClaimSPI setCompositeMPI(String compositeMPI) {
        this.compositeMPI = compositeMPI;  return this;
    }

    public String getSubmittedServiceCharge() {
        return submittedServiceCharge;
    }

    public ClaimSPI setSubmittedServiceCharge(String submittedServiceCharge) {
        this.submittedServiceCharge = submittedServiceCharge;  return this;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public ClaimSPI setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;  return this;
    }

    public String getProductID() {
        return productID;
    }

    public ClaimSPI setProductID(String productID) {
        this.productID = productID;  return this;
    }

    public Integer getPaidUnitsOfService() {
        return paidUnitsOfService;
    }

    public ClaimSPI setPaidUnitsOfService(Integer paidUnitsOfService) {
        this.paidUnitsOfService = paidUnitsOfService;  return this;
    }

    public String getCompositeMedicalProcedureIdentifier2() {
        return compositeMedicalProcedureIdentifier2;
    }

    public ClaimSPI setCompositeMedicalProcedureIdentifier2(String compositeMedicalProcedureIdentifier2) {
        this.compositeMedicalProcedureIdentifier2 = compositeMedicalProcedureIdentifier2;  return this;
    }

    public Integer getOriginalSubmittedUnits() {
        return originalSubmittedUnits;
    }

    public ClaimSPI setOriginalSubmittedUnits(Integer originalSubmittedUnits) {
        this.originalSubmittedUnits = originalSubmittedUnits;  return this;
    }
}