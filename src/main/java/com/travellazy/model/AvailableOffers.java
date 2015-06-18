
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableOffers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableOffers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableOffer" type="{http://www.travellazy.com/product/model}AvailableOffer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerDisplayCategories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offerDisplayCategory" type="{http://www.travellazy.com/product/model}OfferDisplayCategory" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableOffers", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "availableOffer",
    "offerDisplayCategories"
})
public class AvailableOffers {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<AvailableOffer> availableOffer;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AvailableOffers.OfferDisplayCategories offerDisplayCategories;

    /**
     * Gets the value of the availableOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableOffer }
     * 
     * 
     */
    public List<AvailableOffer> getAvailableOffer() {
        if (availableOffer == null) {
            availableOffer = new ArrayList<AvailableOffer>();
        }
        return this.availableOffer;
    }

    /**
     * Gets the value of the offerDisplayCategories property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableOffers.OfferDisplayCategories }
     *     
     */
    public AvailableOffers.OfferDisplayCategories getOfferDisplayCategories() {
        return offerDisplayCategories;
    }

    /**
     * Sets the value of the offerDisplayCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableOffers.OfferDisplayCategories }
     *     
     */
    public void setOfferDisplayCategories(AvailableOffers.OfferDisplayCategories value) {
        this.offerDisplayCategories = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="offerDisplayCategory" type="{http://www.travellazy.com/product/model}OfferDisplayCategory" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offerDisplayCategory"
    })
    public static class OfferDisplayCategories {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<OfferDisplayCategory> offerDisplayCategory;

        /**
         * Gets the value of the offerDisplayCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerDisplayCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferDisplayCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferDisplayCategory }
         * 
         * 
         */
        public List<OfferDisplayCategory> getOfferDisplayCategory() {
            if (offerDisplayCategory == null) {
                offerDisplayCategory = new ArrayList<OfferDisplayCategory>();
            }
            return this.offerDisplayCategory;
        }

    }

}
