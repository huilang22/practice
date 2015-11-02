/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceOrderType related UdtRequests
 *
 */

public abstract class ServiceOrderTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceOrderTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceOrderTypeRequest(String id, String method) {
    super(id, "ServiceOrderType", method);
  }
}
