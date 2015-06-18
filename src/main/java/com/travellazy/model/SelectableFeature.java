
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 One selectable feature. This is just a template for possible values which will when selected
 *                 generate feature instances.
 *             
 * 
 * <p>Java class for SelectableFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectableFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractFeatureProposal">
 *       &lt;sequence>
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
@XmlType(name = "SelectableFeature", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "selectable"
})
public class SelectableFeature
    extends AbstractFeatureProposal
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean selectable;

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
