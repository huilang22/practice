/*
 * UberTranslator.java
 *
 * Created on October 17, 2002, 10:51 AM
 */

package com.csgsystems.udt.xlate;

import com.csgsystems.udt.UdtRootRequest;

/**
 * Translates between Udt and UdtInput and UdtOutput
 * 
 * @author Mark Brahler
 */
public interface UdtTranslator {
    
    /** Translates an Udt into UdtOutput
     * @param bean bean to be translated
     * @throws UdtTranslationException thrown if translation fails
     * @return UdtInput to be used for calls
     */    
    public com.csgsystems.udt.xlate.UdtOutput translate(UdtRootRequest request) throws com.csgsystems.udt.xlate.UdtTranslationException;
    
    /** Translates from UdtInput to an UdtRootRequest
     * @return UdtBean from input
     * @param input Input to Udt
     * @param bean Bean for structural knowledge
     * @throws UdtTranslationException thrown if translation fails
     */    
    public com.csgsystems.udt.UdtRootRequest translate(com.csgsystems.udt.xlate.UdtInput input, com.csgsystems.udt.UdtRootRequest request) throws com.csgsystems.udt.xlate.UdtTranslationException;
    
}
