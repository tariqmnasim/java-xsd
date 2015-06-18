
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScriptOfferRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScriptOfferRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}OfferRule">
 *       &lt;sequence>
 *         &lt;element name="scriptKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScriptOfferRule", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "scriptKey"
})
public class ScriptOfferRule
    extends OfferRule
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String scriptKey;

    /**
     * Gets the value of the scriptKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptKey() {
        return scriptKey;
    }

    /**
     * Sets the value of the scriptKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptKey(String value) {
        this.scriptKey = value;
    }

}
