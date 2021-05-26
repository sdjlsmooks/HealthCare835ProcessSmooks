/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.util.List;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Loop2430LineAdjusticationInfo implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private LineAdjInfo lineAdjInfo;
    private List<LineAdjustment> lineAdjustment;
    private LineCheckRemittanceDate lineCheckRemittanceDate;
    private RemainingPatientLiability remainingPatientLiability;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(lineAdjInfo != null) {
            nodeWriter.write("SVD");
            nodeWriter.write(delimiters.getField());
            lineAdjInfo.write(nodeWriter, delimiters);
        }
        if(lineAdjustment != null && !lineAdjustment.isEmpty()) {
            for(LineAdjustment lineAdjustmentInst : lineAdjustment) {
                nodeWriter.write("CAS");
                nodeWriter.write(delimiters.getField());
                lineAdjustmentInst.write(nodeWriter, delimiters);
            }
        }
        if(lineCheckRemittanceDate != null) {
            nodeWriter.write("DTP");
            nodeWriter.write(delimiters.getField());
            lineCheckRemittanceDate.write(nodeWriter, delimiters);
        }
        if(remainingPatientLiability != null) {
            nodeWriter.write("AMT");
            nodeWriter.write(delimiters.getField());
            remainingPatientLiability.write(nodeWriter, delimiters);
        }
    }

    public LineAdjInfo getLineAdjInfo() {
        return lineAdjInfo;
    }

    public Loop2430LineAdjusticationInfo setLineAdjInfo(LineAdjInfo lineAdjInfo) {
        this.lineAdjInfo = lineAdjInfo;  return this;
    }

    public List<LineAdjustment> getLineAdjustment() {
        return lineAdjustment;
    }

    public Loop2430LineAdjusticationInfo setLineAdjustment(List<LineAdjustment> lineAdjustment) {
        this.lineAdjustment = lineAdjustment;  return this;
    }

    public LineCheckRemittanceDate getLineCheckRemittanceDate() {
        return lineCheckRemittanceDate;
    }

    public Loop2430LineAdjusticationInfo setLineCheckRemittanceDate(LineCheckRemittanceDate lineCheckRemittanceDate) {
        this.lineCheckRemittanceDate = lineCheckRemittanceDate;  return this;
    }

    public RemainingPatientLiability getRemainingPatientLiability() {
        return remainingPatientLiability;
    }

    public Loop2430LineAdjusticationInfo setRemainingPatientLiability(RemainingPatientLiability remainingPatientLiability) {
        this.remainingPatientLiability = remainingPatientLiability;  return this;
    }
}