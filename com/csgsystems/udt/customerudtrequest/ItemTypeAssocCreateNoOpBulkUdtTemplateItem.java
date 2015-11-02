/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeAssocCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemTypeAssocCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemTypeAssocCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemTypeAssocObjData noOpIn;

/**
 *
 * Constructor to create a   ItemTypeAssocCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemTypeAssocCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeAssocObjData noOpInIn) {
    super(id, context, "ItemTypeAssocCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(noOpIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }
/**
 *
 * Sets the  ItemTypeAssoc
 * @param noOpInIn ItemTypeAssocObjData to set
 *
 */
  public void setItemTypeAssoc(ItemTypeAssocObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemTypeAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeAssocObjData getItemTypeAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemTypeAssocObjHelper.fromMap(inputMap, "ItemTypeAssoc");
  }
}
