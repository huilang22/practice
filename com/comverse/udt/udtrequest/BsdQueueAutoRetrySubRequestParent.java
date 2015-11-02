/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetrySubRequestParent.java
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
 * Abstract base class for all BsdQueueAutoRetry related UdtSubRequestParents
 *
 */
public abstract class BsdQueueAutoRetrySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdQueueAutoRetryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdQueueAutoRetryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdQueueAutoRetrySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdQueueAutoRetrySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdQueueAutoRetrySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdQueueAutoRetrySubRequestParent(String id, String method) {
    super(id, "BsdQueueAutoRetry", method);
  }
}
