
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeInAdvanceMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paymentFrequencyMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timelineItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="timelineItem" type="{http://www.travellazy.com/product/model}RecurringTimelineItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="isOperatorAssignable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isProrated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="prorationMode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "RecurringCharge", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "chargeInAdvanceMonths",
    "paymentFrequencyMonths",
    "timelineItems"
})
public class RecurringCharge {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int chargeInAdvanceMonths;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int paymentFrequencyMonths;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected RecurringCharge.TimelineItems timelineItems;
    @XmlAttribute(name = "isOperatorAssignable")
    protected Boolean isOperatorAssignable;
    @XmlAttribute(name = "isProrated", required = true)
    protected boolean isProrated;
    @XmlAttribute(name = "prorationMode")
    protected String prorationMode;
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
     * Gets the value of the chargeInAdvanceMonths property.
     * 
     */
    public int getChargeInAdvanceMonths() {
        return chargeInAdvanceMonths;
    }

    /**
     * Sets the value of the chargeInAdvanceMonths property.
     * 
     */
    public void setChargeInAdvanceMonths(int value) {
        this.chargeInAdvanceMonths = value;
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
     *     {@link RecurringCharge.TimelineItems }
     *     
     */
    public RecurringCharge.TimelineItems getTimelineItems() {
        return timelineItems;
    }

    /**
     * Sets the value of the timelineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringCharge.TimelineItems }
     *     
     */
    public void setTimelineItems(RecurringCharge.TimelineItems value) {
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
     * Gets the value of the isProrated property.
     * 
     */
    public boolean isIsProrated() {
        return isProrated;
    }

    /**
     * Sets the value of the isProrated property.
     * 
     */
    public void setIsProrated(boolean value) {
        this.isProrated = value;
    }

    /**
     * Gets the value of the prorationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProrationMode() {
        return prorationMode;
    }

    /**
     * Sets the value of the prorationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProrationMode(String value) {
        this.prorationMode = value;
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
     *         &lt;element name="timelineItem" type="{http://www.travellazy.com/product/model}RecurringTimelineItem" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<RecurringTimelineItem> timelineItem;

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
         * {@link RecurringTimelineItem }
         * 
         * 
         */
        public List<RecurringTimelineItem> getTimelineItem() {
            if (timelineItem == null) {
                timelineItem = new ArrayList<RecurringTimelineItem>();
            }
            return this.timelineItem;
        }

    }

}
