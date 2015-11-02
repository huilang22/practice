/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrRate related UdtRequests
 *
 */

public abstract class RbrRateRequest extends UdtRequest {

/**
 *
 * Constructor for RbrRateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrRateRequest(String id, String method) {
    super(id, "RbrRate", method);
  }
}
