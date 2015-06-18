
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizedOfferSearchResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizedOfferSearchResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customizedOffer" type="{http://www.travellazy.com/product/model}CustomizedOfferSearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizedOfferSearchResults", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "customizedOffer"
})
public class CustomizedOfferSearchResults {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<CustomizedOfferSearchResult> customizedOffer;

    /**
     * Gets the value of the customizedOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizedOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizedOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizedOfferSearchResult }
     * 
     * 
     */
    public List<CustomizedOfferSearchResult> getCustomizedOffer() {
        if (customizedOffer == null) {
            customizedOffer = new ArrayList<CustomizedOfferSearchResult>();
        }
        return this.customizedOffer;
    }

}
