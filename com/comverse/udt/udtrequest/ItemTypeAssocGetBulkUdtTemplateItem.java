/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocGetBulkUdtTemplateItem.java
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
