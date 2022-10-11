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

public class Loop2000ABillingProviderDetail implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private List<BpdHL> bpdHL;
    private List<HeaderSection> headerSection;
    private Loop2010AABillingProviderName loop2010AABillingProviderName;
    private Loop2010ABPayToAddressName loop2010ABPayToAddressName;
    private Loop2010ACPayToPlanName loop2010ACPayToPlanName;
    private List<Loop2000BSubscriberHierarchicalLevel> loop2000BSubscriberHierarchicalLevel;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(bpdHL != null && !bpdHL.isEmpty()) {
            for(BpdHL bpdHLInst : bpdHL) {
                nodeWriter.write("SDJLHLa8");
                nodeWriter.write(delimiters.getField());
                bpdHLInst.write(nodeWriter, delimiters);
            }
        }
        if(headerSection != null && !headerSection.isEmpty()) {
            for(HeaderSection headerSectionInst : headerSection) {
                headerSectionInst.write(nodeWriter, delimiters);
            }
        }
        if(loop2010AABillingProviderName != null) {
            loop2010AABillingProviderName.write(nodeWriter, delimiters);
        }
        if(loop2010ABPayToAddressName != null) {
            loop2010ABPayToAddressName.write(nodeWriter, delimiters);
        }
        if(loop2010ACPayToPlanName != null) {
            loop2010ACPayToPlanName.write(nodeWriter, delimiters);
        }
        if(loop2000BSubscriberHierarchicalLevel != null && !loop2000BSubscriberHierarchicalLevel.isEmpty()) {
            for(Loop2000BSubscriberHierarchicalLevel loop2000BSubscriberHierarchicalLevelInst : loop2000BSubscriberHierarchicalLevel) {
                loop2000BSubscriberHierarchicalLevelInst.write(nodeWriter, delimiters);
            }
        }
    }

    public List<BpdHL> getBpdHL() {
        return bpdHL;
    }

    public Loop2000ABillingProviderDetail setBpdHL(List<BpdHL> bpdHL) {
        this.bpdHL = bpdHL;  return this;
    }

    public List<HeaderSection> getHeaderSection() {
        return headerSection;
    }

    public Loop2000ABillingProviderDetail setHeaderSection(List<HeaderSection> headerSection) {
        this.headerSection = headerSection;  return this;
    }

    public Loop2010AABillingProviderName getLoop2010AABillingProviderName() {
        return loop2010AABillingProviderName;
    }

    public Loop2000ABillingProviderDetail setLoop2010AABillingProviderName(Loop2010AABillingProviderName loop2010AABillingProviderName) {
        this.loop2010AABillingProviderName = loop2010AABillingProviderName;  return this;
    }

    public Loop2010ABPayToAddressName getLoop2010ABPayToAddressName() {
        return loop2010ABPayToAddressName;
    }

    public Loop2000ABillingProviderDetail setLoop2010ABPayToAddressName(Loop2010ABPayToAddressName loop2010ABPayToAddressName) {
        this.loop2010ABPayToAddressName = loop2010ABPayToAddressName;  return this;
    }

    public Loop2010ACPayToPlanName getLoop2010ACPayToPlanName() {
        return loop2010ACPayToPlanName;
    }

    public Loop2000ABillingProviderDetail setLoop2010ACPayToPlanName(Loop2010ACPayToPlanName loop2010ACPayToPlanName) {
        this.loop2010ACPayToPlanName = loop2010ACPayToPlanName;  return this;
    }

    public List<Loop2000BSubscriberHierarchicalLevel> getLoop2000BSubscriberHierarchicalLevel() {
        return loop2000BSubscriberHierarchicalLevel;
    }

    public Loop2000ABillingProviderDetail setLoop2000BSubscriberHierarchicalLevel(List<Loop2000BSubscriberHierarchicalLevel> loop2000BSubscriberHierarchicalLevel) {
        this.loop2000BSubscriberHierarchicalLevel = loop2000BSubscriberHierarchicalLevel;  return this;
    }
}