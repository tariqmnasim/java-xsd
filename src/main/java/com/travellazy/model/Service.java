
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
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceSpecificationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="workflows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="workflow" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceProvisioningTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="workflowDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" default="jbpm">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="jbpm"/>
 *                                 &lt;enumeration value="activiti"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subService" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceKey" type="{http://www.travellazy.com/product/model}NonEmptyString"/>
 *                             &lt;element name="minNumberOfInstances">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="0"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="maxNumberOfInstances" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "serviceProviderKey",
    "serviceSpecificationKey",
    "displayName",
    "description",
    "activation",
    "termination",
    "workflows",
    "subServices"
})
public class Service {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceProviderKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceSpecificationKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Service.Workflows workflows;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Service.SubServices subServices;

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
     * Gets the value of the serviceProviderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderKey() {
        return serviceProviderKey;
    }

    /**
     * Sets the value of the serviceProviderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderKey(String value) {
        this.serviceProviderKey = value;
    }

    /**
     * Gets the value of the serviceSpecificationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSpecificationKey() {
        return serviceSpecificationKey;
    }

    /**
     * Sets the value of the serviceSpecificationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSpecificationKey(String value) {
        this.serviceSpecificationKey = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
     * Gets the value of the workflows property.
     * 
     * @return
     *     possible object is
     *     {@link Service.Workflows }
     *     
     */
    public Service.Workflows getWorkflows() {
        return workflows;
    }

    /**
     * Sets the value of the workflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service.Workflows }
     *     
     */
    public void setWorkflows(Service.Workflows value) {
        this.workflows = value;
    }

    /**
     * Gets the value of the subServices property.
     * 
     * @return
     *     possible object is
     *     {@link Service.SubServices }
     *     
     */
    public Service.SubServices getSubServices() {
        return subServices;
    }

    /**
     * Sets the value of the subServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service.SubServices }
     *     
     */
    public void setSubServices(Service.SubServices value) {
        this.subServices = value;
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
     *         &lt;element name="subService" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceKey" type="{http://www.travellazy.com/product/model}NonEmptyString"/>
     *                   &lt;element name="minNumberOfInstances">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="0"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="maxNumberOfInstances" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "subService"
    })
    public static class SubServices {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<Service.SubServices.SubService> subService;

        /**
         * Gets the value of the subService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Service.SubServices.SubService }
         * 
         * 
         */
        public List<Service.SubServices.SubService> getSubService() {
            if (subService == null) {
                subService = new ArrayList<Service.SubServices.SubService>();
            }
            return this.subService;
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
         *         &lt;element name="serviceKey" type="{http://www.travellazy.com/product/model}NonEmptyString"/>
         *         &lt;element name="minNumberOfInstances">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="maxNumberOfInstances" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "serviceKey",
            "minNumberOfInstances",
            "maxNumberOfInstances",
            "activation",
            "termination"
        })
        public static class SubService {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String serviceKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected int minNumberOfInstances;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected Integer maxNumberOfInstances;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar activation;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar termination;

            /**
             * Gets the value of the serviceKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceKey() {
                return serviceKey;
            }

            /**
             * Sets the value of the serviceKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceKey(String value) {
                this.serviceKey = value;
            }

            /**
             * Gets the value of the minNumberOfInstances property.
             * 
             */
            public int getMinNumberOfInstances() {
                return minNumberOfInstances;
            }

            /**
             * Sets the value of the minNumberOfInstances property.
             * 
             */
            public void setMinNumberOfInstances(int value) {
                this.minNumberOfInstances = value;
            }

            /**
             * Gets the value of the maxNumberOfInstances property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxNumberOfInstances() {
                return maxNumberOfInstances;
            }

            /**
             * Sets the value of the maxNumberOfInstances property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxNumberOfInstances(Integer value) {
                this.maxNumberOfInstances = value;
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
     *         &lt;element name="workflow" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceProvisioningTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="workflowDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" default="jbpm">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="jbpm"/>
     *                       &lt;enumeration value="activiti"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        "workflow"
    })
    public static class Workflows {

        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        protected List<Service.Workflows.Workflow> workflow;

        /**
         * Gets the value of the workflow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workflow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkflow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Service.Workflows.Workflow }
         * 
         * 
         */
        public List<Service.Workflows.Workflow> getWorkflow() {
            if (workflow == null) {
                workflow = new ArrayList<Service.Workflows.Workflow>();
            }
            return this.workflow;
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
         *         &lt;element name="serviceProvisioningTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="workflowDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="type" default="jbpm">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="jbpm"/>
         *             &lt;enumeration value="activiti"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "serviceProvisioningTypeKey",
            "workflowDefinitionName"
        })
        public static class Workflow {

            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String serviceProvisioningTypeKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
            protected String workflowDefinitionName;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Gets the value of the serviceProvisioningTypeKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceProvisioningTypeKey() {
                return serviceProvisioningTypeKey;
            }

            /**
             * Sets the value of the serviceProvisioningTypeKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceProvisioningTypeKey(String value) {
                this.serviceProvisioningTypeKey = value;
            }

            /**
             * Gets the value of the workflowDefinitionName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkflowDefinitionName() {
                return workflowDefinitionName;
            }

            /**
             * Sets the value of the workflowDefinitionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkflowDefinitionName(String value) {
                this.workflowDefinitionName = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                if (type == null) {
                    return "jbpm";
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
