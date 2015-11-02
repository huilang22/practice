/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationDeleteNoOpRequest.java
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
 * NoOp class used to simulate a ItemCategoryMarketingAssociationDeleteNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryMarketingAssociationDeleteNoOpRequest extends ItemCategoryMarketingAssociationSubRequestParent {
/**
 *
 * Constructor to create a   ItemCategoryMarketingAssociationDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryMarketingAssociationDeleteNoOpRequest(String id, ItemCategoryMarketingObjectData noOpIn) {
    super(id, "ItemCategoryMarketingAssociationDeleteNoOpRequest");
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
