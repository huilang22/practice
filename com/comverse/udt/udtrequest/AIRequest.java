/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AIRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AI related UdtRequests
 *
 */

public abstract class AIRequest extends UdtRequest {

/**
 *
 * Constructor for AIRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AIRequest(String id, String method) {
    super(id, "AI", method);
  }
}
