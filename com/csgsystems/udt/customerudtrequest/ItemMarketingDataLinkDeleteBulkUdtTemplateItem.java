/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataLinkDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataLinkDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataLinkObjectKeyData IMDLDeleteIn;
/**
 *
 * Constructor to create a  ItemMarketingDataLinkDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataLinkDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectKeyData IMDLDeleteInIn) {
    super(id, context, "ItemMarketingDataLinkDelete");
    IMDLDeleteIn = IMDLDeleteInIn;
  }

  public void translateToMap() {
    if (IMDLDeleteIn != null) {
      IMDLDeleteIn.resetFlags(true, true);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(IMDLDeleteIn, new HashMap(), "ItemMarketingDataLinkObjectKeyData").get("ItemMarketingDataLinkObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemMarketingDataLink
 * @param IMDLDeleteInIn Value of the IMDLDeleteIn
 *
 */

  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectKeyData IMDLDeleteInIn) {
    IMDLDeleteIn = IMDLDeleteInIn;
  }

  public void translateFromMap() {
    IMDLDeleteIn = ItemMarketingDataLinkObjectKeyHelper.fromMap(inputMap, "ItemMarketingDataLink");
  }

/**
 *
 * Gets the ItemMarketingDataLink
 * @return Value of the ItemMarketingDataLink
 *
 */

  public ItemMarketingDataLinkObjectKeyData getItemMarketingDataLink( ) {
    return IMDLDeleteIn;
  }

}
