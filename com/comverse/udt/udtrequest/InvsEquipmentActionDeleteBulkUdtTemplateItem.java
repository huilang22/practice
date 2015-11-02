/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsEquipmentActionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentActionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentActionObjectData InvsEquipmentActionDeleteIn;
/**
 *
 * Constructor to create a  InvsEquipmentActionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentActionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionObjectData InvsEquipmentActionDeleteInIn) {
    super(id, context, "InvsEquipmentActionDelete");
    InvsEquipmentActionDeleteIn = InvsEquipmentActionDeleteInIn;
  }

  public void translateToMap() {
    if (InvsEquipmentActionDeleteIn != null) {
      InvsEquipmentActionDeleteIn.resetFlags(true, true);
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionDeleteIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }


/**
 *
 * Sets the InvsEquipmentAction
 * @param InvsEquipmentActionDeleteInIn Value of the InvsEquipmentActionDeleteIn
 *
 */

  public void setInvsEquipmentAction(InvsEquipmentActionObjectData InvsEquipmentActionDeleteInIn) {
    InvsEquipmentActionDeleteIn = InvsEquipmentActionDeleteInIn;
  }

  public void translateFromMap() {
    InvsEquipmentActionDeleteIn = InvsEquipmentActionObjectHelper.fromMap(inputMap, "InvsEquipmentAction");
  }

/**
 *
 * Gets the InvsEquipmentAction
 * @return Value of the InvsEquipmentAction
 *
 */

  public InvsEquipmentActionObjectData getInvsEquipmentAction( ) {
    return InvsEquipmentActionDeleteIn;
  }

}
