/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SuspendedReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SuspendedReason related UdtRequests
 *
 */

public abstract class SuspendedReasonRequest extends UdtRequest {

/**
 *
 * Constructor for SuspendedReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SuspendedReasonRequest(String id, String method) {
    super(id, "SuspendedReason", method);
  }
}
