/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationCreateNoOpRequest.java
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
 * NoOp class used to simulate a ItemCategoryIndustryAssociationCreateNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryIndustryAssociationCreateNoOpRequest extends ItemCategoryIndustryAssociationSubRequestParent {
/**
 *
 * Constructor to create a   ItemCategoryIndustryAssociationCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryIndustryAssociationCreateNoOpRequest(String id, ItemCategoryIndustryObjectData noOpIn) {
    super(id, "ItemCategoryIndustryAssociationCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(noOpIn, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }
/**
 *
 * Retrieves the ItemCategoryIndustryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryIndustryObjectData getOutput() {
    return ItemCategoryIndustryObjectHelper.fromMap(outputMap, "ItemCategoryIndustryAssociation");
  }
}
