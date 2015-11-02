/*
 * UdtTranslationException.java
 *
 * Created on October 17, 2002, 10:53 AM
 */

package com.csgsystems.udt.xlate;

import com.csgsystems.aruba.connection.ServiceException;

/**
 * Exception when translating Udts
 * 
 * @author Mark Brahler
 */
public class UdtTranslationException extends ServiceException {

    private static final String CATEGORY = "UdtTranslation";

    /**
     * Constructs an instance of <code>UdtTranslationException</code> with just an error message
     *
     * @param errorName error name
     * @param errorMessage error message
     */
    public UdtTranslationException(String errorName, String errorMessage) {
        super(CATEGORY, errorName, errorMessage, (String)null, (String)null, (String)null);
    }

    /**
     * Constructs an instance of <code>UdtTranslationException</code> with a cause
     *
     * @param errorName error name
     * @param errorMessage error message
     * @param cause Throwable that caused the error to occur
     */
    public UdtTranslationException(String errorName, String errorMessage, Throwable cause) {
        this(errorName, errorMessage);
        if (cause != null) {
            initCause(cause);
        }
    }
}
