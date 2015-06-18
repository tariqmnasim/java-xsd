
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MediationEventReferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediationEventReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mediationEventReference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mediationFeedKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="mediationEventKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="isIntercarrierBilling" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "MediationEventReferences", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "mediationEventReference"
})
public class MediationEventReferences {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<MediationEventReferences.MediationEventReference> mediationEventReference;

    /**
     * Gets the value of the mediationEventReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediationEventReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediationEventReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediationEventReferences.MediationEventReference }
     * 
     * 
     */
    public List<MediationEventReferences.MediationEventReference> getMediationEventReference() {
        if (mediationEventReference == null) {
            mediationEventReference = new ArrayList<MediationEventReferences.MediationEventReference>();
        }
        return this.mediationEventReference;
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
     *         &lt;element name="mediationFeedKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="mediationEventKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="isIntercarrierBilling" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mediationFeedKey",
        "mediationEventKey",
        "activation",
        "termination"
    })
    public static class MediationEventReference {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String mediationFeedKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String mediationEventKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar activation;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar termination;
        @XmlAttribute(name = "isIntercarrierBilling", required = true)
        protected boolean isIntercarrierBilling;

        /**
         * Gets the value of the mediationFeedKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMediationFeedKey() {
            return mediationFeedKey;
        }

        /**
         * Sets the value of the mediationFeedKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMediationFeedKey(String value) {
            this.mediationFeedKey = value;
        }

        /**
         * Gets the value of the mediationEventKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMediationEventKey() {
            return mediationEventKey;
        }

        /**
         * Sets the value of the mediationEventKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMediationEventKey(String value) {
            this.mediationEventKey = value;
        }

        /**
         * Gets the value of the activation property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActivation() {
            return activation;
        }

        /**
         * Sets the value of the activation property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActivation(XMLGregorianCalendar value) {
            this.activation = value;
        }

        /**
         * Gets the value of the termination property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTermination() {
            return termination;
        }

        /**
         * Sets the value of the termination property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTermination(XMLGregorianCalendar value) {
            this.termination = value;
        }

        /**
         * Gets the value of the isIntercarrierBilling property.
         * 
         */
        public boolean isIsIntercarrierBilling() {
            return isIntercarrierBilling;
        }

        /**
         * Sets the value of the isIntercarrierBilling property.
         * 
         */
        public void setIsIntercarrierBilling(boolean value) {
            this.isIntercarrierBilling = value;
        }

    }

}
