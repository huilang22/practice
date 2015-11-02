/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdAttributeConstraintCondition related UdtRequests
 *
 */

public abstract class BsdAttributeConstraintConditionRequest extends UdtRequest {

/**
 *
 * Constructor for BsdAttributeConstraintConditionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdAttributeConstraintConditionRequest(String id, String method) {
    super(id, "BsdAttributeConstraintCondition", method);
  }
}
