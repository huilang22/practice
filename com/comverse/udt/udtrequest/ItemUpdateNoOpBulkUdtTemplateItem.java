/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ItemUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectData noOpInIn) {
    super(id, context, "ItemUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Item", ItemObjectHelper.toMap(noOpIn, new HashMap(), "Item").get("Item"));
    }
  }
/**
 *
 * Sets the  Item
 * @param noOpInIn ItemObjectData to set
 *
 */
  public void setItem(ItemObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Item passed into the constructor
 * @return Simulated response
 *
 */
  public ItemObjectData getItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemObjectHelper.fromMap(inputMap, "Item");
  }
}
