
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BundleOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="termsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tariffModelKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerTemplateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureGroupReferences" type="{http://www.travellazy.com/product/model}FeatureGroupReferenceList" minOccurs="0"/>
 *         &lt;element name="ruleReferences" type="{http://www.travellazy.com/product/model}RuleReferenceList" minOccurs="0"/>
 *         &lt;element name="serviceFeatureReferences" type="{http://www.travellazy.com/product/model}ServiceFeatureReferenceList" minOccurs="0"/>
 *         &lt;element name="featureDependencies" type="{http://www.travellazy.com/product/model}FeatureDependencyList" minOccurs="0"/>
 *         &lt;element name="offerReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offerReference" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="offerGroupReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offerGroupReference" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="offerGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="allowReuseOfBaseOffers" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "invoiceName",
    "internalName",
    "activation",
    "termination",
    "termsAndConditions",
    "tariffModelKey",
    "offerTemplateKey",
    "featureGroupReferences",
    "ruleReferences",
    "serviceFeatureReferences",
    "featureDependencies",
    "offerReferences",
    "offerGroupReferences"
})
public class BundleOffer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String invoiceName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String internalName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String termsAndConditions;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String tariffModelKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String offerTemplateKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupReferenceList featureGroupReferences;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected RuleReferenceList ruleReferences;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceFeatureReferenceList serviceFeatureReferences;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureDependencyList featureDependencies;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BundleOffer.OfferReferences offerReferences;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BundleOffer.OfferGroupReferences offerGroupReferences;
    @XmlAttribute(name = "allowReuseOfBaseOffers", required = true)
    protected boolean allowReuseOfBaseOffers;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivation(XMLGregorianCalendar value) {
        this.activation = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermination(XMLGregorianCalendar value) {
        this.termination = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * Gets the value of the tariffModelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffModelKey() {
        return tariffModelKey;
    }

    /**
     * Sets the value of the tariffModelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffModelKey(String value) {
        this.tariffModelKey = value;
    }

    /**
     * Gets the value of the offerTemplateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTemplateKey() {
        return offerTemplateKey;
    }

    /**
     * Sets the value of the offerTemplateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTemplateKey(String value) {
        this.offerTemplateKey = value;
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
     * Gets the value of the ruleReferences property.
     * 
     * @return
     *     possible object is
     *     {@link RuleReferenceList }
     *     
     */
    public RuleReferenceList getRuleReferences() {
        return ruleReferences;
    }

    /**
     * Sets the value of the ruleReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleReferenceList }
     *     
     */
    public void setRuleReferences(RuleReferenceList value) {
        this.ruleReferences = value;
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
     * Gets the value of the featureDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureDependencyList }
     *     
     */
    public FeatureDependencyList getFeatureDependencies() {
        return featureDependencies;
    }

    /**
     * Sets the value of the featureDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureDependencyList }
     *     
     */
    public void setFeatureDependencies(FeatureDependencyList value) {
        this.featureDependencies = value;
    }

    /**
     * Gets the value of the offerReferences property.
     * 
     * @return
     *     possible object is
     *     {@link BundleOffer.OfferReferences }
     *     
     */
    public BundleOffer.OfferReferences getOfferReferences() {
        return offerReferences;
    }

    /**
     * Sets the value of the offerReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleOffer.OfferReferences }
     *     
     */
    public void setOfferReferences(BundleOffer.OfferReferences value) {
        this.offerReferences = value;
    }

    /**
     * Gets the value of the offerGroupReferences property.
     * 
     * @return
     *     possible object is
     *     {@link BundleOffer.OfferGroupReferences }
     *     
     */
    public BundleOffer.OfferGroupReferences getOfferGroupReferences() {
        return offerGroupReferences;
    }

    /**
     * Sets the value of the offerGroupReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleOffer.OfferGroupReferences }
     *     
     */
    public void setOfferGroupReferences(BundleOffer.OfferGroupReferences value) {
        this.offerGroupReferences = value;
    }

    /**
     * Gets the value of the allowReuseOfBaseOffers property.
     * 
     */
    public boolean isAllowReuseOfBaseOffers() {
        return allowReuseOfBaseOffers;
    }

    /**
     * Sets the value of the allowReuseOfBaseOffers property.
     * 
     */
    public void setAllowReuseOfBaseOffers(boolean value) {
        this.allowReuseOfBaseOffers = value;
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
     *         &lt;element name="offerGroupReference" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="offerGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "offerGroupReference"
    })
    public static class OfferGroupReferences {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<BundleOffer.OfferGroupReferences.OfferGroupReference> offerGroupReference;

        /**
         * Gets the value of the offerGroupReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerGroupReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferGroupReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BundleOffer.OfferGroupReferences.OfferGroupReference }
         * 
         * 
         */
        public List<BundleOffer.OfferGroupReferences.OfferGroupReference> getOfferGroupReference() {
            if (offerGroupReference == null) {
                offerGroupReference = new ArrayList<BundleOffer.OfferGroupReferences.OfferGroupReference>();
            }
            return this.offerGroupReference;
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
         *         &lt;element name="offerGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "offerGroupKey",
            "minNumberOfInstances",
            "maxNumberOfInstances"
        })
        public static class OfferGroupReference {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String offerGroupKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected int minNumberOfInstances;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected Integer maxNumberOfInstances;

            /**
             * Gets the value of the offerGroupKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfferGroupKey() {
                return offerGroupKey;
            }

            /**
             * Sets the value of the offerGroupKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfferGroupKey(String value) {
                this.offerGroupKey = value;
            }

            /**
             * Gets the value of the minNumberOfInstances property.
             * 
             */
            public int getMinNumberOfInstances() {
                return minNumberOfInstances;
            }

            /**
             * Sets the value of the minNumberOfInstances property.
             * 
             */
            public void setMinNumberOfInstances(int value) {
                this.minNumberOfInstances = value;
            }

            /**
             * Gets the value of the maxNumberOfInstances property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxNumberOfInstances() {
                return maxNumberOfInstances;
            }

            /**
             * Sets the value of the maxNumberOfInstances property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxNumberOfInstances(Integer value) {
                this.maxNumberOfInstances = value;
            }

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
     *         &lt;element name="offerReference" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "offerReference"
    })
    public static class OfferReferences {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<BundleOffer.OfferReferences.OfferReference> offerReference;

        /**
         * Gets the value of the offerReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BundleOffer.OfferReferences.OfferReference }
         * 
         * 
         */
        public List<BundleOffer.OfferReferences.OfferReference> getOfferReference() {
            if (offerReference == null) {
                offerReference = new ArrayList<BundleOffer.OfferReferences.OfferReference>();
            }
            return this.offerReference;
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
         *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "offerKey",
            "minNumberOfInstances",
            "maxNumberOfInstances"
        })
        public static class OfferReference {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String offerKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected int minNumberOfInstances;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected Integer maxNumberOfInstances;

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
             * Gets the value of the minNumberOfInstances property.
             * 
             */
            public int getMinNumberOfInstances() {
                return minNumberOfInstances;
            }

            /**
             * Sets the value of the minNumberOfInstances property.
             * 
             */
            public void setMinNumberOfInstances(int value) {
                this.minNumberOfInstances = value;
            }

            /**
             * Gets the value of the maxNumberOfInstances property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxNumberOfInstances() {
                return maxNumberOfInstances;
            }

            /**
             * Sets the value of the maxNumberOfInstances property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxNumberOfInstances(Integer value) {
                this.maxNumberOfInstances = value;
            }

        }

    }

}
