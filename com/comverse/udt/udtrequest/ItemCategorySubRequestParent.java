/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategorySubRequestParent.java
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
 * Abstract base class for all ItemCategory related UdtSubRequestParents
 *
 */
public abstract class ItemCategorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemCategoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemCategoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemCategorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemCategorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemCategorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemCategorySubRequestParent(String id, String method) {
    super(id, "ItemCategory", method);
  }
}
