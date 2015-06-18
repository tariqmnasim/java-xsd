
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 One selectable service. This is just a
 *                 template for possible values which will when selected
 *                 generate service instances.
 *             
 * 
 * <p>Java class for SelectableService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectableService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}ServiceProposal">
 *       &lt;sequence>
 *         &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="selectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectableService", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "minNumberOfInstances",
    "maxNumberOfInstances",
    "selectable"
})
public class SelectableService
    extends ServiceProposal
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Short minNumberOfInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Short maxNumberOfInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean selectable;

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

}
