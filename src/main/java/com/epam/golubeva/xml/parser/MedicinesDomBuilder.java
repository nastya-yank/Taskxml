package com.epam.golubeva.xml.parser;

import com.epam.golubeva.xml.entity.Medicines;
import com.epam.golubeva.xml.exception.MedicinesXmlException;
import com.epam.golubeva.xml.handler.MedicineXmlTag;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Set;

public class MedicinesDomBuilder extends AbstractMedicineBuilder {
    public static Logger logger = LogManager.getLogger();
    private DocumentBuilder docBuilder;
    public final static String ATTRIBUTE_NAME = "name";
    public final static String ATTRIBUTE_ANALOG = "analog";
    public final static String DEFAULT_ATTRIBUTE_ANALOG = "coal";
    public MedicinesDomBuilder(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            docBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            logger.log(Level.ERROR, " parser configuration error");
        }
    }
    public MedicinesDomBuilder(Set<Medicines> medicines) {
        super(medicines);
    }

    @Override
    public void buildSetMedicine(String filename) throws MedicinesXmlException {
        Document doc;
        try {
            doc = docBuilder.parse(filename);
            Element root = doc.getDocumentElement();
            NodeList medicinesList = root.getElementsByTagName(MedicineXmlTag.MEDICINE.getValue());
            for (int i = 0; i < medicinesList.getLength(); i++) {
                Element medicineElement = (Element) medicinesList.item(i);
                Medicines medicines = buildMedicine(medicineElement);
                this.medicines.add(medicines);
            }
            logger.log(Level.INFO, "parsing result: " + getMedicines());
        } catch (IOException | SAXException e) {
            throw new MedicinesXmlException("parsing error" + e);
        }
    }
    private Medicines buildMedicine(Element medicineElement){

    }
}
