/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerUdtRequestInterface.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest.interfaces;

import com.csgsystems.aruba.connection.*;
import com.csgsystems.udt.UdtProcessor;
import com.comverse.udt.udtrequest.CustomerUdtRequest;
import javax.ejb.Remote;

@Remote
public interface CustomerUdtRequestInterface extends UdtProcessor {
  /**
   Processes Udt requests for the CustomerUdtRequest server
   @param context Session context for request
   @param request request to be processed
   @return results for request
   @throws BSDMResourceException if the request could not be processed
   */

  public CustomerUdtRequest process(BSDMSessionContext context, CustomerUdtRequest request) throws BSDMResourceException;
}
