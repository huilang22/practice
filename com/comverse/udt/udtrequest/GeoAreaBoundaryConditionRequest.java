/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoAreaBoundaryCondition related UdtRequests
 *
 */

public abstract class GeoAreaBoundaryConditionRequest extends UdtRequest {

/**
 *
 * Constructor for GeoAreaBoundaryConditionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GeoAreaBoundaryConditionRequest(String id, String method) {
    super(id, "GeoAreaBoundaryCondition", method);
  }
}
