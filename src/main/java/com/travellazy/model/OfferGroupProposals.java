
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Contains a list of offer groups including
 *                 information about selectable base
 *                 offers and
 *                 selected base offer
 *                 instances.
 *             
 * 
 * <p>Java class for OfferGroupProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGroupProposals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerGroup" type="{http://www.travellazy.com/product/model}OfferGroupProposal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGroupProposals", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerGroup"
})
public class OfferGroupProposals {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<OfferGroupProposal> offerGroup;

    /**
     * Gets the value of the offerGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferGroupProposal }
     * 
     * 
     */
    public List<OfferGroupProposal> getOfferGroup() {
        if (offerGroup == null) {
            offerGroup = new ArrayList<OfferGroupProposal>();
        }
        return this.offerGroup;
    }

}
