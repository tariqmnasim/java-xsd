
package com.travellazy.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminationCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bindingMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gracePeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tieringLevels" type="{http://www.travellazy.com/product/model}TieringLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onceOnlyCharge" type="{http://www.travellazy.com/product/model}OnceOnlyCharge"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationCharge", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "bindingMonths",
    "gracePeriod",
    "totalAmount",
    "tieringLevels",
    "onceOnlyCharge"
})
public class TerminationCharge {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int bindingMonths;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int gracePeriod;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal totalAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<TieringLevel> tieringLevels;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected OnceOnlyCharge onceOnlyCharge;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the bindingMonths property.
     * 
     */
    public int getBindingMonths() {
        return bindingMonths;
    }

    /**
     * Sets the value of the bindingMonths property.
     * 
     */
    public void setBindingMonths(int value) {
        this.bindingMonths = value;
    }

    /**
     * Gets the value of the gracePeriod property.
     * 
     */
    public int getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Sets the value of the gracePeriod property.
     * 
     */
    public void setGracePeriod(int value) {
        this.gracePeriod = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the tieringLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tieringLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTieringLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TieringLevel }
     * 
     * 
     */
    public List<TieringLevel> getTieringLevels() {
        if (tieringLevels == null) {
            tieringLevels = new ArrayList<TieringLevel>();
        }
        return this.tieringLevels;
    }

    /**
     * Gets the value of the onceOnlyCharge property.
     * 
     * @return
     *     possible object is
     *     {@link OnceOnlyCharge }
     *     
     */
    public OnceOnlyCharge getOnceOnlyCharge() {
        return onceOnlyCharge;
    }

    /**
     * Sets the value of the onceOnlyCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnceOnlyCharge }
     *     
     */
    public void setOnceOnlyCharge(OnceOnlyCharge value) {
        this.onceOnlyCharge = value;
    }

}
