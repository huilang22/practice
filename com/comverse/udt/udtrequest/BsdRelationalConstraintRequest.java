/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdRelationalConstraint related UdtRequests
 *
 */

public abstract class BsdRelationalConstraintRequest extends UdtRequest {

/**
 *
 * Constructor for BsdRelationalConstraintRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdRelationalConstraintRequest(String id, String method) {
    super(id, "BsdRelationalConstraint", method);
  }
}
