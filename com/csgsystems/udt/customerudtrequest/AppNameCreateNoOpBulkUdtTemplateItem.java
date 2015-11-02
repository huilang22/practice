/*
 * Generated code DO NOT EDIT
 * Generated file: AppNameCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a AppNameCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AppNameCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AppNameObjectData noOpIn;

/**
 *
 * Constructor to create a   AppNameCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AppNameCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AppNameObjectData noOpInIn) {
    super(id, context, "AppNameCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AppName", AppNameObjectHelper.toMap(noOpIn, new HashMap(), "AppName").get("AppName"));
    }
  }
/**
 *
 * Sets the  AppName
 * @param noOpInIn AppNameObjectData to set
 *
 */
  public void setAppName(AppNameObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AppName passed into the constructor
 * @return Simulated response
 *
 */
  public AppNameObjectData getAppName() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AppNameObjectHelper.fromMap(inputMap, "AppName");
  }
}
