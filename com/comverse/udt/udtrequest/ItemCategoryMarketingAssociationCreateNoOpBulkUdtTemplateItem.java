/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemCategoryMarketingAssociationCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCategoryMarketingAssociationCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemCategoryMarketingObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemCategoryMarketingAssociationCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCategoryMarketingAssociationCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryMarketingObjectData noOpInIn) {
    super(id, context, "ItemCategoryMarketingAssociationCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(noOpIn, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }
/**
 *
 * Sets the  ItemCategoryMarketingAssociation
 * @param noOpInIn ItemCategoryMarketingObjectData to set
 *
 */
  public void setItemCategoryMarketingAssociation(ItemCategoryMarketingObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemCategoryMarketingAssociation passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryMarketingObjectData getItemCategoryMarketingAssociation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemCategoryMarketingObjectHelper.fromMap(inputMap, "ItemCategoryMarketingAssociation");
  }
}
