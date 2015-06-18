
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A list of selectable services.
 *             
 * 
 * <p>Java class for SelectableServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectableServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectableService" type="{http://www.travellazy.com/product/model}SelectableService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectableServices", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "selectableService"
})
public class SelectableServices {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<SelectableService> selectableService;

    /**
     * Gets the value of the selectableService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectableService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectableService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectableService }
     * 
     * 
     */
    public List<SelectableService> getSelectableService() {
        if (selectableService == null) {
            selectableService = new ArrayList<SelectableService>();
        }
        return this.selectableService;
    }

}
