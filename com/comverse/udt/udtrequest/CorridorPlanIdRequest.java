/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CorridorPlanId related UdtRequests
 *
 */

public abstract class CorridorPlanIdRequest extends UdtRequest {

/**
 *
 * Constructor for CorridorPlanIdRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CorridorPlanIdRequest(String id, String method) {
    super(id, "CorridorPlanId", method);
  }
}
