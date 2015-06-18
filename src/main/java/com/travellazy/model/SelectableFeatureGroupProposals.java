
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Container for selectable feature group proposal. Contains attributes of an abstract feature group as
 *                 well as a list of selectable features.
 *             
 * 
 * <p>Java class for SelectableFeatureGroupProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectableFeatureGroupProposals">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractFeatureGroupProposal">
 *       &lt;sequence>
 *         &lt;element name="selectableFeatures" type="{http://www.travellazy.com/product/model}SelectableFeatures" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectableFeatureGroupProposals", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "selectableFeatures"
})
public class SelectableFeatureGroupProposals
    extends AbstractFeatureGroupProposal
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected SelectableFeatures selectableFeatures;

    /**
     * Gets the value of the selectableFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SelectableFeatures }
     *     
     */
    public SelectableFeatures getSelectableFeatures() {
        return selectableFeatures;
    }

    /**
     * Sets the value of the selectableFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableFeatures }
     *     
     */
    public void setSelectableFeatures(SelectableFeatures value) {
        this.selectableFeatures = value;
    }

}
