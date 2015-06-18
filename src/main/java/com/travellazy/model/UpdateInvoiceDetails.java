
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInvoiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInvoiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractInvoiceDetails">
 *       &lt;sequence>
 *         &lt;element name="futureBillCycleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInvoiceDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "futureBillCycleId"
})
public class UpdateInvoiceDetails
    extends AbstractInvoiceDetails
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long futureBillCycleId;

    /**
     * Gets the value of the futureBillCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFutureBillCycleId() {
        return futureBillCycleId;
    }

    /**
     * Sets the value of the futureBillCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFutureBillCycleId(Long value) {
        this.futureBillCycleId = value;
    }

}
