/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteSubRequestParent.java
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
 * Abstract base class for all ItemRoute related UdtSubRequestParents
 *
 */
public abstract class ItemRouteSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemRouteRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemRouteRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemRouteSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemRouteSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemRouteSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemRouteSubRequestParent(String id, String method) {
    super(id, "ItemRoute", method);
  }
}
