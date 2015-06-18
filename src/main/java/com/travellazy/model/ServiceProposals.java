
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Container for service proposals.
 *             
 * 
 * <p>Java class for ServiceProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProposals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceProposal" type="{http://www.travellazy.com/product/model}ServiceProposal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProposals", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceProposal"
})
public class ServiceProposals {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<ServiceProposal> serviceProposal;

    /**
     * Gets the value of the serviceProposal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProposal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProposal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProposal }
     * 
     * 
     */
    public List<ServiceProposal> getServiceProposal() {
        if (serviceProposal == null) {
            serviceProposal = new ArrayList<ServiceProposal>();
        }
        return this.serviceProposal;
    }

}
