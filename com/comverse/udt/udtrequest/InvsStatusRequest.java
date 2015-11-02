/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsStatus related UdtRequests
 *
 */

public abstract class InvsStatusRequest extends UdtRequest {

/**
 *
 * Constructor for InvsStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsStatusRequest(String id, String method) {
    super(id, "InvsStatus", method);
  }
}
