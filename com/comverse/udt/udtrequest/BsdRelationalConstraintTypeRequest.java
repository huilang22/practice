/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdRelationalConstraintType related UdtRequests
 *
 */

public abstract class BsdRelationalConstraintTypeRequest extends UdtRequest {

/**
 *
 * Constructor for BsdRelationalConstraintTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdRelationalConstraintTypeRequest(String id, String method) {
    super(id, "BsdRelationalConstraintType", method);
  }
}
