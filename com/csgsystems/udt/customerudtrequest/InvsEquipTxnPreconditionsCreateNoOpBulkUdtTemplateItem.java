/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPreconditionsCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipTxnPreconditionsCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipTxnPreconditionsCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipTxnPreconditionsObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipTxnPreconditionsCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipTxnPreconditionsCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPreconditionsObjectData noOpInIn) {
    super(id, context, "InvsEquipTxnPreconditionsCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }
/**
 *
 * Sets the  InvsEquipTxnPreconditions
 * @param noOpInIn InvsEquipTxnPreconditionsObjectData to set
 *
 */
  public void setInvsEquipTxnPreconditions(InvsEquipTxnPreconditionsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipTxnPreconditions passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPreconditionsObjectData getInvsEquipTxnPreconditions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipTxnPreconditionsObjectHelper.fromMap(inputMap, "InvsEquipTxnPreconditions");
  }
}
