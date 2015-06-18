
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
 * <p>Java class for WholesaleProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WholesaleProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="serviceReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceReference" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="nonCommunicationServiceReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nonCommunicationServiceReference" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nonCommunicationServiceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *       &lt;attribute name="notForResale" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesaleProduct", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "activation",
    "termination",
    "serviceReferences",
    "nonCommunicationServiceReferences"
})
public class WholesaleProduct {

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
    protected WholesaleProduct.ServiceReferences serviceReferences;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected WholesaleProduct.NonCommunicationServiceReferences nonCommunicationServiceReferences;
    @XmlAttribute(name = "notForResale")
    protected Boolean notForResale;

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
     * Gets the value of the serviceReferences property.
     * 
     * @return
     *     possible object is
     *     {@link WholesaleProduct.ServiceReferences }
     *     
     */
    public WholesaleProduct.ServiceReferences getServiceReferences() {
        return serviceReferences;
    }

    /**
     * Sets the value of the serviceReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesaleProduct.ServiceReferences }
     *     
     */
    public void setServiceReferences(WholesaleProduct.ServiceReferences value) {
        this.serviceReferences = value;
    }

    /**
     * Gets the value of the nonCommunicationServiceReferences property.
     * 
     * @return
     *     possible object is
     *     {@link WholesaleProduct.NonCommunicationServiceReferences }
     *     
     */
    public WholesaleProduct.NonCommunicationServiceReferences getNonCommunicationServiceReferences() {
        return nonCommunicationServiceReferences;
    }

    /**
     * Sets the value of the nonCommunicationServiceReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesaleProduct.NonCommunicationServiceReferences }
     *     
     */
    public void setNonCommunicationServiceReferences(WholesaleProduct.NonCommunicationServiceReferences value) {
        this.nonCommunicationServiceReferences = value;
    }

    /**
     * Gets the value of the notForResale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotForResale() {
        if (notForResale == null) {
            return false;
        } else {
            return notForResale;
        }
    }

    /**
     * Sets the value of the notForResale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForResale(Boolean value) {
        this.notForResale = value;
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
     *         &lt;element name="nonCommunicationServiceReference" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nonCommunicationServiceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "nonCommunicationServiceReference"
    })
    public static class NonCommunicationServiceReferences {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<WholesaleProduct.NonCommunicationServiceReferences.NonCommunicationServiceReference> nonCommunicationServiceReference;

        /**
         * Gets the value of the nonCommunicationServiceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nonCommunicationServiceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNonCommunicationServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WholesaleProduct.NonCommunicationServiceReferences.NonCommunicationServiceReference }
         * 
         * 
         */
        public List<WholesaleProduct.NonCommunicationServiceReferences.NonCommunicationServiceReference> getNonCommunicationServiceReference() {
            if (nonCommunicationServiceReference == null) {
                nonCommunicationServiceReference = new ArrayList<WholesaleProduct.NonCommunicationServiceReferences.NonCommunicationServiceReference>();
            }
            return this.nonCommunicationServiceReference;
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
         *         &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nonCommunicationServiceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "serviceProviderKey",
            "nonCommunicationServiceKey",
            "activation",
            "termination"
        })
        public static class NonCommunicationServiceReference {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String serviceProviderKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String nonCommunicationServiceKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;

            /**
             * Gets the value of the serviceProviderKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceProviderKey() {
                return serviceProviderKey;
            }

            /**
             * Sets the value of the serviceProviderKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceProviderKey(String value) {
                this.serviceProviderKey = value;
            }

            /**
             * Gets the value of the nonCommunicationServiceKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonCommunicationServiceKey() {
                return nonCommunicationServiceKey;
            }

            /**
             * Sets the value of the nonCommunicationServiceKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonCommunicationServiceKey(String value) {
                this.nonCommunicationServiceKey = value;
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
     *         &lt;element name="serviceReference" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "serviceReference"
    })
    public static class ServiceReferences {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<WholesaleProduct.ServiceReferences.ServiceReference> serviceReference;

        /**
         * Gets the value of the serviceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WholesaleProduct.ServiceReferences.ServiceReference }
         * 
         * 
         */
        public List<WholesaleProduct.ServiceReferences.ServiceReference> getServiceReference() {
            if (serviceReference == null) {
                serviceReference = new ArrayList<WholesaleProduct.ServiceReferences.ServiceReference>();
            }
            return this.serviceReference;
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
         *         &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "serviceKey",
            "activation",
            "termination"
        })
        public static class ServiceReference {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String serviceKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;

            /**
             * Gets the value of the serviceKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceKey() {
                return serviceKey;
            }

            /**
             * Sets the value of the serviceKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceKey(String value) {
                this.serviceKey = value;
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

        }

    }

}
