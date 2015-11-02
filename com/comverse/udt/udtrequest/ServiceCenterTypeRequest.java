/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceCenterType related UdtRequests
 *
 */

public abstract class ServiceCenterTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceCenterTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceCenterTypeRequest(String id, String method) {
    super(id, "ServiceCenterType", method);
  }
}
