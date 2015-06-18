
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
 * <p>Java class for FeatureGroupReferenceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureGroupReferenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="featureGroupReference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="referenceTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceSpecificationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceFeatureParamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceFeatureParamValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="isMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isChangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isChangeableDuringProvisioning" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isDefaultActive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="terminateWhenBroken" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="terminateWhenInProgress" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="terminateWhenComplete" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="chargeOnTermination" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "FeatureGroupReferenceList", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "featureGroupReference"
})
public class FeatureGroupReferenceList {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<FeatureGroupReferenceList.FeatureGroupReference> featureGroupReference;

    /**
     * Gets the value of the featureGroupReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureGroupReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureGroupReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureGroupReferenceList.FeatureGroupReference }
     * 
     * 
     */
    public List<FeatureGroupReferenceList.FeatureGroupReference> getFeatureGroupReference() {
        if (featureGroupReference == null) {
            featureGroupReference = new ArrayList<FeatureGroupReferenceList.FeatureGroupReference>();
        }
        return this.featureGroupReference;
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
     *         &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="referenceTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceSpecificationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceFeatureParamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceFeatureParamValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="isMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isChangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isChangeableDuringProvisioning" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isDefaultActive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="terminateWhenBroken" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="terminateWhenInProgress" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="terminateWhenComplete" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="chargeOnTermination" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "featureGroupKey",
        "maxNumberOfInstances",
        "displayOrder",
        "activation",
        "termination",
        "referenceTypeKey",
        "serviceSpecificationKey",
        "serviceProviderKey",
        "serviceKey",
        "serviceFeatureKey",
        "serviceFeatureParamName",
        "serviceFeatureParamValue"
    })
    public static class FeatureGroupReference {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String featureGroupKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected Integer maxNumberOfInstances;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected int displayOrder;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar activation;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar termination;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected String referenceTypeKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected String serviceSpecificationKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected String serviceProviderKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected String serviceKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected String serviceFeatureKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected String serviceFeatureParamName;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected String serviceFeatureParamValue;
        @XmlAttribute(name = "isMandatory", required = true)
        protected boolean isMandatory;
        @XmlAttribute(name = "isChangeable", required = true)
        protected boolean isChangeable;
        @XmlAttribute(name = "isChangeableDuringProvisioning", required = true)
        protected boolean isChangeableDuringProvisioning;
        @XmlAttribute(name = "isDefaultActive", required = true)
        protected boolean isDefaultActive;
        @XmlAttribute(name = "terminateWhenBroken", required = true)
        protected boolean terminateWhenBroken;
        @XmlAttribute(name = "terminateWhenInProgress", required = true)
        protected boolean terminateWhenInProgress;
        @XmlAttribute(name = "terminateWhenComplete", required = true)
        protected boolean terminateWhenComplete;
        @XmlAttribute(name = "chargeOnTermination", required = true)
        protected boolean chargeOnTermination;

        /**
         * Gets the value of the featureGroupKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureGroupKey() {
            return featureGroupKey;
        }

        /**
         * Sets the value of the featureGroupKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureGroupKey(String value) {
            this.featureGroupKey = value;
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
         * Gets the value of the displayOrder property.
         * 
         */
        public int getDisplayOrder() {
            return displayOrder;
        }

        /**
         * Sets the value of the displayOrder property.
         * 
         */
        public void setDisplayOrder(int value) {
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
         * Gets the value of the referenceTypeKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceTypeKey() {
            return referenceTypeKey;
        }

        /**
         * Sets the value of the referenceTypeKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceTypeKey(String value) {
            this.referenceTypeKey = value;
        }

        /**
         * Gets the value of the serviceSpecificationKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceSpecificationKey() {
            return serviceSpecificationKey;
        }

        /**
         * Sets the value of the serviceSpecificationKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceSpecificationKey(String value) {
            this.serviceSpecificationKey = value;
        }

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
         * Gets the value of the serviceFeatureParamName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceFeatureParamName() {
            return serviceFeatureParamName;
        }

        /**
         * Sets the value of the serviceFeatureParamName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceFeatureParamName(String value) {
            this.serviceFeatureParamName = value;
        }

        /**
         * Gets the value of the serviceFeatureParamValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceFeatureParamValue() {
            return serviceFeatureParamValue;
        }

        /**
         * Sets the value of the serviceFeatureParamValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceFeatureParamValue(String value) {
            this.serviceFeatureParamValue = value;
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
         * Gets the value of the isChangeableDuringProvisioning property.
         * 
         */
        public boolean isIsChangeableDuringProvisioning() {
            return isChangeableDuringProvisioning;
        }

        /**
         * Sets the value of the isChangeableDuringProvisioning property.
         * 
         */
        public void setIsChangeableDuringProvisioning(boolean value) {
            this.isChangeableDuringProvisioning = value;
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

        /**
         * Gets the value of the terminateWhenBroken property.
         * 
         */
        public boolean isTerminateWhenBroken() {
            return terminateWhenBroken;
        }

        /**
         * Sets the value of the terminateWhenBroken property.
         * 
         */
        public void setTerminateWhenBroken(boolean value) {
            this.terminateWhenBroken = value;
        }

        /**
         * Gets the value of the terminateWhenInProgress property.
         * 
         */
        public boolean isTerminateWhenInProgress() {
            return terminateWhenInProgress;
        }

        /**
         * Sets the value of the terminateWhenInProgress property.
         * 
         */
        public void setTerminateWhenInProgress(boolean value) {
            this.terminateWhenInProgress = value;
        }

        /**
         * Gets the value of the terminateWhenComplete property.
         * 
         */
        public boolean isTerminateWhenComplete() {
            return terminateWhenComplete;
        }

        /**
         * Sets the value of the terminateWhenComplete property.
         * 
         */
        public void setTerminateWhenComplete(boolean value) {
            this.terminateWhenComplete = value;
        }

        /**
         * Gets the value of the chargeOnTermination property.
         * 
         */
        public boolean isChargeOnTermination() {
            return chargeOnTermination;
        }

        /**
         * Sets the value of the chargeOnTermination property.
         * 
         */
        public void setChargeOnTermination(boolean value) {
            this.chargeOnTermination = value;
        }

    }

}
