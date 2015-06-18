
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferDisplayCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDisplayCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definitions">
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
 *         &lt;element name="mappings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offerDisplayCategoryMapping" type="{http://www.travellazy.com/product/model}OfferDisplayCategoryMapping" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OfferDisplayCategories", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "definitions",
    "mappings"
})
public class OfferDisplayCategories {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected OfferDisplayCategories.Definitions definitions;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected OfferDisplayCategories.Mappings mappings;

    /**
     * Gets the value of the definitions property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDisplayCategories.Definitions }
     *     
     */
    public OfferDisplayCategories.Definitions getDefinitions() {
        return definitions;
    }

    /**
     * Sets the value of the definitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDisplayCategories.Definitions }
     *     
     */
    public void setDefinitions(OfferDisplayCategories.Definitions value) {
        this.definitions = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDisplayCategories.Mappings }
     *     
     */
    public OfferDisplayCategories.Mappings getMappings() {
        return mappings;
    }

    /**
     * Sets the value of the mappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDisplayCategories.Mappings }
     *     
     */
    public void setMappings(OfferDisplayCategories.Mappings value) {
        this.mappings = value;
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
    public static class Definitions {

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
     *         &lt;element name="offerDisplayCategoryMapping" type="{http://www.travellazy.com/product/model}OfferDisplayCategoryMapping" maxOccurs="unbounded" minOccurs="0"/>
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
        "offerDisplayCategoryMapping"
    })
    public static class Mappings {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<OfferDisplayCategoryMapping> offerDisplayCategoryMapping;

        /**
         * Gets the value of the offerDisplayCategoryMapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerDisplayCategoryMapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferDisplayCategoryMapping().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferDisplayCategoryMapping }
         * 
         * 
         */
        public List<OfferDisplayCategoryMapping> getOfferDisplayCategoryMapping() {
            if (offerDisplayCategoryMapping == null) {
                offerDisplayCategoryMapping = new ArrayList<OfferDisplayCategoryMapping>();
            }
            return this.offerDisplayCategoryMapping;
        }

    }

}
