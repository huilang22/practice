/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NetAction related UdtRequests
 *
 */

public abstract class NetActionRequest extends UdtRequest {

/**
 *
 * Constructor for NetActionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NetActionRequest(String id, String method) {
    super(id, "NetAction", method);
  }
}
