
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreateInvoiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateInvoiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractInvoiceDetails">
 *       &lt;sequence>
 *         &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="taxExemption" type="{http://www.travellazy.com/product/model}TaxExemption" minOccurs="0"/>
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
@XmlType(name = "CreateInvoiceDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "billCycleId",
    "taxExemption",
    "invoiceCurrency"
})
public class CreateInvoiceDetails
    extends AbstractInvoiceDetails
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long billCycleId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected TaxExemption taxExemption;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String invoiceCurrency;

    /**
     * Gets the value of the billCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillCycleId() {
        return billCycleId;
    }

    /**
     * Sets the value of the billCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillCycleId(Long value) {
        this.billCycleId = value;
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
