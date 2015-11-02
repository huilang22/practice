/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectData itemMarketingDataCreateIn;
/**
 *
 * Constructor to create a  ItemMarketingDataCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectData itemMarketingDataCreateInIn) {
    super(id, context, "ItemMarketingDataCreate");
    itemMarketingDataCreateIn = itemMarketingDataCreateInIn;
  }

  public void translateToMap() {
    if (itemMarketingDataCreateIn != null) {
      itemMarketingDataCreateIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(itemMarketingDataCreateIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param itemMarketingDataCreateInIn Value of the itemMarketingDataCreateIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectData itemMarketingDataCreateInIn) {
    itemMarketingDataCreateIn = itemMarketingDataCreateInIn;
  }

  public void translateFromMap() {
    itemMarketingDataCreateIn = ItemMarketingDataObjectHelper.fromMap(inputMap, "ItemMarketingData");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectData getItemMarketingData( ) {
    return itemMarketingDataCreateIn;
  }

}
