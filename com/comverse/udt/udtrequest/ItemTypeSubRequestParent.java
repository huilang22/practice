/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeSubRequestParent.java
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
 * Abstract base class for all ItemType related UdtSubRequestParents
 *
 */
public abstract class ItemTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemTypeSubRequestParent(String id, String method) {
    super(id, "ItemType", method);
  }
}
