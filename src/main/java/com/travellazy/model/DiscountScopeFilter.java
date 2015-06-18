
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountScopeFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountScopeFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountScopeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="filter" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice minOccurs="0">
 *                               &lt;element name="chargeTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="billTypeGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="offerTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="isExcluded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "DiscountScopeFilter", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "discountScopeKey",
    "description",
    "filters"
})
public class DiscountScopeFilter {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String discountScopeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected DiscountScopeFilter.Filters filters;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the discountScopeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountScopeKey() {
        return discountScopeKey;
    }

    /**
     * Sets the value of the discountScopeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountScopeKey(String value) {
        this.discountScopeKey = value;
    }

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
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountScopeFilter.Filters }
     *     
     */
    public DiscountScopeFilter.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountScopeFilter.Filters }
     *     
     */
    public void setFilters(DiscountScopeFilter.Filters value) {
        this.filters = value;
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
     *         &lt;element name="filter" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice minOccurs="0">
     *                     &lt;element name="chargeTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="billTypeGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="offerTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="isExcluded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    @XmlType(name = "", propOrder = {
        "filter"
    })
    public static class Filters {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<DiscountScopeFilter.Filters.Filter> filter;

        /**
         * Gets the value of the filter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiscountScopeFilter.Filters.Filter }
         * 
         * 
         */
        public List<DiscountScopeFilter.Filters.Filter> getFilter() {
            if (filter == null) {
                filter = new ArrayList<DiscountScopeFilter.Filters.Filter>();
            }
            return this.filter;
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
         *         &lt;choice minOccurs="0">
         *           &lt;element name="chargeTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="billTypeGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="offerTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="isExcluded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "chargeTypeKey",
            "billTypeGroupKey",
            "billTypeKey",
            "offerTypeKey"
        })
        public static class Filter {

            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String chargeTypeKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String billTypeGroupKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String billTypeKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String offerTypeKey;
            @XmlAttribute(name = "isExcluded", required = true)
            protected boolean isExcluded;

            /**
             * Gets the value of the chargeTypeKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeTypeKey() {
                return chargeTypeKey;
            }

            /**
             * Sets the value of the chargeTypeKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeTypeKey(String value) {
                this.chargeTypeKey = value;
            }

            /**
             * Gets the value of the billTypeGroupKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillTypeGroupKey() {
                return billTypeGroupKey;
            }

            /**
             * Sets the value of the billTypeGroupKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillTypeGroupKey(String value) {
                this.billTypeGroupKey = value;
            }

            /**
             * Gets the value of the billTypeKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillTypeKey() {
                return billTypeKey;
            }

            /**
             * Sets the value of the billTypeKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillTypeKey(String value) {
                this.billTypeKey = value;
            }

            /**
             * Gets the value of the offerTypeKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfferTypeKey() {
                return offerTypeKey;
            }

            /**
             * Sets the value of the offerTypeKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfferTypeKey(String value) {
                this.offerTypeKey = value;
            }

            /**
             * Gets the value of the isExcluded property.
             * 
             */
            public boolean isIsExcluded() {
                return isExcluded;
            }

            /**
             * Sets the value of the isExcluded property.
             * 
             */
            public void setIsExcluded(boolean value) {
                this.isExcluded = value;
            }

        }

    }

}
