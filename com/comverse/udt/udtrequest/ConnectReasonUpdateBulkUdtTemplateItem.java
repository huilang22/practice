/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ConnectReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConnectReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ConnectReasonObjectData CRUpdateIn;
/**
 *
 * Constructor to create a  ConnectReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConnectReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectData CRUpdateInIn) {
    super(id, context, "ConnectReasonUpdate");
    CRUpdateIn = CRUpdateInIn;
  }

  public void translateToMap() {
    if (CRUpdateIn != null) {
      CRUpdateIn.resetFlags(true, true);
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(CRUpdateIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }


/**
 *
 * Sets the ConnectReason
 * @param CRUpdateInIn Value of the CRUpdateIn
 *
 */

  public void setConnectReason(ConnectReasonObjectData CRUpdateInIn) {
    CRUpdateIn = CRUpdateInIn;
  }

  public void translateFromMap() {
    CRUpdateIn = ConnectReasonObjectHelper.fromMap(inputMap, "ConnectReason");
  }

/**
 *
 * Gets the ConnectReason
 * @return Value of the ConnectReason
 *
 */

  public ConnectReasonObjectData getConnectReason( ) {
    return CRUpdateIn;
  }

}
