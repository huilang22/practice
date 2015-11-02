/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchTypeStage related UdtRequests
 *
 */

public abstract class BatchTypeStageRequest extends UdtRequest {

/**
 *
 * Constructor for BatchTypeStageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchTypeStageRequest(String id, String method) {
    super(id, "BatchTypeStage", method);
  }
}
