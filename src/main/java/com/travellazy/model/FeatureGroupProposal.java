
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 An actual feature group proposal containing feature instances.
 *                 Created from a selectable feature group proposal when one of the containing features is selected.
 *             
 * 
 * <p>Java class for FeatureGroupProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureGroupProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureSelectionMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberOfAllowedInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfSelectedInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="single" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="selectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="categoryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationErrors" type="{http://www.travellazy.com/product/model}ValidationErrors" minOccurs="0"/>
 *         &lt;element name="featureInstances" type="{http://www.travellazy.com/product/model}FeatureInstances" minOccurs="0"/>
 *         &lt;element name="selectableFeatures" type="{http://www.travellazy.com/product/model}SelectableFeatures" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureGroupProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "displayName",
    "description",
    "featureGroupType",
    "featureSelectionMandatory",
    "numberOfAllowedInstances",
    "numberOfSelectedInstances",
    "minNumberOfInstances",
    "maxNumberOfInstances",
    "single",
    "modified",
    "selectable",
    "categoryKey",
    "validationErrors",
    "featureInstances",
    "selectableFeatures"
})
@XmlSeeAlso({
    ServiceFeatureGroupProposal.class
})
public class FeatureGroupProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String featureGroupType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean featureSelectionMandatory;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer numberOfAllowedInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer numberOfSelectedInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Short minNumberOfInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Short maxNumberOfInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean single;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean modified;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean selectable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String categoryKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ValidationErrors validationErrors;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureInstances featureInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected SelectableFeatures selectableFeatures;

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
     * Gets the value of the featureGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureGroupType() {
        return featureGroupType;
    }

    /**
     * Sets the value of the featureGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureGroupType(String value) {
        this.featureGroupType = value;
    }

    /**
     * Gets the value of the featureSelectionMandatory property.
     * 
     */
    public boolean isFeatureSelectionMandatory() {
        return featureSelectionMandatory;
    }

    /**
     * Sets the value of the featureSelectionMandatory property.
     * 
     */
    public void setFeatureSelectionMandatory(boolean value) {
        this.featureSelectionMandatory = value;
    }

    /**
     * Gets the value of the numberOfAllowedInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAllowedInstances() {
        return numberOfAllowedInstances;
    }

    /**
     * Sets the value of the numberOfAllowedInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAllowedInstances(Integer value) {
        this.numberOfAllowedInstances = value;
    }

    /**
     * Gets the value of the numberOfSelectedInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSelectedInstances() {
        return numberOfSelectedInstances;
    }

    /**
     * Sets the value of the numberOfSelectedInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSelectedInstances(Integer value) {
        this.numberOfSelectedInstances = value;
    }

    /**
     * Gets the value of the minNumberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinNumberOfInstances() {
        return minNumberOfInstances;
    }

    /**
     * Sets the value of the minNumberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinNumberOfInstances(Short value) {
        this.minNumberOfInstances = value;
    }

    /**
     * Gets the value of the maxNumberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxNumberOfInstances() {
        return maxNumberOfInstances;
    }

    /**
     * Sets the value of the maxNumberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxNumberOfInstances(Short value) {
        this.maxNumberOfInstances = value;
    }

    /**
     * Gets the value of the single property.
     * 
     */
    public boolean isSingle() {
        return single;
    }

    /**
     * Sets the value of the single property.
     * 
     */
    public void setSingle(boolean value) {
        this.single = value;
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
     * Gets the value of the selectable property.
     * 
     */
    public boolean isSelectable() {
        return selectable;
    }

    /**
     * Sets the value of the selectable property.
     * 
     */
    public void setSelectable(boolean value) {
        this.selectable = value;
    }

    /**
     * Gets the value of the categoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryKey() {
        return categoryKey;
    }

    /**
     * Sets the value of the categoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryKey(String value) {
        this.categoryKey = value;
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
     * Gets the value of the featureInstances property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureInstances }
     *     
     */
    public FeatureInstances getFeatureInstances() {
        return featureInstances;
    }

    /**
     * Sets the value of the featureInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureInstances }
     *     
     */
    public void setFeatureInstances(FeatureInstances value) {
        this.featureInstances = value;
    }

    /**
     * Gets the value of the selectableFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SelectableFeatures }
     *     
     */
    public SelectableFeatures getSelectableFeatures() {
        return selectableFeatures;
    }

    /**
     * Sets the value of the selectableFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableFeatures }
     *     
     */
    public void setSelectableFeatures(SelectableFeatures value) {
        this.selectableFeatures = value;
    }

}
