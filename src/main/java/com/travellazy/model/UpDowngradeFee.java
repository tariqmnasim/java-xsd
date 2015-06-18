
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UpDowngradeFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpDowngradeFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upDowngradeFeeFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="netCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "UpDowngradeFee", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "upDowngradeFeeFeatureKey",
    "invoiceText",
    "grossCharge",
    "netCharge",
    "currency"
})
public class UpDowngradeFee {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String upDowngradeFeeFeatureKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String invoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal grossCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal netCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String currency;

    /**
     * Gets the value of the upDowngradeFeeFeatureKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpDowngradeFeeFeatureKey() {
        return upDowngradeFeeFeatureKey;
    }

    /**
     * Sets the value of the upDowngradeFeeFeatureKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpDowngradeFeeFeatureKey(String value) {
        this.upDowngradeFeeFeatureKey = value;
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
     * Gets the value of the grossCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossCharge() {
        return grossCharge;
    }

    /**
     * Sets the value of the grossCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossCharge(BigDecimal value) {
        this.grossCharge = value;
    }

    /**
     * Gets the value of the netCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetCharge() {
        return netCharge;
    }

    /**
     * Sets the value of the netCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetCharge(BigDecimal value) {
        this.netCharge = value;
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
