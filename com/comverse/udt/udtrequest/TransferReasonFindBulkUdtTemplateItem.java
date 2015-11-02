/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a TransferReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TransferReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransferReasonObjectFilter XRFindIn;
/**
 *
 * Constructor to create a  TransferReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransferReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectFilter XRFindInIn) {
    super(id, context, "TransferReasonFind");
    XRFindIn = XRFindInIn;
  }

  public void translateToMap() {
    if (XRFindIn != null) {
      Integer index =  XRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TransferReason", TransferReasonObjectHelper.toMap(XRFindIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }


/**
 *
 * Sets the TransferReason
 * @param XRFindInIn Value of the XRFindIn
 *
 */

  public void setTransferReason(TransferReasonObjectFilter XRFindInIn) {
    XRFindIn = XRFindInIn;
  }

  public void translateFromMap() {
    XRFindIn = TransferReasonObjectHelper.fromMapFilter(inputMap, "TransferReason");
  }

/**
 *
 * Gets the TransferReason
 * @return Value of the TransferReason
 *
 */

  public TransferReasonObjectFilter getTransferReason( ) {
    return XRFindIn;
  }

}
