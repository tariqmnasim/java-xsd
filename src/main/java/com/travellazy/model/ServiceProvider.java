
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{http://www.travellazy.com/product/model}ServiceProviderAccount"/>
 *         &lt;element name="mediationFeeds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mediationFeed" type="{http://www.travellazy.com/product/model}MediationFeed" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProvider", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "account",
    "mediationFeeds"
})
public class ServiceProvider {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected ServiceProviderAccount account;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceProvider.MediationFeeds mediationFeeds;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderAccount }
     *     
     */
    public ServiceProviderAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderAccount }
     *     
     */
    public void setAccount(ServiceProviderAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the mediationFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProvider.MediationFeeds }
     *     
     */
    public ServiceProvider.MediationFeeds getMediationFeeds() {
        return mediationFeeds;
    }

    /**
     * Sets the value of the mediationFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProvider.MediationFeeds }
     *     
     */
    public void setMediationFeeds(ServiceProvider.MediationFeeds value) {
        this.mediationFeeds = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mediationFeed" type="{http://www.travellazy.com/product/model}MediationFeed" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mediationFeed"
    })
    public static class MediationFeeds {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<MediationFeed> mediationFeed;

        /**
         * Gets the value of the mediationFeed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mediationFeed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMediationFeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediationFeed }
         * 
         * 
         */
        public List<MediationFeed> getMediationFeed() {
            if (mediationFeed == null) {
                mediationFeed = new ArrayList<MediationFeed>();
            }
            return this.mediationFeed;
        }

    }

}
