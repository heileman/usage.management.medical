//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.11 at 08:32:25 PM MDT 
//


package org.astm.ccr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:astm-org:CCR}Type" minOccurs="0"/>
 *         &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:astm-org:CCR}Age" minOccurs="0"/>
 *         &lt;element name="ApproximateDateTime" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *         &lt;element name="DateTimeRange" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BeginRange" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{urn:astm-org:CCR}Age" minOccurs="0"/>
 *                             &lt;element name="ApproximateDateTime" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EndRange" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{urn:astm-org:CCR}Age" minOccurs="0"/>
 *                             &lt;element name="ApproximateDateTime" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeType", propOrder = {
    "type",
    "exactDateTime",
    "age",
    "approximateDateTime",
    "dateTimeRange"
})
@XmlSeeAlso({
    org.astm.ccr.Direction.AdministrationTiming.class
})
public class DateTimeType {

    @XmlElement(name = "Type")
    protected CodedDescriptionType type;
    @XmlElement(name = "ExactDateTime")
    protected String exactDateTime;
    @XmlElement(name = "Age")
    protected MeasureType age;
    @XmlElement(name = "ApproximateDateTime")
    protected CodedDescriptionType approximateDateTime;
    @XmlElement(name = "DateTimeRange")
    protected List<DateTimeType.DateTimeRange> dateTimeRange;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setType(CodedDescriptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the exactDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExactDateTime() {
        return exactDateTime;
    }

    /**
     * Sets the value of the exactDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExactDateTime(String value) {
        this.exactDateTime = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAge(MeasureType value) {
        this.age = value;
    }

    /**
     * Gets the value of the approximateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getApproximateDateTime() {
        return approximateDateTime;
    }

    /**
     * Sets the value of the approximateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setApproximateDateTime(CodedDescriptionType value) {
        this.approximateDateTime = value;
    }

    /**
     * Gets the value of the dateTimeRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTimeRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTimeRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeType.DateTimeRange }
     * 
     * 
     */
    public List<DateTimeType.DateTimeRange> getDateTimeRange() {
        if (dateTimeRange == null) {
            dateTimeRange = new ArrayList<DateTimeType.DateTimeRange>();
        }
        return this.dateTimeRange;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BeginRange" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{urn:astm-org:CCR}Age" minOccurs="0"/>
     *                   &lt;element name="ApproximateDateTime" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EndRange" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{urn:astm-org:CCR}Age" minOccurs="0"/>
     *                   &lt;element name="ApproximateDateTime" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "beginRange",
        "endRange"
    })
    public static class DateTimeRange {

        @XmlElement(name = "BeginRange")
        protected DateTimeType.DateTimeRange.BeginRange beginRange;
        @XmlElement(name = "EndRange")
        protected DateTimeType.DateTimeRange.EndRange endRange;

        /**
         * Gets the value of the beginRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeType.DateTimeRange.BeginRange }
         *     
         */
        public DateTimeType.DateTimeRange.BeginRange getBeginRange() {
            return beginRange;
        }

        /**
         * Sets the value of the beginRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeType.DateTimeRange.BeginRange }
         *     
         */
        public void setBeginRange(DateTimeType.DateTimeRange.BeginRange value) {
            this.beginRange = value;
        }

        /**
         * Gets the value of the endRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeType.DateTimeRange.EndRange }
         *     
         */
        public DateTimeType.DateTimeRange.EndRange getEndRange() {
            return endRange;
        }

        /**
         * Sets the value of the endRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeType.DateTimeRange.EndRange }
         *     
         */
        public void setEndRange(DateTimeType.DateTimeRange.EndRange value) {
            this.endRange = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{urn:astm-org:CCR}Age" minOccurs="0"/>
         *         &lt;element name="ApproximateDateTime" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exactDateTime",
            "age",
            "approximateDateTime"
        })
        public static class BeginRange {

            @XmlElement(name = "ExactDateTime")
            protected String exactDateTime;
            @XmlElement(name = "Age")
            protected MeasureType age;
            @XmlElement(name = "ApproximateDateTime")
            protected CodedDescriptionType approximateDateTime;

            /**
             * Gets the value of the exactDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExactDateTime() {
                return exactDateTime;
            }

            /**
             * Sets the value of the exactDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExactDateTime(String value) {
                this.exactDateTime = value;
            }

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link MeasureType }
             *     
             */
            public MeasureType getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link MeasureType }
             *     
             */
            public void setAge(MeasureType value) {
                this.age = value;
            }

            /**
             * Gets the value of the approximateDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link CodedDescriptionType }
             *     
             */
            public CodedDescriptionType getApproximateDateTime() {
                return approximateDateTime;
            }

            /**
             * Sets the value of the approximateDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedDescriptionType }
             *     
             */
            public void setApproximateDateTime(CodedDescriptionType value) {
                this.approximateDateTime = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{urn:astm-org:CCR}Age" minOccurs="0"/>
         *         &lt;element name="ApproximateDateTime" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exactDateTime",
            "age",
            "approximateDateTime"
        })
        public static class EndRange {

            @XmlElement(name = "ExactDateTime")
            protected String exactDateTime;
            @XmlElement(name = "Age")
            protected MeasureType age;
            @XmlElement(name = "ApproximateDateTime")
            protected CodedDescriptionType approximateDateTime;

            /**
             * Gets the value of the exactDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExactDateTime() {
                return exactDateTime;
            }

            /**
             * Sets the value of the exactDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExactDateTime(String value) {
                this.exactDateTime = value;
            }

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link MeasureType }
             *     
             */
            public MeasureType getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link MeasureType }
             *     
             */
            public void setAge(MeasureType value) {
                this.age = value;
            }

            /**
             * Gets the value of the approximateDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link CodedDescriptionType }
             *     
             */
            public CodedDescriptionType getApproximateDateTime() {
                return approximateDateTime;
            }

            /**
             * Sets the value of the approximateDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedDescriptionType }
             *     
             */
            public void setApproximateDateTime(CodedDescriptionType value) {
                this.approximateDateTime = value;
            }

        }

    }

}
