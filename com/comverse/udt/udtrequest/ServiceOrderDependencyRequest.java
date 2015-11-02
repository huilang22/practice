/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceOrderDependency related UdtRequests
 *
 */

public abstract class ServiceOrderDependencyRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceOrderDependencyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceOrderDependencyRequest(String id, String method) {
    super(id, "ServiceOrderDependency", method);
  }
}
