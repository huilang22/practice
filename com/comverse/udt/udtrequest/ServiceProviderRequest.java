/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceProvider related UdtRequests
 *
 */

public abstract class ServiceProviderRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceProviderRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceProviderRequest(String id, String method) {
    super(id, "ServiceProvider", method);
  }
}
