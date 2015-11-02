/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameGetBulkUdtTemplateItem.java
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
 * Class used to create a AppNameGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AppNameGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AppNameObjectKeyData AppNameGetIn;
/**
 *
 * Constructor to create a  AppNameGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AppNameGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AppNameObjectKeyData AppNameGetInIn) {
    super(id, context, "AppNameGet");
    AppNameGetIn = AppNameGetInIn;
  }

  public void translateToMap() {
    if (AppNameGetIn != null) {
      AppNameGetIn.resetFlags(true, true);
      addInput("AppName", AppNameObjectKeyHelper.toMap(AppNameGetIn, new HashMap(), "AppNameObjectKeyData").get("AppNameObjectKeyData"));
    }
  }


/**
 *
 * Sets the AppName
 * @param AppNameGetInIn Value of the AppNameGetIn
 *
 */

  public void setAppName(AppNameObjectKeyData AppNameGetInIn) {
    AppNameGetIn = AppNameGetInIn;
  }

  public void translateFromMap() {
    AppNameGetIn = AppNameObjectKeyHelper.fromMap(inputMap, "AppName");
  }

/**
 *
 * Gets the AppName
 * @return Value of the AppName
 *
 */

  public AppNameObjectKeyData getAppName( ) {
    return AppNameGetIn;
  }

}
