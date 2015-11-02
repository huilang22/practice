/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConnectReasonGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConnectReasonGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ConnectReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   ConnectReasonGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConnectReasonGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectData noOpInIn) {
    super(id, context, "ConnectReasonGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(noOpIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }
/**
 *
 * Sets the  ConnectReason
 * @param noOpInIn ConnectReasonObjectData to set
 *
 */
  public void setConnectReason(ConnectReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConnectReason passed into the constructor
 * @return Simulated response
 *
 */
  public ConnectReasonObjectData getConnectReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ConnectReasonObjectHelper.fromMap(inputMap, "ConnectReason");
  }
}
