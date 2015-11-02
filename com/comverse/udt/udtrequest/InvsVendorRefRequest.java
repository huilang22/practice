/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsVendorRef related UdtRequests
 *
 */

public abstract class InvsVendorRefRequest extends UdtRequest {

/**
 *
 * Constructor for InvsVendorRefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsVendorRefRequest(String id, String method) {
    super(id, "InvsVendorRef", method);
  }
}
