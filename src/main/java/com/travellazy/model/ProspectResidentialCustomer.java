
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProspectResidentialCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProspectResidentialCustomer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCreateCustomer">
 *       &lt;sequence>
 *         &lt;element name="residentialCustomerAttributes" type="{http://www.travellazy.com/product/model}ResidentialCustomerAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProspectResidentialCustomer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "residentialCustomerAttributes"
})
public class ProspectResidentialCustomer
    extends AbstractCreateCustomer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ResidentialCustomerAttributes residentialCustomerAttributes;

    /**
     * Gets the value of the residentialCustomerAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialCustomerAttributes }
     *     
     */
    public ResidentialCustomerAttributes getResidentialCustomerAttributes() {
        return residentialCustomerAttributes;
    }

    /**
     * Sets the value of the residentialCustomerAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialCustomerAttributes }
     *     
     */
    public void setResidentialCustomerAttributes(ResidentialCustomerAttributes value) {
        this.residentialCustomerAttributes = value;
    }

}
