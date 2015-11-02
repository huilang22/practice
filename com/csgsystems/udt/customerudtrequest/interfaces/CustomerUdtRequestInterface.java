/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerUdtRequestInterface.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest.interfaces;

import javax.ejb.Remote;
import com.csgsystems.aruba.connection.*;
import com.csgsystems.udt.customerudtrequest.CustomerUdtRequest;

@Remote
public interface CustomerUdtRequestInterface {
  /**
   Processes Udt requests for the CustomerUdtRequest server
   @param context Session context for request
   @param request request to be processed
   @return results for request
   @throws BSDMResourceException if the request could not be processed
   */

  public CustomerUdtRequest process(BSDMSessionContext context, CustomerUdtRequest request) throws BSDMResourceException;
}
