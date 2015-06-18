
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpDowngradeOfferRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpDowngradeOfferRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}OfferRule">
 *       &lt;sequence>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="earlyTerminationFeeHandlingTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="earlyTerminationFeeHandlingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="upDowngradeFeeFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isUpgrade" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpDowngradeOfferRule", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerKey",
    "earlyTerminationFeeHandlingTypeKey",
    "earlyTerminationFeeHandlingAmount",
    "upDowngradeFeeFeatureKey"
})
public class UpDowngradeOfferRule
    extends OfferRule
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String earlyTerminationFeeHandlingTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal earlyTerminationFeeHandlingAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String upDowngradeFeeFeatureKey;
    @XmlAttribute(name = "isUpgrade", required = true)
    protected boolean isUpgrade;

    /**
     * Gets the value of the offerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferKey() {
        return offerKey;
    }

    /**
     * Sets the value of the offerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferKey(String value) {
        this.offerKey = value;
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
     * Gets the value of the upDowngradeFeeFeatureKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpDowngradeFeeFeatureKey() {
        return upDowngradeFeeFeatureKey;
    }

    /**
     * Sets the value of the upDowngradeFeeFeatureKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpDowngradeFeeFeatureKey(String value) {
        this.upDowngradeFeeFeatureKey = value;
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
