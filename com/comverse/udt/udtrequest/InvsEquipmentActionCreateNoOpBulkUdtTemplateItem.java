/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentActionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentActionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentActionObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentActionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentActionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionObjectData noOpInIn) {
    super(id, context, "InvsEquipmentActionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
/**
 *
 * Sets the  InvsEquipmentAction
 * @param noOpInIn InvsEquipmentActionObjectData to set
 *
 */
  public void setInvsEquipmentAction(InvsEquipmentActionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentAction passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentActionObjectData getInvsEquipmentAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentActionObjectHelper.fromMap(inputMap, "InvsEquipmentAction");
  }
}
