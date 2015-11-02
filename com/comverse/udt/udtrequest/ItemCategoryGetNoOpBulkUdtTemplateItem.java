/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemCategoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCategoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemCategoryObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemCategoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCategoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryObjectData noOpInIn) {
    super(id, context, "ItemCategoryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(noOpIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }
/**
 *
 * Sets the  ItemCategory
 * @param noOpInIn ItemCategoryObjectData to set
 *
 */
  public void setItemCategory(ItemCategoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemCategory passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryObjectData getItemCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemCategoryObjectHelper.fromMap(inputMap, "ItemCategory");
  }
}
