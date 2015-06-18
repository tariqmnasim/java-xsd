
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateFeatures">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}CreateOrder">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="channelKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="feature" type="{http://www.travellazy.com/product/model}AbstractFeature" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFeatures", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "channelId",
    "channelKey",
    "feature"
})
public class UpdateFeatures
    extends CreateOrder
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long channelId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String channelKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected List<AbstractFeature> feature;

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChannelId(Long value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelKey() {
        return channelKey;
    }

    /**
     * Sets the value of the channelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelKey(String value) {
        this.channelKey = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractFeature }
     * 
     * 
     */
    public List<AbstractFeature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<AbstractFeature>();
        }
        return this.feature;
    }

}
