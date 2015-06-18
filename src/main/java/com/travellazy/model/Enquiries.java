
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enquiries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enquiries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPagedList">
 *       &lt;sequence>
 *         &lt;element name="enquiry" type="{http://www.travellazy.com/product/model}Enquiry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enquiries", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "enquiry"
})
public class Enquiries
    extends AbstractPagedList
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<Enquiry> enquiry;

    /**
     * Gets the value of the enquiry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enquiry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnquiry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Enquiry }
     * 
     * 
     */
    public List<Enquiry> getEnquiry() {
        if (enquiry == null) {
            enquiry = new ArrayList<Enquiry>();
        }
        return this.enquiry;
    }

}
