/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionSubRequestParent.java
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
 * Abstract base class for all ItemAction related UdtSubRequestParents
 *
 */
public abstract class ItemActionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemActionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemActionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemActionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemActionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemActionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemActionSubRequestParent(String id, String method) {
    super(id, "ItemAction", method);
  }
}
