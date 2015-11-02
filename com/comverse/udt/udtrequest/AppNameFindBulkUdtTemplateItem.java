/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameFindBulkUdtTemplateItem.java
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
 * Class used to create a AppNameFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AppNameFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AppNameObjectFilter AppNameFindIn;
/**
 *
 * Constructor to create a  AppNameFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AppNameFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AppNameObjectFilter AppNameFindInIn) {
    super(id, context, "AppNameFind");
    AppNameFindIn = AppNameFindInIn;
  }

  public void translateToMap() {
    if (AppNameFindIn != null) {
      Integer index =  AppNameFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AppName", AppNameObjectHelper.toMap(AppNameFindIn, new HashMap(), "AppName").get("AppName"));
    }
  }


/**
 *
 * Sets the AppName
 * @param AppNameFindInIn Value of the AppNameFindIn
 *
 */

  public void setAppName(AppNameObjectFilter AppNameFindInIn) {
    AppNameFindIn = AppNameFindInIn;
  }

  public void translateFromMap() {
    AppNameFindIn = AppNameObjectHelper.fromMapFilter(inputMap, "AppName");
  }

/**
 *
 * Gets the AppName
 * @return Value of the AppName
 *
 */

  public AppNameObjectFilter getAppName( ) {
    return AppNameFindIn;
  }

}
