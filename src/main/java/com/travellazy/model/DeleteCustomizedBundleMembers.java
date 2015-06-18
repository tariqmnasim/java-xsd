
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCustomizedBundleMembers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCustomizedBundleMembers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseOffer" type="{http://www.travellazy.com/product/model}DeleteBundleMember" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCustomizedBundleMembers", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "baseOffer"
})
public class DeleteCustomizedBundleMembers {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected List<DeleteBundleMember> baseOffer;

    /**
     * Gets the value of the baseOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteBundleMember }
     * 
     * 
     */
    public List<DeleteBundleMember> getBaseOffer() {
        if (baseOffer == null) {
            baseOffer = new ArrayList<DeleteBundleMember>();
        }
        return this.baseOffer;
    }

}
