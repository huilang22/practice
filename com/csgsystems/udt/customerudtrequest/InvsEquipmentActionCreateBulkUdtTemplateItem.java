/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentActionCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentActionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentActionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentActionObjectData InvsEquipmentActionCreateIn;
/**
 *
 * Constructor to create a  InvsEquipmentActionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentActionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionObjectData InvsEquipmentActionCreateInIn) {
    super(id, context, "InvsEquipmentActionCreate");
    InvsEquipmentActionCreateIn = InvsEquipmentActionCreateInIn;
  }

  public void translateToMap() {
    if (InvsEquipmentActionCreateIn != null) {
      InvsEquipmentActionCreateIn.resetFlags(true, true);
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionCreateIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }


/**
 *
 * Sets the InvsEquipmentAction
 * @param InvsEquipmentActionCreateInIn Value of the InvsEquipmentActionCreateIn
 *
 */

  public void setInvsEquipmentAction(InvsEquipmentActionObjectData InvsEquipmentActionCreateInIn) {
    InvsEquipmentActionCreateIn = InvsEquipmentActionCreateInIn;
  }

  public void translateFromMap() {
    InvsEquipmentActionCreateIn = InvsEquipmentActionObjectHelper.fromMap(inputMap, "InvsEquipmentAction");
  }

/**
 *
 * Gets the InvsEquipmentAction
 * @return Value of the InvsEquipmentAction
 *
 */

  public InvsEquipmentActionObjectData getInvsEquipmentAction( ) {
    return InvsEquipmentActionCreateIn;
  }

}
