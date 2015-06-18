
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProspectResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProspectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prospectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProspectResponse", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "prospectId"
})
public class ProspectResponse {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long prospectId;

    /**
     * Gets the value of the prospectId property.
     * 
     */
    public long getProspectId() {
        return prospectId;
    }

    /**
     * Sets the value of the prospectId property.
     * 
     */
    public void setProspectId(long value) {
        this.prospectId = value;
    }

}
