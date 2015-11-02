/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeSubRequestParent.java
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
 * Abstract base class for all GeoAreaType related UdtSubRequestParents
 *
 */
public abstract class GeoAreaTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeoAreaTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeoAreaTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeoAreaTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeoAreaTypeSubRequestParent(String id, String method) {
    super(id, "GeoAreaType", method);
  }
}
