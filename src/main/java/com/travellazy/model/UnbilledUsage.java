
package com.travellazy.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UnbilledUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbilledUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customizedOfferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerInvoiceText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="netAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="grossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="currency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="measuringUnitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usageSumsPerBillType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="usageSumPerBillType" type="{http://www.travellazy.com/product/model}Usage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UnbilledUsage", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "customizedOfferId",
    "offerKey",
    "offerInvoiceText",
    "serviceIdentifier",
    "netAmount",
    "grossAmount",
    "currency",
    "units",
    "measuringUnitKey",
    "usageSumsPerBillType"
})
public class UnbilledUsage {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long customizedOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerInvoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected List<String> serviceIdentifier;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal netAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal grossAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String currency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal units;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String measuringUnitKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected UnbilledUsage.UsageSumsPerBillType usageSumsPerBillType;

    /**
     * Gets the value of the customizedOfferId property.
     * 
     */
    public long getCustomizedOfferId() {
        return customizedOfferId;
    }

    /**
     * Sets the value of the customizedOfferId property.
     * 
     */
    public void setCustomizedOfferId(long value) {
        this.customizedOfferId = value;
    }

    /**
     * Gets the value of the offerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferKey() {
        return offerKey;
    }

    /**
     * Sets the value of the offerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferKey(String value) {
        this.offerKey = value;
    }

    /**
     * Gets the value of the offerInvoiceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferInvoiceText() {
        return offerInvoiceText;
    }

    /**
     * Sets the value of the offerInvoiceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferInvoiceText(String value) {
        this.offerInvoiceText = value;
    }

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceIdentifier() {
        if (serviceIdentifier == null) {
            serviceIdentifier = new ArrayList<String>();
        }
        return this.serviceIdentifier;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmount(BigDecimal value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnits(BigDecimal value) {
        this.units = value;
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
     * Gets the value of the usageSumsPerBillType property.
     * 
     * @return
     *     possible object is
     *     {@link UnbilledUsage.UsageSumsPerBillType }
     *     
     */
    public UnbilledUsage.UsageSumsPerBillType getUsageSumsPerBillType() {
        return usageSumsPerBillType;
    }

    /**
     * Sets the value of the usageSumsPerBillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnbilledUsage.UsageSumsPerBillType }
     *     
     */
    public void setUsageSumsPerBillType(UnbilledUsage.UsageSumsPerBillType value) {
        this.usageSumsPerBillType = value;
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
     *         &lt;element name="usageSumPerBillType" type="{http://www.travellazy.com/product/model}Usage" maxOccurs="unbounded" minOccurs="0"/>
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
        "usageSumPerBillType"
    })
    public static class UsageSumsPerBillType {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<Usage> usageSumPerBillType;

        /**
         * Gets the value of the usageSumPerBillType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usageSumPerBillType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsageSumPerBillType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Usage }
         * 
         * 
         */
        public List<Usage> getUsageSumPerBillType() {
            if (usageSumPerBillType == null) {
                usageSumPerBillType = new ArrayList<Usage>();
            }
            return this.usageSumPerBillType;
        }

    }

}
