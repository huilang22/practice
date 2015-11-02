/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemTypeAssocGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemTypeAssocGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemTypeAssocObjData noOpIn;

/**
 *
 * Constructor to create a   ItemTypeAssocGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemTypeAssocGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeAssocObjData noOpInIn) {
    super(id, context, "ItemTypeAssocGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(noOpIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }
/**
 *
 * Sets the  ItemTypeAssoc
 * @param noOpInIn ItemTypeAssocObjData to set
 *
 */
  public void setItemTypeAssoc(ItemTypeAssocObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemTypeAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeAssocObjData getItemTypeAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemTypeAssocObjHelper.fromMap(inputMap, "ItemTypeAssoc");
  }
}
