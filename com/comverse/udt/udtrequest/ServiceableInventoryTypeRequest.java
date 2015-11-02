/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableInventoryTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceableInventoryType related UdtRequests
 *
 */

public abstract class ServiceableInventoryTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceableInventoryTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceableInventoryTypeRequest(String id, String method) {
    super(id, "ServiceableInventoryType", method);
  }
}
