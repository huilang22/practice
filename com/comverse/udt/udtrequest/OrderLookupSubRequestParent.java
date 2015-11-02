/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLookupSubRequestParent.java
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
 * Abstract base class for all OrderLookup related UdtSubRequestParents
 *
 */
public abstract class OrderLookupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OrderLookupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderLookupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderLookupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderLookupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OrderLookupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderLookupSubRequestParent(String id, String method) {
    super(id, "OrderLookup", method);
  }
}
