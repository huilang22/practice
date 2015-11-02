/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceSubRequestParent.java
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
 * Abstract base class for all BatchInvSource related UdtSubRequestParents
 *
 */
public abstract class BatchInvSourceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchInvSourceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchInvSourceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchInvSourceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchInvSourceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchInvSourceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchInvSourceSubRequestParent(String id, String method) {
    super(id, "BatchInvSource", method);
  }
}
