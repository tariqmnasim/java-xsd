
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Attributes of a recurring charge.
 *             
 * 
 * <p>Java class for RecurringChargeProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringChargeProposal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCharge">
 *       &lt;sequence>
 *         &lt;element name="paymentFrequencyMonths" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="chargeInAdvanceMonths" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringChargeProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "paymentFrequencyMonths",
    "chargeInAdvanceMonths"
})
public class RecurringChargeProposal
    extends AbstractCharge
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long paymentFrequencyMonths;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long chargeInAdvanceMonths;

    /**
     * Gets the value of the paymentFrequencyMonths property.
     * 
     */
    public long getPaymentFrequencyMonths() {
        return paymentFrequencyMonths;
    }

    /**
     * Sets the value of the paymentFrequencyMonths property.
     * 
     */
    public void setPaymentFrequencyMonths(long value) {
        this.paymentFrequencyMonths = value;
    }

    /**
     * Gets the value of the chargeInAdvanceMonths property.
     * 
     */
    public long getChargeInAdvanceMonths() {
        return chargeInAdvanceMonths;
    }

    /**
     * Sets the value of the chargeInAdvanceMonths property.
     * 
     */
    public void setChargeInAdvanceMonths(long value) {
        this.chargeInAdvanceMonths = value;
    }

}
