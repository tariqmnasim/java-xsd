
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A proposal for a parameter of a feature
 *                 containing the definition of a value
 *                 that can be filled for the instance
 *                 created from the parameter proposal's feature.
 *             
 * 
 * <p>Java class for ParameterProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regexValidationRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configurable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="validationErrors" type="{http://www.travellazy.com/product/model}ValidationErrors" minOccurs="0"/>
 *         &lt;element name="selectableValues" type="{http://www.travellazy.com/product/model}SelectableValues" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "defaultValue",
    "type",
    "regexValidationRule",
    "description",
    "configurable",
    "modified",
    "readOnly",
    "changeable",
    "validationErrors",
    "selectableValues"
})
public class ParameterProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String defaultValue;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String type;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String regexValidationRule;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean configurable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean modified;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean readOnly;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean changeable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ValidationErrors validationErrors;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<SelectableValues> selectableValues;

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
     * Gets the value of the regexValidationRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegexValidationRule() {
        return regexValidationRule;
    }

    /**
     * Sets the value of the regexValidationRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegexValidationRule(String value) {
        this.regexValidationRule = value;
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModified(Boolean value) {
        this.modified = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the changeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeable() {
        return changeable;
    }

    /**
     * Sets the value of the changeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeable(Boolean value) {
        this.changeable = value;
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
     * Gets the value of the selectableValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectableValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectableValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectableValues }
     * 
     * 
     */
    public List<SelectableValues> getSelectableValues() {
        if (selectableValues == null) {
            selectableValues = new ArrayList<SelectableValues>();
        }
        return this.selectableValues;
    }

}
