
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
 * <p>Java class for FeatureGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="featureAssignmentLevelKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="minActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="feature" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonCommunicationServiceReference" type="{http://www.travellazy.com/product/model}NonCommunicationServiceId" minOccurs="0"/>
 *                             &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="mediationEventReferences" type="{http://www.travellazy.com/product/model}MediationEventReferences" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="isMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isChangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isDefaultActive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributeKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="isSingleFeatureGroup" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isGlobal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="requiresProvisioning" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureGroup", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "displayName",
    "description",
    "chargeTypeKey",
    "featureAssignmentLevelKey",
    "activation",
    "termination",
    "minActive",
    "maxActive",
    "features",
    "attributes"
})
public class FeatureGroup {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String chargeTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String featureAssignmentLevelKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer minActive;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer maxActive;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroup.Features features;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroup.Attributes attributes;
    @XmlAttribute(name = "isSingleFeatureGroup", required = true)
    protected boolean isSingleFeatureGroup;
    @XmlAttribute(name = "isGlobal", required = true)
    protected boolean isGlobal;
    @XmlAttribute(name = "requiresProvisioning", required = true)
    protected boolean requiresProvisioning;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
     * Gets the value of the chargeTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    /**
     * Sets the value of the chargeTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTypeKey(String value) {
        this.chargeTypeKey = value;
    }

    /**
     * Gets the value of the featureAssignmentLevelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureAssignmentLevelKey() {
        return featureAssignmentLevelKey;
    }

    /**
     * Sets the value of the featureAssignmentLevelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureAssignmentLevelKey(String value) {
        this.featureAssignmentLevelKey = value;
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
     * Gets the value of the minActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinActive() {
        return minActive;
    }

    /**
     * Sets the value of the minActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinActive(Integer value) {
        this.minActive = value;
    }

    /**
     * Gets the value of the maxActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxActive() {
        return maxActive;
    }

    /**
     * Sets the value of the maxActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxActive(Integer value) {
        this.maxActive = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroup.Features }
     *     
     */
    public FeatureGroup.Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroup.Features }
     *     
     */
    public void setFeatures(FeatureGroup.Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroup.Attributes }
     *     
     */
    public FeatureGroup.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroup.Attributes }
     *     
     */
    public void setAttributes(FeatureGroup.Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the isSingleFeatureGroup property.
     * 
     */
    public boolean isIsSingleFeatureGroup() {
        return isSingleFeatureGroup;
    }

    /**
     * Sets the value of the isSingleFeatureGroup property.
     * 
     */
    public void setIsSingleFeatureGroup(boolean value) {
        this.isSingleFeatureGroup = value;
    }

    /**
     * Gets the value of the isGlobal property.
     * 
     */
    public boolean isIsGlobal() {
        return isGlobal;
    }

    /**
     * Sets the value of the isGlobal property.
     * 
     */
    public void setIsGlobal(boolean value) {
        this.isGlobal = value;
    }

    /**
     * Gets the value of the requiresProvisioning property.
     * 
     */
    public boolean isRequiresProvisioning() {
        return requiresProvisioning;
    }

    /**
     * Sets the value of the requiresProvisioning property.
     * 
     */
    public void setRequiresProvisioning(boolean value) {
        this.requiresProvisioning = value;
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
     *         &lt;element name="attributeKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "attributeKey"
    })
    public static class Attributes {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<String> attributeKey;

        /**
         * Gets the value of the attributeKey property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeKey property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAttributeKey() {
            if (attributeKey == null) {
                attributeKey = new ArrayList<String>();
            }
            return this.attributeKey;
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
     *         &lt;element name="feature" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonCommunicationServiceReference" type="{http://www.travellazy.com/product/model}NonCommunicationServiceId" minOccurs="0"/>
     *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="mediationEventReferences" type="{http://www.travellazy.com/product/model}MediationEventReferences" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="isMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isChangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isDefaultActive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "feature"
    })
    public static class Features {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<FeatureGroup.Features.Feature> feature;

        /**
         * Gets the value of the feature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureGroup.Features.Feature }
         * 
         * 
         */
        public List<FeatureGroup.Features.Feature> getFeature() {
            if (feature == null) {
                feature = new ArrayList<FeatureGroup.Features.Feature>();
            }
            return this.feature;
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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonCommunicationServiceReference" type="{http://www.travellazy.com/product/model}NonCommunicationServiceId" minOccurs="0"/>
         *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="mediationEventReferences" type="{http://www.travellazy.com/product/model}MediationEventReferences" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="isMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isChangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isDefaultActive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "displayName",
            "description",
            "nonCommunicationServiceReference",
            "activation",
            "termination",
            "mediationEventReferences"
        })
        public static class Feature {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String key;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String displayName;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String description;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected NonCommunicationServiceId nonCommunicationServiceReference;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected MediationEventReferences mediationEventReferences;
            @XmlAttribute(name = "isMandatory", required = true)
            protected boolean isMandatory;
            @XmlAttribute(name = "isChangeable", required = true)
            protected boolean isChangeable;
            @XmlAttribute(name = "isDefaultActive", required = true)
            protected boolean isDefaultActive;

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
             * Gets the value of the displayName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplayName() {
                return displayName;
            }

            /**
             * Sets the value of the displayName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplayName(String value) {
                this.displayName = value;
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
             * Gets the value of the nonCommunicationServiceReference property.
             * 
             * @return
             *     possible object is
             *     {@link NonCommunicationServiceId }
             *     
             */
            public NonCommunicationServiceId getNonCommunicationServiceReference() {
                return nonCommunicationServiceReference;
            }

            /**
             * Sets the value of the nonCommunicationServiceReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link NonCommunicationServiceId }
             *     
             */
            public void setNonCommunicationServiceReference(NonCommunicationServiceId value) {
                this.nonCommunicationServiceReference = value;
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
             * Gets the value of the mediationEventReferences property.
             * 
             * @return
             *     possible object is
             *     {@link MediationEventReferences }
             *     
             */
            public MediationEventReferences getMediationEventReferences() {
                return mediationEventReferences;
            }

            /**
             * Sets the value of the mediationEventReferences property.
             * 
             * @param value
             *     allowed object is
             *     {@link MediationEventReferences }
             *     
             */
            public void setMediationEventReferences(MediationEventReferences value) {
                this.mediationEventReferences = value;
            }

            /**
             * Gets the value of the isMandatory property.
             * 
             */
            public boolean isIsMandatory() {
                return isMandatory;
            }

            /**
             * Sets the value of the isMandatory property.
             * 
             */
            public void setIsMandatory(boolean value) {
                this.isMandatory = value;
            }

            /**
             * Gets the value of the isChangeable property.
             * 
             */
            public boolean isIsChangeable() {
                return isChangeable;
            }

            /**
             * Sets the value of the isChangeable property.
             * 
             */
            public void setIsChangeable(boolean value) {
                this.isChangeable = value;
            }

            /**
             * Gets the value of the isDefaultActive property.
             * 
             */
            public boolean isIsDefaultActive() {
                return isDefaultActive;
            }

            /**
             * Sets the value of the isDefaultActive property.
             * 
             */
            public void setIsDefaultActive(boolean value) {
                this.isDefaultActive = value;
            }

        }

    }

}
