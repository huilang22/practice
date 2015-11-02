/*
 * Generated code DO NOT EDIT
 * Generated file: AppNameUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AppNameUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AppNameUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AppNameObjectData AppNameUpdateIn;
/**
 *
 * Constructor to create a  AppNameUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AppNameUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AppNameObjectData AppNameUpdateInIn) {
    super(id, context, "AppNameUpdate");
    AppNameUpdateIn = AppNameUpdateInIn;
  }

  public void translateToMap() {
    if (AppNameUpdateIn != null) {
      AppNameUpdateIn.resetFlags(true, true);
      addInput("AppName", AppNameObjectHelper.toMap(AppNameUpdateIn, new HashMap(), "AppName").get("AppName"));
    }
  }


/**
 *
 * Sets the AppName
 * @param AppNameUpdateInIn Value of the AppNameUpdateIn
 *
 */

  public void setAppName(AppNameObjectData AppNameUpdateInIn) {
    AppNameUpdateIn = AppNameUpdateInIn;
  }

  public void translateFromMap() {
    AppNameUpdateIn = AppNameObjectHelper.fromMap(inputMap, "AppName");
  }

/**
 *
 * Gets the AppName
 * @return Value of the AppName
 *
 */

  public AppNameObjectData getAppName( ) {
    return AppNameUpdateIn;
  }

}
