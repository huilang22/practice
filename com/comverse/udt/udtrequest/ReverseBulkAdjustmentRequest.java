/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ReverseBulkAdjustmentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ReverseBulkAdjustment related UdtRequests
 *
 */

public abstract class ReverseBulkAdjustmentRequest extends UdtRequest {

/**
 *
 * Constructor for ReverseBulkAdjustmentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ReverseBulkAdjustmentRequest(String id, String method) {
    super(id, "ReverseBulkAdjustment", method);
  }
}
