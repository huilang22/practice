/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdAttributeConstraint related UdtRequests
 *
 */

public abstract class BsdAttributeConstraintRequest extends UdtRequest {

/**
 *
 * Constructor for BsdAttributeConstraintRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdAttributeConstraintRequest(String id, String method) {
    super(id, "BsdAttributeConstraint", method);
  }
}
