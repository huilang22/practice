/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CitTask related UdtRequests
 *
 */

public abstract class CitTaskRequest extends UdtRequest {

/**
 *
 * Constructor for CitTaskRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CitTaskRequest(String id, String method) {
    super(id, "CitTask", method);
  }
}
