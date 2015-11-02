/*
 * Generated code DO NOT EDIT
 * Generated file: TransferReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a TransferReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class TransferReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransferReasonObjectKeyData XRDeleteIn;
/**
 *
 * Constructor to create a  TransferReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransferReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectKeyData XRDeleteInIn) {
    super(id, context, "TransferReasonDelete");
    XRDeleteIn = XRDeleteInIn;
  }

  public void translateToMap() {
    if (XRDeleteIn != null) {
      XRDeleteIn.resetFlags(true, true);
      addInput("TransferReason", TransferReasonObjectKeyHelper.toMap(XRDeleteIn, new HashMap(), "TransferReasonObjectKeyData").get("TransferReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the TransferReason
 * @param XRDeleteInIn Value of the XRDeleteIn
 *
 */

  public void setTransferReason(TransferReasonObjectKeyData XRDeleteInIn) {
    XRDeleteIn = XRDeleteInIn;
  }

  public void translateFromMap() {
    XRDeleteIn = TransferReasonObjectKeyHelper.fromMap(inputMap, "TransferReason");
  }

/**
 *
 * Gets the TransferReason
 * @return Value of the TransferReason
 *
 */

  public TransferReasonObjectKeyData getTransferReason( ) {
    return XRDeleteIn;
  }

}
