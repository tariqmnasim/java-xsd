
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Characteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Characteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="characteristicTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characteristicValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="characteristicValue" type="{http://www.travellazy.com/product/model}CharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="isSearchable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Characteristic", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "characteristicTypeKey",
    "displayName",
    "displayOrder",
    "description",
    "defaultValue",
    "validationErrorMessage",
    "validationRule",
    "characteristicValues"
})
public class Characteristic {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String characteristicTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer displayOrder;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String defaultValue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String validationErrorMessage;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String validationRule;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Characteristic.CharacteristicValues characteristicValues;
    @XmlAttribute(name = "isSearchable", required = true)
    protected boolean isSearchable;

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
     * Gets the value of the characteristicValues property.
     * 
     * @return
     *     possible object is
     *     {@link Characteristic.CharacteristicValues }
     *     
     */
    public Characteristic.CharacteristicValues getCharacteristicValues() {
        return characteristicValues;
    }

    /**
     * Sets the value of the characteristicValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristic.CharacteristicValues }
     *     
     */
    public void setCharacteristicValues(Characteristic.CharacteristicValues value) {
        this.characteristicValues = value;
    }

    /**
     * Gets the value of the isSearchable property.
     * 
     */
    public boolean isIsSearchable() {
        return isSearchable;
    }

    /**
     * Sets the value of the isSearchable property.
     * 
     */
    public void setIsSearchable(boolean value) {
        this.isSearchable = value;
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
     *         &lt;element name="characteristicValue" type="{http://www.travellazy.com/product/model}CharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
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
        "characteristicValue"
    })
    public static class CharacteristicValues {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<CharacteristicValue> characteristicValue;

        /**
         * Gets the value of the characteristicValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristicValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristicValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CharacteristicValue }
         * 
         * 
         */
        public List<CharacteristicValue> getCharacteristicValue() {
            if (characteristicValue == null) {
                characteristicValue = new ArrayList<CharacteristicValue>();
            }
            return this.characteristicValue;
        }

    }

}
