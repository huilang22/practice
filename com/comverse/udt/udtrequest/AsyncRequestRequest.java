/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AsyncRequestRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AsyncRequest related UdtRequests
 *
 */

public abstract class AsyncRequestRequest extends UdtRequest {

/**
 *
 * Constructor for AsyncRequestRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AsyncRequestRequest(String id, String method) {
    super(id, "AsyncRequest", method);
  }
}
