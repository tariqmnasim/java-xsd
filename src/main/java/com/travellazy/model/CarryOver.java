
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 If this element is missing, there is no carry over configuration;
 *                 If this element contains a months field, it has a carry over configured for the specified amount of
 *                 time;
 *                 If this element contains an unlimited field, it has an unlimited carry over configuration;
 *             
 * 
 * <p>Java class for CarryOver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarryOver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="unlimited">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="months" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarryOver", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "unlimited",
    "months"
})
public class CarryOver {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CarryOver.Unlimited unlimited;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer months;

    /**
     * Gets the value of the unlimited property.
     * 
     * @return
     *     possible object is
     *     {@link CarryOver.Unlimited }
     *     
     */
    public CarryOver.Unlimited getUnlimited() {
        return unlimited;
    }

    /**
     * Sets the value of the unlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarryOver.Unlimited }
     *     
     */
    public void setUnlimited(CarryOver.Unlimited value) {
        this.unlimited = value;
    }

    /**
     * Gets the value of the months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonths() {
        return months;
    }

    /**
     * Sets the value of the months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonths(Integer value) {
        this.months = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Unlimited {


    }

}
