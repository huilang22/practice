/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GlobalOpenItemIdMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalOpenItemIdMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn;
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalOpenItemIdMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMDeleteInIn) {
    super(id, context, "GlobalOpenItemIdMapDelete");
    GOIIMDeleteIn = GOIIMDeleteInIn;
  }

  public void translateToMap() {
    if (GOIIMDeleteIn != null) {
      GOIIMDeleteIn.resetFlags(true, true);
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectKeyHelper.toMap(GOIIMDeleteIn, new HashMap(), "GlobalOpenItemIdMapObjectKeyData").get("GlobalOpenItemIdMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the GlobalOpenItemIdMap
 * @param GOIIMDeleteInIn Value of the GOIIMDeleteIn
 *
 */

  public void setGlobalOpenItemIdMap(GlobalOpenItemIdMapObjectKeyData GOIIMDeleteInIn) {
    GOIIMDeleteIn = GOIIMDeleteInIn;
  }

  public void translateFromMap() {
    GOIIMDeleteIn = GlobalOpenItemIdMapObjectKeyHelper.fromMap(inputMap, "GlobalOpenItemIdMap");
  }

/**
 *
 * Gets the GlobalOpenItemIdMap
 * @return Value of the GlobalOpenItemIdMap
 *
 */

  public GlobalOpenItemIdMapObjectKeyData getGlobalOpenItemIdMap( ) {
    return GOIIMDeleteIn;
  }

}
