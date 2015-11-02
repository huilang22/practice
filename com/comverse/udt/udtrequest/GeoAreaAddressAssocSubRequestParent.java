/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocSubRequestParent.java
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
 * Abstract base class for all GeoAreaAddressAssoc related UdtSubRequestParents
 *
 */
public abstract class GeoAreaAddressAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeoAreaAddressAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaAddressAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeoAreaAddressAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaAddressAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeoAreaAddressAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeoAreaAddressAssocSubRequestParent(String id, String method) {
    super(id, "GeoAreaAddressAssoc", method);
  }
}
