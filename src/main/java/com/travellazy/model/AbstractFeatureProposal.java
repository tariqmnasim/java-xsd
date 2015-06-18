
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Common attributes for features.
 *             
 * 
 * <p>Java class for AbstractFeatureProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisionable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="parentChargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charge" type="{http://www.travellazy.com/product/model}AbstractCharge" minOccurs="0"/>
 *         &lt;element name="externalReferenceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.travellazy.com/product/model}ProductCatalogFeatureParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "description",
    "displayName",
    "provisionable",
    "parentChargeClusterKey",
    "charge",
    "externalReferenceKey",
    "hidden",
    "changeable",
    "name",
    "displayOrder",
    "parameters"
})
@XmlSeeAlso({
    FeatureInstance.class,
    SelectableFeature.class
})
public class AbstractFeatureProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean provisionable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String parentChargeClusterKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractCharge charge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String externalReferenceKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean hidden;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean changeable;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String name;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer displayOrder;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ProductCatalogFeatureParameters parameters;

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
     * Gets the value of the provisionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvisionable() {
        return provisionable;
    }

    /**
     * Sets the value of the provisionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvisionable(Boolean value) {
        this.provisionable = value;
    }

    /**
     * Gets the value of the parentChargeClusterKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentChargeClusterKey() {
        return parentChargeClusterKey;
    }

    /**
     * Sets the value of the parentChargeClusterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentChargeClusterKey(String value) {
        this.parentChargeClusterKey = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractCharge }
     *     
     */
    public AbstractCharge getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractCharge }
     *     
     */
    public void setCharge(AbstractCharge value) {
        this.charge = value;
    }

    /**
     * Gets the value of the externalReferenceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceKey() {
        return externalReferenceKey;
    }

    /**
     * Sets the value of the externalReferenceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceKey(String value) {
        this.externalReferenceKey = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogFeatureParameters }
     *     
     */
    public ProductCatalogFeatureParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogFeatureParameters }
     *     
     */
    public void setParameters(ProductCatalogFeatureParameters value) {
        this.parameters = value;
    }

}
