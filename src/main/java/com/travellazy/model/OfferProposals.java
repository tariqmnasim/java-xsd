
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Contains a list of proposals for requested offers.
 *                 OfferProposals can either be a base or
 *                 bundle offer. Bundle
 *                 offer
 *                 include information about selected and available base offers and
 *                 offer features.
 *                 This includes
 *                 selected and available
 *                 service and offer
 *                 features including parameters, modification
 *                 information
 *                 and charges.
 *             
 * 
 * <p>Java class for OfferProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferProposals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerProposal" type="{http://www.travellazy.com/product/model}AbstractOfferProposal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferProposals", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerProposal"
})
public class OfferProposals {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<AbstractOfferProposal> offerProposal;

    /**
     * Gets the value of the offerProposal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerProposal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferProposal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractOfferProposal }
     * 
     * 
     */
    public List<AbstractOfferProposal> getOfferProposal() {
        if (offerProposal == null) {
            offerProposal = new ArrayList<AbstractOfferProposal>();
        }
        return this.offerProposal;
    }

}
