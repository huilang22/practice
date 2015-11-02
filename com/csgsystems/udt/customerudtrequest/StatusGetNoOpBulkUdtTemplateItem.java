/*
 * Generated code DO NOT EDIT
 * Generated file: StatusGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a StatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectData noOpInIn) {
    super(id, context, "StatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Status", StatusObjectHelper.toMap(noOpIn, new HashMap(), "Status").get("Status"));
    }
  }
/**
 *
 * Sets the  Status
 * @param noOpInIn StatusObjectData to set
 *
 */
  public void setStatus(StatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Status passed into the constructor
 * @return Simulated response
 *
 */
  public StatusObjectData getStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusObjectHelper.fromMap(inputMap, "Status");
  }
}
