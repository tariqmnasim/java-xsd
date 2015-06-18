
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
 * <p>Java class for TariffModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tariffs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tariff" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice minOccurs="0">
 *                               &lt;element name="offerComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="serviceFeature" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="serviceFeatureParameter" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="parameterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="valueKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="nonCommunicationServiceReference" type="{http://www.travellazy.com/product/model}NonCommunicationServiceId" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;element name="chargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="parentChargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="monthsActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                               &lt;element name="validityPeriod" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         &lt;element name="unit">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;enumeration value="DAYS"/>
 *                                               &lt;enumeration value="MONTHS"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                             &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *       &lt;attribute name="isOfferIndependent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffModel", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "activation",
    "termination",
    "tariffs"
})
public class TariffModel {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected TariffModel.Tariffs tariffs;
    @XmlAttribute(name = "isOfferIndependent", required = true)
    protected boolean isOfferIndependent;

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
     * Gets the value of the tariffs property.
     * 
     * @return
     *     possible object is
     *     {@link TariffModel.Tariffs }
     *     
     */
    public TariffModel.Tariffs getTariffs() {
        return tariffs;
    }

    /**
     * Sets the value of the tariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffModel.Tariffs }
     *     
     */
    public void setTariffs(TariffModel.Tariffs value) {
        this.tariffs = value;
    }

    /**
     * Gets the value of the isOfferIndependent property.
     * 
     */
    public boolean isIsOfferIndependent() {
        return isOfferIndependent;
    }

    /**
     * Sets the value of the isOfferIndependent property.
     * 
     */
    public void setIsOfferIndependent(boolean value) {
        this.isOfferIndependent = value;
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
     *         &lt;element name="tariff" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice minOccurs="0">
     *                     &lt;element name="offerComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="serviceFeature" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="serviceFeatureParameter" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="parameterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="valueKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="nonCommunicationServiceReference" type="{http://www.travellazy.com/product/model}NonCommunicationServiceId" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;element name="chargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="parentChargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="monthsActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                     &lt;element name="validityPeriod" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                               &lt;element name="unit">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;enumeration value="DAYS"/>
     *                                     &lt;enumeration value="MONTHS"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "tariff"
    })
    public static class Tariffs {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<TariffModel.Tariffs.Tariff> tariff;

        /**
         * Gets the value of the tariff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTariff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TariffModel.Tariffs.Tariff }
         * 
         * 
         */
        public List<TariffModel.Tariffs.Tariff> getTariff() {
            if (tariff == null) {
                tariff = new ArrayList<TariffModel.Tariffs.Tariff>();
            }
            return this.tariff;
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
         *         &lt;choice minOccurs="0">
         *           &lt;element name="offerComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *           &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *           &lt;element name="serviceFeature" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="serviceFeatureParameter" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="parameterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="valueKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="nonCommunicationServiceReference" type="{http://www.travellazy.com/product/model}NonCommunicationServiceId" minOccurs="0"/>
         *         &lt;/choice>
         *         &lt;element name="chargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="parentChargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="monthsActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *           &lt;element name="validityPeriod" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                     &lt;element name="unit">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;enumeration value="DAYS"/>
         *                           &lt;enumeration value="MONTHS"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "offerComponent",
            "service",
            "serviceFeature",
            "serviceFeatureParameter",
            "nonCommunicationServiceReference",
            "chargeClusterKey",
            "parentChargeClusterKey",
            "monthsActive",
            "validityPeriod",
            "activation",
            "termination"
        })
        public static class Tariff {

            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String offerComponent;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String service;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected TariffModel.Tariffs.Tariff.ServiceFeature serviceFeature;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected TariffModel.Tariffs.Tariff.ServiceFeatureParameter serviceFeatureParameter;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected NonCommunicationServiceId nonCommunicationServiceReference;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String chargeClusterKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String parentChargeClusterKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected Integer monthsActive;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected TariffModel.Tariffs.Tariff.ValidityPeriod validityPeriod;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;

            /**
             * Gets the value of the offerComponent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfferComponent() {
                return offerComponent;
            }

            /**
             * Sets the value of the offerComponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfferComponent(String value) {
                this.offerComponent = value;
            }

            /**
             * Gets the value of the service property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getService() {
                return service;
            }

            /**
             * Sets the value of the service property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setService(String value) {
                this.service = value;
            }

            /**
             * Gets the value of the serviceFeature property.
             * 
             * @return
             *     possible object is
             *     {@link TariffModel.Tariffs.Tariff.ServiceFeature }
             *     
             */
            public TariffModel.Tariffs.Tariff.ServiceFeature getServiceFeature() {
                return serviceFeature;
            }

            /**
             * Sets the value of the serviceFeature property.
             * 
             * @param value
             *     allowed object is
             *     {@link TariffModel.Tariffs.Tariff.ServiceFeature }
             *     
             */
            public void setServiceFeature(TariffModel.Tariffs.Tariff.ServiceFeature value) {
                this.serviceFeature = value;
            }

            /**
             * Gets the value of the serviceFeatureParameter property.
             * 
             * @return
             *     possible object is
             *     {@link TariffModel.Tariffs.Tariff.ServiceFeatureParameter }
             *     
             */
            public TariffModel.Tariffs.Tariff.ServiceFeatureParameter getServiceFeatureParameter() {
                return serviceFeatureParameter;
            }

            /**
             * Sets the value of the serviceFeatureParameter property.
             * 
             * @param value
             *     allowed object is
             *     {@link TariffModel.Tariffs.Tariff.ServiceFeatureParameter }
             *     
             */
            public void setServiceFeatureParameter(TariffModel.Tariffs.Tariff.ServiceFeatureParameter value) {
                this.serviceFeatureParameter = value;
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
             * Gets the value of the chargeClusterKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeClusterKey() {
                return chargeClusterKey;
            }

            /**
             * Sets the value of the chargeClusterKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeClusterKey(String value) {
                this.chargeClusterKey = value;
            }

            /**
             * Gets the value of the parentChargeClusterKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentChargeClusterKey() {
                return parentChargeClusterKey;
            }

            /**
             * Sets the value of the parentChargeClusterKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentChargeClusterKey(String value) {
                this.parentChargeClusterKey = value;
            }

            /**
             * Gets the value of the monthsActive property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMonthsActive() {
                return monthsActive;
            }

            /**
             * Sets the value of the monthsActive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMonthsActive(Integer value) {
                this.monthsActive = value;
            }

            /**
             * Gets the value of the validityPeriod property.
             * 
             * @return
             *     possible object is
             *     {@link TariffModel.Tariffs.Tariff.ValidityPeriod }
             *     
             */
            public TariffModel.Tariffs.Tariff.ValidityPeriod getValidityPeriod() {
                return validityPeriod;
            }

            /**
             * Sets the value of the validityPeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link TariffModel.Tariffs.Tariff.ValidityPeriod }
             *     
             */
            public void setValidityPeriod(TariffModel.Tariffs.Tariff.ValidityPeriod value) {
                this.validityPeriod = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "serviceProvider",
                "key"
            })
            public static class ServiceFeature {

                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String serviceProvider;
                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String key;

                /**
                 * Gets the value of the serviceProvider property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceProvider() {
                    return serviceProvider;
                }

                /**
                 * Sets the value of the serviceProvider property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceProvider(String value) {
                    this.serviceProvider = value;
                }

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
             *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="parameterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="valueKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "serviceProvider",
                "featureKey",
                "parameterName",
                "valueKey"
            })
            public static class ServiceFeatureParameter {

                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String serviceProvider;
                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String featureKey;
                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String parameterName;
                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String valueKey;

                /**
                 * Gets the value of the serviceProvider property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceProvider() {
                    return serviceProvider;
                }

                /**
                 * Sets the value of the serviceProvider property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceProvider(String value) {
                    this.serviceProvider = value;
                }

                /**
                 * Gets the value of the featureKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFeatureKey() {
                    return featureKey;
                }

                /**
                 * Sets the value of the featureKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFeatureKey(String value) {
                    this.featureKey = value;
                }

                /**
                 * Gets the value of the parameterName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParameterName() {
                    return parameterName;
                }

                /**
                 * Sets the value of the parameterName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParameterName(String value) {
                    this.parameterName = value;
                }

                /**
                 * Gets the value of the valueKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValueKey() {
                    return valueKey;
                }

                /**
                 * Sets the value of the valueKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValueKey(String value) {
                    this.valueKey = value;
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
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="unit">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="DAYS"/>
             *               &lt;enumeration value="MONTHS"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "value",
                "unit"
            })
            public static class ValidityPeriod {

                @XmlElement(namespace = "http://www.travellazy.com/product/model")
                protected int value;
                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String unit;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(int value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the unit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Sets the value of the unit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

            }

        }

    }

}
