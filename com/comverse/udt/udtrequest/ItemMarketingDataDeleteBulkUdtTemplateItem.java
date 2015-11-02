/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectKeyData itemMarketingDataDeleteIn;
/**
 *
 * Constructor to create a  ItemMarketingDataDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectKeyData itemMarketingDataDeleteInIn) {
    super(id, context, "ItemMarketingDataDelete");
    itemMarketingDataDeleteIn = itemMarketingDataDeleteInIn;
  }

  public void translateToMap() {
    if (itemMarketingDataDeleteIn != null) {
      itemMarketingDataDeleteIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(itemMarketingDataDeleteIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param itemMarketingDataDeleteInIn Value of the itemMarketingDataDeleteIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectKeyData itemMarketingDataDeleteInIn) {
    itemMarketingDataDeleteIn = itemMarketingDataDeleteInIn;
  }

  public void translateFromMap() {
    itemMarketingDataDeleteIn = ItemMarketingDataObjectKeyHelper.fromMap(inputMap, "ItemMarketingData");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectKeyData getItemMarketingData( ) {
    return itemMarketingDataDeleteIn;
  }

}
