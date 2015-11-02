/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ZoneClass related UdtRequests
 *
 */

public abstract class ZoneClassRequest extends UdtRequest {

/**
 *
 * Constructor for ZoneClassRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ZoneClassRequest(String id, String method) {
    super(id, "ZoneClass", method);
  }
}
