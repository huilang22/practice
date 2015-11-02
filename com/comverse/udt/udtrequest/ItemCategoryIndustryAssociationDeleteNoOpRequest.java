/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationDeleteNoOpRequest.java
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
 * NoOp class used to simulate a ItemCategoryIndustryAssociationDeleteNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryIndustryAssociationDeleteNoOpRequest extends ItemCategoryIndustryAssociationSubRequestParent {
/**
 *
 * Constructor to create a   ItemCategoryIndustryAssociationDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryIndustryAssociationDeleteNoOpRequest(String id, ItemCategoryIndustryObjectData noOpIn) {
    super(id, "ItemCategoryIndustryAssociationDeleteNoOpRequest");
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
