/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CorridorPlanGroup related UdtRequests
 *
 */

public abstract class CorridorPlanGroupRequest extends UdtRequest {

/**
 *
 * Constructor for CorridorPlanGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CorridorPlanGroupRequest(String id, String method) {
    super(id, "CorridorPlanGroup", method);
  }
}
