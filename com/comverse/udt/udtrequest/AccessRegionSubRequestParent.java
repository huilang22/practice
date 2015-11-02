/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionSubRequestParent.java
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
 * Abstract base class for all AccessRegion related UdtSubRequestParents
 *
 */
public abstract class AccessRegionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccessRegionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccessRegionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccessRegionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccessRegionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccessRegionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccessRegionSubRequestParent(String id, String method) {
    super(id, "AccessRegion", method);
  }
}
