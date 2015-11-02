/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentActionUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsEquipmentActionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentActionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentActionObjectData InvsEquipmentActionUpdateIn;
/**
 *
 * Constructor to create a  InvsEquipmentActionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentActionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionObjectData InvsEquipmentActionUpdateInIn) {
    super(id, context, "InvsEquipmentActionUpdate");
    InvsEquipmentActionUpdateIn = InvsEquipmentActionUpdateInIn;
  }

  public void translateToMap() {
    if (InvsEquipmentActionUpdateIn != null) {
      InvsEquipmentActionUpdateIn.resetFlags(true, true);
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionUpdateIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }


/**
 *
 * Sets the InvsEquipmentAction
 * @param InvsEquipmentActionUpdateInIn Value of the InvsEquipmentActionUpdateIn
 *
 */

  public void setInvsEquipmentAction(InvsEquipmentActionObjectData InvsEquipmentActionUpdateInIn) {
    InvsEquipmentActionUpdateIn = InvsEquipmentActionUpdateInIn;
  }

  public void translateFromMap() {
    InvsEquipmentActionUpdateIn = InvsEquipmentActionObjectHelper.fromMap(inputMap, "InvsEquipmentAction");
  }

/**
 *
 * Gets the InvsEquipmentAction
 * @return Value of the InvsEquipmentAction
 *
 */

  public InvsEquipmentActionObjectData getInvsEquipmentAction( ) {
    return InvsEquipmentActionUpdateIn;
  }

}
