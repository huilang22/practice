/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeAssocObjKeyData getIn;
/**
 *
 * Constructor to create a  ItemTypeAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeAssocObjKeyData getInIn) {
    super(id, context, "ItemTypeAssocGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ItemTypeAssoc", ItemTypeAssocObjKeyHelper.toMap(getIn, new HashMap(), "ItemTypeAssocObjKeyData").get("ItemTypeAssocObjKeyData"));
    }
  }


/**
 *
 * Sets the ItemTypeAssoc
 * @param getInIn Value of the getIn
 *
 */

  public void setItemTypeAssoc(ItemTypeAssocObjKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = ItemTypeAssocObjKeyHelper.fromMap(inputMap, "ItemTypeAssoc");
  }

/**
 *
 * Gets the ItemTypeAssoc
 * @return Value of the ItemTypeAssoc
 *
 */

  public ItemTypeAssocObjKeyData getItemTypeAssoc( ) {
    return getIn;
  }

}
