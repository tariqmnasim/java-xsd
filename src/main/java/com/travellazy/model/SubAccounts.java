
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubAccounts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPagedList">
 *       &lt;sequence>
 *         &lt;element name="subaccount" type="{http://www.travellazy.com/product/model}SubAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccounts", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "subaccount"
})
public class SubAccounts
    extends AbstractPagedList
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<SubAccount> subaccount;

    /**
     * Gets the value of the subaccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subaccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubaccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAccount }
     * 
     * 
     */
    public List<SubAccount> getSubaccount() {
        if (subaccount == null) {
            subaccount = new ArrayList<SubAccount>();
        }
        return this.subaccount;
    }

}
