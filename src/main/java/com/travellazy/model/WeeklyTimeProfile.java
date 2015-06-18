
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeeklyTimeProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeeklyTimeProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weeklyTimetableKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weeklyTimeProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyTimeProfile", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "weeklyTimetableKey",
    "weeklyTimeProfile"
})
public class WeeklyTimeProfile {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String weeklyTimetableKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String weeklyTimeProfile;

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

}
