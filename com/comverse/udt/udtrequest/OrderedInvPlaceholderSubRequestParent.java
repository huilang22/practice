/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInvPlaceholderSubRequestParent.java
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
 * Abstract base class for all OrderedInvPlaceholder related UdtSubRequestParents
 *
 */
public abstract class OrderedInvPlaceholderSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OrderedInvPlaceholderRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedInvPlaceholderRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedInvPlaceholderSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedInvPlaceholderSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OrderedInvPlaceholderSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedInvPlaceholderSubRequestParent(String id, String method) {
    super(id, "OrderedInvPlaceholder", method);
  }
}
