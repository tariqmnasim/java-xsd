
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnbilledUsages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbilledUsages">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPagedList">
 *       &lt;sequence>
 *         &lt;element name="unbilledUsage" type="{http://www.travellazy.com/product/model}UnbilledUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbilledUsages", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "unbilledUsage"
})
public class UnbilledUsages
    extends AbstractPagedList
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<UnbilledUsage> unbilledUsage;

    /**
     * Gets the value of the unbilledUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unbilledUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbilledUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnbilledUsage }
     * 
     * 
     */
    public List<UnbilledUsage> getUnbilledUsage() {
        if (unbilledUsage == null) {
            unbilledUsage = new ArrayList<UnbilledUsage>();
        }
        return this.unbilledUsage;
    }

}
