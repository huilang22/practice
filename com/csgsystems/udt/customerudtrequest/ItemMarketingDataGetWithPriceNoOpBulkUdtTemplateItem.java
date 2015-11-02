/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataGetWithPriceNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemMarketingDataGetWithPriceNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataGetWithPriceNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataWithPriceObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataGetWithPriceNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataGetWithPriceNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataWithPriceObjectData noOpInIn) {
    super(id, context, "ItemMarketingDataGetWithPrice");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataWithPriceObjectHelper.toMap(noOpIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
/**
 *
 * Sets the  ItemMarketingData
 * @param noOpInIn ItemMarketingDataWithPriceObjectData to set
 *
 */
  public void setItemMarketingData(ItemMarketingDataWithPriceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemMarketingData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataWithPriceObjectData getItemMarketingData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemMarketingDataWithPriceObjectHelper.fromMap(inputMap, "ItemMarketingData");
  }
}
