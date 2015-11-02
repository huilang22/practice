/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeAssocObjData createIn;
/**
 *
 * Constructor to create a  ItemTypeAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeAssocObjData createInIn) {
    super(id, context, "ItemTypeAssocCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(createIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }


/**
 *
 * Sets the ItemTypeAssoc
 * @param createInIn Value of the createIn
 *
 */

  public void setItemTypeAssoc(ItemTypeAssocObjData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = ItemTypeAssocObjHelper.fromMap(inputMap, "ItemTypeAssoc");
  }

/**
 *
 * Gets the ItemTypeAssoc
 * @return Value of the ItemTypeAssoc
 *
 */

  public ItemTypeAssocObjData getItemTypeAssoc( ) {
    return createIn;
  }

}
