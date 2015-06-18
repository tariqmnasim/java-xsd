
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WeeklyTimeTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeeklyTimeTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profiles">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *                             &lt;element name="ranges">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="range" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="kindOfDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="startSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="endSecond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "WeeklyTimeTable", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "profiles",
    "timelineItems"
})
public class WeeklyTimeTable {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected WeeklyTimeTable.Profiles profiles;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected WeeklyTimeTable.TimelineItems timelineItems;

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
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyTimeTable.Profiles }
     *     
     */
    public WeeklyTimeTable.Profiles getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyTimeTable.Profiles }
     *     
     */
    public void setProfiles(WeeklyTimeTable.Profiles value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the timelineItems property.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyTimeTable.TimelineItems }
     *     
     */
    public WeeklyTimeTable.TimelineItems getTimelineItems() {
        return timelineItems;
    }

    /**
     * Sets the value of the timelineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyTimeTable.TimelineItems }
     *     
     */
    public void setTimelineItems(WeeklyTimeTable.TimelineItems value) {
        this.timelineItems = value;
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
     *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "profileName"
    })
    public static class Profiles {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<String> profileName;

        /**
         * Gets the value of the profileName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getProfileName() {
            if (profileName == null) {
                profileName = new ArrayList<String>();
            }
            return this.profileName;
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
     *         &lt;element name="timelineItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ranges">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="range" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="kindOfDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="startSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="endSecond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        protected List<WeeklyTimeTable.TimelineItems.TimelineItem> timelineItem;

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
         * {@link WeeklyTimeTable.TimelineItems.TimelineItem }
         * 
         * 
         */
        public List<WeeklyTimeTable.TimelineItems.TimelineItem> getTimelineItem() {
            if (timelineItem == null) {
                timelineItem = new ArrayList<WeeklyTimeTable.TimelineItems.TimelineItem>();
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
         *         &lt;element name="ranges">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="range" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="kindOfDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="startSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="endSecond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "ranges"
        })
        public static class TimelineItem {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected WeeklyTimeTable.TimelineItems.TimelineItem.Ranges ranges;

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
             * Gets the value of the ranges property.
             * 
             * @return
             *     possible object is
             *     {@link WeeklyTimeTable.TimelineItems.TimelineItem.Ranges }
             *     
             */
            public WeeklyTimeTable.TimelineItems.TimelineItem.Ranges getRanges() {
                return ranges;
            }

            /**
             * Sets the value of the ranges property.
             * 
             * @param value
             *     allowed object is
             *     {@link WeeklyTimeTable.TimelineItems.TimelineItem.Ranges }
             *     
             */
            public void setRanges(WeeklyTimeTable.TimelineItems.TimelineItem.Ranges value) {
                this.ranges = value;
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
             *         &lt;element name="range" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="kindOfDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="startSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="endSecond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "range"
            })
            public static class Ranges {

                @XmlElement(namespace = "http://www.travellazy.com/product/model")
                protected List<WeeklyTimeTable.TimelineItems.TimelineItem.Ranges.Range> range;

                /**
                 * Gets the value of the range property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the range property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRange().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link WeeklyTimeTable.TimelineItems.TimelineItem.Ranges.Range }
                 * 
                 * 
                 */
                public List<WeeklyTimeTable.TimelineItems.TimelineItem.Ranges.Range> getRange() {
                    if (range == null) {
                        range = new ArrayList<WeeklyTimeTable.TimelineItems.TimelineItem.Ranges.Range>();
                    }
                    return this.range;
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
                 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="kindOfDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="startSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="endSecond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                    "profileName",
                    "kindOfDay",
                    "startSecond",
                    "endSecond"
                })
                public static class Range {

                    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                    protected String profileName;
                    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
                    protected String kindOfDay;
                    @XmlElement(namespace = "http://www.travellazy.com/product/model")
                    protected int startSecond;
                    @XmlElement(namespace = "http://www.travellazy.com/product/model")
                    protected Integer endSecond;

                    /**
                     * Gets the value of the profileName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProfileName() {
                        return profileName;
                    }

                    /**
                     * Sets the value of the profileName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProfileName(String value) {
                        this.profileName = value;
                    }

                    /**
                     * Gets the value of the kindOfDay property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKindOfDay() {
                        return kindOfDay;
                    }

                    /**
                     * Sets the value of the kindOfDay property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKindOfDay(String value) {
                        this.kindOfDay = value;
                    }

                    /**
                     * Gets the value of the startSecond property.
                     * 
                     */
                    public int getStartSecond() {
                        return startSecond;
                    }

                    /**
                     * Sets the value of the startSecond property.
                     * 
                     */
                    public void setStartSecond(int value) {
                        this.startSecond = value;
                    }

                    /**
                     * Gets the value of the endSecond property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getEndSecond() {
                        return endSecond;
                    }

                    /**
                     * Sets the value of the endSecond property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setEndSecond(Integer value) {
                        this.endSecond = value;
                    }

                }

            }

        }

    }

}
