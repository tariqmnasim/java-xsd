
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceItemizeLevelKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paperInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasDisputes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasAdjustments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invoiceAddress" type="{http://www.travellazy.com/product/model}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAttributes", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "invoiceItemizeLevelKey",
    "paperInvoice",
    "taxModeKey",
    "paymentMethod",
    "hasDisputes",
    "hasAdjustments",
    "invoiceAddress"
})
public class InvoiceAttributes {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String invoiceItemizeLevelKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean paperInvoice;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String taxModeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String paymentMethod;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean hasDisputes;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean hasAdjustments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Address invoiceAddress;

    /**
     * Gets the value of the invoiceItemizeLevelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceItemizeLevelKey() {
        return invoiceItemizeLevelKey;
    }

    /**
     * Sets the value of the invoiceItemizeLevelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceItemizeLevelKey(String value) {
        this.invoiceItemizeLevelKey = value;
    }

    /**
     * Gets the value of the paperInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaperInvoice() {
        return paperInvoice;
    }

    /**
     * Sets the value of the paperInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaperInvoice(Boolean value) {
        this.paperInvoice = value;
    }

    /**
     * Gets the value of the taxModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxModeKey() {
        return taxModeKey;
    }

    /**
     * Sets the value of the taxModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxModeKey(String value) {
        this.taxModeKey = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the hasDisputes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDisputes() {
        return hasDisputes;
    }

    /**
     * Sets the value of the hasDisputes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDisputes(Boolean value) {
        this.hasDisputes = value;
    }

    /**
     * Gets the value of the hasAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAdjustments() {
        return hasAdjustments;
    }

    /**
     * Sets the value of the hasAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAdjustments(Boolean value) {
        this.hasAdjustments = value;
    }

    /**
     * Gets the value of the invoiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Sets the value of the invoiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setInvoiceAddress(Address value) {
        this.invoiceAddress = value;
    }

}
