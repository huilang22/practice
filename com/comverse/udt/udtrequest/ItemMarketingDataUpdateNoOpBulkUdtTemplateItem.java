/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemMarketingDataUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectData noOpInIn) {
    super(id, context, "ItemMarketingDataUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(noOpIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
/**
 *
 * Sets the  ItemMarketingData
 * @param noOpInIn ItemMarketingDataObjectData to set
 *
 */
  public void setItemMarketingData(ItemMarketingDataObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemMarketingData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataObjectData getItemMarketingData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemMarketingDataObjectHelper.fromMap(inputMap, "ItemMarketingData");
  }
}
