/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UnitCrPlan related UdtRequests
 *
 */

public abstract class UnitCrPlanRequest extends UdtRequest {

/**
 *
 * Constructor for UnitCrPlanRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UnitCrPlanRequest(String id, String method) {
    super(id, "UnitCrPlan", method);
  }
}
