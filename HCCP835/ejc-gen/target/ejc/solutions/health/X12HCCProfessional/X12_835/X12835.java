/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_835;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import org.milyn.smooks.edi.EDIMessage;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

@EDIMessage    
public class X12835 implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private Interchange interchange;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(interchange != null) {
            interchange.write(nodeWriter, delimiters);
        }
    }

    public Interchange getInterchange() {
        return interchange;
    }

    public X12835 setInterchange(Interchange interchange) {
        this.interchange = interchange;  return this;
    }
}