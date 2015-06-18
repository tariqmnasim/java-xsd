
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateContactDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractContactDetails">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.travellazy.com/product/model}CreateAddress"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContactDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "address"
})
public class CreateContactDetails
    extends AbstractContactDetails
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected CreateAddress address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAddress }
     *     
     */
    public CreateAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAddress }
     *     
     */
    public void setAddress(CreateAddress value) {
        this.address = value;
    }

}
