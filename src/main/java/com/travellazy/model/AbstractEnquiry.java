
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractEnquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEnquiry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priorityKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEnquiry", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "dueDate",
    "description",
    "priorityKey",
    "categoryKey"
})
@XmlSeeAlso({
    CreateEnquiry.class,
    Enquiry.class
})
public abstract class AbstractEnquiry {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String priorityKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String categoryKey;

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the priorityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityKey() {
        return priorityKey;
    }

    /**
     * Sets the value of the priorityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityKey(String value) {
        this.priorityKey = value;
    }

    /**
     * Gets the value of the categoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryKey() {
        return categoryKey;
    }

    /**
     * Sets the value of the categoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryKey(String value) {
        this.categoryKey = value;
    }

}
