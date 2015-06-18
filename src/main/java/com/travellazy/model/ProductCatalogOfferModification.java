
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Information about the existing offer this proposal has been created from as well as additional
 *                 properties controlling the behaviour of upgrades from this existing offer to the offer defined in the
 *                 proposal.
 *             
 * 
 * <p>Java class for ProductCatalogOfferModification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogOfferModification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceCustomizedOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceOfferKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceOfferInvoiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceParentOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="upgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ruleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etfHandling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etfAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="upDowngradeFee" type="{http://www.travellazy.com/product/model}SelectableFeature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCatalogOfferModification", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "sourceCustomizedOfferId",
    "type",
    "sourceOfferKey",
    "sourceOfferInvoiceName",
    "sourceParentOfferId",
    "upgrade",
    "ruleKey",
    "etfHandling",
    "etfAmount",
    "upDowngradeFee"
})
public class ProductCatalogOfferModification {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long sourceCustomizedOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String type;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String sourceOfferKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String sourceOfferInvoiceName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long sourceParentOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean upgrade;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String ruleKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String etfHandling;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal etfAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected SelectableFeature upDowngradeFee;

    /**
     * Gets the value of the sourceCustomizedOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceCustomizedOfferId() {
        return sourceCustomizedOfferId;
    }

    /**
     * Sets the value of the sourceCustomizedOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceCustomizedOfferId(Long value) {
        this.sourceCustomizedOfferId = value;
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
     * Gets the value of the sourceOfferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfferKey() {
        return sourceOfferKey;
    }

    /**
     * Sets the value of the sourceOfferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfferKey(String value) {
        this.sourceOfferKey = value;
    }

    /**
     * Gets the value of the sourceOfferInvoiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfferInvoiceName() {
        return sourceOfferInvoiceName;
    }

    /**
     * Sets the value of the sourceOfferInvoiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfferInvoiceName(String value) {
        this.sourceOfferInvoiceName = value;
    }

    /**
     * Gets the value of the sourceParentOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceParentOfferId() {
        return sourceParentOfferId;
    }

    /**
     * Sets the value of the sourceParentOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceParentOfferId(Long value) {
        this.sourceParentOfferId = value;
    }

    /**
     * Gets the value of the upgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgrade() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgrade(Boolean value) {
        this.upgrade = value;
    }

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
     * Gets the value of the etfHandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtfHandling() {
        return etfHandling;
    }

    /**
     * Sets the value of the etfHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtfHandling(String value) {
        this.etfHandling = value;
    }

    /**
     * Gets the value of the etfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEtfAmount() {
        return etfAmount;
    }

    /**
     * Sets the value of the etfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEtfAmount(BigDecimal value) {
        this.etfAmount = value;
    }

    /**
     * Gets the value of the upDowngradeFee property.
     * 
     * @return
     *     possible object is
     *     {@link SelectableFeature }
     *     
     */
    public SelectableFeature getUpDowngradeFee() {
        return upDowngradeFee;
    }

    /**
     * Sets the value of the upDowngradeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableFeature }
     *     
     */
    public void setUpDowngradeFee(SelectableFeature value) {
        this.upDowngradeFee = value;
    }

}
