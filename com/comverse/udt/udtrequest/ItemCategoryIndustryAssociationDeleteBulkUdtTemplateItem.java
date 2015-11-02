/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryIndustryAssociationDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryIndustryAssociationDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryIndustryObjectKeyData ICIDeleteIn;
/**
 *
 * Constructor to create a  ItemCategoryIndustryAssociationDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryIndustryAssociationDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryIndustryObjectKeyData ICIDeleteInIn) {
    super(id, context, "ItemCategoryIndustryAssociationDelete");
    ICIDeleteIn = ICIDeleteInIn;
  }

  public void translateToMap() {
    if (ICIDeleteIn != null) {
      ICIDeleteIn.resetFlags(true, true);
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectKeyHelper.toMap(ICIDeleteIn, new HashMap(), "ItemCategoryIndustryObjectKeyData").get("ItemCategoryIndustryObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemCategoryIndustryAssociation
 * @param ICIDeleteInIn Value of the ICIDeleteIn
 *
 */

  public void setItemCategoryIndustryAssociation(ItemCategoryIndustryObjectKeyData ICIDeleteInIn) {
    ICIDeleteIn = ICIDeleteInIn;
  }

  public void translateFromMap() {
    ICIDeleteIn = ItemCategoryIndustryObjectKeyHelper.fromMap(inputMap, "ItemCategoryIndustryAssociation");
  }

/**
 *
 * Gets the ItemCategoryIndustryAssociation
 * @return Value of the ItemCategoryIndustryAssociation
 *
 */

  public ItemCategoryIndustryObjectKeyData getItemCategoryIndustryAssociation( ) {
    return ICIDeleteIn;
  }

}
