
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A base offer proposal is a selected and available
 *                 offer features,
 *                 services and service
 *                 features
 *                 including
 *                 parameters,
 *                 modification information and charges.
 *             
 * 
 * <p>Java class for BaseOfferProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseOfferProposal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractOfferProposal">
 *       &lt;sequence>
 *         &lt;element name="serviceProposals" type="{http://www.travellazy.com/product/model}ServiceProposals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseOfferProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceProposals"
})
@XmlSeeAlso({
    TerminatedBaseOfferProposal.class
})
public class BaseOfferProposal
    extends AbstractOfferProposal
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceProposals serviceProposals;

    /**
     * Gets the value of the serviceProposals property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProposals }
     *     
     */
    public ServiceProposals getServiceProposals() {
        return serviceProposals;
    }

    /**
     * Sets the value of the serviceProposals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProposals }
     *     
     */
    public void setServiceProposals(ServiceProposals value) {
        this.serviceProposals = value;
    }

}
