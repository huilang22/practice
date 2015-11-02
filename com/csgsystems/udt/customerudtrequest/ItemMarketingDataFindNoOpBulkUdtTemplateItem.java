/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemMarketingDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectDataList noOpInIn) {
    super(id, context, "ItemMarketingDataFind");
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
        mapArray[i] = ItemMarketingDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemMarketingData", noOpIn);
      }
      addInput("ItemMarketingData", mapList);
    }
  }
/**
 *
 * Sets the  ItemMarketingData
 * @param noOpInIn ItemMarketingDataObjectDataList to set
 *
 */
  public void setItemMarketingData(ItemMarketingDataObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemMarketingData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataObjectDataList getItemMarketingData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemMarketingDataObjectHelper.fromMapList(inputMap, "ItemMarketingDataList");
  }
}
