/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchStatus related UdtRequests
 *
 */

public abstract class BatchStatusRequest extends UdtRequest {

/**
 *
 * Constructor for BatchStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchStatusRequest(String id, String method) {
    super(id, "BatchStatus", method);
  }
}
