/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentSubRequestParent.java
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
 * Abstract base class for all BatchRequestSegment related UdtSubRequestParents
 *
 */
public abstract class BatchRequestSegmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchRequestSegmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestSegmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchRequestSegmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestSegmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchRequestSegmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchRequestSegmentSubRequestParent(String id, String method) {
    super(id, "BatchRequestSegment", method);
  }
}
