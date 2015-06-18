
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 Charges and usage sums for a customized offer, along with all service identifiers and net and gross sums
 *                 of all expenses.
 *             
 * 
 * <p>Java class for CustomizedOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizedOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="offerInvoiceText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="grossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="currency" type="{http://www.travellazy.com/product/model}isoCurrency"/>
 *         &lt;element name="serviceIdentifiers" type="{http://www.travellazy.com/product/model}ServiceIdentifiersList" minOccurs="0"/>
 *         &lt;element name="charges" type="{http://www.travellazy.com/product/model}CustOfferChargeList" minOccurs="0"/>
 *         &lt;element name="usageSumsPerBillType" type="{http://www.travellazy.com/product/model}CustOfferUsageList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizedOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "id",
    "offerInvoiceText",
    "netAmount",
    "grossAmount",
    "currency",
    "serviceIdentifiers",
    "charges",
    "usageSumsPerBillType"
})
public class CustomizedOffer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long id;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerInvoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal netAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal grossAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String currency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceIdentifiersList serviceIdentifiers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CustOfferChargeList charges;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CustOfferUsageList usageSumsPerBillType;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Gets the value of the serviceIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifiersList }
     *     
     */
    public ServiceIdentifiersList getServiceIdentifiers() {
        return serviceIdentifiers;
    }

    /**
     * Sets the value of the serviceIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifiersList }
     *     
     */
    public void setServiceIdentifiers(ServiceIdentifiersList value) {
        this.serviceIdentifiers = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link CustOfferChargeList }
     *     
     */
    public CustOfferChargeList getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustOfferChargeList }
     *     
     */
    public void setCharges(CustOfferChargeList value) {
        this.charges = value;
    }

    /**
     * Gets the value of the usageSumsPerBillType property.
     * 
     * @return
     *     possible object is
     *     {@link CustOfferUsageList }
     *     
     */
    public CustOfferUsageList getUsageSumsPerBillType() {
        return usageSumsPerBillType;
    }

    /**
     * Sets the value of the usageSumsPerBillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustOfferUsageList }
     *     
     */
    public void setUsageSumsPerBillType(CustOfferUsageList value) {
        this.usageSumsPerBillType = value;
    }

}
