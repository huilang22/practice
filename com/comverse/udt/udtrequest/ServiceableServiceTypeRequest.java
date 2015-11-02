/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableServiceTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceableServiceType related UdtRequests
 *
 */

public abstract class ServiceableServiceTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceableServiceTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceableServiceTypeRequest(String id, String method) {
    super(id, "ServiceableServiceType", method);
  }
}
