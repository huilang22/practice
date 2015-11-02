/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemMarketingDataLinkCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataLinkCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataLinkObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataLinkCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataLinkCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectData noOpInIn) {
    super(id, context, "ItemMarketingDataLinkCreate");
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
