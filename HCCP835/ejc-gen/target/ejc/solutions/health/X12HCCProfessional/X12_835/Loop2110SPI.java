/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.util.List;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class Loop2110SPI implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private ClaimSPI claimSPI;
    private List<ServiceDate> serviceDate;
    private List<ServiceAdjustment> serviceAdjustment;
    private ServiceIdentification serviceIdentification;
    private List<LineItemControlNumber> lineItemControlNumber;
    private RenderingProviderInformation renderingProviderInformation;
    private List<HealthcarePolicyIdentification> healthcarePolicyIdentification;
    private List<ServiceSuppAmount> serviceSuppAmount;
    private List<ServiceSuppQuantity> serviceSuppQuantity;
    private List<HcRemarkCodes> hcRemarkCodes;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(claimSPI != null) {
            nodeWriter.write("SVC");
            nodeWriter.write(delimiters.getField());
            claimSPI.write(nodeWriter, delimiters);
        }
        if(serviceDate != null && !serviceDate.isEmpty()) {
            for(ServiceDate serviceDateInst : serviceDate) {
                nodeWriter.write("DTM");
                nodeWriter.write(delimiters.getField());
                serviceDateInst.write(nodeWriter, delimiters);
            }
        }
        if(serviceAdjustment != null && !serviceAdjustment.isEmpty()) {
            for(ServiceAdjustment serviceAdjustmentInst : serviceAdjustment) {
                nodeWriter.write("CAS");
                nodeWriter.write(delimiters.getField());
                serviceAdjustmentInst.write(nodeWriter, delimiters);
            }
        }
        if(serviceIdentification != null) {
            nodeWriter.write("REF");
            nodeWriter.write(delimiters.getField());
            serviceIdentification.write(nodeWriter, delimiters);
        }
        if(lineItemControlNumber != null && !lineItemControlNumber.isEmpty()) {
            for(LineItemControlNumber lineItemControlNumberInst : lineItemControlNumber) {
                nodeWriter.write("REF");
                nodeWriter.write(delimiters.getField());
                lineItemControlNumberInst.write(nodeWriter, delimiters);
            }
        }
        if(renderingProviderInformation != null) {
            nodeWriter.write("REF");
            nodeWriter.write(delimiters.getField());
            renderingProviderInformation.write(nodeWriter, delimiters);
        }
        if(healthcarePolicyIdentification != null && !healthcarePolicyIdentification.isEmpty()) {
            for(HealthcarePolicyIdentification healthcarePolicyIdentificationInst : healthcarePolicyIdentification) {
                nodeWriter.write("REF");
                nodeWriter.write(delimiters.getField());
                healthcarePolicyIdentificationInst.write(nodeWriter, delimiters);
            }
        }
        if(serviceSuppAmount != null && !serviceSuppAmount.isEmpty()) {
            for(ServiceSuppAmount serviceSuppAmountInst : serviceSuppAmount) {
                nodeWriter.write("AMT");
                nodeWriter.write(delimiters.getField());
                serviceSuppAmountInst.write(nodeWriter, delimiters);
            }
        }
        if(serviceSuppQuantity != null && !serviceSuppQuantity.isEmpty()) {
            for(ServiceSuppQuantity serviceSuppQuantityInst : serviceSuppQuantity) {
                nodeWriter.write("QTY");
                nodeWriter.write(delimiters.getField());
                serviceSuppQuantityInst.write(nodeWriter, delimiters);
            }
        }
        if(hcRemarkCodes != null && !hcRemarkCodes.isEmpty()) {
            for(HcRemarkCodes hcRemarkCodesInst : hcRemarkCodes) {
                nodeWriter.write("LQ");
                nodeWriter.write(delimiters.getField());
                hcRemarkCodesInst.write(nodeWriter, delimiters);
            }
        }
    }

    public ClaimSPI getClaimSPI() {
        return claimSPI;
    }

    public Loop2110SPI setClaimSPI(ClaimSPI claimSPI) {
        this.claimSPI = claimSPI;  return this;
    }

    public List<ServiceDate> getServiceDate() {
        return serviceDate;
    }

    public Loop2110SPI setServiceDate(List<ServiceDate> serviceDate) {
        this.serviceDate = serviceDate;  return this;
    }

    public List<ServiceAdjustment> getServiceAdjustment() {
        return serviceAdjustment;
    }

    public Loop2110SPI setServiceAdjustment(List<ServiceAdjustment> serviceAdjustment) {
        this.serviceAdjustment = serviceAdjustment;  return this;
    }

    public ServiceIdentification getServiceIdentification() {
        return serviceIdentification;
    }

    public Loop2110SPI setServiceIdentification(ServiceIdentification serviceIdentification) {
        this.serviceIdentification = serviceIdentification;  return this;
    }

    public List<LineItemControlNumber> getLineItemControlNumber() {
        return lineItemControlNumber;
    }

    public Loop2110SPI setLineItemControlNumber(List<LineItemControlNumber> lineItemControlNumber) {
        this.lineItemControlNumber = lineItemControlNumber;  return this;
    }

    public RenderingProviderInformation getRenderingProviderInformation() {
        return renderingProviderInformation;
    }

    public Loop2110SPI setRenderingProviderInformation(RenderingProviderInformation renderingProviderInformation) {
        this.renderingProviderInformation = renderingProviderInformation;  return this;
    }

    public List<HealthcarePolicyIdentification> getHealthcarePolicyIdentification() {
        return healthcarePolicyIdentification;
    }

    public Loop2110SPI setHealthcarePolicyIdentification(List<HealthcarePolicyIdentification> healthcarePolicyIdentification) {
        this.healthcarePolicyIdentification = healthcarePolicyIdentification;  return this;
    }

    public List<ServiceSuppAmount> getServiceSuppAmount() {
        return serviceSuppAmount;
    }

    public Loop2110SPI setServiceSuppAmount(List<ServiceSuppAmount> serviceSuppAmount) {
        this.serviceSuppAmount = serviceSuppAmount;  return this;
    }

    public List<ServiceSuppQuantity> getServiceSuppQuantity() {
        return serviceSuppQuantity;
    }

    public Loop2110SPI setServiceSuppQuantity(List<ServiceSuppQuantity> serviceSuppQuantity) {
        this.serviceSuppQuantity = serviceSuppQuantity;  return this;
    }

    public List<HcRemarkCodes> getHcRemarkCodes() {
        return hcRemarkCodes;
    }

    public Loop2110SPI setHcRemarkCodes(List<HcRemarkCodes> hcRemarkCodes) {
        this.hcRemarkCodes = hcRemarkCodes;  return this;
    }
}