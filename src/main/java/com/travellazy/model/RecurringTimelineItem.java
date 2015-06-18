
package com.travellazy.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 The timeline of a recurring charge can either have a charge amount
 *                 or it can have a reference to a recurring tiering.
 *             
 * 
 * <p>Java class for RecurringTimelineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringTimelineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="recurringTiering">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="recurringTieringLevels">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="recurringTieringLevel" type="{http://www.travellazy.com/product/model}RecurringTieringLevel" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="isIncremental" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTimelineItem", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "charge",
    "recurringTiering",
    "activation",
    "termination"
})
public class RecurringTimelineItem {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal charge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected RecurringTimelineItem.RecurringTiering recurringTiering;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

    /**
     * Gets the value of the recurringTiering property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTimelineItem.RecurringTiering }
     *     
     */
    public RecurringTimelineItem.RecurringTiering getRecurringTiering() {
        return recurringTiering;
    }

    /**
     * Sets the value of the recurringTiering property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTimelineItem.RecurringTiering }
     *     
     */
    public void setRecurringTiering(RecurringTimelineItem.RecurringTiering value) {
        this.recurringTiering = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivation(XMLGregorianCalendar value) {
        this.activation = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermination(XMLGregorianCalendar value) {
        this.termination = value;
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
     *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="recurringTieringLevels">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="recurringTieringLevel" type="{http://www.travellazy.com/product/model}RecurringTieringLevel" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="isIncremental" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "recurringTieringLevels"
    })
    public static class RecurringTiering {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String key;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected RecurringTimelineItem.RecurringTiering.RecurringTieringLevels recurringTieringLevels;
        @XmlAttribute(name = "isIncremental", required = true)
        protected boolean isIncremental;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the recurringTieringLevels property.
         * 
         * @return
         *     possible object is
         *     {@link RecurringTimelineItem.RecurringTiering.RecurringTieringLevels }
         *     
         */
        public RecurringTimelineItem.RecurringTiering.RecurringTieringLevels getRecurringTieringLevels() {
            return recurringTieringLevels;
        }

        /**
         * Sets the value of the recurringTieringLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecurringTimelineItem.RecurringTiering.RecurringTieringLevels }
         *     
         */
        public void setRecurringTieringLevels(RecurringTimelineItem.RecurringTiering.RecurringTieringLevels value) {
            this.recurringTieringLevels = value;
        }

        /**
         * Gets the value of the isIncremental property.
         * 
         */
        public boolean isIsIncremental() {
            return isIncremental;
        }

        /**
         * Sets the value of the isIncremental property.
         * 
         */
        public void setIsIncremental(boolean value) {
            this.isIncremental = value;
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
         *         &lt;element name="recurringTieringLevel" type="{http://www.travellazy.com/product/model}RecurringTieringLevel" maxOccurs="unbounded" minOccurs="0"/>
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
            "recurringTieringLevel"
        })
        public static class RecurringTieringLevels {

            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected List<RecurringTieringLevel> recurringTieringLevel;

            /**
             * Gets the value of the recurringTieringLevel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the recurringTieringLevel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRecurringTieringLevel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RecurringTieringLevel }
             * 
             * 
             */
            public List<RecurringTieringLevel> getRecurringTieringLevel() {
                if (recurringTieringLevel == null) {
                    recurringTieringLevel = new ArrayList<RecurringTieringLevel>();
                }
                return this.recurringTieringLevel;
            }

        }

    }

}
