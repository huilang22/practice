/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandSubRequestParent.java
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
 * Abstract base class for all DistanceBand related UdtSubRequestParents
 *
 */
public abstract class DistanceBandSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DistanceBandRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DistanceBandRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DistanceBandSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DistanceBandSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DistanceBandSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DistanceBandSubRequestParent(String id, String method) {
    super(id, "DistanceBand", method);
  }
}
