
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InvoiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractInvoiceDetails">
 *       &lt;sequence>
 *         &lt;element name="futureBillCycleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currentBillCycleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lastInvoicedPeriod" type="{http://www.travellazy.com/product/model}InvoicePeriod" minOccurs="0"/>
 *         &lt;element name="taxExemption" type="{http://www.travellazy.com/product/model}TaxExemption"/>
 *         &lt;element name="pendingTaxExemption" type="{http://www.travellazy.com/product/model}TaxExemption" minOccurs="0"/>
 *         &lt;element name="invoiceCurrency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "futureBillCycleId",
    "currentBillCycleId",
    "lastInvoicedPeriod",
    "taxExemption",
    "pendingTaxExemption",
    "invoiceCurrency"
})
public class InvoiceDetails
    extends AbstractInvoiceDetails
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long futureBillCycleId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long currentBillCycleId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected InvoicePeriod lastInvoicedPeriod;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected TaxExemption taxExemption;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected TaxExemption pendingTaxExemption;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String invoiceCurrency;

    /**
     * Gets the value of the futureBillCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFutureBillCycleId() {
        return futureBillCycleId;
    }

    /**
     * Sets the value of the futureBillCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFutureBillCycleId(Long value) {
        this.futureBillCycleId = value;
    }

    /**
     * Gets the value of the currentBillCycleId property.
     * 
     */
    public long getCurrentBillCycleId() {
        return currentBillCycleId;
    }

    /**
     * Sets the value of the currentBillCycleId property.
     * 
     */
    public void setCurrentBillCycleId(long value) {
        this.currentBillCycleId = value;
    }

    /**
     * Gets the value of the lastInvoicedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePeriod }
     *     
     */
    public InvoicePeriod getLastInvoicedPeriod() {
        return lastInvoicedPeriod;
    }

    /**
     * Sets the value of the lastInvoicedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePeriod }
     *     
     */
    public void setLastInvoicedPeriod(InvoicePeriod value) {
        this.lastInvoicedPeriod = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setTaxExemption(TaxExemption value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the pendingTaxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getPendingTaxExemption() {
        return pendingTaxExemption;
    }

    /**
     * Sets the value of the pendingTaxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setPendingTaxExemption(TaxExemption value) {
        this.pendingTaxExemption = value;
    }

    /**
     * Gets the value of the invoiceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCurrency() {
        return invoiceCurrency;
    }

    /**
     * Sets the value of the invoiceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCurrency(String value) {
        this.invoiceCurrency = value;
    }

}
