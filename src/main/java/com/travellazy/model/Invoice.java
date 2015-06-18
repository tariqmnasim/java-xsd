
package com.travellazy.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="invoicePeriod" type="{http://www.travellazy.com/product/model}InvoicePeriod"/>
 *         &lt;element name="invoicePeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="invoicePeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="amountToPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="amountOverdue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="amountOverdueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="grossAmountDue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="netAmountDue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxAmountDue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="currency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *         &lt;element name="invoiceStatusKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceMessages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="invoiceMessage" type="{http://www.travellazy.com/product/model}InvoiceMessage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="invoiceAttributes" type="{http://www.travellazy.com/product/model}InvoiceAttributes" minOccurs="0"/>
 *         &lt;element name="amountOpen" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isFinal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "id",
    "billCycleId",
    "invoicePeriod",
    "invoicePeriodStartDate",
    "invoicePeriodEndDate",
    "invoiceDate",
    "dueDate",
    "amountToPay",
    "amountOverdue",
    "amountOverdueDate",
    "grossAmountDue",
    "netAmountDue",
    "taxAmountDue",
    "currency",
    "invoiceStatusKey",
    "invoiceMessages",
    "invoiceAttributes",
    "amountOpen"
})
public class Invoice {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long id;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long billCycleId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected InvoicePeriod invoicePeriod;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoicePeriodStartDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoicePeriodEndDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal amountToPay;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal amountOverdue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar amountOverdueDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal grossAmountDue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal netAmountDue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal taxAmountDue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String currency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String invoiceStatusKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Invoice.InvoiceMessages invoiceMessages;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected InvoiceAttributes invoiceAttributes;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal amountOpen;
    @XmlAttribute(name = "isFinal")
    protected Boolean isFinal;

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
     * Gets the value of the billCycleId property.
     * 
     */
    public long getBillCycleId() {
        return billCycleId;
    }

    /**
     * Sets the value of the billCycleId property.
     * 
     */
    public void setBillCycleId(long value) {
        this.billCycleId = value;
    }

    /**
     * Gets the value of the invoicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePeriod }
     *     
     */
    public InvoicePeriod getInvoicePeriod() {
        return invoicePeriod;
    }

    /**
     * Sets the value of the invoicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePeriod }
     *     
     */
    public void setInvoicePeriod(InvoicePeriod value) {
        this.invoicePeriod = value;
    }

    /**
     * Gets the value of the invoicePeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoicePeriodStartDate() {
        return invoicePeriodStartDate;
    }

    /**
     * Sets the value of the invoicePeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoicePeriodStartDate(XMLGregorianCalendar value) {
        this.invoicePeriodStartDate = value;
    }

    /**
     * Gets the value of the invoicePeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoicePeriodEndDate() {
        return invoicePeriodEndDate;
    }

    /**
     * Sets the value of the invoicePeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoicePeriodEndDate(XMLGregorianCalendar value) {
        this.invoicePeriodEndDate = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the amountToPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountToPay() {
        return amountToPay;
    }

    /**
     * Sets the value of the amountToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountToPay(BigDecimal value) {
        this.amountToPay = value;
    }

    /**
     * Gets the value of the amountOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOverdue() {
        return amountOverdue;
    }

    /**
     * Sets the value of the amountOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountOverdue(BigDecimal value) {
        this.amountOverdue = value;
    }

    /**
     * Gets the value of the amountOverdueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmountOverdueDate() {
        return amountOverdueDate;
    }

    /**
     * Sets the value of the amountOverdueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmountOverdueDate(XMLGregorianCalendar value) {
        this.amountOverdueDate = value;
    }

    /**
     * Gets the value of the grossAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmountDue() {
        return grossAmountDue;
    }

    /**
     * Sets the value of the grossAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmountDue(BigDecimal value) {
        this.grossAmountDue = value;
    }

    /**
     * Gets the value of the netAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmountDue() {
        return netAmountDue;
    }

    /**
     * Sets the value of the netAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmountDue(BigDecimal value) {
        this.netAmountDue = value;
    }

    /**
     * Gets the value of the taxAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmountDue() {
        return taxAmountDue;
    }

    /**
     * Sets the value of the taxAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmountDue(BigDecimal value) {
        this.taxAmountDue = value;
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
     * Gets the value of the invoiceStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatusKey() {
        return invoiceStatusKey;
    }

    /**
     * Sets the value of the invoiceStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatusKey(String value) {
        this.invoiceStatusKey = value;
    }

    /**
     * Gets the value of the invoiceMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.InvoiceMessages }
     *     
     */
    public Invoice.InvoiceMessages getInvoiceMessages() {
        return invoiceMessages;
    }

    /**
     * Sets the value of the invoiceMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.InvoiceMessages }
     *     
     */
    public void setInvoiceMessages(Invoice.InvoiceMessages value) {
        this.invoiceMessages = value;
    }

    /**
     * Gets the value of the invoiceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAttributes }
     *     
     */
    public InvoiceAttributes getInvoiceAttributes() {
        return invoiceAttributes;
    }

    /**
     * Sets the value of the invoiceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAttributes }
     *     
     */
    public void setInvoiceAttributes(InvoiceAttributes value) {
        this.invoiceAttributes = value;
    }

    /**
     * Gets the value of the amountOpen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOpen() {
        return amountOpen;
    }

    /**
     * Sets the value of the amountOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountOpen(BigDecimal value) {
        this.amountOpen = value;
    }

    /**
     * Gets the value of the isFinal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFinal() {
        return isFinal;
    }

    /**
     * Sets the value of the isFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFinal(Boolean value) {
        this.isFinal = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="invoiceMessage" type="{http://www.travellazy.com/product/model}InvoiceMessage" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invoiceMessage"
    })
    public static class InvoiceMessages {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<InvoiceMessage> invoiceMessage;

        /**
         * Gets the value of the invoiceMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the invoiceMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvoiceMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceMessage }
         * 
         * 
         */
        public List<InvoiceMessage> getInvoiceMessage() {
            if (invoiceMessage == null) {
                invoiceMessage = new ArrayList<InvoiceMessage>();
            }
            return this.invoiceMessage;
        }

    }

}
