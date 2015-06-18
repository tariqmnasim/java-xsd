
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A list of offer category keys that determine the offers categories.
 *             
 * 
 * <p>Java class for OfferDisplayCategoryReferenceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDisplayCategoryReferenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerDisplayCategoryReference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="categoryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "OfferDisplayCategoryReferenceList", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerDisplayCategoryReference"
})
public class OfferDisplayCategoryReferenceList {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<OfferDisplayCategoryReferenceList.OfferDisplayCategoryReference> offerDisplayCategoryReference;

    /**
     * Gets the value of the offerDisplayCategoryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerDisplayCategoryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferDisplayCategoryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferDisplayCategoryReferenceList.OfferDisplayCategoryReference }
     * 
     * 
     */
    public List<OfferDisplayCategoryReferenceList.OfferDisplayCategoryReference> getOfferDisplayCategoryReference() {
        if (offerDisplayCategoryReference == null) {
            offerDisplayCategoryReference = new ArrayList<OfferDisplayCategoryReferenceList.OfferDisplayCategoryReference>();
        }
        return this.offerDisplayCategoryReference;
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
     *         &lt;element name="categoryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "categoryKey"
    })
    public static class OfferDisplayCategoryReference {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String categoryKey;

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

    }

}
