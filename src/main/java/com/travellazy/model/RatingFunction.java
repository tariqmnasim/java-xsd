
package com.travellazy.model;

import java.math.BigDecimal;
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
 * <p>Java class for RatingFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="weeklyTimetableKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="profiles">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="profile" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="weeklyTimeProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="superposeModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="stepInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="segments">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="segment" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                                     &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                                     &lt;element name="connectionCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                     &lt;element name="basicCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                     &lt;element name="chargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
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
 *       &lt;attribute name="isPricedByServiceProvider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isInstanceOverridable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingFunction", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "timelineItems"
})
public class RatingFunction {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected RatingFunction.TimelineItems timelineItems;
    @XmlAttribute(name = "isPricedByServiceProvider", required = true)
    protected boolean isPricedByServiceProvider;
    @XmlAttribute(name = "isInstanceOverridable")
    protected Boolean isInstanceOverridable;

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
     * Gets the value of the timelineItems property.
     * 
     * @return
     *     possible object is
     *     {@link RatingFunction.TimelineItems }
     *     
     */
    public RatingFunction.TimelineItems getTimelineItems() {
        return timelineItems;
    }

    /**
     * Sets the value of the timelineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingFunction.TimelineItems }
     *     
     */
    public void setTimelineItems(RatingFunction.TimelineItems value) {
        this.timelineItems = value;
    }

    /**
     * Gets the value of the isPricedByServiceProvider property.
     * 
     */
    public boolean isIsPricedByServiceProvider() {
        return isPricedByServiceProvider;
    }

    /**
     * Sets the value of the isPricedByServiceProvider property.
     * 
     */
    public void setIsPricedByServiceProvider(boolean value) {
        this.isPricedByServiceProvider = value;
    }

    /**
     * Gets the value of the isInstanceOverridable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsInstanceOverridable() {
        if (isInstanceOverridable == null) {
            return false;
        } else {
            return isInstanceOverridable;
        }
    }

    /**
     * Sets the value of the isInstanceOverridable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInstanceOverridable(Boolean value) {
        this.isInstanceOverridable = value;
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
     *                   &lt;element name="weeklyTimetableKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="profiles">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="profile" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="weeklyTimeProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="superposeModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="stepInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="segments">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="segment" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                                           &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                           &lt;element name="connectionCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                           &lt;element name="basicCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                           &lt;element name="chargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
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
        protected List<RatingFunction.TimelineItems.TimelineItem> timelineItem;

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
         * {@link RatingFunction.TimelineItems.TimelineItem }
         * 
         * 
         */
        public List<RatingFunction.TimelineItems.TimelineItem> getTimelineItem() {
            if (timelineItem == null) {
                timelineItem = new ArrayList<RatingFunction.TimelineItems.TimelineItem>();
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
         *         &lt;element name="weeklyTimetableKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="profiles">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="profile" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="weeklyTimeProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="superposeModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="stepInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="segments">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="segment" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                                                 &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                                 &lt;element name="connectionCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                 &lt;element name="basicCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                 &lt;element name="chargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
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
            "weeklyTimetableKey",
            "profiles"
        })
        public static class TimelineItem {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String weeklyTimetableKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected RatingFunction.TimelineItems.TimelineItem.Profiles profiles;

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
             * Gets the value of the weeklyTimetableKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWeeklyTimetableKey() {
                return weeklyTimetableKey;
            }

            /**
             * Sets the value of the weeklyTimetableKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWeeklyTimetableKey(String value) {
                this.weeklyTimetableKey = value;
            }

            /**
             * Gets the value of the profiles property.
             * 
             * @return
             *     possible object is
             *     {@link RatingFunction.TimelineItems.TimelineItem.Profiles }
             *     
             */
            public RatingFunction.TimelineItems.TimelineItem.Profiles getProfiles() {
                return profiles;
            }

            /**
             * Sets the value of the profiles property.
             * 
             * @param value
             *     allowed object is
             *     {@link RatingFunction.TimelineItems.TimelineItem.Profiles }
             *     
             */
            public void setProfiles(RatingFunction.TimelineItems.TimelineItem.Profiles value) {
                this.profiles = value;
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
             *         &lt;element name="profile" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="weeklyTimeProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="superposeModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="stepInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="segments">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="segment" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                                       &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                                       &lt;element name="connectionCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                       &lt;element name="basicCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                       &lt;element name="chargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                                     &lt;/sequence>
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "profile"
            })
            public static class Profiles {

                @XmlElement(namespace = "http://www.travellazy.com/product/model")
                protected List<RatingFunction.TimelineItems.TimelineItem.Profiles.Profile> profile;

                /**
                 * Gets the value of the profile property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the profile property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProfile().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RatingFunction.TimelineItems.TimelineItem.Profiles.Profile }
                 * 
                 * 
                 */
                public List<RatingFunction.TimelineItems.TimelineItem.Profiles.Profile> getProfile() {
                    if (profile == null) {
                        profile = new ArrayList<RatingFunction.TimelineItems.TimelineItem.Profiles.Profile>();
                    }
                    return this.profile;
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
                 *         &lt;element name="weeklyTimeProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="superposeModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="stepInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="segments">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="segment" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *                             &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                             &lt;element name="connectionCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                             &lt;element name="basicCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                             &lt;element name="chargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "weeklyTimeProfile",
                    "superposeModeKey",
                    "stepInterval",
                    "segments"
                })
                public static class Profile {

                    @XmlElement(namespace = "http://www.travellazy.com/product/model")
                    protected String weeklyTimeProfile;
                    @XmlElement(namespace = "http://www.travellazy.com/product/model")
                    protected String superposeModeKey;
                    @XmlElement(namespace = "http://www.travellazy.com/product/model")
                    protected Integer stepInterval;
                    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                    protected RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments segments;

                    /**
                     * Gets the value of the weeklyTimeProfile property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWeeklyTimeProfile() {
                        return weeklyTimeProfile;
                    }

                    /**
                     * Sets the value of the weeklyTimeProfile property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWeeklyTimeProfile(String value) {
                        this.weeklyTimeProfile = value;
                    }

                    /**
                     * Gets the value of the superposeModeKey property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSuperposeModeKey() {
                        return superposeModeKey;
                    }

                    /**
                     * Sets the value of the superposeModeKey property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSuperposeModeKey(String value) {
                        this.superposeModeKey = value;
                    }

                    /**
                     * Gets the value of the stepInterval property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getStepInterval() {
                        return stepInterval;
                    }

                    /**
                     * Sets the value of the stepInterval property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setStepInterval(Integer value) {
                        this.stepInterval = value;
                    }

                    /**
                     * Gets the value of the segments property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments }
                     *     
                     */
                    public RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments getSegments() {
                        return segments;
                    }

                    /**
                     * Sets the value of the segments property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments }
                     *     
                     */
                    public void setSegments(RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments value) {
                        this.segments = value;
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
                     *         &lt;element name="segment" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
                     *                   &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *                   &lt;element name="connectionCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                   &lt;element name="basicCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                   &lt;element name="chargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
                        "segment"
                    })
                    public static class Segments {

                        @XmlElement(namespace = "http://www.travellazy.com/product/model")
                        protected List<RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments.Segment> segment;

                        /**
                         * Gets the value of the segment property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the segment property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSegment().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments.Segment }
                         * 
                         * 
                         */
                        public List<RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments.Segment> getSegment() {
                            if (segment == null) {
                                segment = new ArrayList<RatingFunction.TimelineItems.TimelineItem.Profiles.Profile.Segments.Segment>();
                            }
                            return this.segment;
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
                         *         &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
                         *         &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                         *         &lt;element name="connectionCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *         &lt;element name="basicCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *         &lt;element name="chargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
                            "unitsMin",
                            "unitsMax",
                            "connectionCharge",
                            "basicCharge",
                            "chargePerUnit"
                        })
                        public static class Segment {

                            @XmlElement(namespace = "http://www.travellazy.com/product/model")
                            protected long unitsMin;
                            @XmlElement(namespace = "http://www.travellazy.com/product/model")
                            protected Long unitsMax;
                            @XmlElement(namespace = "http://www.travellazy.com/product/model")
                            protected BigDecimal connectionCharge;
                            @XmlElement(namespace = "http://www.travellazy.com/product/model")
                            protected BigDecimal basicCharge;
                            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                            protected BigDecimal chargePerUnit;

                            /**
                             * Gets the value of the unitsMin property.
                             * 
                             */
                            public long getUnitsMin() {
                                return unitsMin;
                            }

                            /**
                             * Sets the value of the unitsMin property.
                             * 
                             */
                            public void setUnitsMin(long value) {
                                this.unitsMin = value;
                            }

                            /**
                             * Gets the value of the unitsMax property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Long }
                             *     
                             */
                            public Long getUnitsMax() {
                                return unitsMax;
                            }

                            /**
                             * Sets the value of the unitsMax property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Long }
                             *     
                             */
                            public void setUnitsMax(Long value) {
                                this.unitsMax = value;
                            }

                            /**
                             * Gets the value of the connectionCharge property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getConnectionCharge() {
                                return connectionCharge;
                            }

                            /**
                             * Sets the value of the connectionCharge property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setConnectionCharge(BigDecimal value) {
                                this.connectionCharge = value;
                            }

                            /**
                             * Gets the value of the basicCharge property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getBasicCharge() {
                                return basicCharge;
                            }

                            /**
                             * Sets the value of the basicCharge property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setBasicCharge(BigDecimal value) {
                                this.basicCharge = value;
                            }

                            /**
                             * Gets the value of the chargePerUnit property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getChargePerUnit() {
                                return chargePerUnit;
                            }

                            /**
                             * Sets the value of the chargePerUnit property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setChargePerUnit(BigDecimal value) {
                                this.chargePerUnit = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
