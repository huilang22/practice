/*
 * Generated code DO NOT EDIT
 * Generated file: TransferReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a TransferReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TransferReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransferReasonObjectKeyData XRGetIn;
/**
 *
 * Constructor to create a  TransferReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransferReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectKeyData XRGetInIn) {
    super(id, context, "TransferReasonGet");
    XRGetIn = XRGetInIn;
  }

  public void translateToMap() {
    if (XRGetIn != null) {
      XRGetIn.resetFlags(true, true);
      addInput("TransferReason", TransferReasonObjectKeyHelper.toMap(XRGetIn, new HashMap(), "TransferReasonObjectKeyData").get("TransferReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the TransferReason
 * @param XRGetInIn Value of the XRGetIn
 *
 */

  public void setTransferReason(TransferReasonObjectKeyData XRGetInIn) {
    XRGetIn = XRGetInIn;
  }

  public void translateFromMap() {
    XRGetIn = TransferReasonObjectKeyHelper.fromMap(inputMap, "TransferReason");
  }

/**
 *
 * Gets the TransferReason
 * @return Value of the TransferReason
 *
 */

  public TransferReasonObjectKeyData getTransferReason( ) {
    return XRGetIn;
  }

}
