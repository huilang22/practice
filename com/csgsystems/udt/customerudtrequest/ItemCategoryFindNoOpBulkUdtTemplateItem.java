/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemCategoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCategoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemCategoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemCategoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCategoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryObjectDataList noOpInIn) {
    super(id, context, "ItemCategoryFind");
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
        mapArray[i] = ItemCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemCategory", noOpIn);
      }
      addInput("ItemCategory", mapList);
    }
  }
/**
 *
 * Sets the  ItemCategory
 * @param noOpInIn ItemCategoryObjectDataList to set
 *
 */
  public void setItemCategory(ItemCategoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemCategory passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryObjectDataList getItemCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemCategoryObjectHelper.fromMapList(inputMap, "ItemCategoryList");
  }
}
