/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchRequestParameter related UdtRequests
 *
 */

public abstract class BatchRequestParameterRequest extends UdtRequest {

/**
 *
 * Constructor for BatchRequestParameterRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchRequestParameterRequest(String id, String method) {
    super(id, "BatchRequestParameter", method);
  }
}
