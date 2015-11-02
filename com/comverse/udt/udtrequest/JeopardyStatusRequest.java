/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all JeopardyStatus related UdtRequests
 *
 */

public abstract class JeopardyStatusRequest extends UdtRequest {

/**
 *
 * Constructor for JeopardyStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public JeopardyStatusRequest(String id, String method) {
    super(id, "JeopardyStatus", method);
  }
}
