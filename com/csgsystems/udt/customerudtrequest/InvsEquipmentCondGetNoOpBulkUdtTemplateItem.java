/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentCondGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentCondGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentCondGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentCondObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentCondGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentCondGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectData noOpInIn) {
    super(id, context, "InvsEquipmentCondGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }
/**
 *
 * Sets the  InvsEquipmentCond
 * @param noOpInIn InvsEquipmentCondObjectData to set
 *
 */
  public void setInvsEquipmentCond(InvsEquipmentCondObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentCond passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentCondObjectData getInvsEquipmentCond() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentCondObjectHelper.fromMap(inputMap, "InvsEquipmentCond");
  }
}
