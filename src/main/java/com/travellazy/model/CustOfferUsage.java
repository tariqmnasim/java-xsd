
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Represents the sum of all detailed usage records for one bill type.
 *                 That could be the sum of all ‘International Calls’ for a mobile offer, where ‘International
 *                 Calls’ would be the bill type.
 *             
 * 
 * <p>Java class for CustOfferUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustOfferUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}ChargeBase">
 *       &lt;sequence>
 *         &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="measuringUnitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustOfferUsage", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "billTypeKey",
    "units",
    "measuringUnitKey"
})
public class CustOfferUsage
    extends ChargeBase
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String billTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long units;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String measuringUnitKey;

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
     * Gets the value of the units property.
     * 
     */
    public long getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     */
    public void setUnits(long value) {
        this.units = value;
    }

    /**
     * Gets the value of the measuringUnitKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuringUnitKey() {
        return measuringUnitKey;
    }

    /**
     * Sets the value of the measuringUnitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuringUnitKey(String value) {
        this.measuringUnitKey = value;
    }

}
