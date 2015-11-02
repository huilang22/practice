/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataFindWithPriceNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemMarketingDataFindWithPriceNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataFindWithPriceNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataWithPriceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataFindWithPriceNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataFindWithPriceNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataWithPriceObjectDataList noOpInIn) {
    super(id, context, "ItemMarketingDataFindWithPrice");
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
        mapArray[i] = ItemMarketingDataWithPriceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemMarketingData", noOpIn);
      }
      addInput("ItemMarketingData", mapList);
    }
  }
/**
 *
 * Sets the  ItemMarketingData
 * @param noOpInIn ItemMarketingDataWithPriceObjectDataList to set
 *
 */
  public void setItemMarketingData(ItemMarketingDataWithPriceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemMarketingData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataWithPriceObjectDataList getItemMarketingData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemMarketingDataWithPriceObjectHelper.fromMapList(inputMap, "ItemMarketingDataList");
  }
}
