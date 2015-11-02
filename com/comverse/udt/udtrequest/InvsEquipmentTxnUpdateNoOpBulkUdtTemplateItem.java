/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentTxnUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentTxnUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentTxnObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentTxnUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentTxnUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnObjectData noOpInIn) {
    super(id, context, "InvsEquipmentTxnUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }
/**
 *
 * Sets the  InvsEquipmentTxn
 * @param noOpInIn InvsEquipmentTxnObjectData to set
 *
 */
  public void setInvsEquipmentTxn(InvsEquipmentTxnObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentTxn passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnObjectData getInvsEquipmentTxn() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentTxnObjectHelper.fromMap(inputMap, "InvsEquipmentTxn");
  }
}
