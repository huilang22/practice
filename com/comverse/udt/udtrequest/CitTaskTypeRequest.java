/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CitTaskType related UdtRequests
 *
 */

public abstract class CitTaskTypeRequest extends UdtRequest {

/**
 *
 * Constructor for CitTaskTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CitTaskTypeRequest(String id, String method) {
    super(id, "CitTaskType", method);
  }
}
