
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 One particular balance and its history entries.
 *             
 * 
 * <p>Java class for BalanceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractBalance">
 *       &lt;sequence>
 *         &lt;element name="transactions" type="{http://www.travellazy.com/product/model}BalanceTransactionList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "transactions"
})
public class BalanceDetails
    extends AbstractBalance
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BalanceTransactionList transactions;

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransactionList }
     *     
     */
    public BalanceTransactionList getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransactionList }
     *     
     */
    public void setTransactions(BalanceTransactionList value) {
        this.transactions = value;
    }

}
