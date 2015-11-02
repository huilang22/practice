/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdAttributeConstraintType related UdtRequests
 *
 */

public abstract class BsdAttributeConstraintTypeRequest extends UdtRequest {

/**
 *
 * Constructor for BsdAttributeConstraintTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdAttributeConstraintTypeRequest(String id, String method) {
    super(id, "BsdAttributeConstraintType", method);
  }
}
