
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 Common attributes of a charge.
 *             
 * 
 * <p>Java class for AbstractCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="netCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="grossCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="chargeCurrency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCharge", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "chargeType",
    "invoiceText",
    "glCode",
    "productCode",
    "billTypeKey",
    "taxRate",
    "netCharge",
    "grossCharge",
    "chargeCurrency"
})
@XmlSeeAlso({
    RecurringChargeProposal.class,
    InstalmentChargeProposal.class,
    OnceOnlyChargeProposal.class
})
public abstract class AbstractCharge {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String chargeType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String invoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String glCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String productCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String billTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal taxRate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal netCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal grossCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeCurrency;

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
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
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
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
     * Gets the value of the chargeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCurrency() {
        return chargeCurrency;
    }

    /**
     * Sets the value of the chargeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCurrency(String value) {
        this.chargeCurrency = value;
    }

}
