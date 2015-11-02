/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataLinkUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataLinkUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataLinkObjectData IMDLUpdateIn;
/**
 *
 * Constructor to create a  ItemMarketingDataLinkUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataLinkUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectData IMDLUpdateInIn) {
    super(id, context, "ItemMarketingDataLinkUpdate");
    IMDLUpdateIn = IMDLUpdateInIn;
  }

  public void translateToMap() {
    if (IMDLUpdateIn != null) {
      IMDLUpdateIn.resetFlags(true, true);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(IMDLUpdateIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }


/**
 *
 * Sets the ItemMarketingDataLink
 * @param IMDLUpdateInIn Value of the IMDLUpdateIn
 *
 */

  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectData IMDLUpdateInIn) {
    IMDLUpdateIn = IMDLUpdateInIn;
  }

  public void translateFromMap() {
    IMDLUpdateIn = ItemMarketingDataLinkObjectHelper.fromMap(inputMap, "ItemMarketingDataLink");
  }

/**
 *
 * Gets the ItemMarketingDataLink
 * @return Value of the ItemMarketingDataLink
 *
 */

  public ItemMarketingDataLinkObjectData getItemMarketingDataLink( ) {
    return IMDLUpdateIn;
  }

}
