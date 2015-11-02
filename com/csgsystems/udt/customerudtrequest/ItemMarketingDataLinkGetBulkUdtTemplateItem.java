/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataLinkGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataLinkGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataLinkObjectKeyData IMDLGetIn;
/**
 *
 * Constructor to create a  ItemMarketingDataLinkGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataLinkGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectKeyData IMDLGetInIn) {
    super(id, context, "ItemMarketingDataLinkGet");
    IMDLGetIn = IMDLGetInIn;
  }

  public void translateToMap() {
    if (IMDLGetIn != null) {
      IMDLGetIn.resetFlags(true, true);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(IMDLGetIn, new HashMap(), "ItemMarketingDataLinkObjectKeyData").get("ItemMarketingDataLinkObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemMarketingDataLink
 * @param IMDLGetInIn Value of the IMDLGetIn
 *
 */

  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectKeyData IMDLGetInIn) {
    IMDLGetIn = IMDLGetInIn;
  }

  public void translateFromMap() {
    IMDLGetIn = ItemMarketingDataLinkObjectKeyHelper.fromMap(inputMap, "ItemMarketingDataLink");
  }

/**
 *
 * Gets the ItemMarketingDataLink
 * @return Value of the ItemMarketingDataLink
 *
 */

  public ItemMarketingDataLinkObjectKeyData getItemMarketingDataLink( ) {
    return IMDLGetIn;
  }

}
