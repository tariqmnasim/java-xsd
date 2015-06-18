
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessCustomer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCustomer">
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
@XmlType(name = "BusinessCustomer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "businessCustomerAttributes"
})
public class BusinessCustomer
    extends AbstractCustomer
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
