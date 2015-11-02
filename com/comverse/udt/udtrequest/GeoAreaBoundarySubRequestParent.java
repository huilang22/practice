/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundarySubRequestParent.java
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
 * Abstract base class for all GeoAreaBoundary related UdtSubRequestParents
 *
 */
public abstract class GeoAreaBoundarySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeoAreaBoundaryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaBoundaryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeoAreaBoundarySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaBoundarySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeoAreaBoundarySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeoAreaBoundarySubRequestParent(String id, String method) {
    super(id, "GeoAreaBoundary", method);
  }
}
