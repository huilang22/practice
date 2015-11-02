/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageSubRequestParent.java
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
 * Abstract base class for all BatchTypeStage related UdtSubRequestParents
 *
 */
public abstract class BatchTypeStageSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchTypeStageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTypeStageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchTypeStageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTypeStageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchTypeStageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchTypeStageSubRequestParent(String id, String method) {
    super(id, "BatchTypeStage", method);
  }
}
