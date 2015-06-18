
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Contains a list of selected base offers with
 *                 selected and available offer
 *                 features, services
 *                 and service
 *                 features
 *                 including parameters, modification information and charges.
 *             
 * 
 * <p>Java class for BaseOfferProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseOfferProposals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseOffer" type="{http://www.travellazy.com/product/model}BaseOfferProposal" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseOfferProposals", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "baseOffer"
})
public class BaseOfferProposals {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected List<BaseOfferProposal> baseOffer;

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
     * {@link BaseOfferProposal }
     * 
     * 
     */
    public List<BaseOfferProposal> getBaseOffer() {
        if (baseOffer == null) {
            baseOffer = new ArrayList<BaseOfferProposal>();
        }
        return this.baseOffer;
    }

}
