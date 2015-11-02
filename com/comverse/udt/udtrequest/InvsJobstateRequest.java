/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsJobstate related UdtRequests
 *
 */

public abstract class InvsJobstateRequest extends UdtRequest {

/**
 *
 * Constructor for InvsJobstateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsJobstateRequest(String id, String method) {
    super(id, "InvsJobstate", method);
  }
}
