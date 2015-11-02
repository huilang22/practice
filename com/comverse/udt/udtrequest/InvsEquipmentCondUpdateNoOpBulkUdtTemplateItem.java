/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentCondUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentCondUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentCondObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentCondUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentCondUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectData noOpInIn) {
    super(id, context, "InvsEquipmentCondUpdate");
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
