/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemRoute related UdtRequests
 *
 */

public abstract class ItemRouteRequest extends UdtRequest {

/**
 *
 * Constructor for ItemRouteRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ItemRouteRequest(String id, String method) {
    super(id, "ItemRoute", method);
  }
}
