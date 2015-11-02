/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ConnectReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ConnectReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ConnectReasonObjectKeyData CRDeleteIn;
/**
 *
 * Constructor to create a  ConnectReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConnectReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectKeyData CRDeleteInIn) {
    super(id, context, "ConnectReasonDelete");
    CRDeleteIn = CRDeleteInIn;
  }

  public void translateToMap() {
    if (CRDeleteIn != null) {
      CRDeleteIn.resetFlags(true, true);
      addInput("ConnectReason", ConnectReasonObjectKeyHelper.toMap(CRDeleteIn, new HashMap(), "ConnectReasonObjectKeyData").get("ConnectReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the ConnectReason
 * @param CRDeleteInIn Value of the CRDeleteIn
 *
 */

  public void setConnectReason(ConnectReasonObjectKeyData CRDeleteInIn) {
    CRDeleteIn = CRDeleteInIn;
  }

  public void translateFromMap() {
    CRDeleteIn = ConnectReasonObjectKeyHelper.fromMap(inputMap, "ConnectReason");
  }

/**
 *
 * Gets the ConnectReason
 * @return Value of the ConnectReason
 *
 */

  public ConnectReasonObjectKeyData getConnectReason( ) {
    return CRDeleteIn;
  }

}
