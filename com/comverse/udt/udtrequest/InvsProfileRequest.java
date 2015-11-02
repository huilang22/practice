/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsProfile related UdtRequests
 *
 */

public abstract class InvsProfileRequest extends UdtRequest {

/**
 *
 * Constructor for InvsProfileRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsProfileRequest(String id, String method) {
    super(id, "InvsProfile", method);
  }
}
