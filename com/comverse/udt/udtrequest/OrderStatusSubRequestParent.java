/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OrderStatus related UdtSubRequestParents
 *
 */
public abstract class OrderStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OrderStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OrderStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderStatusSubRequestParent(String id, String method) {
    super(id, "OrderStatus", method);
  }
}
