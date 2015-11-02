/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationCreateNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ItemCategoryMarketingAssociationCreateNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryMarketingAssociationCreateNoOpRequest extends ItemCategoryMarketingAssociationSubRequestParent {
/**
 *
 * Constructor to create a   ItemCategoryMarketingAssociationCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryMarketingAssociationCreateNoOpRequest(String id, ItemCategoryMarketingObjectData noOpIn) {
    super(id, "ItemCategoryMarketingAssociationCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(noOpIn, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }
/**
 *
 * Retrieves the ItemCategoryMarketingObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryMarketingObjectData getOutput() {
    return ItemCategoryMarketingObjectHelper.fromMap(outputMap, "ItemCategoryMarketingAssociation");
  }
}
