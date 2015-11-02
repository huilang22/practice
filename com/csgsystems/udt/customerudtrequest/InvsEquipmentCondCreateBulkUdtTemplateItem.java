/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentCondCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentCondCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentCondCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentCondObjectData IECCreateIn;
/**
 *
 * Constructor to create a  InvsEquipmentCondCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentCondCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectData IECCreateInIn) {
    super(id, context, "InvsEquipmentCondCreate");
    IECCreateIn = IECCreateInIn;
  }

  public void translateToMap() {
    if (IECCreateIn != null) {
      IECCreateIn.resetFlags(true, true);
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(IECCreateIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }


/**
 *
 * Sets the InvsEquipmentCond
 * @param IECCreateInIn Value of the IECCreateIn
 *
 */

  public void setInvsEquipmentCond(InvsEquipmentCondObjectData IECCreateInIn) {
    IECCreateIn = IECCreateInIn;
  }

  public void translateFromMap() {
    IECCreateIn = InvsEquipmentCondObjectHelper.fromMap(inputMap, "InvsEquipmentCond");
  }

/**
 *
 * Gets the InvsEquipmentCond
 * @return Value of the InvsEquipmentCond
 *
 */

  public InvsEquipmentCondObjectData getInvsEquipmentCond( ) {
    return IECCreateIn;
  }

}
