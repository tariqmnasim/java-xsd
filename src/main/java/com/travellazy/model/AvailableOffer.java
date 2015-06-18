
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AvailableOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customizedOfferId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="upgradeCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="upgradeChargeCurrency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *         &lt;element name="offerDisplayCategoryReferences" type="{http://www.travellazy.com/product/model}OfferDisplayCategoryReferenceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerKey",
    "invoiceName",
    "internalName",
    "description",
    "customizedOfferId",
    "upgradeCharge",
    "upgradeChargeCurrency",
    "offerDisplayCategoryReferences"
})
public class AvailableOffer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String invoiceName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String internalName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer customizedOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal upgradeCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String upgradeChargeCurrency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferDisplayCategoryReferenceList offerDisplayCategoryReferences;

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
     * Gets the value of the invoiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceName() {
        return invoiceName;
    }

    /**
     * Sets the value of the invoiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceName(String value) {
        this.invoiceName = value;
    }

    /**
     * Gets the value of the internalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     * Sets the value of the internalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalName(String value) {
        this.internalName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the customizedOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomizedOfferId() {
        return customizedOfferId;
    }

    /**
     * Sets the value of the customizedOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomizedOfferId(Integer value) {
        this.customizedOfferId = value;
    }

    /**
     * Gets the value of the upgradeCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpgradeCharge() {
        return upgradeCharge;
    }

    /**
     * Sets the value of the upgradeCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpgradeCharge(BigDecimal value) {
        this.upgradeCharge = value;
    }

    /**
     * Gets the value of the upgradeChargeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeChargeCurrency() {
        return upgradeChargeCurrency;
    }

    /**
     * Sets the value of the upgradeChargeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeChargeCurrency(String value) {
        this.upgradeChargeCurrency = value;
    }

    /**
     * Gets the value of the offerDisplayCategoryReferences property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDisplayCategoryReferenceList }
     *     
     */
    public OfferDisplayCategoryReferenceList getOfferDisplayCategoryReferences() {
        return offerDisplayCategoryReferences;
    }

    /**
     * Sets the value of the offerDisplayCategoryReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDisplayCategoryReferenceList }
     *     
     */
    public void setOfferDisplayCategoryReferences(OfferDisplayCategoryReferenceList value) {
        this.offerDisplayCategoryReferences = value;
    }

}
