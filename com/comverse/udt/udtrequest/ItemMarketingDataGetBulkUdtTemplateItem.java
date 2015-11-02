/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectKeyData itemMarketingDataGetIn;
/**
 *
 * Constructor to create a  ItemMarketingDataGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectKeyData itemMarketingDataGetInIn) {
    super(id, context, "ItemMarketingDataGet");
    itemMarketingDataGetIn = itemMarketingDataGetInIn;
  }

  public void translateToMap() {
    if (itemMarketingDataGetIn != null) {
      itemMarketingDataGetIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(itemMarketingDataGetIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param itemMarketingDataGetInIn Value of the itemMarketingDataGetIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectKeyData itemMarketingDataGetInIn) {
    itemMarketingDataGetIn = itemMarketingDataGetInIn;
  }

  public void translateFromMap() {
    itemMarketingDataGetIn = ItemMarketingDataObjectKeyHelper.fromMap(inputMap, "ItemMarketingData");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectKeyData getItemMarketingData( ) {
    return itemMarketingDataGetIn;
  }

}
