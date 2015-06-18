
package com.travellazy.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSpecificationCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSpecificationCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="characteristicKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="characteristicTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="validationErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCharacteristicValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceCharacteristicValue" type="{http://www.travellazy.com/product/model}CharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="isHidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isDefaultActive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isChangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isChangeableDuringProvisioning" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isServiceAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isDeliveryAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSpecificationCharacteristic", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "characteristicKey",
    "characteristicTypeKey",
    "displayName",
    "displayOrder",
    "description",
    "defaultValue",
    "maxNumberOfInstances",
    "validationErrorMessage",
    "validationRule",
    "serviceCharacteristicValues"
})
public class ServiceSpecificationCharacteristic {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String characteristicKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String characteristicTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer displayOrder;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String defaultValue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigInteger maxNumberOfInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String validationErrorMessage;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String validationRule;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceSpecificationCharacteristic.ServiceCharacteristicValues serviceCharacteristicValues;
    @XmlAttribute(name = "isHidden", required = true)
    protected boolean isHidden;
    @XmlAttribute(name = "isReadOnly", required = true)
    protected boolean isReadOnly;
    @XmlAttribute(name = "isMandatory", required = true)
    protected boolean isMandatory;
    @XmlAttribute(name = "isDefaultActive", required = true)
    protected boolean isDefaultActive;
    @XmlAttribute(name = "isChangeable", required = true)
    protected boolean isChangeable;
    @XmlAttribute(name = "isChangeableDuringProvisioning")
    protected Boolean isChangeableDuringProvisioning;
    @XmlAttribute(name = "isGroupIdentifier")
    protected Boolean isGroupIdentifier;
    @XmlAttribute(name = "isSearchable")
    protected Boolean isSearchable;
    @XmlAttribute(name = "isServiceIdentifier")
    protected Boolean isServiceIdentifier;
    @XmlAttribute(name = "isServiceAddress")
    protected Boolean isServiceAddress;
    @XmlAttribute(name = "isDeliveryAddress")
    protected Boolean isDeliveryAddress;

    /**
     * Gets the value of the characteristicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicKey() {
        return characteristicKey;
    }

    /**
     * Sets the value of the characteristicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicKey(String value) {
        this.characteristicKey = value;
    }

    /**
     * Gets the value of the characteristicTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicTypeKey() {
        return characteristicTypeKey;
    }

    /**
     * Sets the value of the characteristicTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicTypeKey(String value) {
        this.characteristicTypeKey = value;
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
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the maxNumberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfInstances() {
        return maxNumberOfInstances;
    }

    /**
     * Sets the value of the maxNumberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfInstances(BigInteger value) {
        this.maxNumberOfInstances = value;
    }

    /**
     * Gets the value of the validationErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationErrorMessage() {
        return validationErrorMessage;
    }

    /**
     * Sets the value of the validationErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationErrorMessage(String value) {
        this.validationErrorMessage = value;
    }

    /**
     * Gets the value of the validationRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationRule() {
        return validationRule;
    }

    /**
     * Sets the value of the validationRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationRule(String value) {
        this.validationRule = value;
    }

    /**
     * Gets the value of the serviceCharacteristicValues property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSpecificationCharacteristic.ServiceCharacteristicValues }
     *     
     */
    public ServiceSpecificationCharacteristic.ServiceCharacteristicValues getServiceCharacteristicValues() {
        return serviceCharacteristicValues;
    }

    /**
     * Sets the value of the serviceCharacteristicValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSpecificationCharacteristic.ServiceCharacteristicValues }
     *     
     */
    public void setServiceCharacteristicValues(ServiceSpecificationCharacteristic.ServiceCharacteristicValues value) {
        this.serviceCharacteristicValues = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     */
    public void setIsReadOnly(boolean value) {
        this.isReadOnly = value;
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsChangeableDuringProvisioning() {
        if (isChangeableDuringProvisioning == null) {
            return false;
        } else {
            return isChangeableDuringProvisioning;
        }
    }

    /**
     * Sets the value of the isChangeableDuringProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChangeableDuringProvisioning(Boolean value) {
        this.isChangeableDuringProvisioning = value;
    }

    /**
     * Gets the value of the isGroupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsGroupIdentifier() {
        if (isGroupIdentifier == null) {
            return false;
        } else {
            return isGroupIdentifier;
        }
    }

    /**
     * Sets the value of the isGroupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroupIdentifier(Boolean value) {
        this.isGroupIdentifier = value;
    }

    /**
     * Gets the value of the isSearchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSearchable() {
        return isSearchable;
    }

    /**
     * Sets the value of the isSearchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSearchable(Boolean value) {
        this.isSearchable = value;
    }

    /**
     * Gets the value of the isServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsServiceIdentifier() {
        if (isServiceIdentifier == null) {
            return false;
        } else {
            return isServiceIdentifier;
        }
    }

    /**
     * Sets the value of the isServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceIdentifier(Boolean value) {
        this.isServiceIdentifier = value;
    }

    /**
     * Gets the value of the isServiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsServiceAddress() {
        if (isServiceAddress == null) {
            return false;
        } else {
            return isServiceAddress;
        }
    }

    /**
     * Sets the value of the isServiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceAddress(Boolean value) {
        this.isServiceAddress = value;
    }

    /**
     * Gets the value of the isDeliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDeliveryAddress() {
        if (isDeliveryAddress == null) {
            return false;
        } else {
            return isDeliveryAddress;
        }
    }

    /**
     * Sets the value of the isDeliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeliveryAddress(Boolean value) {
        this.isDeliveryAddress = value;
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
     *         &lt;element name="serviceCharacteristicValue" type="{http://www.travellazy.com/product/model}CharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceCharacteristicValue"
    })
    public static class ServiceCharacteristicValues {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<CharacteristicValue> serviceCharacteristicValue;

        /**
         * Gets the value of the serviceCharacteristicValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCharacteristicValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCharacteristicValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CharacteristicValue }
         * 
         * 
         */
        public List<CharacteristicValue> getServiceCharacteristicValue() {
            if (serviceCharacteristicValue == null) {
                serviceCharacteristicValue = new ArrayList<CharacteristicValue>();
            }
            return this.serviceCharacteristicValue;
        }

    }

}
