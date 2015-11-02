/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RatePeriodUsage related UdtRequests
 *
 */

public abstract class RatePeriodUsageRequest extends UdtRequest {

/**
 *
 * Constructor for RatePeriodUsageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RatePeriodUsageRequest(String id, String method) {
    super(id, "RatePeriodUsage", method);
  }
}
