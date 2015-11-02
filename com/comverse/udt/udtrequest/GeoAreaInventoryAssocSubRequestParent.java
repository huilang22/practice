/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocSubRequestParent.java
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
 * Abstract base class for all GeoAreaInventoryAssoc related UdtSubRequestParents
 *
 */
public abstract class GeoAreaInventoryAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeoAreaInventoryAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaInventoryAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeoAreaInventoryAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaInventoryAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeoAreaInventoryAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeoAreaInventoryAssocSubRequestParent(String id, String method) {
    super(id, "GeoAreaInventoryAssoc", method);
  }
}
