/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BilledUsageBulkAdjustment related UdtRequests
 *
 */

public abstract class BilledUsageBulkAdjustmentRequest extends UdtRequest {

/**
 *
 * Constructor for BilledUsageBulkAdjustmentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BilledUsageBulkAdjustmentRequest(String id, String method) {
    super(id, "BilledUsageBulkAdjustment", method);
  }
}
