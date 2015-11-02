/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionSubRequestParent.java
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
 * Abstract base class for all GeoAreaBoundaryCondition related UdtSubRequestParents
 *
 */
public abstract class GeoAreaBoundaryConditionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeoAreaBoundaryConditionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaBoundaryConditionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeoAreaBoundaryConditionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaBoundaryConditionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeoAreaBoundaryConditionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeoAreaBoundaryConditionSubRequestParent(String id, String method) {
    super(id, "GeoAreaBoundaryCondition", method);
  }
}
