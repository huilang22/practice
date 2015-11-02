/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Zone related UdtRequests
 *
 */

public abstract class ZoneRequest extends UdtRequest {

/**
 *
 * Constructor for ZoneRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ZoneRequest(String id, String method) {
    super(id, "Zone", method);
  }
}
