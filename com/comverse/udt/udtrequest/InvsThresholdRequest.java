/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsThreshold related UdtRequests
 *
 */

public abstract class InvsThresholdRequest extends UdtRequest {

/**
 *
 * Constructor for InvsThresholdRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsThresholdRequest(String id, String method) {
    super(id, "InvsThreshold", method);
  }
}
