
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A feature parameter instance.
 *             
 * 
 * <p>Java class for ProductCatalogFeatureParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogFeatureParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configurable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validationRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validationErrors" type="{http://www.travellazy.com/product/model}ValidationErrors" minOccurs="0"/>
 *         &lt;element name="validationRuleDefaultErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameterValues" type="{http://www.travellazy.com/product/model}ProductCatalogFeatureParameterValues" minOccurs="0"/>
 *         &lt;element name="validationRuleType" type="{http://www.travellazy.com/product/model}ValidationRuleType" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://www.travellazy.com/product/model}ProductCatalogFeatureParameterModification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCatalogFeatureParameter", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "value",
    "defaultValue",
    "description",
    "type",
    "configurable",
    "modified",
    "readOnly",
    "changeable",
    "validationRule",
    "selected",
    "validationErrors",
    "validationRuleDefaultErrorMessage",
    "parameterValues",
    "validationRuleType",
    "modification"
})
public class ProductCatalogFeatureParameter {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String value;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String defaultValue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String type;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean configurable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean modified;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean readOnly;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean changeable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String validationRule;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean selected;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ValidationErrors validationErrors;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String validationRuleDefaultErrorMessage;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ProductCatalogFeatureParameterValues parameterValues;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ValidationRuleType validationRuleType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ProductCatalogFeatureParameterModification modification;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the configurable property.
     * 
     */
    public boolean isConfigurable() {
        return configurable;
    }

    /**
     * Sets the value of the configurable property.
     * 
     */
    public void setConfigurable(boolean value) {
        this.configurable = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     */
    public boolean isModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     */
    public void setModified(boolean value) {
        this.modified = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the changeable property.
     * 
     */
    public boolean isChangeable() {
        return changeable;
    }

    /**
     * Sets the value of the changeable property.
     * 
     */
    public void setChangeable(boolean value) {
        this.changeable = value;
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
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationErrors }
     *     
     */
    public ValidationErrors getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationErrors }
     *     
     */
    public void setValidationErrors(ValidationErrors value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the validationRuleDefaultErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationRuleDefaultErrorMessage() {
        return validationRuleDefaultErrorMessage;
    }

    /**
     * Sets the value of the validationRuleDefaultErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationRuleDefaultErrorMessage(String value) {
        this.validationRuleDefaultErrorMessage = value;
    }

    /**
     * Gets the value of the parameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogFeatureParameterValues }
     *     
     */
    public ProductCatalogFeatureParameterValues getParameterValues() {
        return parameterValues;
    }

    /**
     * Sets the value of the parameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogFeatureParameterValues }
     *     
     */
    public void setParameterValues(ProductCatalogFeatureParameterValues value) {
        this.parameterValues = value;
    }

    /**
     * Gets the value of the validationRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationRuleType }
     *     
     */
    public ValidationRuleType getValidationRuleType() {
        return validationRuleType;
    }

    /**
     * Sets the value of the validationRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationRuleType }
     *     
     */
    public void setValidationRuleType(ValidationRuleType value) {
        this.validationRuleType = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogFeatureParameterModification }
     *     
     */
    public ProductCatalogFeatureParameterModification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogFeatureParameterModification }
     *     
     */
    public void setModification(ProductCatalogFeatureParameterModification value) {
        this.modification = value;
    }

}
