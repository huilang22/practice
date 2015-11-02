/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueSubRequestParent.java
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
 * Abstract base class for all BsdQueue related UdtSubRequestParents
 *
 */
public abstract class BsdQueueSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdQueueRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdQueueRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdQueueSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdQueueSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdQueueSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdQueueSubRequestParent(String id, String method) {
    super(id, "BsdQueue", method);
  }
}
