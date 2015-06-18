
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractInvoiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractInvoiceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.travellazy.com/product/model}CreateAddress" minOccurs="0"/>
 *         &lt;element name="invoiceItemizationTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invoiceDeliveryMethodKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextInvoicePeriod" type="{http://www.travellazy.com/product/model}InvoicePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractInvoiceDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "address",
    "invoiceItemizationTypeKey",
    "taxModeKey",
    "invoiceInterval",
    "invoiceDeliveryMethodKey",
    "nextInvoicePeriod"
})
@XmlSeeAlso({
    UpdateInvoiceDetails.class,
    CreateInvoiceDetails.class,
    InvoiceDetails.class
})
public abstract class AbstractInvoiceDetails {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateAddress address;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String invoiceItemizationTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String taxModeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", defaultValue = "1")
    protected int invoiceInterval;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String invoiceDeliveryMethodKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected InvoicePeriod nextInvoicePeriod;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAddress }
     *     
     */
    public CreateAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAddress }
     *     
     */
    public void setAddress(CreateAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the invoiceItemizationTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceItemizationTypeKey() {
        return invoiceItemizationTypeKey;
    }

    /**
     * Sets the value of the invoiceItemizationTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceItemizationTypeKey(String value) {
        this.invoiceItemizationTypeKey = value;
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
     * Gets the value of the invoiceInterval property.
     * 
     */
    public int getInvoiceInterval() {
        return invoiceInterval;
    }

    /**
     * Sets the value of the invoiceInterval property.
     * 
     */
    public void setInvoiceInterval(int value) {
        this.invoiceInterval = value;
    }

    /**
     * Gets the value of the invoiceDeliveryMethodKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDeliveryMethodKey() {
        return invoiceDeliveryMethodKey;
    }

    /**
     * Sets the value of the invoiceDeliveryMethodKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDeliveryMethodKey(String value) {
        this.invoiceDeliveryMethodKey = value;
    }

    /**
     * Gets the value of the nextInvoicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePeriod }
     *     
     */
    public InvoicePeriod getNextInvoicePeriod() {
        return nextInvoicePeriod;
    }

    /**
     * Sets the value of the nextInvoicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePeriod }
     *     
     */
    public void setNextInvoicePeriod(InvoicePeriod value) {
        this.nextInvoicePeriod = value;
    }

}
