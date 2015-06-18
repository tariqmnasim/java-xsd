
package com.travellazy.model;

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
 * <p>Java class for BillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measuringUnitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="taxTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="loyaltyPointsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mediationEventReferences" type="{http://www.travellazy.com/product/model}MediationEventReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillType", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "chargeTypeKey",
    "measuringUnitKey",
    "invoiceText",
    "productCode",
    "callTypeKey",
    "glCode",
    "timelineItems",
    "mediationEventReferences"
})
public class BillType {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String chargeTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String measuringUnitKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String invoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String productCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String callTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String glCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BillType.TimelineItems timelineItems;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected MediationEventReferences mediationEventReferences;

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
     * Gets the value of the chargeTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    /**
     * Sets the value of the chargeTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTypeKey(String value) {
        this.chargeTypeKey = value;
    }

    /**
     * Gets the value of the measuringUnitKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuringUnitKey() {
        return measuringUnitKey;
    }

    /**
     * Sets the value of the measuringUnitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuringUnitKey(String value) {
        this.measuringUnitKey = value;
    }

    /**
     * Gets the value of the invoiceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceText() {
        return invoiceText;
    }

    /**
     * Sets the value of the invoiceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceText(String value) {
        this.invoiceText = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the callTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTypeKey() {
        return callTypeKey;
    }

    /**
     * Sets the value of the callTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTypeKey(String value) {
        this.callTypeKey = value;
    }

    /**
     * Gets the value of the glCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlCode() {
        return glCode;
    }

    /**
     * Sets the value of the glCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlCode(String value) {
        this.glCode = value;
    }

    /**
     * Gets the value of the timelineItems property.
     * 
     * @return
     *     possible object is
     *     {@link BillType.TimelineItems }
     *     
     */
    public BillType.TimelineItems getTimelineItems() {
        return timelineItems;
    }

    /**
     * Sets the value of the timelineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillType.TimelineItems }
     *     
     */
    public void setTimelineItems(BillType.TimelineItems value) {
        this.timelineItems = value;
    }

    /**
     * Gets the value of the mediationEventReferences property.
     * 
     * @return
     *     possible object is
     *     {@link MediationEventReferences }
     *     
     */
    public MediationEventReferences getMediationEventReferences() {
        return mediationEventReferences;
    }

    /**
     * Sets the value of the mediationEventReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediationEventReferences }
     *     
     */
    public void setMediationEventReferences(MediationEventReferences value) {
        this.mediationEventReferences = value;
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
     *                   &lt;element name="taxTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="loyaltyPointsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        protected List<BillType.TimelineItems.TimelineItem> timelineItem;

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
         * {@link BillType.TimelineItems.TimelineItem }
         * 
         * 
         */
        public List<BillType.TimelineItems.TimelineItem> getTimelineItem() {
            if (timelineItem == null) {
                timelineItem = new ArrayList<BillType.TimelineItems.TimelineItem>();
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
         *         &lt;element name="taxTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="loyaltyPointsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "taxTypeKey"
        })
        public static class TimelineItem {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String taxTypeKey;
            @XmlAttribute(name = "loyaltyPointsDisabled")
            protected Boolean loyaltyPointsDisabled;

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
             * Gets the value of the taxTypeKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxTypeKey() {
                return taxTypeKey;
            }

            /**
             * Sets the value of the taxTypeKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxTypeKey(String value) {
                this.taxTypeKey = value;
            }

            /**
             * Gets the value of the loyaltyPointsDisabled property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLoyaltyPointsDisabled() {
                return loyaltyPointsDisabled;
            }

            /**
             * Sets the value of the loyaltyPointsDisabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLoyaltyPointsDisabled(Boolean value) {
                this.loyaltyPointsDisabled = value;
            }

        }

    }

}
