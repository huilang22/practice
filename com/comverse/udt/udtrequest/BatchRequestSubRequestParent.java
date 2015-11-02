/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSubRequestParent.java
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
 * Abstract base class for all BatchRequest related UdtSubRequestParents
 *
 */
public abstract class BatchRequestSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchRequestRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchRequestSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchRequestSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchRequestSubRequestParent(String id, String method) {
    super(id, "BatchRequest", method);
  }
}
