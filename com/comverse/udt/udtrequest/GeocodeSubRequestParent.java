/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeocodeSubRequestParent.java
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
 * Abstract base class for all Geocode related UdtSubRequestParents
 *
 */
public abstract class GeocodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeocodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeocodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeocodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeocodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeocodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeocodeSubRequestParent(String id, String method) {
    super(id, "Geocode", method);
  }
}
