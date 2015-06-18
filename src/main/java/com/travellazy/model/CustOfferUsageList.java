
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A list of all bill types, along with their usage sums.
 *             
 * 
 * <p>Java class for CustOfferUsageList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustOfferUsageList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageSumPerBillType" type="{http://www.travellazy.com/product/model}CustOfferUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustOfferUsageList", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "usageSumPerBillType"
})
public class CustOfferUsageList {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<CustOfferUsage> usageSumPerBillType;

    /**
     * Gets the value of the usageSumPerBillType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageSumPerBillType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageSumPerBillType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustOfferUsage }
     * 
     * 
     */
    public List<CustOfferUsage> getUsageSumPerBillType() {
        if (usageSumPerBillType == null) {
            usageSumPerBillType = new ArrayList<CustOfferUsage>();
        }
        return this.usageSumPerBillType;
    }

}
