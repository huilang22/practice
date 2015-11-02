/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchInvSource related UdtRequests
 *
 */

public abstract class BatchInvSourceRequest extends UdtRequest {

/**
 *
 * Constructor for BatchInvSourceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchInvSourceRequest(String id, String method) {
    super(id, "BatchInvSource", method);
  }
}
