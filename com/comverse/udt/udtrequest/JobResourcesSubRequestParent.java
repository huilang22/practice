/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesSubRequestParent.java
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
 * Abstract base class for all JobResources related UdtSubRequestParents
 *
 */
public abstract class JobResourcesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on JobResourcesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(JobResourcesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on JobResourcesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(JobResourcesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for JobResourcesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public JobResourcesSubRequestParent(String id, String method) {
    super(id, "JobResources", method);
  }
}
