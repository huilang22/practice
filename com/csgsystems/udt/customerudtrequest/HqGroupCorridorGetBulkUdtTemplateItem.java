/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorGetBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupCorridorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupCorridorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupCorridorObjectData HQGCgetIn;
/**
 *
 * Constructor to create a  HqGroupCorridorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupCorridorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectData HQGCgetInIn) {
    super(id, context, "HqGroupCorridorGet");
    HQGCgetIn = HQGCgetInIn;
  }

  public void translateToMap() {
    if (HQGCgetIn != null) {
      HQGCgetIn.resetFlags(true, true);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCgetIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }


/**
 *
 * Sets the HqGroupCorridor
 * @param HQGCgetInIn Value of the HQGCgetIn
 *
 */

  public void setHqGroupCorridor(HqGroupCorridorObjectData HQGCgetInIn) {
    HQGCgetIn = HQGCgetInIn;
  }

  public void translateFromMap() {
    HQGCgetIn = HqGroupCorridorObjectHelper.fromMap(inputMap, "HqGroupCorridor");
  }

/**
 *
 * Gets the HqGroupCorridor
 * @return Value of the HqGroupCorridor
 *
 */

  public HqGroupCorridorObjectData getHqGroupCorridor( ) {
    return HQGCgetIn;
  }

}
