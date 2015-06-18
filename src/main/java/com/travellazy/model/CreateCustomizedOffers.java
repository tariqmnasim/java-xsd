
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustomizedOffers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomizedOffers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="customizedOffer" type="{http://www.travellazy.com/product/model}AbstractCreateCustomizedOffer"/>
 *         &lt;element name="offerConfiguration" type="{http://www.travellazy.com/product/model}RetrieveOfferConfiguration"/>
 *         &lt;element name="baseOffer" type="{http://www.travellazy.com/product/model}CreateCustomizedBaseOffer"/>
 *         &lt;element name="bundleOffer" type="{http://www.travellazy.com/product/model}CreateCustomizedBundleOffer"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustomizedOffers", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "customizedOfferOrOfferConfigurationOrBaseOffer"
})
public class CreateCustomizedOffers {

    @XmlElements({
        @XmlElement(name = "customizedOffer", namespace = "http://www.travellazy.com/product/model"),
        @XmlElement(name = "offerConfiguration", namespace = "http://www.travellazy.com/product/model", type = RetrieveOfferConfiguration.class),
        @XmlElement(name = "baseOffer", namespace = "http://www.travellazy.com/product/model", type = CreateCustomizedBaseOffer.class),
        @XmlElement(name = "bundleOffer", namespace = "http://www.travellazy.com/product/model", type = CreateCustomizedBundleOffer.class)
    })
    protected List<AbstractCreateCustomizedOffer> customizedOfferOrOfferConfigurationOrBaseOffer;

    /**
     * Gets the value of the customizedOfferOrOfferConfigurationOrBaseOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizedOfferOrOfferConfigurationOrBaseOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizedOfferOrOfferConfigurationOrBaseOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCreateCustomizedOffer }
     * {@link RetrieveOfferConfiguration }
     * {@link CreateCustomizedBaseOffer }
     * {@link CreateCustomizedBundleOffer }
     * 
     * 
     */
    public List<AbstractCreateCustomizedOffer> getCustomizedOfferOrOfferConfigurationOrBaseOffer() {
        if (customizedOfferOrOfferConfigurationOrBaseOffer == null) {
            customizedOfferOrOfferConfigurationOrBaseOffer = new ArrayList<AbstractCreateCustomizedOffer>();
        }
        return this.customizedOfferOrOfferConfigurationOrBaseOffer;
    }

}
