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

public class OpbpBillingProvider implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String entityIDCode;
    private String entityTypeQualifier;
    private String lastName;
    private String firstName;
    private String middleName;
    private String namePrefix;
    private String nameSuffix;
    private String idCodeQualifier;
    private String idCode;
    private String entityRelationshipCode;
    private String entityIdentifierCode;
    private String organizationName;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = new StringWriter();

        List<String> nodeTokens = new ArrayList<String>();

        if(entityIDCode != null) {
            nodeWriter.write(delimiters.escape(entityIDCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(entityTypeQualifier != null) {
            nodeWriter.write(delimiters.escape(entityTypeQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(lastName != null) {
            nodeWriter.write(delimiters.escape(lastName.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(firstName != null) {
            nodeWriter.write(delimiters.escape(firstName.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(middleName != null) {
            nodeWriter.write(delimiters.escape(middleName.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(namePrefix != null) {
            nodeWriter.write(delimiters.escape(namePrefix.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(nameSuffix != null) {
            nodeWriter.write(delimiters.escape(nameSuffix.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(idCodeQualifier != null) {
            nodeWriter.write(delimiters.escape(idCodeQualifier.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(idCode != null) {
            nodeWriter.write(delimiters.escape(idCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(entityRelationshipCode != null) {
            nodeWriter.write(delimiters.escape(entityRelationshipCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(entityIdentifierCode != null) {
            nodeWriter.write(delimiters.escape(entityIdentifierCode.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeWriter.write(delimiters.getField());
        if(organizationName != null) {
            nodeWriter.write(delimiters.escape(organizationName.toString()));
            nodeTokens.add(nodeWriter.toString());
            ((StringWriter)nodeWriter).getBuffer().setLength(0);
        }
        nodeTokens.add(nodeWriter.toString());
        writer.write(EDIUtils.concatAndTruncate(nodeTokens, DelimiterType.FIELD, delimiters));
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getEntityIDCode() {
        return entityIDCode;
    }

    public OpbpBillingProvider setEntityIDCode(String entityIDCode) {
        this.entityIDCode = entityIDCode;  return this;
    }

    public String getEntityTypeQualifier() {
        return entityTypeQualifier;
    }

    public OpbpBillingProvider setEntityTypeQualifier(String entityTypeQualifier) {
        this.entityTypeQualifier = entityTypeQualifier;  return this;
    }

    public String getLastName() {
        return lastName;
    }

    public OpbpBillingProvider setLastName(String lastName) {
        this.lastName = lastName;  return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public OpbpBillingProvider setFirstName(String firstName) {
        this.firstName = firstName;  return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public OpbpBillingProvider setMiddleName(String middleName) {
        this.middleName = middleName;  return this;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public OpbpBillingProvider setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;  return this;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public OpbpBillingProvider setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;  return this;
    }

    public String getIdCodeQualifier() {
        return idCodeQualifier;
    }

    public OpbpBillingProvider setIdCodeQualifier(String idCodeQualifier) {
        this.idCodeQualifier = idCodeQualifier;  return this;
    }

    public String getIdCode() {
        return idCode;
    }

    public OpbpBillingProvider setIdCode(String idCode) {
        this.idCode = idCode;  return this;
    }

    public String getEntityRelationshipCode() {
        return entityRelationshipCode;
    }

    public OpbpBillingProvider setEntityRelationshipCode(String entityRelationshipCode) {
        this.entityRelationshipCode = entityRelationshipCode;  return this;
    }

    public String getEntityIdentifierCode() {
        return entityIdentifierCode;
    }

    public OpbpBillingProvider setEntityIdentifierCode(String entityIdentifierCode) {
        this.entityIdentifierCode = entityIdentifierCode;  return this;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public OpbpBillingProvider setOrganizationName(String organizationName) {
        this.organizationName = organizationName;  return this;
    }
}