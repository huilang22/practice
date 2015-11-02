/*
 * UdtInput.java
 *
 * Created on October 17, 2002, 10:52 AM
 */

package com.csgsystems.udt.xlate;

import java.io.PrintStream;

/**
 * Input used to translate to Udt
 * 
 * @author Mark Brahler
 */

public interface UdtInput {    
    /**
     * Debugs this UdtOutput instance
     * 
     * @param ps     stream location to write out debug
     */
    public void debug (PrintStream ps);

}
