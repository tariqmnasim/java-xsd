
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roleKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="securityQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextPossibleLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="languageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="isLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "userName",
    "firstName",
    "lastName",
    "roleKey",
    "emailAddress",
    "securityQuestion",
    "securityAnswer",
    "passwordExpirationDate",
    "nextPossibleLoginDate",
    "languageKey"
})
public class User {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String userName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String firstName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String lastName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String roleKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String emailAddress;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String securityQuestion;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String securityAnswer;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordExpirationDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPossibleLoginDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String languageKey;
    @XmlAttribute(name = "isActive")
    protected Boolean isActive;
    @XmlAttribute(name = "isLocked")
    protected Boolean isLocked;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the roleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleKey() {
        return roleKey;
    }

    /**
     * Sets the value of the roleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleKey(String value) {
        this.roleKey = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the securityQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * Sets the value of the securityQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestion(String value) {
        this.securityQuestion = value;
    }

    /**
     * Gets the value of the securityAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * Sets the value of the securityAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAnswer(String value) {
        this.securityAnswer = value;
    }

    /**
     * Gets the value of the passwordExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordExpirationDate() {
        return passwordExpirationDate;
    }

    /**
     * Sets the value of the passwordExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordExpirationDate(XMLGregorianCalendar value) {
        this.passwordExpirationDate = value;
    }

    /**
     * Gets the value of the nextPossibleLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPossibleLoginDate() {
        return nextPossibleLoginDate;
    }

    /**
     * Sets the value of the nextPossibleLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPossibleLoginDate(XMLGregorianCalendar value) {
        this.nextPossibleLoginDate = value;
    }

    /**
     * Gets the value of the languageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageKey() {
        return languageKey;
    }

    /**
     * Sets the value of the languageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageKey(String value) {
        this.languageKey = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsActive() {
        if (isActive == null) {
            return true;
        } else {
            return isActive;
        }
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsLocked() {
        if (isLocked == null) {
            return false;
        } else {
            return isLocked;
        }
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

}
