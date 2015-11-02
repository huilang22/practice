/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableComponentTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceableComponentType related UdtRequests
 *
 */

public abstract class ServiceableComponentTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceableComponentTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceableComponentTypeRequest(String id, String method) {
    super(id, "ServiceableComponentType", method);
  }
}
