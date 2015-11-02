/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectFilter itemMarketingDataFindIn;
/**
 *
 * Constructor to create a  ItemMarketingDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectFilter itemMarketingDataFindInIn) {
    super(id, context, "ItemMarketingDataFind");
    itemMarketingDataFindIn = itemMarketingDataFindInIn;
  }

  public void translateToMap() {
    if (itemMarketingDataFindIn != null) {
      Integer index =  itemMarketingDataFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(itemMarketingDataFindIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param itemMarketingDataFindInIn Value of the itemMarketingDataFindIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectFilter itemMarketingDataFindInIn) {
    itemMarketingDataFindIn = itemMarketingDataFindInIn;
  }

  public void translateFromMap() {
    itemMarketingDataFindIn = ItemMarketingDataObjectHelper.fromMapFilter(inputMap, "ItemMarketingData");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectFilter getItemMarketingData( ) {
    return itemMarketingDataFindIn;
  }

}
