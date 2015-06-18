
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="createFeature" type="{http://www.travellazy.com/product/model}CreateFeature"/>
 *         &lt;element name="updateFeature" type="{http://www.travellazy.com/product/model}UpdateFeature"/>
 *         &lt;element name="deleteFeature" type="{http://www.travellazy.com/product/model}DeleteFeature"/>
 *         &lt;element name="feature" type="{http://www.travellazy.com/product/model}AbstractFeature"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatures", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "createFeatureOrUpdateFeatureOrDeleteFeature"
})
public class AbstractFeatures {

    @XmlElements({
        @XmlElement(name = "createFeature", namespace = "http://www.travellazy.com/product/model", type = CreateFeature.class),
        @XmlElement(name = "updateFeature", namespace = "http://www.travellazy.com/product/model", type = UpdateFeature.class),
        @XmlElement(name = "deleteFeature", namespace = "http://www.travellazy.com/product/model", type = DeleteFeature.class),
        @XmlElement(name = "feature", namespace = "http://www.travellazy.com/product/model")
    })
    protected List<AbstractFeature> createFeatureOrUpdateFeatureOrDeleteFeature;

    /**
     * Gets the value of the createFeatureOrUpdateFeatureOrDeleteFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createFeatureOrUpdateFeatureOrDeleteFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateFeatureOrUpdateFeatureOrDeleteFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateFeature }
     * {@link UpdateFeature }
     * {@link DeleteFeature }
     * {@link AbstractFeature }
     * 
     * 
     */
    public List<AbstractFeature> getCreateFeatureOrUpdateFeatureOrDeleteFeature() {
        if (createFeatureOrUpdateFeatureOrDeleteFeature == null) {
            createFeatureOrUpdateFeatureOrDeleteFeature = new ArrayList<AbstractFeature>();
        }
        return this.createFeatureOrUpdateFeatureOrDeleteFeature;
    }

}
