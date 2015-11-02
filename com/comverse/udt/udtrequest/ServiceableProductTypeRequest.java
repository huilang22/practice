/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableProductTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceableProductType related UdtRequests
 *
 */

public abstract class ServiceableProductTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceableProductTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceableProductTypeRequest(String id, String method) {
    super(id, "ServiceableProductType", method);
  }
}
