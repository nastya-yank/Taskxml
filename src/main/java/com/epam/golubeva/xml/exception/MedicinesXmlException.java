package com.epam.golubeva.xml.exception;

import com.epam.golubeva.xml.entity.Medicines;

public class MedicinesXmlException extends Exception {
    private static final long serialVersionUID = 1L;

    public MedicinesXmlException() {
    }

    public MedicinesXmlException (String message) {
        super(message);
    }

    public MedicinesXmlException (String message, Throwable cause) {
        super(message, cause);
    }

    public MedicinesXmlException (Throwable cause) {
        super(cause);
    }
}
