
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A Bundle offer proposal includes information about
 *                 selected,
 *                 terminated and available base
 *                 offers and offer
 *                 features
 *                 including parameters, modification information and charges.
 *             
 * 
 * <p>Java class for BundleOfferProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleOfferProposal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractOfferProposal">
 *       &lt;sequence>
 *         &lt;element name="offerGroups" type="{http://www.travellazy.com/product/model}OfferGroupProposals"/>
 *         &lt;element name="terminatedBaseOfferProposals" type="{http://www.travellazy.com/product/model}TerminatedBaseOfferProposal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleOfferProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerGroups",
    "terminatedBaseOfferProposals"
})
public class BundleOfferProposal
    extends AbstractOfferProposal
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected OfferGroupProposals offerGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<TerminatedBaseOfferProposal> terminatedBaseOfferProposals;

    /**
     * Gets the value of the offerGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OfferGroupProposals }
     *     
     */
    public OfferGroupProposals getOfferGroups() {
        return offerGroups;
    }

    /**
     * Sets the value of the offerGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferGroupProposals }
     *     
     */
    public void setOfferGroups(OfferGroupProposals value) {
        this.offerGroups = value;
    }

    /**
     * Gets the value of the terminatedBaseOfferProposals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminatedBaseOfferProposals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminatedBaseOfferProposals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminatedBaseOfferProposal }
     * 
     * 
     */
    public List<TerminatedBaseOfferProposal> getTerminatedBaseOfferProposals() {
        if (terminatedBaseOfferProposals == null) {
            terminatedBaseOfferProposals = new ArrayList<TerminatedBaseOfferProposal>();
        }
        return this.terminatedBaseOfferProposals;
    }

}
