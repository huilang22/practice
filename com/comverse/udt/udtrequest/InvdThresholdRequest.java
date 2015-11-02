/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvdThreshold related UdtRequests
 *
 */

public abstract class InvdThresholdRequest extends UdtRequest {

/**
 *
 * Constructor for InvdThresholdRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvdThresholdRequest(String id, String method) {
    super(id, "InvdThreshold", method);
  }
}
