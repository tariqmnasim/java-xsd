
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Container for a service feature group proposal. Contains attributes of an abstract feature group as well
 *                 as a list of service feature propsals.
 *             
 * 
 * <p>Java class for ServiceFeatureGroupProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeatureGroupProposal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}FeatureGroupProposal">
 *       &lt;sequence>
 *         &lt;element name="serviceFeatureProposal" type="{http://www.travellazy.com/product/model}ServiceFeatureProposal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeatureGroupProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceFeatureProposal"
})
public class ServiceFeatureGroupProposal
    extends FeatureGroupProposal
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceFeatureProposal serviceFeatureProposal;

    /**
     * Gets the value of the serviceFeatureProposal property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeatureProposal }
     *     
     */
    public ServiceFeatureProposal getServiceFeatureProposal() {
        return serviceFeatureProposal;
    }

    /**
     * Sets the value of the serviceFeatureProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeatureProposal }
     *     
     */
    public void setServiceFeatureProposal(ServiceFeatureProposal value) {
        this.serviceFeatureProposal = value;
    }

}
