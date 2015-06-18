
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
 * <p>Java class for InstallmentCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentFrequencyMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timelineItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="timelineItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="numberOfPayments" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="initialPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *       &lt;attribute name="isOperatorAssignable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="payRemainderOnTermination" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isInstanceOverridable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isInvoiceTextOverridable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentCharge", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "paymentFrequencyMonths",
    "timelineItems"
})
public class InstallmentCharge {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int paymentFrequencyMonths;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected InstallmentCharge.TimelineItems timelineItems;
    @XmlAttribute(name = "isOperatorAssignable")
    protected Boolean isOperatorAssignable;
    @XmlAttribute(name = "payRemainderOnTermination", required = true)
    protected boolean payRemainderOnTermination;
    @XmlAttribute(name = "isInstanceOverridable", required = true)
    protected boolean isInstanceOverridable;
    @XmlAttribute(name = "isInvoiceTextOverridable", required = true)
    protected boolean isInvoiceTextOverridable;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the paymentFrequencyMonths property.
     * 
     */
    public int getPaymentFrequencyMonths() {
        return paymentFrequencyMonths;
    }

    /**
     * Sets the value of the paymentFrequencyMonths property.
     * 
     */
    public void setPaymentFrequencyMonths(int value) {
        this.paymentFrequencyMonths = value;
    }

    /**
     * Gets the value of the timelineItems property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentCharge.TimelineItems }
     *     
     */
    public InstallmentCharge.TimelineItems getTimelineItems() {
        return timelineItems;
    }

    /**
     * Sets the value of the timelineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentCharge.TimelineItems }
     *     
     */
    public void setTimelineItems(InstallmentCharge.TimelineItems value) {
        this.timelineItems = value;
    }

    /**
     * Gets the value of the isOperatorAssignable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperatorAssignable() {
        return isOperatorAssignable;
    }

    /**
     * Sets the value of the isOperatorAssignable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOperatorAssignable(Boolean value) {
        this.isOperatorAssignable = value;
    }

    /**
     * Gets the value of the payRemainderOnTermination property.
     * 
     */
    public boolean isPayRemainderOnTermination() {
        return payRemainderOnTermination;
    }

    /**
     * Sets the value of the payRemainderOnTermination property.
     * 
     */
    public void setPayRemainderOnTermination(boolean value) {
        this.payRemainderOnTermination = value;
    }

    /**
     * Gets the value of the isInstanceOverridable property.
     * 
     */
    public boolean isIsInstanceOverridable() {
        return isInstanceOverridable;
    }

    /**
     * Sets the value of the isInstanceOverridable property.
     * 
     */
    public void setIsInstanceOverridable(boolean value) {
        this.isInstanceOverridable = value;
    }

    /**
     * Gets the value of the isInvoiceTextOverridable property.
     * 
     */
    public boolean isIsInvoiceTextOverridable() {
        return isInvoiceTextOverridable;
    }

    /**
     * Sets the value of the isInvoiceTextOverridable property.
     * 
     */
    public void setIsInvoiceTextOverridable(boolean value) {
        this.isInvoiceTextOverridable = value;
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
     *         &lt;element name="timelineItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="numberOfPayments" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="initialPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "timelineItem"
    })
    public static class TimelineItems {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<InstallmentCharge.TimelineItems.TimelineItem> timelineItem;

        /**
         * Gets the value of the timelineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timelineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimelineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InstallmentCharge.TimelineItems.TimelineItem }
         * 
         * 
         */
        public List<InstallmentCharge.TimelineItems.TimelineItem> getTimelineItem() {
            if (timelineItem == null) {
                timelineItem = new ArrayList<InstallmentCharge.TimelineItems.TimelineItem>();
            }
            return this.timelineItem;
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
         *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="numberOfPayments" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="initialPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
            "activation",
            "termination",
            "numberOfPayments",
            "initialPayments",
            "charge"
        })
        public static class TimelineItem {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected BigDecimal numberOfPayments;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected Integer initialPayments;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected BigDecimal charge;

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
             * Gets the value of the numberOfPayments property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumberOfPayments() {
                return numberOfPayments;
            }

            /**
             * Sets the value of the numberOfPayments property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNumberOfPayments(BigDecimal value) {
                this.numberOfPayments = value;
            }

            /**
             * Gets the value of the initialPayments property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getInitialPayments() {
                return initialPayments;
            }

            /**
             * Sets the value of the initialPayments property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setInitialPayments(Integer value) {
                this.initialPayments = value;
            }

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

        }

    }

}
