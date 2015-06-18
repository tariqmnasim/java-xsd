
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Enquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enquiry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractEnquiry">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="creatorOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assignedOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="closeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="typeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolutionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolutionTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enquiry", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "id",
    "creatorOperator",
    "assignedOperator",
    "creationDate",
    "closeDate",
    "typeKey",
    "resolutionDescription",
    "resolutionTypeKey",
    "statusKey"
})
public class Enquiry
    extends AbstractEnquiry
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long id;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String creatorOperator;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String assignedOperator;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String typeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String resolutionDescription;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String resolutionTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String statusKey;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the creatorOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorOperator() {
        return creatorOperator;
    }

    /**
     * Sets the value of the creatorOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorOperator(String value) {
        this.creatorOperator = value;
    }

    /**
     * Gets the value of the assignedOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedOperator() {
        return assignedOperator;
    }

    /**
     * Sets the value of the assignedOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedOperator(String value) {
        this.assignedOperator = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Gets the value of the typeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * Sets the value of the typeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeKey(String value) {
        this.typeKey = value;
    }

    /**
     * Gets the value of the resolutionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionDescription() {
        return resolutionDescription;
    }

    /**
     * Sets the value of the resolutionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionDescription(String value) {
        this.resolutionDescription = value;
    }

    /**
     * Gets the value of the resolutionTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionTypeKey() {
        return resolutionTypeKey;
    }

    /**
     * Sets the value of the resolutionTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionTypeKey(String value) {
        this.resolutionTypeKey = value;
    }

    /**
     * Gets the value of the statusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusKey() {
        return statusKey;
    }

    /**
     * Sets the value of the statusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusKey(String value) {
        this.statusKey = value;
    }

}
