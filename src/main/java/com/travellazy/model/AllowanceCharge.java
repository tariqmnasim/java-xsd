
package com.travellazy.model;

import java.math.BigDecimal;
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
 * <p>Java class for AllowanceCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowanceCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billTypeGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowanceTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="recurringCharge" type="{http://www.travellazy.com/product/model}RecurringCharge"/>
 *           &lt;element name="onceOnlyCharge" type="{http://www.travellazy.com/product/model}OnceOnlyCharge"/>
 *         &lt;/choice>
 *         &lt;element name="weeklyTimeProfile" type="{http://www.travellazy.com/product/model}WeeklyTimeProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="levelCommands" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="levelCommand" type="{http://www.travellazy.com/product/model}LevelCommand" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="carryOver" type="{http://www.travellazy.com/product/model}CarryOver" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isAmountOverridable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceCharge", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "billTypeGroupKey",
    "allowanceTypeKey",
    "allowanceAmount",
    "priority",
    "activation",
    "termination",
    "recurringCharge",
    "onceOnlyCharge",
    "weeklyTimeProfile",
    "levelCommands",
    "carryOver"
})
public class AllowanceCharge {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String billTypeGroupKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String allowanceTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal allowanceAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int priority;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected RecurringCharge recurringCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected OnceOnlyCharge onceOnlyCharge;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<WeeklyTimeProfile> weeklyTimeProfile;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AllowanceCharge.LevelCommands levelCommands;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CarryOver carryOver;
    @XmlAttribute(name = "isLimit", required = true)
    protected boolean isLimit;
    @XmlAttribute(name = "isAmountOverridable")
    protected Boolean isAmountOverridable;

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
     * Gets the value of the billTypeGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillTypeGroupKey() {
        return billTypeGroupKey;
    }

    /**
     * Sets the value of the billTypeGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillTypeGroupKey(String value) {
        this.billTypeGroupKey = value;
    }

    /**
     * Gets the value of the allowanceTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceTypeKey() {
        return allowanceTypeKey;
    }

    /**
     * Sets the value of the allowanceTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceTypeKey(String value) {
        this.allowanceTypeKey = value;
    }

    /**
     * Gets the value of the allowanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllowanceAmount() {
        return allowanceAmount;
    }

    /**
     * Sets the value of the allowanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllowanceAmount(BigDecimal value) {
        this.allowanceAmount = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
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
     * Gets the value of the weeklyTimeProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weeklyTimeProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeeklyTimeProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeeklyTimeProfile }
     * 
     * 
     */
    public List<WeeklyTimeProfile> getWeeklyTimeProfile() {
        if (weeklyTimeProfile == null) {
            weeklyTimeProfile = new ArrayList<WeeklyTimeProfile>();
        }
        return this.weeklyTimeProfile;
    }

    /**
     * Gets the value of the levelCommands property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceCharge.LevelCommands }
     *     
     */
    public AllowanceCharge.LevelCommands getLevelCommands() {
        return levelCommands;
    }

    /**
     * Sets the value of the levelCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceCharge.LevelCommands }
     *     
     */
    public void setLevelCommands(AllowanceCharge.LevelCommands value) {
        this.levelCommands = value;
    }

    /**
     * Gets the value of the carryOver property.
     * 
     * @return
     *     possible object is
     *     {@link CarryOver }
     *     
     */
    public CarryOver getCarryOver() {
        return carryOver;
    }

    /**
     * Sets the value of the carryOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarryOver }
     *     
     */
    public void setCarryOver(CarryOver value) {
        this.carryOver = value;
    }

    /**
     * Gets the value of the isLimit property.
     * 
     */
    public boolean isIsLimit() {
        return isLimit;
    }

    /**
     * Sets the value of the isLimit property.
     * 
     */
    public void setIsLimit(boolean value) {
        this.isLimit = value;
    }

    /**
     * Gets the value of the isAmountOverridable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAmountOverridable() {
        if (isAmountOverridable == null) {
            return false;
        } else {
            return isAmountOverridable;
        }
    }

    /**
     * Sets the value of the isAmountOverridable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAmountOverridable(Boolean value) {
        this.isAmountOverridable = value;
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
     *         &lt;element name="levelCommand" type="{http://www.travellazy.com/product/model}LevelCommand" maxOccurs="unbounded" minOccurs="0"/>
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
        "levelCommand"
    })
    public static class LevelCommands {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<LevelCommand> levelCommand;

        /**
         * Gets the value of the levelCommand property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the levelCommand property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLevelCommand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LevelCommand }
         * 
         * 
         */
        public List<LevelCommand> getLevelCommand() {
            if (levelCommand == null) {
                levelCommand = new ArrayList<LevelCommand>();
            }
            return this.levelCommand;
        }

    }

}
