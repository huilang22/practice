/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeObjectFilter ItemTypeFindIn;
/**
 *
 * Constructor to create a  ItemTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeObjectFilter ItemTypeFindInIn) {
    super(id, context, "ItemTypeFind");
    ItemTypeFindIn = ItemTypeFindInIn;
  }

  public void translateToMap() {
    if (ItemTypeFindIn != null) {
      Integer index =  ItemTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemType", ItemTypeObjectHelper.toMap(ItemTypeFindIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }


/**
 *
 * Sets the ItemType
 * @param ItemTypeFindInIn Value of the ItemTypeFindIn
 *
 */

  public void setItemType(ItemTypeObjectFilter ItemTypeFindInIn) {
    ItemTypeFindIn = ItemTypeFindInIn;
  }

  public void translateFromMap() {
    ItemTypeFindIn = ItemTypeObjectHelper.fromMapFilter(inputMap, "ItemType");
  }

/**
 *
 * Gets the ItemType
 * @return Value of the ItemType
 *
 */

  public ItemTypeObjectFilter getItemType( ) {
    return ItemTypeFindIn;
  }

}
