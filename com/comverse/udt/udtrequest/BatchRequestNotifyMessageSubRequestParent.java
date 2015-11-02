/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageSubRequestParent.java
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
 * Abstract base class for all BatchRequestNotifyMessage related UdtSubRequestParents
 *
 */
public abstract class BatchRequestNotifyMessageSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchRequestNotifyMessageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestNotifyMessageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchRequestNotifyMessageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestNotifyMessageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchRequestNotifyMessageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchRequestNotifyMessageSubRequestParent(String id, String method) {
    super(id, "BatchRequestNotifyMessage", method);
  }
}
