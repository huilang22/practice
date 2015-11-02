/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a GlobalOpenItemIdMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalOpenItemIdMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalOpenItemIdMapObjectData GOIIMCreateIn;
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalOpenItemIdMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMCreateInIn) {
    super(id, context, "GlobalOpenItemIdMapCreate");
    GOIIMCreateIn = GOIIMCreateInIn;
  }

  public void translateToMap() {
    if (GOIIMCreateIn != null) {
      GOIIMCreateIn.resetFlags(true, true);
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(GOIIMCreateIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }


/**
 *
 * Sets the GlobalOpenItemIdMap
 * @param GOIIMCreateInIn Value of the GOIIMCreateIn
 *
 */

  public void setGlobalOpenItemIdMap(GlobalOpenItemIdMapObjectData GOIIMCreateInIn) {
    GOIIMCreateIn = GOIIMCreateInIn;
  }

  public void translateFromMap() {
    GOIIMCreateIn = GlobalOpenItemIdMapObjectHelper.fromMap(inputMap, "GlobalOpenItemIdMap");
  }

/**
 *
 * Gets the GlobalOpenItemIdMap
 * @return Value of the GlobalOpenItemIdMap
 *
 */

  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMap( ) {
    return GOIIMCreateIn;
  }

}
