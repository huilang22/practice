/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsVendor related UdtRequests
 *
 */

public abstract class InvsVendorRequest extends UdtRequest {

/**
 *
 * Constructor for InvsVendorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsVendorRequest(String id, String method) {
    super(id, "InvsVendor", method);
  }
}
