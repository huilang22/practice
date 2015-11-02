/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all JobResources related UdtRequests
 *
 */

public abstract class JobResourcesRequest extends UdtRequest {

/**
 *
 * Constructor for JobResourcesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public JobResourcesRequest(String id, String method) {
    super(id, "JobResources", method);
  }
}
