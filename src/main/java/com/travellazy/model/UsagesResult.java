
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsagesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsagesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="usageDataRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsagesResult", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "usageDataRecordId",
    "errorMessage"
})
public class UsagesResult {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long usageDataRecordId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String errorMessage;

    /**
     * Gets the value of the usageDataRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsageDataRecordId() {
        return usageDataRecordId;
    }

    /**
     * Sets the value of the usageDataRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsageDataRecordId(Long value) {
        this.usageDataRecordId = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
