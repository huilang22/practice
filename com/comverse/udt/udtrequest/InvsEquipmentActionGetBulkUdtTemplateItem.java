/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentActionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentActionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentActionObjectKeyData InvsEquipmentActionGetIn;
/**
 *
 * Constructor to create a  InvsEquipmentActionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentActionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionObjectKeyData InvsEquipmentActionGetInIn) {
    super(id, context, "InvsEquipmentActionGet");
    InvsEquipmentActionGetIn = InvsEquipmentActionGetInIn;
  }

  public void translateToMap() {
    if (InvsEquipmentActionGetIn != null) {
      InvsEquipmentActionGetIn.resetFlags(true, true);
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectKeyHelper.toMap(InvsEquipmentActionGetIn, new HashMap(), "InvsEquipmentActionObjectKeyData").get("InvsEquipmentActionObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipmentAction
 * @param InvsEquipmentActionGetInIn Value of the InvsEquipmentActionGetIn
 *
 */

  public void setInvsEquipmentAction(InvsEquipmentActionObjectKeyData InvsEquipmentActionGetInIn) {
    InvsEquipmentActionGetIn = InvsEquipmentActionGetInIn;
  }

  public void translateFromMap() {
    InvsEquipmentActionGetIn = InvsEquipmentActionObjectKeyHelper.fromMap(inputMap, "InvsEquipmentAction");
  }

/**
 *
 * Gets the InvsEquipmentAction
 * @return Value of the InvsEquipmentAction
 *
 */

  public InvsEquipmentActionObjectKeyData getInvsEquipmentAction( ) {
    return InvsEquipmentActionGetIn;
  }

}
