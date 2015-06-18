
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wholesaleProducts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wholesaleProduct" type="{http://www.travellazy.com/product/model}WholesaleProduct" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="wholesaleOffers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wholesaleOffer" type="{http://www.travellazy.com/product/model}WholesaleOffer" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="wholesaleOfferMandatorAssignments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wholesaleOfferMandatorAssignment" type="{http://www.travellazy.com/product/model}WholesaleOfferMandatorAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="wholesaleServiceProviderAssignments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wholesaleServiceProviderAssignment" type="{http://www.travellazy.com/product/model}WholesaleServiceProviderAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bundleOffers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bundleOffer" type="{http://www.travellazy.com/product/model}BundleOffer" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="offerGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offerGroup" type="{http://www.travellazy.com/product/model}OfferGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baseOffers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="baseOffer" type="{http://www.travellazy.com/product/model}BaseOffer" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="offerChannelAssignments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offerChannelAssignment" type="{http://www.travellazy.com/product/model}OfferChannelAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="nonCommunicationServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nonCommunicationService" type="{http://www.travellazy.com/product/model}NonCommunicationService" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="offerRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offerRule" type="{http://www.travellazy.com/product/model}OfferRule" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="offerDisplayCategories" type="{http://www.travellazy.com/product/model}OfferDisplayCategories" minOccurs="0"/>
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
 *         &lt;element name="weeklyTimeTables" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="weeklyTimeTable" type="{http://www.travellazy.com/product/model}WeeklyTimeTable" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="i18n" type="{http://www.travellazy.com/product/model}I18n" minOccurs="0"/>
 *         &lt;element name="offerAttachments" type="{http://www.travellazy.com/product/model}OfferAttachments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferConfiguration", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "wholesaleProducts",
    "wholesaleOffers",
    "wholesaleOfferMandatorAssignments",
    "wholesaleServiceProviderAssignments",
    "bundleOffers",
    "offerGroups",
    "baseOffers",
    "offerChannelAssignments",
    "featureGroups",
    "featureGroupDisplayCategories",
    "nonCommunicationServices",
    "offerRules",
    "offerDisplayCategories",
    "tariffModels",
    "chargeClusters",
    "weeklyTimeTables",
    "discountScopeFilters",
    "billTypeGroups",
    "billTypes",
    "i18N",
    "offerAttachments"
})
public class OfferConfiguration {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.WholesaleProducts wholesaleProducts;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.WholesaleOffers wholesaleOffers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.WholesaleOfferMandatorAssignments wholesaleOfferMandatorAssignments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.WholesaleServiceProviderAssignments wholesaleServiceProviderAssignments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.BundleOffers bundleOffers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.OfferGroups offerGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.BaseOffers baseOffers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.OfferChannelAssignments offerChannelAssignments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.FeatureGroups featureGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupDisplayCategories featureGroupDisplayCategories;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.NonCommunicationServices nonCommunicationServices;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.OfferRules offerRules;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferDisplayCategories offerDisplayCategories;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.TariffModels tariffModels;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.ChargeClusters chargeClusters;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.WeeklyTimeTables weeklyTimeTables;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.DiscountScopeFilters discountScopeFilters;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.BillTypeGroups billTypeGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferConfiguration.BillTypes billTypes;
    @XmlElement(name = "i18n", namespace = "http://www.travellazy.com/product/model")
    protected I18N i18N;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OfferAttachments offerAttachments;

    /**
     * Gets the value of the wholesaleProducts property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.WholesaleProducts }
     *     
     */
    public OfferConfiguration.WholesaleProducts getWholesaleProducts() {
        return wholesaleProducts;
    }

    /**
     * Sets the value of the wholesaleProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.WholesaleProducts }
     *     
     */
    public void setWholesaleProducts(OfferConfiguration.WholesaleProducts value) {
        this.wholesaleProducts = value;
    }

    /**
     * Gets the value of the wholesaleOffers property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.WholesaleOffers }
     *     
     */
    public OfferConfiguration.WholesaleOffers getWholesaleOffers() {
        return wholesaleOffers;
    }

    /**
     * Sets the value of the wholesaleOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.WholesaleOffers }
     *     
     */
    public void setWholesaleOffers(OfferConfiguration.WholesaleOffers value) {
        this.wholesaleOffers = value;
    }

    /**
     * Gets the value of the wholesaleOfferMandatorAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.WholesaleOfferMandatorAssignments }
     *     
     */
    public OfferConfiguration.WholesaleOfferMandatorAssignments getWholesaleOfferMandatorAssignments() {
        return wholesaleOfferMandatorAssignments;
    }

    /**
     * Sets the value of the wholesaleOfferMandatorAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.WholesaleOfferMandatorAssignments }
     *     
     */
    public void setWholesaleOfferMandatorAssignments(OfferConfiguration.WholesaleOfferMandatorAssignments value) {
        this.wholesaleOfferMandatorAssignments = value;
    }

    /**
     * Gets the value of the wholesaleServiceProviderAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.WholesaleServiceProviderAssignments }
     *     
     */
    public OfferConfiguration.WholesaleServiceProviderAssignments getWholesaleServiceProviderAssignments() {
        return wholesaleServiceProviderAssignments;
    }

    /**
     * Sets the value of the wholesaleServiceProviderAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.WholesaleServiceProviderAssignments }
     *     
     */
    public void setWholesaleServiceProviderAssignments(OfferConfiguration.WholesaleServiceProviderAssignments value) {
        this.wholesaleServiceProviderAssignments = value;
    }

    /**
     * Gets the value of the bundleOffers property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.BundleOffers }
     *     
     */
    public OfferConfiguration.BundleOffers getBundleOffers() {
        return bundleOffers;
    }

    /**
     * Sets the value of the bundleOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.BundleOffers }
     *     
     */
    public void setBundleOffers(OfferConfiguration.BundleOffers value) {
        this.bundleOffers = value;
    }

    /**
     * Gets the value of the offerGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.OfferGroups }
     *     
     */
    public OfferConfiguration.OfferGroups getOfferGroups() {
        return offerGroups;
    }

    /**
     * Sets the value of the offerGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.OfferGroups }
     *     
     */
    public void setOfferGroups(OfferConfiguration.OfferGroups value) {
        this.offerGroups = value;
    }

    /**
     * Gets the value of the baseOffers property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.BaseOffers }
     *     
     */
    public OfferConfiguration.BaseOffers getBaseOffers() {
        return baseOffers;
    }

    /**
     * Sets the value of the baseOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.BaseOffers }
     *     
     */
    public void setBaseOffers(OfferConfiguration.BaseOffers value) {
        this.baseOffers = value;
    }

    /**
     * Gets the value of the offerChannelAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.OfferChannelAssignments }
     *     
     */
    public OfferConfiguration.OfferChannelAssignments getOfferChannelAssignments() {
        return offerChannelAssignments;
    }

    /**
     * Sets the value of the offerChannelAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.OfferChannelAssignments }
     *     
     */
    public void setOfferChannelAssignments(OfferConfiguration.OfferChannelAssignments value) {
        this.offerChannelAssignments = value;
    }

    /**
     * Gets the value of the featureGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.FeatureGroups }
     *     
     */
    public OfferConfiguration.FeatureGroups getFeatureGroups() {
        return featureGroups;
    }

    /**
     * Sets the value of the featureGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.FeatureGroups }
     *     
     */
    public void setFeatureGroups(OfferConfiguration.FeatureGroups value) {
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
     * Gets the value of the nonCommunicationServices property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.NonCommunicationServices }
     *     
     */
    public OfferConfiguration.NonCommunicationServices getNonCommunicationServices() {
        return nonCommunicationServices;
    }

    /**
     * Sets the value of the nonCommunicationServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.NonCommunicationServices }
     *     
     */
    public void setNonCommunicationServices(OfferConfiguration.NonCommunicationServices value) {
        this.nonCommunicationServices = value;
    }

    /**
     * Gets the value of the offerRules property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.OfferRules }
     *     
     */
    public OfferConfiguration.OfferRules getOfferRules() {
        return offerRules;
    }

    /**
     * Sets the value of the offerRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.OfferRules }
     *     
     */
    public void setOfferRules(OfferConfiguration.OfferRules value) {
        this.offerRules = value;
    }

    /**
     * Gets the value of the offerDisplayCategories property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDisplayCategories }
     *     
     */
    public OfferDisplayCategories getOfferDisplayCategories() {
        return offerDisplayCategories;
    }

    /**
     * Sets the value of the offerDisplayCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDisplayCategories }
     *     
     */
    public void setOfferDisplayCategories(OfferDisplayCategories value) {
        this.offerDisplayCategories = value;
    }

    /**
     * Gets the value of the tariffModels property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.TariffModels }
     *     
     */
    public OfferConfiguration.TariffModels getTariffModels() {
        return tariffModels;
    }

    /**
     * Sets the value of the tariffModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.TariffModels }
     *     
     */
    public void setTariffModels(OfferConfiguration.TariffModels value) {
        this.tariffModels = value;
    }

    /**
     * Gets the value of the chargeClusters property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.ChargeClusters }
     *     
     */
    public OfferConfiguration.ChargeClusters getChargeClusters() {
        return chargeClusters;
    }

    /**
     * Sets the value of the chargeClusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.ChargeClusters }
     *     
     */
    public void setChargeClusters(OfferConfiguration.ChargeClusters value) {
        this.chargeClusters = value;
    }

    /**
     * Gets the value of the weeklyTimeTables property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.WeeklyTimeTables }
     *     
     */
    public OfferConfiguration.WeeklyTimeTables getWeeklyTimeTables() {
        return weeklyTimeTables;
    }

    /**
     * Sets the value of the weeklyTimeTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.WeeklyTimeTables }
     *     
     */
    public void setWeeklyTimeTables(OfferConfiguration.WeeklyTimeTables value) {
        this.weeklyTimeTables = value;
    }

    /**
     * Gets the value of the discountScopeFilters property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.DiscountScopeFilters }
     *     
     */
    public OfferConfiguration.DiscountScopeFilters getDiscountScopeFilters() {
        return discountScopeFilters;
    }

    /**
     * Sets the value of the discountScopeFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.DiscountScopeFilters }
     *     
     */
    public void setDiscountScopeFilters(OfferConfiguration.DiscountScopeFilters value) {
        this.discountScopeFilters = value;
    }

    /**
     * Gets the value of the billTypeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.BillTypeGroups }
     *     
     */
    public OfferConfiguration.BillTypeGroups getBillTypeGroups() {
        return billTypeGroups;
    }

    /**
     * Sets the value of the billTypeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.BillTypeGroups }
     *     
     */
    public void setBillTypeGroups(OfferConfiguration.BillTypeGroups value) {
        this.billTypeGroups = value;
    }

    /**
     * Gets the value of the billTypes property.
     * 
     * @return
     *     possible object is
     *     {@link OfferConfiguration.BillTypes }
     *     
     */
    public OfferConfiguration.BillTypes getBillTypes() {
        return billTypes;
    }

    /**
     * Sets the value of the billTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferConfiguration.BillTypes }
     *     
     */
    public void setBillTypes(OfferConfiguration.BillTypes value) {
        this.billTypes = value;
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
     *     {@link OfferAttachments }
     *     
     */
    public OfferAttachments getOfferAttachments() {
        return offerAttachments;
    }

    /**
     * Sets the value of the offerAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAttachments }
     *     
     */
    public void setOfferAttachments(OfferAttachments value) {
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
     *         &lt;element name="baseOffer" type="{http://www.travellazy.com/product/model}BaseOffer" maxOccurs="unbounded" minOccurs="0"/>
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
        "baseOffer"
    })
    public static class BaseOffers {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<BaseOffer> baseOffer;

        /**
         * Gets the value of the baseOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baseOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaseOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseOffer }
         * 
         * 
         */
        public List<BaseOffer> getBaseOffer() {
            if (baseOffer == null) {
                baseOffer = new ArrayList<BaseOffer>();
            }
            return this.baseOffer;
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
     *         &lt;element name="bundleOffer" type="{http://www.travellazy.com/product/model}BundleOffer" maxOccurs="unbounded" minOccurs="0"/>
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
        "bundleOffer"
    })
    public static class BundleOffers {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<BundleOffer> bundleOffer;

        /**
         * Gets the value of the bundleOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bundleOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBundleOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BundleOffer }
         * 
         * 
         */
        public List<BundleOffer> getBundleOffer() {
            if (bundleOffer == null) {
                bundleOffer = new ArrayList<BundleOffer>();
            }
            return this.bundleOffer;
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
     *         &lt;element name="nonCommunicationService" type="{http://www.travellazy.com/product/model}NonCommunicationService" maxOccurs="unbounded" minOccurs="0"/>
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
        "nonCommunicationService"
    })
    public static class NonCommunicationServices {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<NonCommunicationService> nonCommunicationService;

        /**
         * Gets the value of the nonCommunicationService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nonCommunicationService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNonCommunicationService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NonCommunicationService }
         * 
         * 
         */
        public List<NonCommunicationService> getNonCommunicationService() {
            if (nonCommunicationService == null) {
                nonCommunicationService = new ArrayList<NonCommunicationService>();
            }
            return this.nonCommunicationService;
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
     *         &lt;element name="offerChannelAssignment" type="{http://www.travellazy.com/product/model}OfferChannelAssignment" maxOccurs="unbounded" minOccurs="0"/>
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
        "offerChannelAssignment"
    })
    public static class OfferChannelAssignments {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<OfferChannelAssignment> offerChannelAssignment;

        /**
         * Gets the value of the offerChannelAssignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerChannelAssignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferChannelAssignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferChannelAssignment }
         * 
         * 
         */
        public List<OfferChannelAssignment> getOfferChannelAssignment() {
            if (offerChannelAssignment == null) {
                offerChannelAssignment = new ArrayList<OfferChannelAssignment>();
            }
            return this.offerChannelAssignment;
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
     *         &lt;element name="offerGroup" type="{http://www.travellazy.com/product/model}OfferGroup" maxOccurs="unbounded" minOccurs="0"/>
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
        "offerGroup"
    })
    public static class OfferGroups {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<OfferGroup> offerGroup;

        /**
         * Gets the value of the offerGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferGroup }
         * 
         * 
         */
        public List<OfferGroup> getOfferGroup() {
            if (offerGroup == null) {
                offerGroup = new ArrayList<OfferGroup>();
            }
            return this.offerGroup;
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
     *         &lt;element name="offerRule" type="{http://www.travellazy.com/product/model}OfferRule" maxOccurs="unbounded" minOccurs="0"/>
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
        "offerRule"
    })
    public static class OfferRules {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<OfferRule> offerRule;

        /**
         * Gets the value of the offerRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferRule }
         * 
         * 
         */
        public List<OfferRule> getOfferRule() {
            if (offerRule == null) {
                offerRule = new ArrayList<OfferRule>();
            }
            return this.offerRule;
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
     *         &lt;element name="weeklyTimeTable" type="{http://www.travellazy.com/product/model}WeeklyTimeTable" maxOccurs="unbounded" minOccurs="0"/>
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
        "weeklyTimeTable"
    })
    public static class WeeklyTimeTables {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<WeeklyTimeTable> weeklyTimeTable;

        /**
         * Gets the value of the weeklyTimeTable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weeklyTimeTable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeeklyTimeTable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WeeklyTimeTable }
         * 
         * 
         */
        public List<WeeklyTimeTable> getWeeklyTimeTable() {
            if (weeklyTimeTable == null) {
                weeklyTimeTable = new ArrayList<WeeklyTimeTable>();
            }
            return this.weeklyTimeTable;
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
     *         &lt;element name="wholesaleOfferMandatorAssignment" type="{http://www.travellazy.com/product/model}WholesaleOfferMandatorAssignment" maxOccurs="unbounded" minOccurs="0"/>
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
        "wholesaleOfferMandatorAssignment"
    })
    public static class WholesaleOfferMandatorAssignments {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<WholesaleOfferMandatorAssignment> wholesaleOfferMandatorAssignment;

        /**
         * Gets the value of the wholesaleOfferMandatorAssignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wholesaleOfferMandatorAssignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWholesaleOfferMandatorAssignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WholesaleOfferMandatorAssignment }
         * 
         * 
         */
        public List<WholesaleOfferMandatorAssignment> getWholesaleOfferMandatorAssignment() {
            if (wholesaleOfferMandatorAssignment == null) {
                wholesaleOfferMandatorAssignment = new ArrayList<WholesaleOfferMandatorAssignment>();
            }
            return this.wholesaleOfferMandatorAssignment;
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
     *         &lt;element name="wholesaleOffer" type="{http://www.travellazy.com/product/model}WholesaleOffer" maxOccurs="unbounded" minOccurs="0"/>
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
        "wholesaleOffer"
    })
    public static class WholesaleOffers {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<WholesaleOffer> wholesaleOffer;

        /**
         * Gets the value of the wholesaleOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wholesaleOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWholesaleOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WholesaleOffer }
         * 
         * 
         */
        public List<WholesaleOffer> getWholesaleOffer() {
            if (wholesaleOffer == null) {
                wholesaleOffer = new ArrayList<WholesaleOffer>();
            }
            return this.wholesaleOffer;
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
     *         &lt;element name="wholesaleProduct" type="{http://www.travellazy.com/product/model}WholesaleProduct" maxOccurs="unbounded" minOccurs="0"/>
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
        "wholesaleProduct"
    })
    public static class WholesaleProducts {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<WholesaleProduct> wholesaleProduct;

        /**
         * Gets the value of the wholesaleProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wholesaleProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWholesaleProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WholesaleProduct }
         * 
         * 
         */
        public List<WholesaleProduct> getWholesaleProduct() {
            if (wholesaleProduct == null) {
                wholesaleProduct = new ArrayList<WholesaleProduct>();
            }
            return this.wholesaleProduct;
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
     *         &lt;element name="wholesaleServiceProviderAssignment" type="{http://www.travellazy.com/product/model}WholesaleServiceProviderAssignment" maxOccurs="unbounded" minOccurs="0"/>
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
        "wholesaleServiceProviderAssignment"
    })
    public static class WholesaleServiceProviderAssignments {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<WholesaleServiceProviderAssignment> wholesaleServiceProviderAssignment;

        /**
         * Gets the value of the wholesaleServiceProviderAssignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wholesaleServiceProviderAssignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWholesaleServiceProviderAssignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WholesaleServiceProviderAssignment }
         * 
         * 
         */
        public List<WholesaleServiceProviderAssignment> getWholesaleServiceProviderAssignment() {
            if (wholesaleServiceProviderAssignment == null) {
                wholesaleServiceProviderAssignment = new ArrayList<WholesaleServiceProviderAssignment>();
            }
            return this.wholesaleServiceProviderAssignment;
        }

    }

}
