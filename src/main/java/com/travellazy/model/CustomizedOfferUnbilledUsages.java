
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizedOfferUnbilledUsages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizedOfferUnbilledUsages">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPagedList">
 *       &lt;sequence>
 *         &lt;element name="customizedOfferUnbilledUsage" type="{http://www.travellazy.com/product/model}CustomizedOfferUnbilledUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizedOfferUnbilledUsages", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "customizedOfferUnbilledUsage"
})
public class CustomizedOfferUnbilledUsages
    extends AbstractPagedList
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<CustomizedOfferUnbilledUsage> customizedOfferUnbilledUsage;

    /**
     * Gets the value of the customizedOfferUnbilledUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizedOfferUnbilledUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizedOfferUnbilledUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizedOfferUnbilledUsage }
     * 
     * 
     */
    public List<CustomizedOfferUnbilledUsage> getCustomizedOfferUnbilledUsage() {
        if (customizedOfferUnbilledUsage == null) {
            customizedOfferUnbilledUsage = new ArrayList<CustomizedOfferUnbilledUsage>();
        }
        return this.customizedOfferUnbilledUsage;
    }

}
