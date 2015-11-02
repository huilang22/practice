/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AdjustmentReason related UdtRequests
 *
 */

public abstract class AdjustmentReasonRequest extends UdtRequest {

/**
 *
 * Constructor for AdjustmentReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AdjustmentReasonRequest(String id, String method) {
    super(id, "AdjustmentReason", method);
  }
}
