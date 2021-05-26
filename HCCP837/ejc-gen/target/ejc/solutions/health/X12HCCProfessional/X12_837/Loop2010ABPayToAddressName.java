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

public class Loop2010ABPayToAddressName implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private PtName ptName;
    private PtAddress ptAddress;
    private PtCityStateZipCode ptCityStateZipCode;
    private List<BpUNDOCUMENTEDREF> bpUNDOCUMENTEDREF;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(ptName != null) {
            nodeWriter.write("SDJLNM1_1a17");
            nodeWriter.write(delimiters.getField());
            ptName.write(nodeWriter, delimiters);
        }
        if(ptAddress != null) {
            nodeWriter.write("SDJLN3_2a18");
            nodeWriter.write(delimiters.getField());
            ptAddress.write(nodeWriter, delimiters);
        }
        if(ptCityStateZipCode != null) {
            nodeWriter.write("SDJLN4_2a19");
            nodeWriter.write(delimiters.getField());
            ptCityStateZipCode.write(nodeWriter, delimiters);
        }
        if(bpUNDOCUMENTEDREF != null && !bpUNDOCUMENTEDREF.isEmpty()) {
            for(BpUNDOCUMENTEDREF bpUNDOCUMENTEDREFInst : bpUNDOCUMENTEDREF) {
                nodeWriter.write("SDJLREFa20");
                nodeWriter.write(delimiters.getField());
                bpUNDOCUMENTEDREFInst.write(nodeWriter, delimiters);
            }
        }
    }

    public PtName getPtName() {
        return ptName;
    }

    public Loop2010ABPayToAddressName setPtName(PtName ptName) {
        this.ptName = ptName;  return this;
    }

    public PtAddress getPtAddress() {
        return ptAddress;
    }

    public Loop2010ABPayToAddressName setPtAddress(PtAddress ptAddress) {
        this.ptAddress = ptAddress;  return this;
    }

    public PtCityStateZipCode getPtCityStateZipCode() {
        return ptCityStateZipCode;
    }

    public Loop2010ABPayToAddressName setPtCityStateZipCode(PtCityStateZipCode ptCityStateZipCode) {
        this.ptCityStateZipCode = ptCityStateZipCode;  return this;
    }

    public List<BpUNDOCUMENTEDREF> getBpUNDOCUMENTEDREF() {
        return bpUNDOCUMENTEDREF;
    }

    public Loop2010ABPayToAddressName setBpUNDOCUMENTEDREF(List<BpUNDOCUMENTEDREF> bpUNDOCUMENTEDREF) {
        this.bpUNDOCUMENTEDREF = bpUNDOCUMENTEDREF;  return this;
    }
}