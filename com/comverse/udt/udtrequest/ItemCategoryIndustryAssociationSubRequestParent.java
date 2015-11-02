/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationSubRequestParent.java
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
 * Abstract base class for all ItemCategoryIndustryAssociation related UdtSubRequestParents
 *
 */
public abstract class ItemCategoryIndustryAssociationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemCategoryIndustryAssociationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemCategoryIndustryAssociationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemCategoryIndustryAssociationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemCategoryIndustryAssociationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemCategoryIndustryAssociationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemCategoryIndustryAssociationSubRequestParent(String id, String method) {
    super(id, "ItemCategoryIndustryAssociation", method);
  }
}
