/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsSimResellerRef related UdtRequests
 *
 */

public abstract class InvsSimResellerRefRequest extends UdtRequest {

/**
 *
 * Constructor for InvsSimResellerRefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsSimResellerRefRequest(String id, String method) {
    super(id, "InvsSimResellerRef", method);
  }
}
