
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateBusinessCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateBusinessCustomer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCreateCustomer">
 *       &lt;sequence>
 *         &lt;element name="businessCustomerAttributes" type="{http://www.travellazy.com/product/model}BusinessCustomerAttributes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateBusinessCustomer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "businessCustomerAttributes"
})
public class CreateBusinessCustomer
    extends AbstractCreateCustomer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BusinessCustomerAttributes businessCustomerAttributes;

    /**
     * Gets the value of the businessCustomerAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCustomerAttributes }
     *     
     */
    public BusinessCustomerAttributes getBusinessCustomerAttributes() {
        return businessCustomerAttributes;
    }

    /**
     * Sets the value of the businessCustomerAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCustomerAttributes }
     *     
     */
    public void setBusinessCustomerAttributes(BusinessCustomerAttributes value) {
        this.businessCustomerAttributes = value;
    }

}
