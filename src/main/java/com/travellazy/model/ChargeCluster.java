
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
 * <p>Java class for ChargeCluster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeCluster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charges">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="charge" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="onceOnlyCharge" type="{http://www.travellazy.com/product/model}OnceOnlyCharge"/>
 *                               &lt;element name="recurringCharge" type="{http://www.travellazy.com/product/model}RecurringCharge"/>
 *                               &lt;element name="installmentCharge" type="{http://www.travellazy.com/product/model}InstallmentCharge"/>
 *                               &lt;element name="discount" type="{http://www.travellazy.com/product/model}DiscountCharge"/>
 *                               &lt;element name="ratingFunction" type="{http://www.travellazy.com/product/model}RatingFunction"/>
 *                               &lt;element name="allowance" type="{http://www.travellazy.com/product/model}AllowanceCharge"/>
 *                               &lt;element name="terminationCharge" type="{http://www.travellazy.com/product/model}TerminationCharge"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="isOnlineCharged" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCluster", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "priority",
    "currency",
    "charges"
})
public class ChargeCluster {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long priority;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String currency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected ChargeCluster.Charges charges;
    @XmlAttribute(name = "isOnlineCharged")
    protected Boolean isOnlineCharged;

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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeCluster.Charges }
     *     
     */
    public ChargeCluster.Charges getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeCluster.Charges }
     *     
     */
    public void setCharges(ChargeCluster.Charges value) {
        this.charges = value;
    }

    /**
     * Gets the value of the isOnlineCharged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsOnlineCharged() {
        if (isOnlineCharged == null) {
            return false;
        } else {
            return isOnlineCharged;
        }
    }

    /**
     * Sets the value of the isOnlineCharged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnlineCharged(Boolean value) {
        this.isOnlineCharged = value;
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
     *         &lt;element name="charge" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="onceOnlyCharge" type="{http://www.travellazy.com/product/model}OnceOnlyCharge"/>
     *                     &lt;element name="recurringCharge" type="{http://www.travellazy.com/product/model}RecurringCharge"/>
     *                     &lt;element name="installmentCharge" type="{http://www.travellazy.com/product/model}InstallmentCharge"/>
     *                     &lt;element name="discount" type="{http://www.travellazy.com/product/model}DiscountCharge"/>
     *                     &lt;element name="ratingFunction" type="{http://www.travellazy.com/product/model}RatingFunction"/>
     *                     &lt;element name="allowance" type="{http://www.travellazy.com/product/model}AllowanceCharge"/>
     *                     &lt;element name="terminationCharge" type="{http://www.travellazy.com/product/model}TerminationCharge"/>
     *                   &lt;/choice>
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
    @XmlType(name = "", propOrder = {
        "charge"
    })
    public static class Charges {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected List<ChargeCluster.Charges.Charge> charge;

        /**
         * Gets the value of the charge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the charge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChargeCluster.Charges.Charge }
         * 
         * 
         */
        public List<ChargeCluster.Charges.Charge> getCharge() {
            if (charge == null) {
                charge = new ArrayList<ChargeCluster.Charges.Charge>();
            }
            return this.charge;
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
         *         &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="onceOnlyCharge" type="{http://www.travellazy.com/product/model}OnceOnlyCharge"/>
         *           &lt;element name="recurringCharge" type="{http://www.travellazy.com/product/model}RecurringCharge"/>
         *           &lt;element name="installmentCharge" type="{http://www.travellazy.com/product/model}InstallmentCharge"/>
         *           &lt;element name="discount" type="{http://www.travellazy.com/product/model}DiscountCharge"/>
         *           &lt;element name="ratingFunction" type="{http://www.travellazy.com/product/model}RatingFunction"/>
         *           &lt;element name="allowance" type="{http://www.travellazy.com/product/model}AllowanceCharge"/>
         *           &lt;element name="terminationCharge" type="{http://www.travellazy.com/product/model}TerminationCharge"/>
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
        @XmlType(name = "", propOrder = {
            "billTypeKey",
            "activation",
            "termination",
            "onceOnlyCharge",
            "recurringCharge",
            "installmentCharge",
            "discount",
            "ratingFunction",
            "allowance",
            "terminationCharge"
        })
        public static class Charge {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String billTypeKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected OnceOnlyCharge onceOnlyCharge;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected RecurringCharge recurringCharge;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected InstallmentCharge installmentCharge;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected DiscountCharge discount;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected RatingFunction ratingFunction;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected AllowanceCharge allowance;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected TerminationCharge terminationCharge;

            /**
             * Gets the value of the billTypeKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillTypeKey() {
                return billTypeKey;
            }

            /**
             * Sets the value of the billTypeKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillTypeKey(String value) {
                this.billTypeKey = value;
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
             * Gets the value of the onceOnlyCharge property.
             * 
             * @return
             *     possible object is
             *     {@link OnceOnlyCharge }
             *     
             */
            public OnceOnlyCharge getOnceOnlyCharge() {
                return onceOnlyCharge;
            }

            /**
             * Sets the value of the onceOnlyCharge property.
             * 
             * @param value
             *     allowed object is
             *     {@link OnceOnlyCharge }
             *     
             */
            public void setOnceOnlyCharge(OnceOnlyCharge value) {
                this.onceOnlyCharge = value;
            }

            /**
             * Gets the value of the recurringCharge property.
             * 
             * @return
             *     possible object is
             *     {@link RecurringCharge }
             *     
             */
            public RecurringCharge getRecurringCharge() {
                return recurringCharge;
            }

            /**
             * Sets the value of the recurringCharge property.
             * 
             * @param value
             *     allowed object is
             *     {@link RecurringCharge }
             *     
             */
            public void setRecurringCharge(RecurringCharge value) {
                this.recurringCharge = value;
            }

            /**
             * Gets the value of the installmentCharge property.
             * 
             * @return
             *     possible object is
             *     {@link InstallmentCharge }
             *     
             */
            public InstallmentCharge getInstallmentCharge() {
                return installmentCharge;
            }

            /**
             * Sets the value of the installmentCharge property.
             * 
             * @param value
             *     allowed object is
             *     {@link InstallmentCharge }
             *     
             */
            public void setInstallmentCharge(InstallmentCharge value) {
                this.installmentCharge = value;
            }

            /**
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link DiscountCharge }
             *     
             */
            public DiscountCharge getDiscount() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiscountCharge }
             *     
             */
            public void setDiscount(DiscountCharge value) {
                this.discount = value;
            }

            /**
             * Gets the value of the ratingFunction property.
             * 
             * @return
             *     possible object is
             *     {@link RatingFunction }
             *     
             */
            public RatingFunction getRatingFunction() {
                return ratingFunction;
            }

            /**
             * Sets the value of the ratingFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link RatingFunction }
             *     
             */
            public void setRatingFunction(RatingFunction value) {
                this.ratingFunction = value;
            }

            /**
             * Gets the value of the allowance property.
             * 
             * @return
             *     possible object is
             *     {@link AllowanceCharge }
             *     
             */
            public AllowanceCharge getAllowance() {
                return allowance;
            }

            /**
             * Sets the value of the allowance property.
             * 
             * @param value
             *     allowed object is
             *     {@link AllowanceCharge }
             *     
             */
            public void setAllowance(AllowanceCharge value) {
                this.allowance = value;
            }

            /**
             * Gets the value of the terminationCharge property.
             * 
             * @return
             *     possible object is
             *     {@link TerminationCharge }
             *     
             */
            public TerminationCharge getTerminationCharge() {
                return terminationCharge;
            }

            /**
             * Sets the value of the terminationCharge property.
             * 
             * @param value
             *     allowed object is
             *     {@link TerminationCharge }
             *     
             */
            public void setTerminationCharge(TerminationCharge value) {
                this.terminationCharge = value;
            }

        }

    }

}
