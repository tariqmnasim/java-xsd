
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A selected instance of a feature.
 *             
 * 
 * <p>Java class for FeatureInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractFeatureProposal">
 *       &lt;sequence>
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validationErrors" type="{http://www.travellazy.com/product/model}ValidationErrors" minOccurs="0"/>
 *         &lt;element name="serviceProposal" type="{http://www.travellazy.com/product/model}ServiceProposal" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://www.travellazy.com/product/model}ProductCatalogFeatureModification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureInstance", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "deletable",
    "modified",
    "validationErrors",
    "serviceProposal",
    "modification"
})
public class FeatureInstance
    extends AbstractFeatureProposal
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean deletable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean modified;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ValidationErrors validationErrors;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceProposal serviceProposal;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ProductCatalogFeatureModification modification;

    /**
     * Gets the value of the deletable property.
     * 
     */
    public boolean isDeletable() {
        return deletable;
    }

    /**
     * Sets the value of the deletable property.
     * 
     */
    public void setDeletable(boolean value) {
        this.deletable = value;
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
     * Gets the value of the serviceProposal property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProposal }
     *     
     */
    public ServiceProposal getServiceProposal() {
        return serviceProposal;
    }

    /**
     * Sets the value of the serviceProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProposal }
     *     
     */
    public void setServiceProposal(ServiceProposal value) {
        this.serviceProposal = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogFeatureModification }
     *     
     */
    public ProductCatalogFeatureModification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogFeatureModification }
     *     
     */
    public void setModification(ProductCatalogFeatureModification value) {
        this.modification = value;
    }

}
