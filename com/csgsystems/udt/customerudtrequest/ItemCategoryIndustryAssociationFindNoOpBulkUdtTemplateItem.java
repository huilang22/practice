/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryIndustryAssociationFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemCategoryIndustryAssociationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCategoryIndustryAssociationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemCategoryIndustryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemCategoryIndustryAssociationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCategoryIndustryAssociationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryIndustryObjectDataList noOpInIn) {
    super(id, context, "ItemCategoryIndustryAssociationFind");
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
        mapArray[i] = ItemCategoryIndustryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemCategoryIndustryAssociation", noOpIn);
      }
      addInput("ItemCategoryIndustryAssociation", mapList);
    }
  }
/**
 *
 * Sets the  ItemCategoryIndustryAssociation
 * @param noOpInIn ItemCategoryIndustryObjectDataList to set
 *
 */
  public void setItemCategoryIndustryAssociation(ItemCategoryIndustryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemCategoryIndustryAssociation passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryIndustryObjectDataList getItemCategoryIndustryAssociation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemCategoryIndustryObjectHelper.fromMapList(inputMap, "ItemCategoryIndustryAssociationList");
  }
}
