/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GlobalOpenItemIdMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalOpenItemIdMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalOpenItemIdMapObjectData GOIIMUpdateIn;
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalOpenItemIdMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMUpdateInIn) {
    super(id, context, "GlobalOpenItemIdMapUpdate");
    GOIIMUpdateIn = GOIIMUpdateInIn;
  }

  public void translateToMap() {
    if (GOIIMUpdateIn != null) {
      GOIIMUpdateIn.resetFlags(true, true);
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(GOIIMUpdateIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }


/**
 *
 * Sets the GlobalOpenItemIdMap
 * @param GOIIMUpdateInIn Value of the GOIIMUpdateIn
 *
 */

  public void setGlobalOpenItemIdMap(GlobalOpenItemIdMapObjectData GOIIMUpdateInIn) {
    GOIIMUpdateIn = GOIIMUpdateInIn;
  }

  public void translateFromMap() {
    GOIIMUpdateIn = GlobalOpenItemIdMapObjectHelper.fromMap(inputMap, "GlobalOpenItemIdMap");
  }

/**
 *
 * Gets the GlobalOpenItemIdMap
 * @return Value of the GlobalOpenItemIdMap
 *
 */

  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMap( ) {
    return GOIIMUpdateIn;
  }

}
