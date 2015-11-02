/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryMarketingAssociationFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemCategoryMarketingAssociationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCategoryMarketingAssociationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemCategoryMarketingObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemCategoryMarketingAssociationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCategoryMarketingAssociationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryMarketingObjectDataList noOpInIn) {
    super(id, context, "ItemCategoryMarketingAssociationFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ItemCategoryMarketingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemCategoryMarketingAssociation", noOpIn);
      }
      addInput("ItemCategoryMarketingAssociation", mapList);
    }
  }
/**
 *
 * Sets the  ItemCategoryMarketingAssociation
 * @param noOpInIn ItemCategoryMarketingObjectDataList to set
 *
 */
  public void setItemCategoryMarketingAssociation(ItemCategoryMarketingObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemCategoryMarketingAssociation passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryMarketingObjectDataList getItemCategoryMarketingAssociation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemCategoryMarketingObjectHelper.fromMapList(inputMap, "ItemCategoryMarketingAssociationList");
  }
}
