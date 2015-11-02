/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFieldAssocGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentTxnFieldAssocGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentTxnFieldAssocGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentTxnFieldTablesObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentTxnFieldAssocGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentTxnFieldAssocGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldTablesObjectData noOpInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
/**
 *
 * Sets the  InvsEquipmentTxnFieldAssoc
 * @param noOpInIn InvsEquipmentTxnFieldTablesObjectData to set
 *
 */
  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldTablesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentTxnFieldAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnFieldTablesObjectData getInvsEquipmentTxnFieldAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentTxnFieldTablesObjectHelper.fromMap(inputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
