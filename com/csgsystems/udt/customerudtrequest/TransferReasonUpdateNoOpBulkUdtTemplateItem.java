/*
 * Generated code DO NOT EDIT
 * Generated file: TransferReasonUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TransferReasonUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TransferReasonUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TransferReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   TransferReasonUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TransferReasonUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectData noOpInIn) {
    super(id, context, "TransferReasonUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TransferReason", TransferReasonObjectHelper.toMap(noOpIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }
/**
 *
 * Sets the  TransferReason
 * @param noOpInIn TransferReasonObjectData to set
 *
 */
  public void setTransferReason(TransferReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TransferReason passed into the constructor
 * @return Simulated response
 *
 */
  public TransferReasonObjectData getTransferReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TransferReasonObjectHelper.fromMap(inputMap, "TransferReason");
  }
}
