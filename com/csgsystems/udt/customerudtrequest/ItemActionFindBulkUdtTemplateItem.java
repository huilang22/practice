/*
 * Generated code DO NOT EDIT
 * Generated file: ItemActionFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemActionObjectFilter ItemActionFindIn;
/**
 *
 * Constructor to create a  ItemActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectFilter ItemActionFindInIn) {
    super(id, context, "ItemActionFind");
    ItemActionFindIn = ItemActionFindInIn;
  }

  public void translateToMap() {
    if (ItemActionFindIn != null) {
      Integer index =  ItemActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemAction", ItemActionObjectHelper.toMap(ItemActionFindIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }


/**
 *
 * Sets the ItemAction
 * @param ItemActionFindInIn Value of the ItemActionFindIn
 *
 */

  public void setItemAction(ItemActionObjectFilter ItemActionFindInIn) {
    ItemActionFindIn = ItemActionFindInIn;
  }

  public void translateFromMap() {
    ItemActionFindIn = ItemActionObjectHelper.fromMapFilter(inputMap, "ItemAction");
  }

/**
 *
 * Gets the ItemAction
 * @return Value of the ItemAction
 *
 */

  public ItemActionObjectFilter getItemAction( ) {
    return ItemActionFindIn;
  }

}
