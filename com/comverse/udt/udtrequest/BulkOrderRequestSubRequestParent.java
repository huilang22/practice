/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestSubRequestParent.java
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
 * Abstract base class for all BulkOrderRequest related UdtSubRequestParents
 *
 */
public abstract class BulkOrderRequestSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BulkOrderRequestRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BulkOrderRequestRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BulkOrderRequestSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BulkOrderRequestSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BulkOrderRequestSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BulkOrderRequestSubRequestParent(String id, String method) {
    super(id, "BulkOrderRequest", method);
  }
}
