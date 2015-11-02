/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionSubRequestParent.java
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
 * Abstract base class for all InvsGeographicRegion related UdtSubRequestParents
 *
 */
public abstract class InvsGeographicRegionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsGeographicRegionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsGeographicRegionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsGeographicRegionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsGeographicRegionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsGeographicRegionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsGeographicRegionSubRequestParent(String id, String method) {
    super(id, "InvsGeographicRegion", method);
  }
}
