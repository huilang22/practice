/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsJobstatus related UdtRequests
 *
 */

public abstract class InvsJobstatusRequest extends UdtRequest {

/**
 *
 * Constructor for InvsJobstatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsJobstatusRequest(String id, String method) {
    super(id, "InvsJobstatus", method);
  }
}
