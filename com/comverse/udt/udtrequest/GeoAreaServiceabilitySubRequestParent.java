/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilitySubRequestParent.java
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
 * Abstract base class for all GeoAreaServiceability related UdtSubRequestParents
 *
 */
public abstract class GeoAreaServiceabilitySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeoAreaServiceabilityRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaServiceabilityRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeoAreaServiceabilitySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaServiceabilitySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeoAreaServiceabilitySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeoAreaServiceabilitySubRequestParent(String id, String method) {
    super(id, "GeoAreaServiceability", method);
  }
}
