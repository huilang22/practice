/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataLinkCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataLinkCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataLinkObjectData IMDLCreateIn;
/**
 *
 * Constructor to create a  ItemMarketingDataLinkCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataLinkCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectData IMDLCreateInIn) {
    super(id, context, "ItemMarketingDataLinkCreate");
    IMDLCreateIn = IMDLCreateInIn;
  }

  public void translateToMap() {
    if (IMDLCreateIn != null) {
      IMDLCreateIn.resetFlags(true, true);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(IMDLCreateIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }


/**
 *
 * Sets the ItemMarketingDataLink
 * @param IMDLCreateInIn Value of the IMDLCreateIn
 *
 */

  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectData IMDLCreateInIn) {
    IMDLCreateIn = IMDLCreateInIn;
  }

  public void translateFromMap() {
    IMDLCreateIn = ItemMarketingDataLinkObjectHelper.fromMap(inputMap, "ItemMarketingDataLink");
  }

/**
 *
 * Gets the ItemMarketingDataLink
 * @return Value of the ItemMarketingDataLink
 *
 */

  public ItemMarketingDataLinkObjectData getItemMarketingDataLink( ) {
    return IMDLCreateIn;
  }

}
