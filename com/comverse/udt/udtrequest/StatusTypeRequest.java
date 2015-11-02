/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all StatusType related UdtRequests
 *
 */

public abstract class StatusTypeRequest extends UdtRequest {

/**
 *
 * Constructor for StatusTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StatusTypeRequest(String id, String method) {
    super(id, "StatusType", method);
  }
}
