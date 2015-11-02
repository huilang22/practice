/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectData itemMarketingDataUpdateIn;
/**
 *
 * Constructor to create a  ItemMarketingDataUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectData itemMarketingDataUpdateInIn) {
    super(id, context, "ItemMarketingDataUpdate");
    itemMarketingDataUpdateIn = itemMarketingDataUpdateInIn;
  }

  public void translateToMap() {
    if (itemMarketingDataUpdateIn != null) {
      itemMarketingDataUpdateIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(itemMarketingDataUpdateIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param itemMarketingDataUpdateInIn Value of the itemMarketingDataUpdateIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectData itemMarketingDataUpdateInIn) {
    itemMarketingDataUpdateIn = itemMarketingDataUpdateInIn;
  }

  public void translateFromMap() {
    itemMarketingDataUpdateIn = ItemMarketingDataObjectHelper.fromMap(inputMap, "ItemMarketingData");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectData getItemMarketingData( ) {
    return itemMarketingDataUpdateIn;
  }

}
