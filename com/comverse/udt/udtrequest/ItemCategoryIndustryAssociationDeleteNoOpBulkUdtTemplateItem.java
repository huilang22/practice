/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationDeleteNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ItemCategoryIndustryAssociationDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCategoryIndustryAssociationDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemCategoryIndustryObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemCategoryIndustryAssociationDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCategoryIndustryAssociationDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryIndustryObjectData noOpInIn) {
    super(id, context, "ItemCategoryIndustryAssociationDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(noOpIn, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }
/**
 *
 * Sets the  ItemCategoryIndustryAssociation
 * @param noOpInIn ItemCategoryIndustryObjectData to set
 *
 */
  public void setItemCategoryIndustryAssociation(ItemCategoryIndustryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemCategoryIndustryAssociation passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryIndustryObjectData getItemCategoryIndustryAssociation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemCategoryIndustryObjectHelper.fromMap(inputMap, "ItemCategoryIndustryAssociation");
  }
}
