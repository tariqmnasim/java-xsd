
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateOfferConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOfferConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offer" type="{http://www.travellazy.com/product/model}UpdateOffer" minOccurs="0"/>
 *         &lt;element name="featureGroupReferences" type="{http://www.travellazy.com/product/model}FeatureGroupReferenceList" minOccurs="0"/>
 *         &lt;element name="serviceFeatureReferences" type="{http://www.travellazy.com/product/model}ServiceFeatureReferenceList" minOccurs="0"/>
 *         &lt;element name="featureGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="featureGroup" type="{http://www.travellazy.com/product/model}FeatureGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="featureGroupDisplayCategories" type="{http://www.travellazy.com/product/model}FeatureGroupDisplayCategories" minOccurs="0"/>
 *         &lt;element name="tariffModels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tariffModel" type="{http://www.travellazy.com/product/model}TariffModel" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="chargeClusters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chargeCluster" type="{http://www.travellazy.com/product/model}ChargeCluster" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="discountScopeFilters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="discountScopeFilter" type="{http://www.travellazy.com/product/model}DiscountScopeFilter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="billTypeGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="billTypeGroup" type="{http://www.travellazy.com/product/model}BillTypeGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="billTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="billType" type="{http://www.travellazy.com/product/model}BillType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="channels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="channelKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="i18n" type="{http://www.travellazy.com/product/model}I18n" minOccurs="0"/>
 *         &lt;element name="offerAttachments" type="{http://www.travellazy.com/product/model}Attachments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOfferConfiguration", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offer",
    "featureGroupReferences",
    "serviceFeatureReferences",
    "featureGroups",
    "featureGroupDisplayCategories",
    "tariffModels",
    "chargeClusters",
    "discountScopeFilters",
    "billTypeGroups",
    "billTypes",
    "channels",
    "i18N",
    "offerAttachments"
})
public class UpdateOfferConfiguration {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOffer offer;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupReferenceList featureGroupReferences;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceFeatureReferenceList serviceFeatureReferences;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOfferConfiguration.FeatureGroups featureGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupDisplayCategories featureGroupDisplayCategories;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOfferConfiguration.TariffModels tariffModels;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOfferConfiguration.ChargeClusters chargeClusters;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOfferConfiguration.DiscountScopeFilters discountScopeFilters;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOfferConfiguration.BillTypeGroups billTypeGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOfferConfiguration.BillTypes billTypes;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateOfferConfiguration.Channels channels;
    @XmlElement(name = "i18n", namespace = "http://www.travellazy.com/product/model")
    protected I18N i18N;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Attachments offerAttachments;

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOffer }
     *     
     */
    public UpdateOffer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOffer }
     *     
     */
    public void setOffer(UpdateOffer value) {
        this.offer = value;
    }

    /**
     * Gets the value of the featureGroupReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupReferenceList }
     *     
     */
    public FeatureGroupReferenceList getFeatureGroupReferences() {
        return featureGroupReferences;
    }

    /**
     * Sets the value of the featureGroupReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupReferenceList }
     *     
     */
    public void setFeatureGroupReferences(FeatureGroupReferenceList value) {
        this.featureGroupReferences = value;
    }

    /**
     * Gets the value of the serviceFeatureReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeatureReferenceList }
     *     
     */
    public ServiceFeatureReferenceList getServiceFeatureReferences() {
        return serviceFeatureReferences;
    }

    /**
     * Sets the value of the serviceFeatureReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeatureReferenceList }
     *     
     */
    public void setServiceFeatureReferences(ServiceFeatureReferenceList value) {
        this.serviceFeatureReferences = value;
    }

    /**
     * Gets the value of the featureGroups property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOfferConfiguration.FeatureGroups }
     *     
     */
    public UpdateOfferConfiguration.FeatureGroups getFeatureGroups() {
        return featureGroups;
    }

    /**
     * Sets the value of the featureGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOfferConfiguration.FeatureGroups }
     *     
     */
    public void setFeatureGroups(UpdateOfferConfiguration.FeatureGroups value) {
        this.featureGroups = value;
    }

    /**
     * Gets the value of the featureGroupDisplayCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupDisplayCategories }
     *     
     */
    public FeatureGroupDisplayCategories getFeatureGroupDisplayCategories() {
        return featureGroupDisplayCategories;
    }

    /**
     * Sets the value of the featureGroupDisplayCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupDisplayCategories }
     *     
     */
    public void setFeatureGroupDisplayCategories(FeatureGroupDisplayCategories value) {
        this.featureGroupDisplayCategories = value;
    }

    /**
     * Gets the value of the tariffModels property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOfferConfiguration.TariffModels }
     *     
     */
    public UpdateOfferConfiguration.TariffModels getTariffModels() {
        return tariffModels;
    }

    /**
     * Sets the value of the tariffModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOfferConfiguration.TariffModels }
     *     
     */
    public void setTariffModels(UpdateOfferConfiguration.TariffModels value) {
        this.tariffModels = value;
    }

    /**
     * Gets the value of the chargeClusters property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOfferConfiguration.ChargeClusters }
     *     
     */
    public UpdateOfferConfiguration.ChargeClusters getChargeClusters() {
        return chargeClusters;
    }

    /**
     * Sets the value of the chargeClusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOfferConfiguration.ChargeClusters }
     *     
     */
    public void setChargeClusters(UpdateOfferConfiguration.ChargeClusters value) {
        this.chargeClusters = value;
    }

    /**
     * Gets the value of the discountScopeFilters property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOfferConfiguration.DiscountScopeFilters }
     *     
     */
    public UpdateOfferConfiguration.DiscountScopeFilters getDiscountScopeFilters() {
        return discountScopeFilters;
    }

    /**
     * Sets the value of the discountScopeFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOfferConfiguration.DiscountScopeFilters }
     *     
     */
    public void setDiscountScopeFilters(UpdateOfferConfiguration.DiscountScopeFilters value) {
        this.discountScopeFilters = value;
    }

    /**
     * Gets the value of the billTypeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOfferConfiguration.BillTypeGroups }
     *     
     */
    public UpdateOfferConfiguration.BillTypeGroups getBillTypeGroups() {
        return billTypeGroups;
    }

    /**
     * Sets the value of the billTypeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOfferConfiguration.BillTypeGroups }
     *     
     */
    public void setBillTypeGroups(UpdateOfferConfiguration.BillTypeGroups value) {
        this.billTypeGroups = value;
    }

    /**
     * Gets the value of the billTypes property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOfferConfiguration.BillTypes }
     *     
     */
    public UpdateOfferConfiguration.BillTypes getBillTypes() {
        return billTypes;
    }

    /**
     * Sets the value of the billTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOfferConfiguration.BillTypes }
     *     
     */
    public void setBillTypes(UpdateOfferConfiguration.BillTypes value) {
        this.billTypes = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOfferConfiguration.Channels }
     *     
     */
    public UpdateOfferConfiguration.Channels getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOfferConfiguration.Channels }
     *     
     */
    public void setChannels(UpdateOfferConfiguration.Channels value) {
        this.channels = value;
    }

    /**
     * Gets the value of the i18N property.
     * 
     * @return
     *     possible object is
     *     {@link I18N }
     *     
     */
    public I18N getI18N() {
        return i18N;
    }

    /**
     * Sets the value of the i18N property.
     * 
     * @param value
     *     allowed object is
     *     {@link I18N }
     *     
     */
    public void setI18N(I18N value) {
        this.i18N = value;
    }

    /**
     * Gets the value of the offerAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getOfferAttachments() {
        return offerAttachments;
    }

    /**
     * Sets the value of the offerAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setOfferAttachments(Attachments value) {
        this.offerAttachments = value;
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
     *         &lt;element name="billTypeGroup" type="{http://www.travellazy.com/product/model}BillTypeGroup" maxOccurs="unbounded" minOccurs="0"/>
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
        "billTypeGroup"
    })
    public static class BillTypeGroups {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<BillTypeGroup> billTypeGroup;

        /**
         * Gets the value of the billTypeGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the billTypeGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBillTypeGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BillTypeGroup }
         * 
         * 
         */
        public List<BillTypeGroup> getBillTypeGroup() {
            if (billTypeGroup == null) {
                billTypeGroup = new ArrayList<BillTypeGroup>();
            }
            return this.billTypeGroup;
        }

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
     *         &lt;element name="billType" type="{http://www.travellazy.com/product/model}BillType" maxOccurs="unbounded" minOccurs="0"/>
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
        "billType"
    })
    public static class BillTypes {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<BillType> billType;

        /**
         * Gets the value of the billType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the billType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBillType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BillType }
         * 
         * 
         */
        public List<BillType> getBillType() {
            if (billType == null) {
                billType = new ArrayList<BillType>();
            }
            return this.billType;
        }

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
     *         &lt;element name="channelKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "channelKey"
    })
    public static class Channels {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<String> channelKey;

        /**
         * Gets the value of the channelKey property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the channelKey property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChannelKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getChannelKey() {
            if (channelKey == null) {
                channelKey = new ArrayList<String>();
            }
            return this.channelKey;
        }

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
     *         &lt;element name="chargeCluster" type="{http://www.travellazy.com/product/model}ChargeCluster" maxOccurs="unbounded" minOccurs="0"/>
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
        "chargeCluster"
    })
    public static class ChargeClusters {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<ChargeCluster> chargeCluster;

        /**
         * Gets the value of the chargeCluster property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeCluster property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeCluster().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChargeCluster }
         * 
         * 
         */
        public List<ChargeCluster> getChargeCluster() {
            if (chargeCluster == null) {
                chargeCluster = new ArrayList<ChargeCluster>();
            }
            return this.chargeCluster;
        }

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
     *         &lt;element name="discountScopeFilter" type="{http://www.travellazy.com/product/model}DiscountScopeFilter" maxOccurs="unbounded" minOccurs="0"/>
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
        "discountScopeFilter"
    })
    public static class DiscountScopeFilters {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<DiscountScopeFilter> discountScopeFilter;

        /**
         * Gets the value of the discountScopeFilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the discountScopeFilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiscountScopeFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiscountScopeFilter }
         * 
         * 
         */
        public List<DiscountScopeFilter> getDiscountScopeFilter() {
            if (discountScopeFilter == null) {
                discountScopeFilter = new ArrayList<DiscountScopeFilter>();
            }
            return this.discountScopeFilter;
        }

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
     *         &lt;element name="featureGroup" type="{http://www.travellazy.com/product/model}FeatureGroup" maxOccurs="unbounded" minOccurs="0"/>
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
        "featureGroup"
    })
    public static class FeatureGroups {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<FeatureGroup> featureGroup;

        /**
         * Gets the value of the featureGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureGroup }
         * 
         * 
         */
        public List<FeatureGroup> getFeatureGroup() {
            if (featureGroup == null) {
                featureGroup = new ArrayList<FeatureGroup>();
            }
            return this.featureGroup;
        }

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
     *         &lt;element name="tariffModel" type="{http://www.travellazy.com/product/model}TariffModel" maxOccurs="unbounded" minOccurs="0"/>
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
        "tariffModel"
    })
    public static class TariffModels {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<TariffModel> tariffModel;

        /**
         * Gets the value of the tariffModel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariffModel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTariffModel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TariffModel }
         * 
         * 
         */
        public List<TariffModel> getTariffModel() {
            if (tariffModel == null) {
                tariffModel = new ArrayList<TariffModel>();
            }
            return this.tariffModel;
        }

    }

}
