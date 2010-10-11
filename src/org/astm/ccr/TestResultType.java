//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.11 at 08:32:25 PM MDT 
//


package org.astm.ccr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:astm-org:CCR}MeasureGroup"/>
 *         &lt;element ref="{urn:astm-org:CCR}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResultSequencePosition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="VariableResultModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestResultType", propOrder = {
    "value",
    "units",
    "code",
    "description",
    "resultSequencePosition",
    "variableResultModifier"
})
public class TestResultType {

    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Units")
    protected org.astm.ccr.NormalType.Units units;
    @XmlElement(name = "Code")
    protected List<CodeType> code;
    @XmlElement(name = "Description")
    protected List<CodedDescriptionType> description;
    @XmlElement(name = "ResultSequencePosition")
    protected BigInteger resultSequencePosition;
    @XmlElement(name = "VariableResultModifier")
    protected CodedDescriptionType variableResultModifier;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link org.astm.ccr.NormalType.Units }
     *     
     */
    public org.astm.ccr.NormalType.Units getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.astm.ccr.NormalType.Units }
     *     
     */
    public void setUnits(org.astm.ccr.NormalType.Units value) {
        this.units = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCode() {
        if (code == null) {
            code = new ArrayList<CodeType>();
        }
        return this.code;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedDescriptionType }
     * 
     * 
     */
    public List<CodedDescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<CodedDescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the resultSequencePosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultSequencePosition() {
        return resultSequencePosition;
    }

    /**
     * Sets the value of the resultSequencePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultSequencePosition(BigInteger value) {
        this.resultSequencePosition = value;
    }

    /**
     * Gets the value of the variableResultModifier property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getVariableResultModifier() {
        return variableResultModifier;
    }

    /**
     * Sets the value of the variableResultModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setVariableResultModifier(CodedDescriptionType value) {
        this.variableResultModifier = value;
    }

}
