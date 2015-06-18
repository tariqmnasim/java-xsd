
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BilledUsages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilledUsages">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPagedList">
 *       &lt;sequence>
 *         &lt;element name="billedUsage" type="{http://www.travellazy.com/product/model}BilledUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilledUsages", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "billedUsage"
})
public class BilledUsages
    extends AbstractPagedList
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<BilledUsage> billedUsage;

    /**
     * Gets the value of the billedUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billedUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilledUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilledUsage }
     * 
     * 
     */
    public List<BilledUsage> getBilledUsage() {
        if (billedUsage == null) {
            billedUsage = new ArrayList<BilledUsage>();
        }
        return this.billedUsage;
    }

}
