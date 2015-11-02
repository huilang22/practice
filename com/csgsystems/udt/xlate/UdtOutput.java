/*
 * UdtOutput.java
 *
 * Created on October 17, 2002, 10:52 AM
 */

package com.csgsystems.udt.xlate;

import java.io.PrintStream;

/**
 * Output from Udt translation
 * 
 * @author Mark Brahler
 */
public interface UdtOutput {    
    /** Debugs this UdtOutput instance
     * @param ps stream location to write out debug
     */
    public void debug (PrintStream ps);
}
