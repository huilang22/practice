/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataLinkFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataLinkFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataLinkObjectFilter IMDLFindIn;
/**
 *
 * Constructor to create a  ItemMarketingDataLinkFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataLinkFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectFilter IMDLFindInIn) {
    super(id, context, "ItemMarketingDataLinkFind");
    IMDLFindIn = IMDLFindInIn;
  }

  public void translateToMap() {
    if (IMDLFindIn != null) {
      Integer index =  IMDLFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(IMDLFindIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }


/**
 *
 * Sets the ItemMarketingDataLink
 * @param IMDLFindInIn Value of the IMDLFindIn
 *
 */

  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectFilter IMDLFindInIn) {
    IMDLFindIn = IMDLFindInIn;
  }

  public void translateFromMap() {
    IMDLFindIn = ItemMarketingDataLinkObjectHelper.fromMapFilter(inputMap, "ItemMarketingDataLink");
  }

/**
 *
 * Gets the ItemMarketingDataLink
 * @return Value of the ItemMarketingDataLink
 *
 */

  public ItemMarketingDataLinkObjectFilter getItemMarketingDataLink( ) {
    return IMDLFindIn;
  }

}
