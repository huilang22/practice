/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GlobalOpenItemIdMapCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GlobalOpenItemIdMapCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GlobalOpenItemIdMapObjectData noOpIn;

/**
 *
 * Constructor to create a   GlobalOpenItemIdMapCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GlobalOpenItemIdMapCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalOpenItemIdMapObjectData noOpInIn) {
    super(id, context, "GlobalOpenItemIdMapCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(noOpIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
/**
 *
 * Sets the  GlobalOpenItemIdMap
 * @param noOpInIn GlobalOpenItemIdMapObjectData to set
 *
 */
  public void setGlobalOpenItemIdMap(GlobalOpenItemIdMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GlobalOpenItemIdMap passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GlobalOpenItemIdMapObjectHelper.fromMap(inputMap, "GlobalOpenItemIdMap");
  }
}
