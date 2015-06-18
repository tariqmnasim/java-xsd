
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
 *                 Information about termination charges that would have to be paid if the feature containing this element
 *                 was to be removed.
 *                 Used for contracts.
 *             
 * 
 * <p>Java class for PricedChargeCluster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedChargeCluster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netChargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="grossChargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="chargeCurrency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *         &lt;element name="graceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="plannedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedChargeCluster", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "chargeClusterKey",
    "netChargeAmount",
    "grossChargeAmount",
    "chargeCurrency",
    "graceDate",
    "plannedEndDate"
})
public class PricedChargeCluster {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String chargeClusterKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal netChargeAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal grossChargeAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeCurrency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar graceDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedEndDate;

    /**
     * Gets the value of the chargeClusterKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeClusterKey() {
        return chargeClusterKey;
    }

    /**
     * Sets the value of the chargeClusterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeClusterKey(String value) {
        this.chargeClusterKey = value;
    }

    /**
     * Gets the value of the netChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetChargeAmount() {
        return netChargeAmount;
    }

    /**
     * Sets the value of the netChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetChargeAmount(BigDecimal value) {
        this.netChargeAmount = value;
    }

    /**
     * Gets the value of the grossChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossChargeAmount() {
        return grossChargeAmount;
    }

    /**
     * Sets the value of the grossChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossChargeAmount(BigDecimal value) {
        this.grossChargeAmount = value;
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
     * Gets the value of the graceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraceDate() {
        return graceDate;
    }

    /**
     * Sets the value of the graceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraceDate(XMLGregorianCalendar value) {
        this.graceDate = value;
    }

    /**
     * Gets the value of the plannedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedEndDate() {
        return plannedEndDate;
    }

    /**
     * Sets the value of the plannedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedEndDate(XMLGregorianCalendar value) {
        this.plannedEndDate = value;
    }

}
