
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateCustomizedOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomizedOfferType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}CreateOrder">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="offerConfiguration" type="{http://www.travellazy.com/product/model}RetrieveOfferConfiguration"/>
 *           &lt;element name="baseOffer" type="{http://www.travellazy.com/product/model}CreateCustomizedBaseOffer"/>
 *           &lt;element name="bundleOffer" type="{http://www.travellazy.com/product/model}CreateCustomizedBundleOffer"/>
 *         &lt;/choice>
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="channelKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustomizedOfferType", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerConfigurationOrBaseOfferOrBundleOffer",
    "activationDate",
    "channelId",
    "channelKey",
    "operator"
})
public class CreateCustomizedOfferType
    extends CreateOrder
{

    @XmlElements({
        @XmlElement(name = "offerConfiguration", namespace = "http://www.travellazy.com/product/model", type = RetrieveOfferConfiguration.class),
        @XmlElement(name = "baseOffer", namespace = "http://www.travellazy.com/product/model", type = CreateCustomizedBaseOffer.class),
        @XmlElement(name = "bundleOffer", namespace = "http://www.travellazy.com/product/model", type = CreateCustomizedBundleOffer.class)
    })
    protected List<AbstractCreateCustomizedOffer> offerConfigurationOrBaseOfferOrBundleOffer;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long channelId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String channelKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String operator;

    /**
     * Gets the value of the offerConfigurationOrBaseOfferOrBundleOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerConfigurationOrBaseOfferOrBundleOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferConfigurationOrBaseOfferOrBundleOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveOfferConfiguration }
     * {@link CreateCustomizedBaseOffer }
     * {@link CreateCustomizedBundleOffer }
     * 
     * 
     */
    public List<AbstractCreateCustomizedOffer> getOfferConfigurationOrBaseOfferOrBundleOffer() {
        if (offerConfigurationOrBaseOfferOrBundleOffer == null) {
            offerConfigurationOrBaseOfferOrBundleOffer = new ArrayList<AbstractCreateCustomizedOffer>();
        }
        return this.offerConfigurationOrBaseOfferOrBundleOffer;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChannelId(Long value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelKey() {
        return channelKey;
    }

    /**
     * Sets the value of the channelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelKey(String value) {
        this.channelKey = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}
