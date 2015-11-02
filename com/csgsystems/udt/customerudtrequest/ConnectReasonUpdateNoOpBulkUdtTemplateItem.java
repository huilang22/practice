/*
 * Generated code DO NOT EDIT
 * Generated file: ConnectReasonUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConnectReasonUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConnectReasonUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ConnectReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   ConnectReasonUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConnectReasonUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectData noOpInIn) {
    super(id, context, "ConnectReasonUpdate");
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
