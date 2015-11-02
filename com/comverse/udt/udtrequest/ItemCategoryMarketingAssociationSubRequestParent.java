/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationSubRequestParent.java
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
 * Abstract base class for all ItemCategoryMarketingAssociation related UdtSubRequestParents
 *
 */
public abstract class ItemCategoryMarketingAssociationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemCategoryMarketingAssociationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemCategoryMarketingAssociationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemCategoryMarketingAssociationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemCategoryMarketingAssociationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemCategoryMarketingAssociationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemCategoryMarketingAssociationSubRequestParent(String id, String method) {
    super(id, "ItemCategoryMarketingAssociation", method);
  }
}
