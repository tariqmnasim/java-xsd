
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractCreateCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCreateCustomer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}CreateOrder">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="channelKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="legacyAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactDetails" type="{http://www.travellazy.com/product/model}CreateContactDetails" minOccurs="0"/>
 *         &lt;element name="invoiceDetails" type="{http://www.travellazy.com/product/model}CreateInvoiceDetails" minOccurs="0"/>
 *         &lt;element name="paymentDetails" type="{http://www.travellazy.com/product/model}CreatePaymentDetails" minOccurs="0"/>
 *         &lt;element name="creditCheckDetails" type="{http://www.travellazy.com/product/model}CreateCreditCheckDetails" minOccurs="0"/>
 *         &lt;element name="createUser" type="{http://www.travellazy.com/product/model}CreateUser" minOccurs="0"/>
 *         &lt;element name="offerIndependentFeatures" type="{http://www.travellazy.com/product/model}CreateFeatures" minOccurs="0"/>
 *         &lt;element name="customizedOffers" type="{http://www.travellazy.com/product/model}CreateCustomizedOffers" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.travellazy.com/product/model}Parameters" minOccurs="0"/>
 *         &lt;element name="documentIdentifiers" type="{http://www.travellazy.com/product/model}DocumentIdentifiers" minOccurs="0"/>
 *         &lt;element name="additionalDetails" type="{http://www.travellazy.com/product/model}AdditionalDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCreateCustomer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "channelId",
    "channelKey",
    "operator",
    "customerId",
    "parentAccountNumber",
    "legacyAccountNumber",
    "contactDetails",
    "invoiceDetails",
    "paymentDetails",
    "creditCheckDetails",
    "createUser",
    "offerIndependentFeatures",
    "customizedOffers",
    "notes",
    "parameters",
    "documentIdentifiers",
    "additionalDetails"
})
@XmlSeeAlso({
    CreateProspect.class,
    CreateBusinessCustomer.class,
    CreateCustomer.class,
    ProspectResidentialCustomer.class,
    CreateTenant.class,
    ProspectBusinessCustomer.class,
    CreateResidentialCustomer.class
})
public abstract class AbstractCreateCustomer
    extends CreateOrder
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long channelId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String channelKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String operator;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long customerId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long parentAccountNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String legacyAccountNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateContactDetails contactDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateInvoiceDetails invoiceDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreatePaymentDetails paymentDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateCreditCheckDetails creditCheckDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateUser createUser;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateFeatures offerIndependentFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateCustomizedOffers customizedOffers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String notes;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Parameters parameters;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected DocumentIdentifiers documentIdentifiers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AdditionalDetails additionalDetails;

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

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the parentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentAccountNumber() {
        return parentAccountNumber;
    }

    /**
     * Sets the value of the parentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentAccountNumber(Long value) {
        this.parentAccountNumber = value;
    }

    /**
     * Gets the value of the legacyAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyAccountNumber() {
        return legacyAccountNumber;
    }

    /**
     * Sets the value of the legacyAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyAccountNumber(String value) {
        this.legacyAccountNumber = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateContactDetails }
     *     
     */
    public CreateContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContactDetails }
     *     
     */
    public void setContactDetails(CreateContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the invoiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateInvoiceDetails }
     *     
     */
    public CreateInvoiceDetails getInvoiceDetails() {
        return invoiceDetails;
    }

    /**
     * Sets the value of the invoiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateInvoiceDetails }
     *     
     */
    public void setInvoiceDetails(CreateInvoiceDetails value) {
        this.invoiceDetails = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePaymentDetails }
     *     
     */
    public CreatePaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePaymentDetails }
     *     
     */
    public void setPaymentDetails(CreatePaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the creditCheckDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCreditCheckDetails }
     *     
     */
    public CreateCreditCheckDetails getCreditCheckDetails() {
        return creditCheckDetails;
    }

    /**
     * Sets the value of the creditCheckDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCreditCheckDetails }
     *     
     */
    public void setCreditCheckDetails(CreateCreditCheckDetails value) {
        this.creditCheckDetails = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUser }
     *     
     */
    public CreateUser getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUser }
     *     
     */
    public void setCreateUser(CreateUser value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the offerIndependentFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link CreateFeatures }
     *     
     */
    public CreateFeatures getOfferIndependentFeatures() {
        return offerIndependentFeatures;
    }

    /**
     * Sets the value of the offerIndependentFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateFeatures }
     *     
     */
    public void setOfferIndependentFeatures(CreateFeatures value) {
        this.offerIndependentFeatures = value;
    }

    /**
     * Gets the value of the customizedOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomizedOffers }
     *     
     */
    public CreateCustomizedOffers getCustomizedOffers() {
        return customizedOffers;
    }

    /**
     * Sets the value of the customizedOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomizedOffers }
     *     
     */
    public void setCustomizedOffers(CreateCustomizedOffers value) {
        this.customizedOffers = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the documentIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentifiers }
     *     
     */
    public DocumentIdentifiers getDocumentIdentifiers() {
        return documentIdentifiers;
    }

    /**
     * Sets the value of the documentIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentifiers }
     *     
     */
    public void setDocumentIdentifiers(DocumentIdentifiers value) {
        this.documentIdentifiers = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetails }
     *     
     */
    public AdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetails }
     *     
     */
    public void setAdditionalDetails(AdditionalDetails value) {
        this.additionalDetails = value;
    }

}
