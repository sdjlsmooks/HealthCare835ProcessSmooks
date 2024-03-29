/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package solutions.health.X12HCCProfessional.X12_837;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import org.milyn.javabean.decoders.IntegerDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    
import java.util.Properties;    

public class TransactionSetTrailer implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private Integer numberOfIncludedSegments;
    private IntegerDecoder numberOfIncludedSegmentsEncoder;
    private Integer transactionSetControlNumber;
    private IntegerDecoder transactionSetControlNumberEncoder;

    public TransactionSetTrailer() {
        
        numberOfIncludedSegmentsEncoder = new IntegerDecoder();
        Properties numberOfIncludedSegmentsEncoderProperties = new Properties();
        numberOfIncludedSegmentsEncoderProperties.setProperty("format", "0000000000");
        numberOfIncludedSegmentsEncoder.setConfiguration(numberOfIncludedSegmentsEncoderProperties);
        transactionSetControlNumberEncoder = new IntegerDecoder();
        Properties transactionSetControlNumberEncoderProperties = new Properties();
        transactionSetControlNumberEncoderProperties.setProperty("format", "000000000");
        transactionSetControlNumberEncoder.setConfiguration(transactionSetControlNumberEncoderProperties);
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(numberOfIncludedSegments != null) {
            nodeWriter.write(delimiters.escape(numberOfIncludedSegmentsEncoder.encode(numberOfIncludedSegments)));
        }
        nodeWriter.write(delimiters.getField());
        if(transactionSetControlNumber != null) {
            nodeWriter.write(delimiters.escape(transactionSetControlNumberEncoder.encode(transactionSetControlNumber)));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public Integer getNumberOfIncludedSegments() {
        return numberOfIncludedSegments;
    }

    public TransactionSetTrailer setNumberOfIncludedSegments(Integer numberOfIncludedSegments) {
        this.numberOfIncludedSegments = numberOfIncludedSegments;  return this;
    }

    public Integer getTransactionSetControlNumber() {
        return transactionSetControlNumber;
    }

    public TransactionSetTrailer setTransactionSetControlNumber(Integer transactionSetControlNumber) {
        this.transactionSetControlNumber = transactionSetControlNumber;  return this;
    }
}