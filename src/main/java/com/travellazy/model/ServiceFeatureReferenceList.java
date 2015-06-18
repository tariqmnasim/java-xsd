
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
 * <p>Java class for ServiceFeatureReferenceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeatureReferenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceFeatureReference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="serviceFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="parameterDefinitionValues" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="parameterDefinitionValue" type="{http://www.travellazy.com/product/model}ParameterDefinitionValue" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="isAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isDefaultActive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "ServiceFeatureReferenceList", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceFeatureReference"
})
public class ServiceFeatureReferenceList {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<ServiceFeatureReferenceList.ServiceFeatureReference> serviceFeatureReference;

    /**
     * Gets the value of the serviceFeatureReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureReferenceList.ServiceFeatureReference }
     * 
     * 
     */
    public List<ServiceFeatureReferenceList.ServiceFeatureReference> getServiceFeatureReference() {
        if (serviceFeatureReference == null) {
            serviceFeatureReference = new ArrayList<ServiceFeatureReferenceList.ServiceFeatureReference>();
        }
        return this.serviceFeatureReference;
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
     *         &lt;element name="serviceFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="parameterDefinitionValues" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="parameterDefinitionValue" type="{http://www.travellazy.com/product/model}ParameterDefinitionValue" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="isAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isDefaultActive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" />
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
        "serviceFeatureKey",
        "displayOrder",
        "activation",
        "termination",
        "parameterDefinitionValues"
    })
    public static class ServiceFeatureReference {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String serviceProviderKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String serviceFeatureKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected Integer displayOrder;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar activation;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar termination;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected ServiceFeatureReferenceList.ServiceFeatureReference.ParameterDefinitionValues parameterDefinitionValues;
        @XmlAttribute(name = "isAvailable")
        protected Boolean isAvailable;
        @XmlAttribute(name = "isMandatory")
        protected Boolean isMandatory;
        @XmlAttribute(name = "isChangeable")
        protected Boolean isChangeable;
        @XmlAttribute(name = "isDefaultActive")
        protected Boolean isDefaultActive;
        @XmlAttribute(name = "maxNumberOfInstances")
        protected Integer maxNumberOfInstances;

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
         * Gets the value of the serviceFeatureKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceFeatureKey() {
            return serviceFeatureKey;
        }

        /**
         * Sets the value of the serviceFeatureKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceFeatureKey(String value) {
            this.serviceFeatureKey = value;
        }

        /**
         * Gets the value of the displayOrder property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDisplayOrder() {
            return displayOrder;
        }

        /**
         * Sets the value of the displayOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDisplayOrder(Integer value) {
            this.displayOrder = value;
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
         * Gets the value of the parameterDefinitionValues property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFeatureReferenceList.ServiceFeatureReference.ParameterDefinitionValues }
         *     
         */
        public ServiceFeatureReferenceList.ServiceFeatureReference.ParameterDefinitionValues getParameterDefinitionValues() {
            return parameterDefinitionValues;
        }

        /**
         * Sets the value of the parameterDefinitionValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFeatureReferenceList.ServiceFeatureReference.ParameterDefinitionValues }
         *     
         */
        public void setParameterDefinitionValues(ServiceFeatureReferenceList.ServiceFeatureReference.ParameterDefinitionValues value) {
            this.parameterDefinitionValues = value;
        }

        /**
         * Gets the value of the isAvailable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsAvailable() {
            return isAvailable;
        }

        /**
         * Sets the value of the isAvailable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsAvailable(Boolean value) {
            this.isAvailable = value;
        }

        /**
         * Gets the value of the isMandatory property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsMandatory() {
            return isMandatory;
        }

        /**
         * Sets the value of the isMandatory property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsMandatory(Boolean value) {
            this.isMandatory = value;
        }

        /**
         * Gets the value of the isChangeable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsChangeable() {
            return isChangeable;
        }

        /**
         * Sets the value of the isChangeable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsChangeable(Boolean value) {
            this.isChangeable = value;
        }

        /**
         * Gets the value of the isDefaultActive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsDefaultActive() {
            return isDefaultActive;
        }

        /**
         * Sets the value of the isDefaultActive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsDefaultActive(Boolean value) {
            this.isDefaultActive = value;
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
         *         &lt;element name="parameterDefinitionValue" type="{http://www.travellazy.com/product/model}ParameterDefinitionValue" maxOccurs="unbounded" minOccurs="0"/>
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
            "parameterDefinitionValue"
        })
        public static class ParameterDefinitionValues {

            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected List<ParameterDefinitionValue> parameterDefinitionValue;

            /**
             * Gets the value of the parameterDefinitionValue property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameterDefinitionValue property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameterDefinitionValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParameterDefinitionValue }
             * 
             * 
             */
            public List<ParameterDefinitionValue> getParameterDefinitionValue() {
                if (parameterDefinitionValue == null) {
                    parameterDefinitionValue = new ArrayList<ParameterDefinitionValue>();
                }
                return this.parameterDefinitionValue;
            }

        }

    }

}
