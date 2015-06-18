
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPaymentDetails" type="{http://www.travellazy.com/product/model}PaymentDetailsInformation"/>
 *         &lt;element name="pendingPaymentDetails" type="{http://www.travellazy.com/product/model}PendingPaymentDetailsInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "currentPaymentDetails",
    "pendingPaymentDetails"
})
public class PaymentDetails {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected PaymentDetailsInformation currentPaymentDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected PendingPaymentDetailsInformation pendingPaymentDetails;

    /**
     * Gets the value of the currentPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsInformation }
     *     
     */
    public PaymentDetailsInformation getCurrentPaymentDetails() {
        return currentPaymentDetails;
    }

    /**
     * Sets the value of the currentPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsInformation }
     *     
     */
    public void setCurrentPaymentDetails(PaymentDetailsInformation value) {
        this.currentPaymentDetails = value;
    }

    /**
     * Gets the value of the pendingPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PendingPaymentDetailsInformation }
     *     
     */
    public PendingPaymentDetailsInformation getPendingPaymentDetails() {
        return pendingPaymentDetails;
    }

    /**
     * Sets the value of the pendingPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingPaymentDetailsInformation }
     *     
     */
    public void setPendingPaymentDetails(PendingPaymentDetailsInformation value) {
        this.pendingPaymentDetails = value;
    }

}
