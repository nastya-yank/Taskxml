package com.epam.golubeva.xml.handler;

import com.epam.golubeva.xml.entity.Group;
import com.epam.golubeva.xml.entity.Medicines;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class MedicineHandler<Medicine> extends DefaultHandler {
    public static Logger logger = LogManager.getLogger(MedicineHandler.class);
    private Set<Medicines> medicines;
    private Medicines current;
    private MedicineXmlTag currentXmlTag;
    private EnumSet<MedicineXmlTag> withText;

    public MedicineHandler() {
        medicines = new HashSet<Medicines>();
        withText = EnumSet.range(MedicineXmlTag.NAME, MedicineXmlTag.DAY);
    }

    public Set<Medicines> getMedicines() {
        return medicines;
    }
    public void startElement(String uri, String localName, String qName, Attributes attrs){
        if("medicine".equals(localName)){
            current=new Medicines();
            current.setAnalogs(attrs.getValue(1));
            if(attrs.getLength()==2){
                current.setName(attrs.getValue(0));
            }
            else{
                MedicineXmlTag temp=MedicineXmlTag.valueOf(localName.toUpperCase());
                if(withText.contains(temp)){
                    currentXmlTag =temp;
                }
            }
        }
    }
    public void endElement(String uri, String localName, String qName){
        if("medicine".equals(localName)){
            medicines.add(current);
        }
    }
    public void characters(char[] ch, int start, int length) {
        String s = new String(ch, start, length).trim();
        if (currentXmlTag != null) {
            switch (currentXmlTag) {
                case NAME:
                    current.setName(s);
                    break;
                case ANALOGS:
                    current.setAnalogs(s);
                    break;
                case NUMBER:
            }
        }
    }
    }

