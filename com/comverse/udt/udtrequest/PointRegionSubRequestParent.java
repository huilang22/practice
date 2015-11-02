/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionSubRequestParent.java
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
 * Abstract base class for all PointRegion related UdtSubRequestParents
 *
 */
public abstract class PointRegionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PointRegionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PointRegionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PointRegionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PointRegionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PointRegionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PointRegionSubRequestParent(String id, String method) {
    super(id, "PointRegion", method);
  }
}
