
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizedBaseOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizedBaseOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCustomizedOffer">
 *       &lt;sequence>
 *         &lt;element name="parentOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceStatusKey" type="{http://www.travellazy.com/product/model}StatusType" minOccurs="0"/>
 *         &lt;element name="serviceBarLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizedBaseOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "parentOfferId",
    "serviceAccountId",
    "serviceIdentifier",
    "serviceStatusKey",
    "serviceBarLevel"
})
public class CustomizedBaseOffer
    extends AbstractCustomizedOffer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long parentOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long serviceAccountId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String serviceIdentifier;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected StatusType serviceStatusKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer serviceBarLevel;

    /**
     * Gets the value of the parentOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentOfferId() {
        return parentOfferId;
    }

    /**
     * Sets the value of the parentOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentOfferId(Long value) {
        this.parentOfferId = value;
    }

    /**
     * Gets the value of the serviceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * Sets the value of the serviceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceAccountId(Long value) {
        this.serviceAccountId = value;
    }

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifier(String value) {
        this.serviceIdentifier = value;
    }

    /**
     * Gets the value of the serviceStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getServiceStatusKey() {
        return serviceStatusKey;
    }

    /**
     * Sets the value of the serviceStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setServiceStatusKey(StatusType value) {
        this.serviceStatusKey = value;
    }

    /**
     * Gets the value of the serviceBarLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceBarLevel() {
        return serviceBarLevel;
    }

    /**
     * Sets the value of the serviceBarLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceBarLevel(Integer value) {
        this.serviceBarLevel = value;
    }

}
