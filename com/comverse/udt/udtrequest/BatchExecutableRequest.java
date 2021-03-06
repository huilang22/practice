/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchExecutable related UdtRequests
 *
 */

public abstract class BatchExecutableRequest extends UdtRequest {

/**
 *
 * Constructor for BatchExecutableRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchExecutableRequest(String id, String method) {
    super(id, "BatchExecutable", method);
  }
}
