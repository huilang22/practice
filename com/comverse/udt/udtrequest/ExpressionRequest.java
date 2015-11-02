/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Expression related UdtRequests
 *
 */

public abstract class ExpressionRequest extends UdtRequest {

/**
 *
 * Constructor for ExpressionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExpressionRequest(String id, String method) {
    super(id, "Expression", method);
  }
}
