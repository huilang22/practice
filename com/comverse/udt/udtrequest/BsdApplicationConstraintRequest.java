/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdApplicationConstraint related UdtRequests
 *
 */

public abstract class BsdApplicationConstraintRequest extends UdtRequest {

/**
 *
 * Constructor for BsdApplicationConstraintRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdApplicationConstraintRequest(String id, String method) {
    super(id, "BsdApplicationConstraint", method);
  }
}
