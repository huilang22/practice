/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryMarketingAssociationDeleteNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a ItemCategoryMarketingAssociationDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCategoryMarketingAssociationDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemCategoryMarketingObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemCategoryMarketingAssociationDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCategoryMarketingAssociationDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryMarketingObjectData noOpInIn) {
    super(id, context, "ItemCategoryMarketingAssociationDelete");
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
