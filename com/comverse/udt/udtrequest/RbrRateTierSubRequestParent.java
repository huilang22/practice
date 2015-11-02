/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierSubRequestParent.java
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
 * Abstract base class for all RbrRateTier related UdtSubRequestParents
 *
 */
public abstract class RbrRateTierSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrRateTierRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrRateTierRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrRateTierSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrRateTierSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrRateTierSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrRateTierSubRequestParent(String id, String method) {
    super(id, "RbrRateTier", method);
  }
}
