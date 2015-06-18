
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Contains the list of selectable base offer.
 *             
 * 
 * <p>Java class for SelectableGroupOffers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectableGroupOffers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectableGroupOffer" type="{http://www.travellazy.com/product/model}SelectableGroupOffer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectableGroupOffers", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "selectableGroupOffer"
})
public class SelectableGroupOffers {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<SelectableGroupOffer> selectableGroupOffer;

    /**
     * Gets the value of the selectableGroupOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectableGroupOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectableGroupOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectableGroupOffer }
     * 
     * 
     */
    public List<SelectableGroupOffer> getSelectableGroupOffer() {
        if (selectableGroupOffer == null) {
            selectableGroupOffer = new ArrayList<SelectableGroupOffer>();
        }
        return this.selectableGroupOffer;
    }

}
