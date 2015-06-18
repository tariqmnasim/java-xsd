
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
 * <p>Java class for CustomizedOfferUnbilledUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizedOfferUnbilledUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="measuringUnitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="grossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="currency" type="{http://www.travellazy.com/product/model}isoCurrency"/>
 *         &lt;element name="taxTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizedOfferUnbilledUsage", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "billTypeKey",
    "serviceAccountId",
    "serviceIdentifier",
    "invoiceText",
    "startDate",
    "duration",
    "units",
    "measuringUnitKey",
    "netAmount",
    "grossAmount",
    "currency",
    "taxTypeKey",
    "originationNumber",
    "destinationNumber",
    "destinationInfo",
    "destinationCountryCode",
    "sessionInfo"
})
public class CustomizedOfferUnbilledUsage {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String billTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long serviceAccountId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceIdentifier;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String invoiceText;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal duration;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal units;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String measuringUnitKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal netAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal grossAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String currency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String taxTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String originationNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String destinationNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String destinationInfo;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String destinationCountryCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String sessionInfo;

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
     * Gets the value of the serviceAccountId property.
     * 
     */
    public long getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * Sets the value of the serviceAccountId property.
     * 
     */
    public void setServiceAccountId(long value) {
        this.serviceAccountId = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuration(BigDecimal value) {
        this.duration = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnits(BigDecimal value) {
        this.units = value;
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
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmount(BigDecimal value) {
        this.grossAmount = value;
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
     * Gets the value of the taxTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeKey() {
        return taxTypeKey;
    }

    /**
     * Sets the value of the taxTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeKey(String value) {
        this.taxTypeKey = value;
    }

    /**
     * Gets the value of the originationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginationNumber() {
        return originationNumber;
    }

    /**
     * Sets the value of the originationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginationNumber(String value) {
        this.originationNumber = value;
    }

    /**
     * Gets the value of the destinationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Sets the value of the destinationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNumber(String value) {
        this.destinationNumber = value;
    }

    /**
     * Gets the value of the destinationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInfo() {
        return destinationInfo;
    }

    /**
     * Sets the value of the destinationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInfo(String value) {
        this.destinationInfo = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionInfo(String value) {
        this.sessionInfo = value;
    }

}
