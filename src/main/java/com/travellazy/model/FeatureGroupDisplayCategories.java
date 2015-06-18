
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureGroupDisplayCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureGroupDisplayCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definitions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="featureGroupDisplayCategory" type="{http://www.travellazy.com/product/model}FeatureGroupDisplayCategory" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="featureGroupDisplayCategoryMapping" type="{http://www.travellazy.com/product/model}FeatureGroupDisplayCategoryMapping" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="serviceFeatureGroupDisplayCategoryMapping" type="{http://www.travellazy.com/product/model}ServiceFeatureGroupDisplayCategoryMapping" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FeatureGroupDisplayCategories", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "definitions",
    "mappings"
})
public class FeatureGroupDisplayCategories {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected FeatureGroupDisplayCategories.Definitions definitions;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected FeatureGroupDisplayCategories.Mappings mappings;

    /**
     * Gets the value of the definitions property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupDisplayCategories.Definitions }
     *     
     */
    public FeatureGroupDisplayCategories.Definitions getDefinitions() {
        return definitions;
    }

    /**
     * Sets the value of the definitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupDisplayCategories.Definitions }
     *     
     */
    public void setDefinitions(FeatureGroupDisplayCategories.Definitions value) {
        this.definitions = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupDisplayCategories.Mappings }
     *     
     */
    public FeatureGroupDisplayCategories.Mappings getMappings() {
        return mappings;
    }

    /**
     * Sets the value of the mappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupDisplayCategories.Mappings }
     *     
     */
    public void setMappings(FeatureGroupDisplayCategories.Mappings value) {
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
     *         &lt;element name="featureGroupDisplayCategory" type="{http://www.travellazy.com/product/model}FeatureGroupDisplayCategory" maxOccurs="unbounded" minOccurs="0"/>
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
        "featureGroupDisplayCategory"
    })
    public static class Definitions {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<FeatureGroupDisplayCategory> featureGroupDisplayCategory;

        /**
         * Gets the value of the featureGroupDisplayCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureGroupDisplayCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureGroupDisplayCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureGroupDisplayCategory }
         * 
         * 
         */
        public List<FeatureGroupDisplayCategory> getFeatureGroupDisplayCategory() {
            if (featureGroupDisplayCategory == null) {
                featureGroupDisplayCategory = new ArrayList<FeatureGroupDisplayCategory>();
            }
            return this.featureGroupDisplayCategory;
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
     *         &lt;element name="featureGroupDisplayCategoryMapping" type="{http://www.travellazy.com/product/model}FeatureGroupDisplayCategoryMapping" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="serviceFeatureGroupDisplayCategoryMapping" type="{http://www.travellazy.com/product/model}ServiceFeatureGroupDisplayCategoryMapping" maxOccurs="unbounded" minOccurs="0"/>
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
        "featureGroupDisplayCategoryMapping",
        "serviceFeatureGroupDisplayCategoryMapping"
    })
    public static class Mappings {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<FeatureGroupDisplayCategoryMapping> featureGroupDisplayCategoryMapping;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<ServiceFeatureGroupDisplayCategoryMapping> serviceFeatureGroupDisplayCategoryMapping;

        /**
         * Gets the value of the featureGroupDisplayCategoryMapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureGroupDisplayCategoryMapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureGroupDisplayCategoryMapping().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureGroupDisplayCategoryMapping }
         * 
         * 
         */
        public List<FeatureGroupDisplayCategoryMapping> getFeatureGroupDisplayCategoryMapping() {
            if (featureGroupDisplayCategoryMapping == null) {
                featureGroupDisplayCategoryMapping = new ArrayList<FeatureGroupDisplayCategoryMapping>();
            }
            return this.featureGroupDisplayCategoryMapping;
        }

        /**
         * Gets the value of the serviceFeatureGroupDisplayCategoryMapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeatureGroupDisplayCategoryMapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeatureGroupDisplayCategoryMapping().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFeatureGroupDisplayCategoryMapping }
         * 
         * 
         */
        public List<ServiceFeatureGroupDisplayCategoryMapping> getServiceFeatureGroupDisplayCategoryMapping() {
            if (serviceFeatureGroupDisplayCategoryMapping == null) {
                serviceFeatureGroupDisplayCategoryMapping = new ArrayList<ServiceFeatureGroupDisplayCategoryMapping>();
            }
            return this.serviceFeatureGroupDisplayCategoryMapping;
        }

    }

}
