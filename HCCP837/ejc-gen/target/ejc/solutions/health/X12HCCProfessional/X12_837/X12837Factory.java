/**
 * Generated by Smooks EJC (Edifact Java Compiler).
 */
package solutions.health.X12HCCProfessional.X12_837;

import org.milyn.Smooks;
import org.milyn.payload.JavaResult;
import org.milyn.edisax.model.internal.Edimap;
import org.milyn.edisax.model.internal.Delimiters;
import org.milyn.edisax.model.EDIConfigDigester;
import org.milyn.edisax.EDIConfigurationException;
import org.xml.sax.SAXException;

import javax.xml.transform.stream.StreamSource;
import java.io.Reader;
import java.io.Writer;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import javax.xml.transform.Result;

public class X12837Factory {

    private Smooks smooks;
    private Delimiters delimiters;

    public static X12837Factory getInstance() throws IOException, SAXException {
        return new X12837Factory();
    }

    public void addConfigurations(InputStream resourceConfigStream) throws SAXException, IOException {
        smooks.addConfigurations(resourceConfigStream);
    }

    public X12837 fromEDI(InputStream ediStream, Result... additionalResults) {
        return fromEDI(new InputStreamReader(ediStream), additionalResults);
    }

    public X12837 fromEDI(Reader ediStream, Result... additionalResults) {
        JavaResult javaResult = new JavaResult();
        int numAdditionalRes = (additionalResults != null? additionalResults.length : 0);
        Result[] results = new Result[numAdditionalRes + 1];

        results[0] = javaResult;
        if(additionalResults != null) {
            System.arraycopy(additionalResults, 0, results, 1, numAdditionalRes);
        }

        smooks.filterSource(new StreamSource(ediStream), results);
        return (X12837) javaResult.getBean(X12837.class);
    }


    public void toEDI(X12837 instance, Writer writer) throws IOException {
        instance.write(writer, delimiters);
    }

    private X12837Factory() throws IOException, SAXException {
        smooks = new Smooks(X12837Factory.class.getResourceAsStream("bindingconfig.xml"));

        try {
            Edimap edimap = EDIConfigDigester.digestConfig(X12837Factory.class.getResourceAsStream("edimappingconfig.xml"));
            delimiters = edimap.getDelimiters();
        } catch(EDIConfigurationException e) {
            IOException ioException = new IOException("Exception reading EDI Mapping model.");
            ioException.initCause(e);
            throw ioException;
        }
    }
}