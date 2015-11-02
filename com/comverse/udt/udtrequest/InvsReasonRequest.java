/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsReason related UdtRequests
 *
 */

public abstract class InvsReasonRequest extends UdtRequest {

/**
 *
 * Constructor for InvsReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsReasonRequest(String id, String method) {
    super(id, "InvsReason", method);
  }
}
