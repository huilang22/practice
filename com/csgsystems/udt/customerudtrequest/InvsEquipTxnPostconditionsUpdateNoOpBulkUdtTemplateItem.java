/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPostconditionsUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipTxnPostconditionsUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipTxnPostconditionsUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipTxnPostconditionsObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipTxnPostconditionsUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipTxnPostconditionsUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectData noOpInIn) {
    super(id, context, "InvsEquipTxnPostconditionsUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
/**
 *
 * Sets the  InvsEquipTxnPostconditions
 * @param noOpInIn InvsEquipTxnPostconditionsObjectData to set
 *
 */
  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipTxnPostconditions passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipTxnPostconditionsObjectHelper.fromMap(inputMap, "InvsEquipTxnPostconditions");
  }
}
