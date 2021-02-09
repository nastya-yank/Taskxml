package com.epam.golubeva.xml.parser;

import com.epam.golubeva.xml.exception.MedicinesXmlException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MedicinesBuilderFactory {
    public static Logger logger = LogManager.getLogger();
    private MedicinesBuilderFactory(){

    }
    public static AbstractMedicineBuilder createMedicineBuilder(String typeParser) throws MedicinesXmlException{
        AbstractMedicineBuilder builder = null;
        switch (typeParser.toUpperCase()) {
            case "DOM":
                builder = new MedicinesDomBuilder();
                break;
            case "STAX":
                builder = new MedicinesStaxBuilder();
                break;
            case "SAX":
                builder = new MedicinesSaxBuilder();
                break;
            default:
                throw new MedicinesXmlException("parser " + typeParser + "is not found");
        }
        logger.log(Level.INFO, builder.getClass().getName() + " will be used");
        return builder;
    }
}
