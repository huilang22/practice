/*
 * Generated code DO NOT EDIT
 * Generated file: ItemActionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemActionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemActionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemActionObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemActionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemActionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectData noOpInIn) {
    super(id, context, "ItemActionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemAction", ItemActionObjectHelper.toMap(noOpIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }
/**
 *
 * Sets the  ItemAction
 * @param noOpInIn ItemActionObjectData to set
 *
 */
  public void setItemAction(ItemActionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemAction passed into the constructor
 * @return Simulated response
 *
 */
  public ItemActionObjectData getItemAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemActionObjectHelper.fromMap(inputMap, "ItemAction");
  }
}
