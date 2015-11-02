/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all HistoricalThresholds related UdtRequests
 *
 */

public abstract class HistoricalThresholdsRequest extends UdtRequest {

/**
 *
 * Constructor for HistoricalThresholdsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public HistoricalThresholdsRequest(String id, String method) {
    super(id, "HistoricalThresholds", method);
  }
}
