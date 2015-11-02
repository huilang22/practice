/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceAddressAssoc related UdtRequests
 *
 */

public abstract class ServiceAddressAssocRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceAddressAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceAddressAssocRequest(String id, String method) {
    super(id, "ServiceAddressAssoc", method);
  }
}
