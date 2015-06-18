
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableUpDowngrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableUpDowngrade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="earlyTerminationFeeHandlingTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="earlyTerminationFeeHandlingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="upDowngradeFee" type="{http://www.travellazy.com/product/model}UpDowngradeFee" minOccurs="0"/>
 *         &lt;element name="offer" type="{http://www.travellazy.com/product/model}AvailableOffer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isUpgrade" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableUpDowngrade", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "ruleKey",
    "earlyTerminationFeeHandlingTypeKey",
    "earlyTerminationFeeHandlingAmount",
    "upDowngradeFee",
    "offer"
})
public class AvailableUpDowngrade {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String ruleKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String earlyTerminationFeeHandlingTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal earlyTerminationFeeHandlingAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpDowngradeFee upDowngradeFee;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected AvailableOffer offer;
    @XmlAttribute(name = "isUpgrade", required = true)
    protected boolean isUpgrade;

    /**
     * Gets the value of the ruleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleKey() {
        return ruleKey;
    }

    /**
     * Sets the value of the ruleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleKey(String value) {
        this.ruleKey = value;
    }

    /**
     * Gets the value of the earlyTerminationFeeHandlingTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyTerminationFeeHandlingTypeKey() {
        return earlyTerminationFeeHandlingTypeKey;
    }

    /**
     * Sets the value of the earlyTerminationFeeHandlingTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyTerminationFeeHandlingTypeKey(String value) {
        this.earlyTerminationFeeHandlingTypeKey = value;
    }

    /**
     * Gets the value of the earlyTerminationFeeHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarlyTerminationFeeHandlingAmount() {
        return earlyTerminationFeeHandlingAmount;
    }

    /**
     * Sets the value of the earlyTerminationFeeHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarlyTerminationFeeHandlingAmount(BigDecimal value) {
        this.earlyTerminationFeeHandlingAmount = value;
    }

    /**
     * Gets the value of the upDowngradeFee property.
     * 
     * @return
     *     possible object is
     *     {@link UpDowngradeFee }
     *     
     */
    public UpDowngradeFee getUpDowngradeFee() {
        return upDowngradeFee;
    }

    /**
     * Sets the value of the upDowngradeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpDowngradeFee }
     *     
     */
    public void setUpDowngradeFee(UpDowngradeFee value) {
        this.upDowngradeFee = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableOffer }
     *     
     */
    public AvailableOffer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableOffer }
     *     
     */
    public void setOffer(AvailableOffer value) {
        this.offer = value;
    }

    /**
     * Gets the value of the isUpgrade property.
     * 
     */
    public boolean isIsUpgrade() {
        return isUpgrade;
    }

    /**
     * Sets the value of the isUpgrade property.
     * 
     */
    public void setIsUpgrade(boolean value) {
        this.isUpgrade = value;
    }

}
