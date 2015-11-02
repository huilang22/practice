/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateUsageBand related UdtRequests
 *
 */

public abstract class RateUsageBandRequest extends UdtRequest {

/**
 *
 * Constructor for RateUsageBandRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateUsageBandRequest(String id, String method) {
    super(id, "RateUsageBand", method);
  }
}
