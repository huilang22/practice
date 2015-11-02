/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFieldAssocCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentTxnFieldAssocCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentTxnFieldAssocCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentTxnFieldAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentTxnFieldAssocCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentTxnFieldAssocCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldAssocObjectData noOpInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
/**
 *
 * Sets the  InvsEquipmentTxnFieldAssoc
 * @param noOpInIn InvsEquipmentTxnFieldAssocObjectData to set
 *
 */
  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentTxnFieldAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnFieldAssocObjectData getInvsEquipmentTxnFieldAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentTxnFieldAssocObjectHelper.fromMap(inputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
