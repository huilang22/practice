/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchRequestNotifyParameter related UdtRequests
 *
 */

public abstract class BatchRequestNotifyParameterRequest extends UdtRequest {

/**
 *
 * Constructor for BatchRequestNotifyParameterRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchRequestNotifyParameterRequest(String id, String method) {
    super(id, "BatchRequestNotifyParameter", method);
  }
}
