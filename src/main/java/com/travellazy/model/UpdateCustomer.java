
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="businessCustomerAttributes" type="{http://www.travellazy.com/product/model}BusinessCustomerAttributes"/>
 *           &lt;element name="residentialCustomerAttributes" type="{http://www.travellazy.com/product/model}ResidentialCustomerAttributes"/>
 *           &lt;element name="customerAttributes" type="{http://www.travellazy.com/product/model}CustomerAttributes"/>
 *         &lt;/choice>
 *         &lt;element name="additionalDetails" type="{http://www.travellazy.com/product/model}AdditionalDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustomer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "businessCustomerAttributes",
    "residentialCustomerAttributes",
    "customerAttributes",
    "additionalDetails"
})
public class UpdateCustomer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BusinessCustomerAttributes businessCustomerAttributes;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ResidentialCustomerAttributes residentialCustomerAttributes;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CustomerAttributes customerAttributes;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AdditionalDetails additionalDetails;

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

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetails }
     *     
     */
    public AdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetails }
     *     
     */
    public void setAdditionalDetails(AdditionalDetails value) {
        this.additionalDetails = value;
    }

}
