/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DiscountPlan related UdtRequests
 *
 */

public abstract class DiscountPlanRequest extends UdtRequest {

/**
 *
 * Constructor for DiscountPlanRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DiscountPlanRequest(String id, String method) {
    super(id, "DiscountPlan", method);
  }
}
