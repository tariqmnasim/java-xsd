
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="services" type="{http://www.travellazy.com/product/model}Services" minOccurs="0"/>
 *         &lt;element name="serviceProviders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceProvider" type="{http://www.travellazy.com/product/model}ServiceProvider" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceSpecifications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceSpecification" type="{http://www.travellazy.com/product/model}ServiceSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="characteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="characteristic" type="{http://www.travellazy.com/product/model}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ServiceConfiguration", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "services",
    "serviceProviders",
    "serviceSpecifications",
    "characteristics"
})
public class ServiceConfiguration {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Services services;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceConfiguration.ServiceProviders serviceProviders;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceConfiguration.ServiceSpecifications serviceSpecifications;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceConfiguration.Characteristics characteristics;

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link Services }
     *     
     */
    public Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link Services }
     *     
     */
    public void setServices(Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the serviceProviders property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfiguration.ServiceProviders }
     *     
     */
    public ServiceConfiguration.ServiceProviders getServiceProviders() {
        return serviceProviders;
    }

    /**
     * Sets the value of the serviceProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfiguration.ServiceProviders }
     *     
     */
    public void setServiceProviders(ServiceConfiguration.ServiceProviders value) {
        this.serviceProviders = value;
    }

    /**
     * Gets the value of the serviceSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfiguration.ServiceSpecifications }
     *     
     */
    public ServiceConfiguration.ServiceSpecifications getServiceSpecifications() {
        return serviceSpecifications;
    }

    /**
     * Sets the value of the serviceSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfiguration.ServiceSpecifications }
     *     
     */
    public void setServiceSpecifications(ServiceConfiguration.ServiceSpecifications value) {
        this.serviceSpecifications = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfiguration.Characteristics }
     *     
     */
    public ServiceConfiguration.Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfiguration.Characteristics }
     *     
     */
    public void setCharacteristics(ServiceConfiguration.Characteristics value) {
        this.characteristics = value;
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
     *         &lt;element name="characteristic" type="{http://www.travellazy.com/product/model}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
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
        "characteristic"
    })
    public static class Characteristics {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<Characteristic> characteristic;

        /**
         * Gets the value of the characteristic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Characteristic }
         * 
         * 
         */
        public List<Characteristic> getCharacteristic() {
            if (characteristic == null) {
                characteristic = new ArrayList<Characteristic>();
            }
            return this.characteristic;
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
     *         &lt;element name="serviceProvider" type="{http://www.travellazy.com/product/model}ServiceProvider" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceProvider"
    })
    public static class ServiceProviders {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<ServiceProvider> serviceProvider;

        /**
         * Gets the value of the serviceProvider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceProvider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceProvider }
         * 
         * 
         */
        public List<ServiceProvider> getServiceProvider() {
            if (serviceProvider == null) {
                serviceProvider = new ArrayList<ServiceProvider>();
            }
            return this.serviceProvider;
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
     *         &lt;element name="serviceSpecification" type="{http://www.travellazy.com/product/model}ServiceSpecification" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceSpecification"
    })
    public static class ServiceSpecifications {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<ServiceSpecification> serviceSpecification;

        /**
         * Gets the value of the serviceSpecification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceSpecification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceSpecification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceSpecification }
         * 
         * 
         */
        public List<ServiceSpecification> getServiceSpecification() {
            if (serviceSpecification == null) {
                serviceSpecification = new ArrayList<ServiceSpecification>();
            }
            return this.serviceSpecification;
        }

    }

}
