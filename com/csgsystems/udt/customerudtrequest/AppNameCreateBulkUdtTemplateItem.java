/*
 * Generated code DO NOT EDIT
 * Generated file: AppNameCreateBulkUdtTemplateItem.java
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
 * Class used to create a AppNameCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AppNameCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AppNameObjectData AppNameCreateIn;
/**
 *
 * Constructor to create a  AppNameCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AppNameCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AppNameObjectData AppNameCreateInIn) {
    super(id, context, "AppNameCreate");
    AppNameCreateIn = AppNameCreateInIn;
  }

  public void translateToMap() {
    if (AppNameCreateIn != null) {
      AppNameCreateIn.resetFlags(true, true);
      addInput("AppName", AppNameObjectHelper.toMap(AppNameCreateIn, new HashMap(), "AppName").get("AppName"));
    }
  }


/**
 *
 * Sets the AppName
 * @param AppNameCreateInIn Value of the AppNameCreateIn
 *
 */

  public void setAppName(AppNameObjectData AppNameCreateInIn) {
    AppNameCreateIn = AppNameCreateInIn;
  }

  public void translateFromMap() {
    AppNameCreateIn = AppNameObjectHelper.fromMap(inputMap, "AppName");
  }

/**
 *
 * Gets the AppName
 * @return Value of the AppName
 *
 */

  public AppNameObjectData getAppName( ) {
    return AppNameCreateIn;
  }

}
