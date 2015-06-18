
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Allowance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Allowance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowanceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customizedOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerInvoiceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billTypeInvoiceText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billTypeGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="usedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="remainingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="measuringUnitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiringAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="carryOverAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="carriedOverFromLastBillingPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="type" type="{http://www.travellazy.com/product/model}AllowanceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allowance", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "allowanceKey",
    "customizedOfferId",
    "offerKey",
    "offerInvoiceText",
    "billTypeKey",
    "billTypeInvoiceText",
    "billTypeGroupKey",
    "serviceIdentifier",
    "amount",
    "usedAmount",
    "remainingAmount",
    "measuringUnitKey",
    "expiringAmount",
    "carryOverAmount",
    "carriedOverFromLastBillingPeriod"
})
public class Allowance {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String allowanceKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long customizedOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String offerKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String offerInvoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String billTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String billTypeInvoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String billTypeGroupKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String serviceIdentifier;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal amount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal usedAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal remainingAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String measuringUnitKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal expiringAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal carryOverAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal carriedOverFromLastBillingPeriod;
    @XmlAttribute(name = "isLimit")
    protected Boolean isLimit;
    @XmlAttribute(name = "type")
    protected AllowanceType type;

    /**
     * Gets the value of the allowanceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceKey() {
        return allowanceKey;
    }

    /**
     * Sets the value of the allowanceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceKey(String value) {
        this.allowanceKey = value;
    }

    /**
     * Gets the value of the customizedOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomizedOfferId() {
        return customizedOfferId;
    }

    /**
     * Sets the value of the customizedOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomizedOfferId(Long value) {
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
     * Gets the value of the billTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillTypeKey() {
        return billTypeKey;
    }

    /**
     * Sets the value of the billTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillTypeKey(String value) {
        this.billTypeKey = value;
    }

    /**
     * Gets the value of the billTypeInvoiceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillTypeInvoiceText() {
        return billTypeInvoiceText;
    }

    /**
     * Sets the value of the billTypeInvoiceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillTypeInvoiceText(String value) {
        this.billTypeInvoiceText = value;
    }

    /**
     * Gets the value of the billTypeGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillTypeGroupKey() {
        return billTypeGroupKey;
    }

    /**
     * Sets the value of the billTypeGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillTypeGroupKey(String value) {
        this.billTypeGroupKey = value;
    }

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifier(String value) {
        this.serviceIdentifier = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the usedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    /**
     * Sets the value of the usedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedAmount(BigDecimal value) {
        this.usedAmount = value;
    }

    /**
     * Gets the value of the remainingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Sets the value of the remainingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingAmount(BigDecimal value) {
        this.remainingAmount = value;
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
     * Gets the value of the expiringAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpiringAmount() {
        return expiringAmount;
    }

    /**
     * Sets the value of the expiringAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpiringAmount(BigDecimal value) {
        this.expiringAmount = value;
    }

    /**
     * Gets the value of the carryOverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarryOverAmount() {
        return carryOverAmount;
    }

    /**
     * Sets the value of the carryOverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarryOverAmount(BigDecimal value) {
        this.carryOverAmount = value;
    }

    /**
     * Gets the value of the carriedOverFromLastBillingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarriedOverFromLastBillingPeriod() {
        return carriedOverFromLastBillingPeriod;
    }

    /**
     * Sets the value of the carriedOverFromLastBillingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarriedOverFromLastBillingPeriod(BigDecimal value) {
        this.carriedOverFromLastBillingPeriod = value;
    }

    /**
     * Gets the value of the isLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLimit() {
        return isLimit;
    }

    /**
     * Sets the value of the isLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLimit(Boolean value) {
        this.isLimit = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceType }
     *     
     */
    public AllowanceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceType }
     *     
     */
    public void setType(AllowanceType value) {
        this.type = value;
    }

}
