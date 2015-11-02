/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AdjustmentType related UdtRequests
 *
 */

public abstract class AdjustmentTypeRequest extends UdtRequest {

/**
 *
 * Constructor for AdjustmentTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AdjustmentTypeRequest(String id, String method) {
    super(id, "AdjustmentType", method);
  }
}
