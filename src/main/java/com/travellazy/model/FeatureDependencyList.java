
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
 * <p>Java class for FeatureDependencyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureDependencyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="featureDependency" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dependencyTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="source">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="serviceFeatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/choice>
 *                             &lt;element name="serviceFeatureParamValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="invertSelection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="target">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="serviceFeatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureDependencyList", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "featureDependency"
})
public class FeatureDependencyList {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<FeatureDependencyList.FeatureDependency> featureDependency;

    /**
     * Gets the value of the featureDependency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureDependency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureDependency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureDependencyList.FeatureDependency }
     * 
     * 
     */
    public List<FeatureDependencyList.FeatureDependency> getFeatureDependency() {
        if (featureDependency == null) {
            featureDependency = new ArrayList<FeatureDependencyList.FeatureDependency>();
        }
        return this.featureDependency;
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
     *         &lt;element name="dependencyTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="source">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="serviceFeatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;/choice>
     *                   &lt;element name="serviceFeatureParamValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="invertSelection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="target">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="serviceFeatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dependencyTypeKey",
        "activation",
        "termination",
        "source",
        "target"
    })
    public static class FeatureDependency {

        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected String dependencyTypeKey;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar activation;
        @XmlElement(namespace = "http://www.travellazy.com/product/model")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar termination;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected FeatureDependencyList.FeatureDependency.Source source;
        @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
        protected FeatureDependencyList.FeatureDependency.Target target;

        /**
         * Gets the value of the dependencyTypeKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDependencyTypeKey() {
            return dependencyTypeKey;
        }

        /**
         * Sets the value of the dependencyTypeKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDependencyTypeKey(String value) {
            this.dependencyTypeKey = value;
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
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link FeatureDependencyList.FeatureDependency.Source }
         *     
         */
        public FeatureDependencyList.FeatureDependency.Source getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureDependencyList.FeatureDependency.Source }
         *     
         */
        public void setSource(FeatureDependencyList.FeatureDependency.Source value) {
            this.source = value;
        }

        /**
         * Gets the value of the target property.
         * 
         * @return
         *     possible object is
         *     {@link FeatureDependencyList.FeatureDependency.Target }
         *     
         */
        public FeatureDependencyList.FeatureDependency.Target getTarget() {
            return target;
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureDependencyList.FeatureDependency.Target }
         *     
         */
        public void setTarget(FeatureDependencyList.FeatureDependency.Target value) {
            this.target = value;
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
         *         &lt;choice>
         *           &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="serviceFeatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;/choice>
         *         &lt;element name="serviceFeatureParamValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="invertSelection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "featureKey",
            "featureGroupKey",
            "serviceFeatureValue",
            "serviceFeatureParamValue"
        })
        public static class Source {

            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String featureKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String featureGroupKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String serviceFeatureValue;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String serviceFeatureParamValue;
            @XmlAttribute(name = "invertSelection", required = true)
            protected boolean invertSelection;

            /**
             * Gets the value of the featureKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeatureKey() {
                return featureKey;
            }

            /**
             * Sets the value of the featureKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeatureKey(String value) {
                this.featureKey = value;
            }

            /**
             * Gets the value of the featureGroupKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeatureGroupKey() {
                return featureGroupKey;
            }

            /**
             * Sets the value of the featureGroupKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeatureGroupKey(String value) {
                this.featureGroupKey = value;
            }

            /**
             * Gets the value of the serviceFeatureValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceFeatureValue() {
                return serviceFeatureValue;
            }

            /**
             * Sets the value of the serviceFeatureValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceFeatureValue(String value) {
                this.serviceFeatureValue = value;
            }

            /**
             * Gets the value of the serviceFeatureParamValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceFeatureParamValue() {
                return serviceFeatureParamValue;
            }

            /**
             * Sets the value of the serviceFeatureParamValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceFeatureParamValue(String value) {
                this.serviceFeatureParamValue = value;
            }

            /**
             * Gets the value of the invertSelection property.
             * 
             */
            public boolean isInvertSelection() {
                return invertSelection;
            }

            /**
             * Sets the value of the invertSelection property.
             * 
             */
            public void setInvertSelection(boolean value) {
                this.invertSelection = value;
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
         *         &lt;choice>
         *           &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="serviceFeatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "featureKey",
            "featureGroupKey",
            "serviceFeatureValue"
        })
        public static class Target {

            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String featureKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String featureGroupKey;
            @XmlElement(namespace = "http://www.travellazy.com/product/model")
            protected String serviceFeatureValue;

            /**
             * Gets the value of the featureKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeatureKey() {
                return featureKey;
            }

            /**
             * Sets the value of the featureKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeatureKey(String value) {
                this.featureKey = value;
            }

            /**
             * Gets the value of the featureGroupKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeatureGroupKey() {
                return featureGroupKey;
            }

            /**
             * Sets the value of the featureGroupKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeatureGroupKey(String value) {
                this.featureGroupKey = value;
            }

            /**
             * Gets the value of the serviceFeatureValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceFeatureValue() {
                return serviceFeatureValue;
            }

            /**
             * Sets the value of the serviceFeatureValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceFeatureValue(String value) {
                this.serviceFeatureValue = value;
            }

        }

    }

}
