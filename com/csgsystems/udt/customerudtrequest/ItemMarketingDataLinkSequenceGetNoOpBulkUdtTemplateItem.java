/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemMarketingDataLinkSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataLinkSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataLinkObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataLinkSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataLinkSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectKeyData noOpInIn) {
    super(id, context, "ItemMarketingDataLinkSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(noOpIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
/**
 *
 * Sets the  ItemMarketingDataLink
 * @param noOpInIn ItemMarketingDataLinkObjectKeyData to set
 *
 */
  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemMarketingDataLink passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataLinkObjectKeyData getItemMarketingDataLink() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemMarketingDataLinkObjectKeyHelper.fromMap(inputMap, "ItemMarketingDataLink");
  }
}
