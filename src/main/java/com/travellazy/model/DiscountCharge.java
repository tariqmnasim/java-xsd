
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DiscountCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequencyMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceScopeAttributeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timelineItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="timelineItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="sourceScopes">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="targetScopes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="discountTiering">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="tieringLevels">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tieringLevel" type="{http://www.travellazy.com/product/model}TieringLevel" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="isIncremental" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
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
 *       &lt;attribute name="isOperatorAssignable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountCharge", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "discountTypeKey",
    "frequencyMonths",
    "sourceScopeAttributeKey",
    "timelineItems"
})
public class DiscountCharge {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String discountTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int frequencyMonths;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String sourceScopeAttributeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected DiscountCharge.TimelineItems timelineItems;
    @XmlAttribute(name = "isOperatorAssignable", required = true)
    protected boolean isOperatorAssignable;

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
     * Gets the value of the discountTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountTypeKey() {
        return discountTypeKey;
    }

    /**
     * Sets the value of the discountTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountTypeKey(String value) {
        this.discountTypeKey = value;
    }

    /**
     * Gets the value of the frequencyMonths property.
     * 
     */
    public int getFrequencyMonths() {
        return frequencyMonths;
    }

    /**
     * Sets the value of the frequencyMonths property.
     * 
     */
    public void setFrequencyMonths(int value) {
        this.frequencyMonths = value;
    }

    /**
     * Gets the value of the sourceScopeAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceScopeAttributeKey() {
        return sourceScopeAttributeKey;
    }

    /**
     * Sets the value of the sourceScopeAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceScopeAttributeKey(String value) {
        this.sourceScopeAttributeKey = value;
    }

    /**
     * Gets the value of the timelineItems property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCharge.TimelineItems }
     *     
     */
    public DiscountCharge.TimelineItems getTimelineItems() {
        return timelineItems;
    }

    /**
     * Sets the value of the timelineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCharge.TimelineItems }
     *     
     */
    public void setTimelineItems(DiscountCharge.TimelineItems value) {
        this.timelineItems = value;
    }

    /**
     * Gets the value of the isOperatorAssignable property.
     * 
     */
    public boolean isIsOperatorAssignable() {
        return isOperatorAssignable;
    }

    /**
     * Sets the value of the isOperatorAssignable property.
     * 
     */
    public void setIsOperatorAssignable(boolean value) {
        this.isOperatorAssignable = value;
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
     *         &lt;element name="timelineItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="sourceScopes">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="targetScopes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="discountTiering">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="tieringLevels">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tieringLevel" type="{http://www.travellazy.com/product/model}TieringLevel" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="isIncremental" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    @XmlType(name = "", propOrder = {
        "timelineItem"
    })
    public static class TimelineItems {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<DiscountCharge.TimelineItems.TimelineItem> timelineItem;

        /**
         * Gets the value of the timelineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timelineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimelineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiscountCharge.TimelineItems.TimelineItem }
         * 
         * 
         */
        public List<DiscountCharge.TimelineItems.TimelineItem> getTimelineItem() {
            if (timelineItem == null) {
                timelineItem = new ArrayList<DiscountCharge.TimelineItems.TimelineItem>();
            }
            return this.timelineItem;
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
         *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="sourceScopes">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="targetScopes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="discountTiering">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="tieringLevels">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tieringLevel" type="{http://www.travellazy.com/product/model}TieringLevel" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="isIncremental" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "activation",
            "termination",
            "sourceScopes",
            "targetScopes",
            "discountTiering"
        })
        public static class TimelineItem {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected DiscountCharge.TimelineItems.TimelineItem.SourceScopes sourceScopes;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected DiscountCharge.TimelineItems.TimelineItem.TargetScopes targetScopes;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected DiscountCharge.TimelineItems.TimelineItem.DiscountTiering discountTiering;

            /**
             * Gets the value of the activation property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getActivation() {
                return activation;
            }

            /**
             * Sets the value of the activation property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setActivation(XMLGregorianCalendar value) {
                this.activation = value;
            }

            /**
             * Gets the value of the termination property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTermination() {
                return termination;
            }

            /**
             * Sets the value of the termination property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTermination(XMLGregorianCalendar value) {
                this.termination = value;
            }

            /**
             * Gets the value of the sourceScopes property.
             * 
             * @return
             *     possible object is
             *     {@link DiscountCharge.TimelineItems.TimelineItem.SourceScopes }
             *     
             */
            public DiscountCharge.TimelineItems.TimelineItem.SourceScopes getSourceScopes() {
                return sourceScopes;
            }

            /**
             * Sets the value of the sourceScopes property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiscountCharge.TimelineItems.TimelineItem.SourceScopes }
             *     
             */
            public void setSourceScopes(DiscountCharge.TimelineItems.TimelineItem.SourceScopes value) {
                this.sourceScopes = value;
            }

            /**
             * Gets the value of the targetScopes property.
             * 
             * @return
             *     possible object is
             *     {@link DiscountCharge.TimelineItems.TimelineItem.TargetScopes }
             *     
             */
            public DiscountCharge.TimelineItems.TimelineItem.TargetScopes getTargetScopes() {
                return targetScopes;
            }

            /**
             * Sets the value of the targetScopes property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiscountCharge.TimelineItems.TimelineItem.TargetScopes }
             *     
             */
            public void setTargetScopes(DiscountCharge.TimelineItems.TimelineItem.TargetScopes value) {
                this.targetScopes = value;
            }

            /**
             * Gets the value of the discountTiering property.
             * 
             * @return
             *     possible object is
             *     {@link DiscountCharge.TimelineItems.TimelineItem.DiscountTiering }
             *     
             */
            public DiscountCharge.TimelineItems.TimelineItem.DiscountTiering getDiscountTiering() {
                return discountTiering;
            }

            /**
             * Sets the value of the discountTiering property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiscountCharge.TimelineItems.TimelineItem.DiscountTiering }
             *     
             */
            public void setDiscountTiering(DiscountCharge.TimelineItems.TimelineItem.DiscountTiering value) {
                this.discountTiering = value;
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
             *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="tieringLevels">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tieringLevel" type="{http://www.travellazy.com/product/model}TieringLevel" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="isIncremental" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "key",
                "tieringLevels"
            })
            public static class DiscountTiering {

                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected String key;
                @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                protected DiscountCharge.TimelineItems.TimelineItem.DiscountTiering.TieringLevels tieringLevels;
                @XmlAttribute(name = "isIncremental", required = true)
                protected boolean isIncremental;

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
                 * Gets the value of the tieringLevels property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DiscountCharge.TimelineItems.TimelineItem.DiscountTiering.TieringLevels }
                 *     
                 */
                public DiscountCharge.TimelineItems.TimelineItem.DiscountTiering.TieringLevels getTieringLevels() {
                    return tieringLevels;
                }

                /**
                 * Sets the value of the tieringLevels property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DiscountCharge.TimelineItems.TimelineItem.DiscountTiering.TieringLevels }
                 *     
                 */
                public void setTieringLevels(DiscountCharge.TimelineItems.TimelineItem.DiscountTiering.TieringLevels value) {
                    this.tieringLevels = value;
                }

                /**
                 * Gets the value of the isIncremental property.
                 * 
                 */
                public boolean isIsIncremental() {
                    return isIncremental;
                }

                /**
                 * Sets the value of the isIncremental property.
                 * 
                 */
                public void setIsIncremental(boolean value) {
                    this.isIncremental = value;
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
                 *         &lt;element name="tieringLevel" type="{http://www.travellazy.com/product/model}TieringLevel" maxOccurs="unbounded" minOccurs="0"/>
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
                    "tieringLevel"
                })
                public static class TieringLevels {

                    @XmlElement(namespace = "http://www.travellazy.com/product/model")
                    protected List<TieringLevel> tieringLevel;

                    /**
                     * Gets the value of the tieringLevel property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the tieringLevel property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTieringLevel().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TieringLevel }
                     * 
                     * 
                     */
                    public List<TieringLevel> getTieringLevel() {
                        if (tieringLevel == null) {
                            tieringLevel = new ArrayList<TieringLevel>();
                        }
                        return this.tieringLevel;
                    }

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
             *         &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "discountScopeFilterKey"
            })
            public static class SourceScopes {

                @XmlElement(namespace = "http://www.travellazy.com/product/model")
                protected List<String> discountScopeFilterKey;

                /**
                 * Gets the value of the discountScopeFilterKey property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the discountScopeFilterKey property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDiscountScopeFilterKey().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getDiscountScopeFilterKey() {
                    if (discountScopeFilterKey == null) {
                        discountScopeFilterKey = new ArrayList<String>();
                    }
                    return this.discountScopeFilterKey;
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
             *         &lt;element name="discountScopeFilterKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "discountScopeFilterKey"
            })
            public static class TargetScopes {

                @XmlElement(namespace = "http://www.travellazy.com/product/model")
                protected List<String> discountScopeFilterKey;

                /**
                 * Gets the value of the discountScopeFilterKey property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the discountScopeFilterKey property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDiscountScopeFilterKey().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getDiscountScopeFilterKey() {
                    if (discountScopeFilterKey == null) {
                        discountScopeFilterKey = new ArrayList<String>();
                    }
                    return this.discountScopeFilterKey;
                }

            }

        }

    }

}
