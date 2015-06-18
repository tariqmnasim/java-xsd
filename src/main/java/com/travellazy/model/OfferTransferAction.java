
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferTransferAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTransferAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}OfferAction">
 *       &lt;sequence>
 *         &lt;element name="targetCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTransferAction", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "targetCustomerId"
})
public class OfferTransferAction
    extends OfferAction
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long targetCustomerId;

    /**
     * Gets the value of the targetCustomerId property.
     * 
     */
    public long getTargetCustomerId() {
        return targetCustomerId;
    }

    /**
     * Sets the value of the targetCustomerId property.
     * 
     */
    public void setTargetCustomerId(long value) {
        this.targetCustomerId = value;
    }

}
