/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a TransferReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class TransferReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransferReasonObjectData XRUpdateIn;
/**
 *
 * Constructor to create a  TransferReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransferReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectData XRUpdateInIn) {
    super(id, context, "TransferReasonUpdate");
    XRUpdateIn = XRUpdateInIn;
  }

  public void translateToMap() {
    if (XRUpdateIn != null) {
      XRUpdateIn.resetFlags(true, true);
      addInput("TransferReason", TransferReasonObjectHelper.toMap(XRUpdateIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }


/**
 *
 * Sets the TransferReason
 * @param XRUpdateInIn Value of the XRUpdateIn
 *
 */

  public void setTransferReason(TransferReasonObjectData XRUpdateInIn) {
    XRUpdateIn = XRUpdateInIn;
  }

  public void translateFromMap() {
    XRUpdateIn = TransferReasonObjectHelper.fromMap(inputMap, "TransferReason");
  }

/**
 *
 * Gets the TransferReason
 * @return Value of the TransferReason
 *
 */

  public TransferReasonObjectData getTransferReason( ) {
    return XRUpdateIn;
  }

}
