
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 When importing a configuration, all the existing level commands are deleted, and then the contained
 *                 commands are saved.
 *             
 * 
 * <p>Java class for LevelCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LevelCommand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="percentageLevel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fireIfLast" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LevelCommand", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "commandKey",
    "percentageLevel"
})
public class LevelCommand {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String commandKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected double percentageLevel;
    @XmlAttribute(name = "fireIfLast", required = true)
    protected boolean fireIfLast;

    /**
     * Gets the value of the commandKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandKey() {
        return commandKey;
    }

    /**
     * Sets the value of the commandKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandKey(String value) {
        this.commandKey = value;
    }

    /**
     * Gets the value of the percentageLevel property.
     * 
     */
    public double getPercentageLevel() {
        return percentageLevel;
    }

    /**
     * Sets the value of the percentageLevel property.
     * 
     */
    public void setPercentageLevel(double value) {
        this.percentageLevel = value;
    }

    /**
     * Gets the value of the fireIfLast property.
     * 
     */
    public boolean isFireIfLast() {
        return fireIfLast;
    }

    /**
     * Sets the value of the fireIfLast property.
     * 
     */
    public void setFireIfLast(boolean value) {
        this.fireIfLast = value;
    }

}
