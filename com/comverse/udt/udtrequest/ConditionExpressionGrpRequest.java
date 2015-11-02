/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ConditionExpressionGrp related UdtRequests
 *
 */

public abstract class ConditionExpressionGrpRequest extends UdtRequest {

/**
 *
 * Constructor for ConditionExpressionGrpRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ConditionExpressionGrpRequest(String id, String method) {
    super(id, "ConditionExpressionGrp", method);
  }
}
