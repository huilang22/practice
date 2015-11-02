/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a AppNameUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AppNameUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AppNameObjectData noOpIn;

/**
 *
 * Constructor to create a   AppNameUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AppNameUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AppNameObjectData noOpInIn) {
    super(id, context, "AppNameUpdate");
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
