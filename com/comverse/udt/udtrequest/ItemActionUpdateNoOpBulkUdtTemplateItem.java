/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemActionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemActionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemActionObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemActionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemActionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectData noOpInIn) {
    super(id, context, "ItemActionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemAction", ItemActionObjectHelper.toMap(noOpIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }
/**
 *
 * Sets the  ItemAction
 * @param noOpInIn ItemActionObjectData to set
 *
 */
  public void setItemAction(ItemActionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemAction passed into the constructor
 * @return Simulated response
 *
 */
  public ItemActionObjectData getItemAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemActionObjectHelper.fromMap(inputMap, "ItemAction");
  }
}
