/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Log related UdtRequests
 *
 */

public abstract class LogRequest extends UdtRequest {

/**
 *
 * Constructor for LogRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public LogRequest(String id, String method) {
    super(id, "Log", method);
  }
}
