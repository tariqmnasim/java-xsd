
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A container for selected instances of a feature.
 *             
 * 
 * <p>Java class for FeatureInstances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureInstances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="featureInstance" type="{http://www.travellazy.com/product/model}FeatureInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureInstances", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "featureInstance"
})
public class FeatureInstances {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<FeatureInstance> featureInstance;

    /**
     * Gets the value of the featureInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureInstance }
     * 
     * 
     */
    public List<FeatureInstance> getFeatureInstance() {
        if (featureInstance == null) {
            featureInstance = new ArrayList<FeatureInstance>();
        }
        return this.featureInstance;
    }

}
