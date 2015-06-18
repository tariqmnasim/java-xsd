
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Attributes of an instalment charge.
 *             
 * 
 * <p>Java class for InstalmentChargeProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalmentChargeProposal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCharge">
 *       &lt;sequence>
 *         &lt;element name="frequencyMonths" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payRemainderOnTermination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initialPayments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfPayments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfPaymentsToMake" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalmentChargeProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "frequencyMonths",
    "payRemainderOnTermination",
    "initialPayments",
    "numberOfPayments",
    "numberOfPaymentsToMake"
})
public class InstalmentChargeProposal
    extends AbstractCharge
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long frequencyMonths;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean payRemainderOnTermination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int initialPayments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int numberOfPayments;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer numberOfPaymentsToMake;

    /**
     * Gets the value of the frequencyMonths property.
     * 
     */
    public long getFrequencyMonths() {
        return frequencyMonths;
    }

    /**
     * Sets the value of the frequencyMonths property.
     * 
     */
    public void setFrequencyMonths(long value) {
        this.frequencyMonths = value;
    }

    /**
     * Gets the value of the payRemainderOnTermination property.
     * 
     */
    public boolean isPayRemainderOnTermination() {
        return payRemainderOnTermination;
    }

    /**
     * Sets the value of the payRemainderOnTermination property.
     * 
     */
    public void setPayRemainderOnTermination(boolean value) {
        this.payRemainderOnTermination = value;
    }

    /**
     * Gets the value of the initialPayments property.
     * 
     */
    public int getInitialPayments() {
        return initialPayments;
    }

    /**
     * Sets the value of the initialPayments property.
     * 
     */
    public void setInitialPayments(int value) {
        this.initialPayments = value;
    }

    /**
     * Gets the value of the numberOfPayments property.
     * 
     */
    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * Sets the value of the numberOfPayments property.
     * 
     */
    public void setNumberOfPayments(int value) {
        this.numberOfPayments = value;
    }

    /**
     * Gets the value of the numberOfPaymentsToMake property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPaymentsToMake() {
        return numberOfPaymentsToMake;
    }

    /**
     * Sets the value of the numberOfPaymentsToMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPaymentsToMake(Integer value) {
        this.numberOfPaymentsToMake = value;
    }

}
