
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyExchangeRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyExchangeRates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyExchangeRate" type="{http://www.travellazy.com/product/model}CurrencyExchangeRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeRates", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "currencyExchangeRate"
})
public class CurrencyExchangeRates {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<CurrencyExchangeRate> currencyExchangeRate;

    /**
     * Gets the value of the currencyExchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyExchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyExchangeRate }
     * 
     * 
     */
    public List<CurrencyExchangeRate> getCurrencyExchangeRate() {
        if (currencyExchangeRate == null) {
            currencyExchangeRate = new ArrayList<CurrencyExchangeRate>();
        }
        return this.currencyExchangeRate;
    }

}
