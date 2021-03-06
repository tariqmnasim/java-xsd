
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCreateCustomer">
 *       &lt;sequence>
 *         &lt;element name="customerTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAttributes" type="{http://www.travellazy.com/product/model}CustomerAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustomer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "customerTypeKey",
    "customerAttributes"
})
public class CreateCustomer
    extends AbstractCreateCustomer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String customerTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CustomerAttributes customerAttributes;

    /**
     * Gets the value of the customerTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeKey() {
        return customerTypeKey;
    }

    /**
     * Sets the value of the customerTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeKey(String value) {
        this.customerTypeKey = value;
    }

    /**
     * Gets the value of the customerAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAttributes }
     *     
     */
    public CustomerAttributes getCustomerAttributes() {
        return customerAttributes;
    }

    /**
     * Sets the value of the customerAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAttributes }
     *     
     */
    public void setCustomerAttributes(CustomerAttributes value) {
        this.customerAttributes = value;
    }

}
