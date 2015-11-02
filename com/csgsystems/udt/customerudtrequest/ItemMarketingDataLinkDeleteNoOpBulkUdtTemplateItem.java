/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemMarketingDataLinkDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataLinkDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataLinkObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataLinkDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataLinkDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectData noOpInIn) {
    super(id, context, "ItemMarketingDataLinkDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(noOpIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
/**
 *
 * Sets the  ItemMarketingDataLink
 * @param noOpInIn ItemMarketingDataLinkObjectData to set
 *
 */
  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemMarketingDataLink passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataLinkObjectData getItemMarketingDataLink() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemMarketingDataLinkObjectHelper.fromMap(inputMap, "ItemMarketingDataLink");
  }
}
