/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryMarketingAssociationDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryMarketingAssociationDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryMarketingObjectKeyData ICMDeleteIn;
/**
 *
 * Constructor to create a  ItemCategoryMarketingAssociationDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryMarketingAssociationDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryMarketingObjectKeyData ICMDeleteInIn) {
    super(id, context, "ItemCategoryMarketingAssociationDelete");
    ICMDeleteIn = ICMDeleteInIn;
  }

  public void translateToMap() {
    if (ICMDeleteIn != null) {
      ICMDeleteIn.resetFlags(true, true);
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectKeyHelper.toMap(ICMDeleteIn, new HashMap(), "ItemCategoryMarketingObjectKeyData").get("ItemCategoryMarketingObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemCategoryMarketingAssociation
 * @param ICMDeleteInIn Value of the ICMDeleteIn
 *
 */

  public void setItemCategoryMarketingAssociation(ItemCategoryMarketingObjectKeyData ICMDeleteInIn) {
    ICMDeleteIn = ICMDeleteInIn;
  }

  public void translateFromMap() {
    ICMDeleteIn = ItemCategoryMarketingObjectKeyHelper.fromMap(inputMap, "ItemCategoryMarketingAssociation");
  }

/**
 *
 * Gets the ItemCategoryMarketingAssociation
 * @return Value of the ItemCategoryMarketingAssociation
 *
 */

  public ItemCategoryMarketingObjectKeyData getItemCategoryMarketingAssociation( ) {
    return ICMDeleteIn;
  }

}
