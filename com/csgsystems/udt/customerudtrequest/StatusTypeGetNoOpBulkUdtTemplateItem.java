/*
 * Generated code DO NOT EDIT
 * Generated file: StatusTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectData noOpInIn) {
    super(id, context, "StatusTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("StatusType", StatusTypeObjectHelper.toMap(noOpIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }
/**
 *
 * Sets the  StatusType
 * @param noOpInIn StatusTypeObjectData to set
 *
 */
  public void setStatusType(StatusTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusType passed into the constructor
 * @return Simulated response
 *
 */
  public StatusTypeObjectData getStatusType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusTypeObjectHelper.fromMap(inputMap, "StatusType");
  }
}
