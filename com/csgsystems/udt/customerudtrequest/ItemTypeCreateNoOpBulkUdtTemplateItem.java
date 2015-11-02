/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeObjectData noOpInIn) {
    super(id, context, "ItemTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemType", ItemTypeObjectHelper.toMap(noOpIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }
/**
 *
 * Sets the  ItemType
 * @param noOpInIn ItemTypeObjectData to set
 *
 */
  public void setItemType(ItemTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemType passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeObjectData getItemType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemTypeObjectHelper.fromMap(inputMap, "ItemType");
  }
}
