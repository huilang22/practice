/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrRateTier related UdtRequests
 *
 */

public abstract class RbrRateTierRequest extends UdtRequest {

/**
 *
 * Constructor for RbrRateTierRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrRateTierRequest(String id, String method) {
    super(id, "RbrRateTier", method);
  }
}
