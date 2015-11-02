/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateUsage related UdtRequests
 *
 */

public abstract class RateUsageRequest extends UdtRequest {

/**
 *
 * Constructor for RateUsageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateUsageRequest(String id, String method) {
    super(id, "RateUsage", method);
  }
}
