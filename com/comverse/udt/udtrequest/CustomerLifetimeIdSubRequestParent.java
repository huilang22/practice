/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdSubRequestParent.java
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
 * Abstract base class for all CustomerLifetimeId related UdtSubRequestParents
 *
 */
public abstract class CustomerLifetimeIdSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CustomerLifetimeIdRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerLifetimeIdRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CustomerLifetimeIdSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerLifetimeIdSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CustomerLifetimeIdSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CustomerLifetimeIdSubRequestParent(String id, String method) {
    super(id, "CustomerLifetimeId", method);
  }
}
