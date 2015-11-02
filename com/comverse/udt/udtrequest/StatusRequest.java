/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Status related UdtRequests
 *
 */

public abstract class StatusRequest extends UdtRequest {

/**
 *
 * Constructor for StatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StatusRequest(String id, String method) {
    super(id, "Status", method);
  }
}
