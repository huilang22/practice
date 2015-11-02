/*
 * Generated code DO NOT EDIT
 * Generated file: ItemActionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemActionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemActionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemActionObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemActionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemActionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectData noOpInIn) {
    super(id, context, "ItemActionCreate");
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
