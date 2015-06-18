
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 One particular transaction, typeKey gives the type of the transaction like INVOICE, PAYMENT.
 *             
 * 
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="typeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentChannelTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releatedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="effectiveAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="rollingBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="disputedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="undisputedItemBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="currency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "date",
    "typeKey",
    "paymentChannelTypeKey",
    "referenceId",
    "releatedTo",
    "sourceCustomerId",
    "amount",
    "effectiveAmount",
    "rollingBalance",
    "disputedAmount",
    "undisputedItemBalance",
    "currency"
})
public class Transaction {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String typeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String paymentChannelTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String referenceId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String releatedTo;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long sourceCustomerId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal amount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal effectiveAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal rollingBalance;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal disputedAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal undisputedItemBalance;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String currency;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the typeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * Sets the value of the typeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeKey(String value) {
        this.typeKey = value;
    }

    /**
     * Gets the value of the paymentChannelTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannelTypeKey() {
        return paymentChannelTypeKey;
    }

    /**
     * Sets the value of the paymentChannelTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentChannelTypeKey(String value) {
        this.paymentChannelTypeKey = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the releatedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleatedTo() {
        return releatedTo;
    }

    /**
     * Sets the value of the releatedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleatedTo(String value) {
        this.releatedTo = value;
    }

    /**
     * Gets the value of the sourceCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceCustomerId() {
        return sourceCustomerId;
    }

    /**
     * Sets the value of the sourceCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceCustomerId(Long value) {
        this.sourceCustomerId = value;
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
     * Gets the value of the effectiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEffectiveAmount() {
        return effectiveAmount;
    }

    /**
     * Sets the value of the effectiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEffectiveAmount(BigDecimal value) {
        this.effectiveAmount = value;
    }

    /**
     * Gets the value of the rollingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRollingBalance() {
        return rollingBalance;
    }

    /**
     * Sets the value of the rollingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRollingBalance(BigDecimal value) {
        this.rollingBalance = value;
    }

    /**
     * Gets the value of the disputedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisputedAmount() {
        return disputedAmount;
    }

    /**
     * Sets the value of the disputedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisputedAmount(BigDecimal value) {
        this.disputedAmount = value;
    }

    /**
     * Gets the value of the undisputedItemBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndisputedItemBalance() {
        return undisputedItemBalance;
    }

    /**
     * Sets the value of the undisputedItemBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndisputedItemBalance(BigDecimal value) {
        this.undisputedItemBalance = value;
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

}
