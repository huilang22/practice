/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeSubRequestParent.java
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
 * Abstract base class for all BatchType related UdtSubRequestParents
 *
 */
public abstract class BatchTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchTypeSubRequestParent(String id, String method) {
    super(id, "BatchType", method);
  }
}
