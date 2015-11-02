/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CitReason related UdtRequests
 *
 */

public abstract class CitReasonRequest extends UdtRequest {

/**
 *
 * Constructor for CitReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CitReasonRequest(String id, String method) {
    super(id, "CitReason", method);
  }
}
