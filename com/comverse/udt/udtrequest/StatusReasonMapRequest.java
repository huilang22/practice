/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all StatusReasonMap related UdtRequests
 *
 */

public abstract class StatusReasonMapRequest extends UdtRequest {

/**
 *
 * Constructor for StatusReasonMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StatusReasonMapRequest(String id, String method) {
    super(id, "StatusReasonMap", method);
  }
}
