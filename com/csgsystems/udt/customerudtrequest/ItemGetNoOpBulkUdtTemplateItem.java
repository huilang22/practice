/*
 * Generated code DO NOT EDIT
 * Generated file: ItemGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ItemGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectData noOpInIn) {
    super(id, context, "ItemGet");
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
