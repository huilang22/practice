/*
 * Generated code DO NOT EDIT
 * Generated file: TransferReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a TransferReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class TransferReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransferReasonObjectData XRCreateIn;
/**
 *
 * Constructor to create a  TransferReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransferReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectData XRCreateInIn) {
    super(id, context, "TransferReasonCreate");
    XRCreateIn = XRCreateInIn;
  }

  public void translateToMap() {
    if (XRCreateIn != null) {
      XRCreateIn.resetFlags(true, true);
      addInput("TransferReason", TransferReasonObjectHelper.toMap(XRCreateIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }


/**
 *
 * Sets the TransferReason
 * @param XRCreateInIn Value of the XRCreateIn
 *
 */

  public void setTransferReason(TransferReasonObjectData XRCreateInIn) {
    XRCreateIn = XRCreateInIn;
  }

  public void translateFromMap() {
    XRCreateIn = TransferReasonObjectHelper.fromMap(inputMap, "TransferReason");
  }

/**
 *
 * Gets the TransferReason
 * @return Value of the TransferReason
 *
 */

  public TransferReasonObjectData getTransferReason( ) {
    return XRCreateIn;
  }

}
