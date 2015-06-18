
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
 *                 For feature instances based on existing features contains information about the crm instance the feature
 *                 is based on
 *                 as well as possible termination charges incurred when the feature is removed.
 *             
 * 
 * <p>Java class for ProductCatalogFeatureModification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogFeatureModification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountComponentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="grossCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="netCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="chargeCurrency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisionable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="openPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="payRemainderOnTermination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminationCharge" type="{http://www.travellazy.com/product/model}PricedChargeCluster" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCatalogFeatureModification", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "accountComponentId",
    "grossCharge",
    "netCharge",
    "chargeCurrency",
    "taxRate",
    "activationDate",
    "displayName",
    "provisionable",
    "openPayments",
    "numberOfPayments",
    "payRemainderOnTermination",
    "serviceId",
    "type",
    "featureType",
    "terminationCharge"
})
public class ProductCatalogFeatureModification {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long accountComponentId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal grossCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal netCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeCurrency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal taxRate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean provisionable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer openPayments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer numberOfPayments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean payRemainderOnTermination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long serviceId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String type;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String featureType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected PricedChargeCluster terminationCharge;

    /**
     * Gets the value of the accountComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountComponentId() {
        return accountComponentId;
    }

    /**
     * Sets the value of the accountComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountComponentId(Long value) {
        this.accountComponentId = value;
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
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the provisionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvisionable() {
        return provisionable;
    }

    /**
     * Sets the value of the provisionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvisionable(Boolean value) {
        this.provisionable = value;
    }

    /**
     * Gets the value of the openPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenPayments() {
        return openPayments;
    }

    /**
     * Sets the value of the openPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenPayments(Integer value) {
        this.openPayments = value;
    }

    /**
     * Gets the value of the numberOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * Sets the value of the numberOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPayments(Integer value) {
        this.numberOfPayments = value;
    }

    /**
     * Gets the value of the payRemainderOnTermination property.
     * 
     */
    public boolean isPayRemainderOnTermination() {
        return payRemainderOnTermination;
    }

    /**
     * Sets the value of the payRemainderOnTermination property.
     * 
     */
    public void setPayRemainderOnTermination(boolean value) {
        this.payRemainderOnTermination = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceId(Long value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the terminationCharge property.
     * 
     * @return
     *     possible object is
     *     {@link PricedChargeCluster }
     *     
     */
    public PricedChargeCluster getTerminationCharge() {
        return terminationCharge;
    }

    /**
     * Sets the value of the terminationCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedChargeCluster }
     *     
     */
    public void setTerminationCharge(PricedChargeCluster value) {
        this.terminationCharge = value;
    }

}
