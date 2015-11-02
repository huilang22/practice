/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalOpenItemIdMapGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GlobalOpenItemIdMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalOpenItemIdMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalOpenItemIdMapObjectKeyData GOIIMGetIn;
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalOpenItemIdMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMGetInIn) {
    super(id, context, "GlobalOpenItemIdMapGet");
    GOIIMGetIn = GOIIMGetInIn;
  }

  public void translateToMap() {
    if (GOIIMGetIn != null) {
      GOIIMGetIn.resetFlags(true, true);
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectKeyHelper.toMap(GOIIMGetIn, new HashMap(), "GlobalOpenItemIdMapObjectKeyData").get("GlobalOpenItemIdMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the GlobalOpenItemIdMap
 * @param GOIIMGetInIn Value of the GOIIMGetIn
 *
 */

  public void setGlobalOpenItemIdMap(GlobalOpenItemIdMapObjectKeyData GOIIMGetInIn) {
    GOIIMGetIn = GOIIMGetInIn;
  }

  public void translateFromMap() {
    GOIIMGetIn = GlobalOpenItemIdMapObjectKeyHelper.fromMap(inputMap, "GlobalOpenItemIdMap");
  }

/**
 *
 * Gets the GlobalOpenItemIdMap
 * @return Value of the GlobalOpenItemIdMap
 *
 */

  public GlobalOpenItemIdMapObjectKeyData getGlobalOpenItemIdMap( ) {
    return GOIIMGetIn;
  }

}
