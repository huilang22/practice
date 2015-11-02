/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableSubRequestParent.java
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
 * Abstract base class for all BatchExecutable related UdtSubRequestParents
 *
 */
public abstract class BatchExecutableSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchExecutableRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchExecutableRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchExecutableSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchExecutableSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchExecutableSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchExecutableSubRequestParent(String id, String method) {
    super(id, "BatchExecutable", method);
  }
}
