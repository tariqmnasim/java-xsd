
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Used for upgrade bundle offers.
 *             
 * 
 * <p>Java class for ChangeCustomizedBundleOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustomizedBundleOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractChangeCustomizedOffer">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.travellazy.com/product/model}BundleMemberActions"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCustomizedBundleOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "upgradeBaseOffers",
    "createBaseOffers",
    "deleteBaseOffers"
})
public class ChangeCustomizedBundleOffer
    extends AbstractChangeCustomizedOffer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpgradeCustomizedBundleMembers upgradeBaseOffers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateCustomizedBundleMembers createBaseOffers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected DeleteCustomizedBundleMembers deleteBaseOffers;

    /**
     * Gets the value of the upgradeBaseOffers property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeCustomizedBundleMembers }
     *     
     */
    public UpgradeCustomizedBundleMembers getUpgradeBaseOffers() {
        return upgradeBaseOffers;
    }

    /**
     * Sets the value of the upgradeBaseOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeCustomizedBundleMembers }
     *     
     */
    public void setUpgradeBaseOffers(UpgradeCustomizedBundleMembers value) {
        this.upgradeBaseOffers = value;
    }

    /**
     * Gets the value of the createBaseOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomizedBundleMembers }
     *     
     */
    public CreateCustomizedBundleMembers getCreateBaseOffers() {
        return createBaseOffers;
    }

    /**
     * Sets the value of the createBaseOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomizedBundleMembers }
     *     
     */
    public void setCreateBaseOffers(CreateCustomizedBundleMembers value) {
        this.createBaseOffers = value;
    }

    /**
     * Gets the value of the deleteBaseOffers property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCustomizedBundleMembers }
     *     
     */
    public DeleteCustomizedBundleMembers getDeleteBaseOffers() {
        return deleteBaseOffers;
    }

    /**
     * Sets the value of the deleteBaseOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCustomizedBundleMembers }
     *     
     */
    public void setDeleteBaseOffers(DeleteCustomizedBundleMembers value) {
        this.deleteBaseOffers = value;
    }

}
