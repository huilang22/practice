/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateCorridorUsage related UdtRequests
 *
 */

public abstract class RateCorridorUsageRequest extends UdtRequest {

/**
 *
 * Constructor for RateCorridorUsageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateCorridorUsageRequest(String id, String method) {
    super(id, "RateCorridorUsage", method);
  }
}
