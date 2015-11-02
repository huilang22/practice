/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapFindBulkUdtTemplateItem.java
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
 * Class used to create a GlobalOpenItemIdMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalOpenItemIdMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalOpenItemIdMapObjectFilter GOIIMFindIn;
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalOpenItemIdMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalOpenItemIdMapObjectFilter GOIIMFindInIn) {
    super(id, context, "GlobalOpenItemIdMapFind");
    GOIIMFindIn = GOIIMFindInIn;
  }

  public void translateToMap() {
    if (GOIIMFindIn != null) {
      Integer index =  GOIIMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(GOIIMFindIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }


/**
 *
 * Sets the GlobalOpenItemIdMap
 * @param GOIIMFindInIn Value of the GOIIMFindIn
 *
 */

  public void setGlobalOpenItemIdMap(GlobalOpenItemIdMapObjectFilter GOIIMFindInIn) {
    GOIIMFindIn = GOIIMFindInIn;
  }

  public void translateFromMap() {
    GOIIMFindIn = GlobalOpenItemIdMapObjectHelper.fromMapFilter(inputMap, "GlobalOpenItemIdMap");
  }

/**
 *
 * Gets the GlobalOpenItemIdMap
 * @return Value of the GlobalOpenItemIdMap
 *
 */

  public GlobalOpenItemIdMapObjectFilter getGlobalOpenItemIdMap( ) {
    return GOIIMFindIn;
  }

}
