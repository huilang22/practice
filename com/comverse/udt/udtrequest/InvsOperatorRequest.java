/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsOperator related UdtRequests
 *
 */

public abstract class InvsOperatorRequest extends UdtRequest {

/**
 *
 * Constructor for InvsOperatorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsOperatorRequest(String id, String method) {
    super(id, "InvsOperator", method);
  }
}
