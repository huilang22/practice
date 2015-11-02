/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDistinctRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RatePeriodDistinct related UdtRequests
 *
 */

public abstract class RatePeriodDistinctRequest extends UdtRequest {

/**
 *
 * Constructor for RatePeriodDistinctRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RatePeriodDistinctRequest(String id, String method) {
    super(id, "RatePeriodDistinct", method);
  }
}
