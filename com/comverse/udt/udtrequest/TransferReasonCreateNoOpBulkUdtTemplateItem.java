/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TransferReasonCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TransferReasonCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TransferReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   TransferReasonCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TransferReasonCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectData noOpInIn) {
    super(id, context, "TransferReasonCreate");
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
