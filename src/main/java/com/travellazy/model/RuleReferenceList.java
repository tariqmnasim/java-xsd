
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RuleReferenceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleReferenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleReference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ruleTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ruleKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "RuleReferenceList", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "ruleReference"
})
public class RuleReferenceList {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<RuleReferenceList.RuleReference> ruleReference;

    /**
     * Gets the value of the ruleReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleReferenceList.RuleReference }
     * 
     * 
     */
    public List<RuleReferenceList.RuleReference> getRuleReference() {
        if (ruleReference == null) {
            ruleReference = new ArrayList<RuleReferenceList.RuleReference>();
        }
        return this.ruleReference;
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
     *         &lt;element name="ruleTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ruleKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "ruleTypeKey",
        "ruleKey",
        "activation",
        "termination"
    })
    public static class RuleReference {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String ruleTypeKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String ruleKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar activation;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar termination;

        /**
         * Gets the value of the ruleTypeKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleTypeKey() {
            return ruleTypeKey;
        }

        /**
         * Sets the value of the ruleTypeKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleTypeKey(String value) {
            this.ruleTypeKey = value;
        }

        /**
         * Gets the value of the ruleKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleKey() {
            return ruleKey;
        }

        /**
         * Sets the value of the ruleKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleKey(String value) {
            this.ruleKey = value;
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

    }

}
