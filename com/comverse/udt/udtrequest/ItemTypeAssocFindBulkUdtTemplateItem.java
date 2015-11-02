/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeAssocObjFilter findIn;
/**
 *
 * Constructor to create a  ItemTypeAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeAssocObjFilter findInIn) {
    super(id, context, "ItemTypeAssocFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(findIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }


/**
 *
 * Sets the ItemTypeAssoc
 * @param findInIn Value of the findIn
 *
 */

  public void setItemTypeAssoc(ItemTypeAssocObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = ItemTypeAssocObjHelper.fromMapFilter(inputMap, "ItemTypeAssoc");
  }

/**
 *
 * Gets the ItemTypeAssoc
 * @return Value of the ItemTypeAssoc
 *
 */

  public ItemTypeAssocObjFilter getItemTypeAssoc( ) {
    return findIn;
  }

}
