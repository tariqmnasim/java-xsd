
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.travellazy.com/product/model}nonNegativeLong"/>
 *         &lt;element name="balanceId" type="{http://www.travellazy.com/product/model}nonNegativeLong"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="deltaValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originatingBalanceId" type="{http://www.travellazy.com/product/model}nonNegativeLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceTransaction", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "id",
    "balanceId",
    "value",
    "deltaValue",
    "referenceId",
    "referenceType",
    "originatingBalanceId"
})
public class BalanceTransaction {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long id;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long balanceId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal value;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal deltaValue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String referenceId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String referenceType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long originatingBalanceId;

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
     * Gets the value of the balanceId property.
     * 
     */
    public long getBalanceId() {
        return balanceId;
    }

    /**
     * Sets the value of the balanceId property.
     * 
     */
    public void setBalanceId(long value) {
        this.balanceId = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the deltaValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeltaValue() {
        return deltaValue;
    }

    /**
     * Sets the value of the deltaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeltaValue(BigDecimal value) {
        this.deltaValue = value;
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
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceType(String value) {
        this.referenceType = value;
    }

    /**
     * Gets the value of the originatingBalanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginatingBalanceId() {
        return originatingBalanceId;
    }

    /**
     * Sets the value of the originatingBalanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginatingBalanceId(Long value) {
        this.originatingBalanceId = value;
    }

}
