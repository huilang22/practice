/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchRequest related UdtRequests
 *
 */

public abstract class BatchRequestRequest extends UdtRequest {

/**
 *
 * Constructor for BatchRequestRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchRequestRequest(String id, String method) {
    super(id, "BatchRequest", method);
  }
}
