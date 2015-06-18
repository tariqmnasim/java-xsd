package com.travellazy;

import com.travellazy.Util.Util;
import com.travellazy.model.*;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;
import java.net.URI;
import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void createCustomizedOfferPOST() {
        CreateCustomizedOfferType createCustomizedOfferType = new CreateCustomizedOfferType();
        createCustomizedOfferType.setPriority(4);

        CreateCustomizedBaseOffer createCustomizedBaseOffer = new CreateCustomizedBaseOffer();
        createCustomizedBaseOffer.setOfferKey("HPCPortVSO01Offer");

        createCustomizedOfferType.getOfferConfigurationOrBaseOfferOrBundleOffer().add(createCustomizedBaseOffer);

        try {
            createCustomizedOfferType.setActivationDate(Util.convertToXMLGregorianCalendar(new Date()));
        } catch(Exception e) {
            e.printStackTrace();
        }

        createCustomizedOfferType.setChannelKey("INTERNAL");
        createCustomizedOfferType.setOperator("admin");

        JAXBElement<CreateCustomizedOfferType> createCustomizedOffer = new ObjectFactory().createCreateCustomizedOffer(createCustomizedOfferType);

        // WRITE xml output to File
        String filePath = getResourcePath() + "createCustomizedOfferPOST_generated.xml";
        writeJAXBElementToFile(createCustomizedOffer, filePath);
    }

    @Test
    public void createCustomisedOfferComplex(){
        ObjectFactory factory = new ObjectFactory();
//        factory.createCustomizedOffer()
        CreateCustomizedOfferType createCustomizedOfferType = new CreateCustomizedOfferType();

        CreateCustomizedBaseOffer createCustomizedBaseOffer = new CreateCustomizedBaseOffer();
        createCustomizedBaseOffer.setOfferKey("RT_WEBSITE");

        CreateFeature feature1 = new CreateFeature();
        feature1.setFeatureKey("WEBSITE_UPFRONT_FEE");
        CreateFeature feature2 = new CreateFeature();
        feature2.setFeatureKey("24_Month_Contract_Website");
        CreateFeatures createFeatures = new CreateFeatures();
        createFeatures.getFeature().add(feature1);
        createFeatures.getFeature().add(feature2);

        createCustomizedBaseOffer.setOfferFeatures(createFeatures);

        CreateServices createServices = new CreateServices();
        CreateService createService = new CreateService();
        createService.setServiceKey("SRV_WEBPAGE");

        CreateFeature serviceFeature = new CreateFeature();
        serviceFeature.setFeatureKey("SP_WEB_PAGE:SC_URL");
        FeatureValueString serviceFeatureValueString = new FeatureValueString();
        serviceFeatureValueString.setValue("CHANGE_ME");
        serviceFeature.setValue(serviceFeatureValueString);

        CreateFeatures serviceFeatures = new CreateFeatures();
        serviceFeatures.getFeature().add(serviceFeature);
        createService.setServiceFeatures(serviceFeatures);
        createServices.getService().add(createService);

        createCustomizedBaseOffer.setServices(createServices);

        createCustomizedOfferType.getOfferConfigurationOrBaseOfferOrBundleOffer().add(createCustomizedBaseOffer);
        createCustomizedOfferType.setChannelKey("INTERNAL");
        createCustomizedOfferType.setOperator("admin");

        JAXBElement<CreateCustomizedOfferType> createCustomizedOffer = new ObjectFactory().createCreateCustomizedOffer(createCustomizedOfferType);

        // WRITE xml output to File
        String filePath = getResourcePath() + "createCustomizedOfferComplex_generated.xml";
        writeJAXBElementToFile(createCustomizedOffer, filePath);

        // WRITE xml output to Console
//        writeJAXBElementToConsole(createCustomizedOffer);
    }

    public void writeJAXBElementToFile(JAXBElement<?> jaxbElement, String filePath) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(CreateCustomizedOfferType.class);
            Marshaller m = context.createMarshaller();
            m.marshal(jaxbElement, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void writeJAXBElementToConsole(JAXBElement<?> jaxbElement) {
        StringWriter writer = new StringWriter();
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(CreateCustomizedOfferType.class);
            Marshaller m = context.createMarshaller();
            m.marshal(jaxbElement, writer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        // output string to console
        String theXML = writer.toString();
        System.out.println(theXML);
    }

    private static String getResourcePath() {
        try {
            URI rootURI = new File("").toURI();
            return rootURI.getPath() + "src/test/resources/";
        } catch (Exception e) {
            return null;
        }
    }
}
