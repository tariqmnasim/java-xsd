
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferUpgradeAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferUpgradeAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}OfferChangeAction">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.travellazy.com/product/model}upgradeInformation"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="baseOffer" type="{http://www.travellazy.com/product/model}ChangeCustomizedBaseOffer"/>
 *           &lt;element name="bundleOffer" type="{http://www.travellazy.com/product/model}ChangeCustomizedBundleOffer"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="channelKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferUpgradeAction", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "targetOfferKey",
    "upDowngradeRuleKey",
    "upgradeBehavior",
    "downgradeReasonKey",
    "baseOffer",
    "bundleOffer",
    "channelId",
    "channelKey"
})
public class OfferUpgradeAction
    extends OfferChangeAction
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String targetOfferKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String upDowngradeRuleKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpgradeBehavior upgradeBehavior;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String downgradeReasonKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ChangeCustomizedBaseOffer baseOffer;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ChangeCustomizedBundleOffer bundleOffer;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long channelId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String channelKey;

    /**
     * Gets the value of the targetOfferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetOfferKey() {
        return targetOfferKey;
    }

    /**
     * Sets the value of the targetOfferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetOfferKey(String value) {
        this.targetOfferKey = value;
    }

    /**
     * Gets the value of the upDowngradeRuleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpDowngradeRuleKey() {
        return upDowngradeRuleKey;
    }

    /**
     * Sets the value of the upDowngradeRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpDowngradeRuleKey(String value) {
        this.upDowngradeRuleKey = value;
    }

    /**
     * Gets the value of the upgradeBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeBehavior }
     *     
     */
    public UpgradeBehavior getUpgradeBehavior() {
        return upgradeBehavior;
    }

    /**
     * Sets the value of the upgradeBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeBehavior }
     *     
     */
    public void setUpgradeBehavior(UpgradeBehavior value) {
        this.upgradeBehavior = value;
    }

    /**
     * Gets the value of the downgradeReasonKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDowngradeReasonKey() {
        return downgradeReasonKey;
    }

    /**
     * Sets the value of the downgradeReasonKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDowngradeReasonKey(String value) {
        this.downgradeReasonKey = value;
    }

    /**
     * Gets the value of the baseOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustomizedBaseOffer }
     *     
     */
    public ChangeCustomizedBaseOffer getBaseOffer() {
        return baseOffer;
    }

    /**
     * Sets the value of the baseOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustomizedBaseOffer }
     *     
     */
    public void setBaseOffer(ChangeCustomizedBaseOffer value) {
        this.baseOffer = value;
    }

    /**
     * Gets the value of the bundleOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustomizedBundleOffer }
     *     
     */
    public ChangeCustomizedBundleOffer getBundleOffer() {
        return bundleOffer;
    }

    /**
     * Sets the value of the bundleOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustomizedBundleOffer }
     *     
     */
    public void setBundleOffer(ChangeCustomizedBundleOffer value) {
        this.bundleOffer = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChannelId(Long value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelKey() {
        return channelKey;
    }

    /**
     * Sets the value of the channelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelKey(String value) {
        this.channelKey = value;
    }

}
