/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeAssocUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeAssocUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeAssocUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeAssocObjData updateIn;
/**
 *
 * Constructor to create a  ItemTypeAssocUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeAssocUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeAssocObjData updateInIn) {
    super(id, context, "ItemTypeAssocUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(updateIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }


/**
 *
 * Sets the ItemTypeAssoc
 * @param updateInIn Value of the updateIn
 *
 */

  public void setItemTypeAssoc(ItemTypeAssocObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = ItemTypeAssocObjHelper.fromMap(inputMap, "ItemTypeAssoc");
  }

/**
 *
 * Gets the ItemTypeAssoc
 * @return Value of the ItemTypeAssoc
 *
 */

  public ItemTypeAssocObjData getItemTypeAssoc( ) {
    return updateIn;
  }

}
