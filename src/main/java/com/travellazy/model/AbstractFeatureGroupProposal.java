
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Common attributes of a feature group proposal. A feature group proposal is a container for
 *                 feature proposals that can be selected for the component the group resides in.
 *                 There are feature groups for offers and
 *                 feature groups for services.
 *             
 * 
 * <p>Java class for AbstractFeatureGroupProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureGroupProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfAllowedInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="featureSelectionMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="single" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="selectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureGroupProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "displayName",
    "featureGroupType",
    "numberOfAllowedInstances",
    "featureSelectionMandatory",
    "single",
    "selectable",
    "modified"
})
@XmlSeeAlso({
    SelectableFeatureGroupProposals.class
})
public class AbstractFeatureGroupProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String featureGroupType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer numberOfAllowedInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean featureSelectionMandatory;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean single;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean selectable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean modified;

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

}
