
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A list of selectable features for a given component (offer or service).
 *             
 * 
 * <p>Java class for SelectableFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectableFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectableFeature" type="{http://www.travellazy.com/product/model}SelectableFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectableFeatures", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "selectableFeature"
})
public class SelectableFeatures {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<SelectableFeature> selectableFeature;

    /**
     * Gets the value of the selectableFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectableFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectableFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectableFeature }
     * 
     * 
     */
    public List<SelectableFeature> getSelectableFeature() {
        if (selectableFeature == null) {
            selectableFeature = new ArrayList<SelectableFeature>();
        }
        return this.selectableFeature;
    }

}
