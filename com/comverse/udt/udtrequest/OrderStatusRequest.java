/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OrderStatus related UdtRequests
 *
 */

public abstract class OrderStatusRequest extends UdtRequest {

/**
 *
 * Constructor for OrderStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OrderStatusRequest(String id, String method) {
    super(id, "OrderStatus", method);
  }
}
