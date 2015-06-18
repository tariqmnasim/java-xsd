
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Container for a a list of feature group proposals.
 *             
 * 
 * <p>Java class for FeatureGroupProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureGroupProposals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="featureGroup" type="{http://www.travellazy.com/product/model}FeatureGroupProposal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureGroupProposals", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "featureGroup"
})
public class FeatureGroupProposals {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<FeatureGroupProposal> featureGroup;

    /**
     * Gets the value of the featureGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureGroupProposal }
     * 
     * 
     */
    public List<FeatureGroupProposal> getFeatureGroup() {
        if (featureGroup == null) {
            featureGroup = new ArrayList<FeatureGroupProposal>();
        }
        return this.featureGroup;
    }

}
