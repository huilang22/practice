/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsLineRef related UdtRequests
 *
 */

public abstract class InvsLineRefRequest extends UdtRequest {

/**
 *
 * Constructor for InvsLineRefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsLineRefRequest(String id, String method) {
    super(id, "InvsLineRef", method);
  }
}
