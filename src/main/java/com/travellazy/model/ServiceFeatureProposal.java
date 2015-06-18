
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A service feature proposal. Can have parameters.
 *             
 * 
 * <p>Java class for ServiceFeatureProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeatureProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://www.travellazy.com/product/model}ParameterProposals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeatureProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "parameters"
})
public class ServiceFeatureProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ParameterProposals parameters;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterProposals }
     *     
     */
    public ParameterProposals getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterProposals }
     *     
     */
    public void setParameters(ParameterProposals value) {
        this.parameters = value;
    }

}
