/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionSubRequestParent.java
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
 * Abstract base class for all Exclusion related UdtSubRequestParents
 *
 */
public abstract class ExclusionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExclusionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExclusionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExclusionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExclusionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExclusionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExclusionSubRequestParent(String id, String method) {
    super(id, "Exclusion", method);
  }
}
