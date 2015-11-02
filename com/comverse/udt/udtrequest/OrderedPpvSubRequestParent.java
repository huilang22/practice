/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPpvSubRequestParent.java
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
 * Abstract base class for all OrderedPpv related UdtSubRequestParents
 *
 */
public abstract class OrderedPpvSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OrderedPpvRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedPpvRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedPpvSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedPpvSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OrderedPpvSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedPpvSubRequestParent(String id, String method) {
    super(id, "OrderedPpv", method);
  }
}
