/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusSubRequestParent.java
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
 * Abstract base class for all BatchStatus related UdtSubRequestParents
 *
 */
public abstract class BatchStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchStatusSubRequestParent(String id, String method) {
    super(id, "BatchStatus", method);
  }
}
