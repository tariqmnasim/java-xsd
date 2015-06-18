
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferBarAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferBarAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}OfferAction">
 *       &lt;sequence>
 *         &lt;element name="barLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCollections" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferBarAction", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "barLevel",
    "reason"
})
public class OfferBarAction
    extends OfferAction
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int barLevel;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String reason;
    @XmlAttribute(name = "isCollections")
    protected Boolean isCollections;

    /**
     * Gets the value of the barLevel property.
     * 
     */
    public int getBarLevel() {
        return barLevel;
    }

    /**
     * Sets the value of the barLevel property.
     * 
     */
    public void setBarLevel(int value) {
        this.barLevel = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the isCollections property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCollections() {
        if (isCollections == null) {
            return false;
        } else {
            return isCollections;
        }
    }

    /**
     * Sets the value of the isCollections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCollections(Boolean value) {
        this.isCollections = value;
    }

}
