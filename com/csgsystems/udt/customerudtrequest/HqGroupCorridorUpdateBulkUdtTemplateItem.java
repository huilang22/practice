/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupCorridorUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupCorridorUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupCorridorObjectData HQGCupdateIn;
/**
 *
 * Constructor to create a  HqGroupCorridorUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupCorridorUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectData HQGCupdateInIn) {
    super(id, context, "HqGroupCorridorUpdate");
    HQGCupdateIn = HQGCupdateInIn;
  }

  public void translateToMap() {
    if (HQGCupdateIn != null) {
      HQGCupdateIn.resetFlags(true, true);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCupdateIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }


/**
 *
 * Sets the HqGroupCorridor
 * @param HQGCupdateInIn Value of the HQGCupdateIn
 *
 */

  public void setHqGroupCorridor(HqGroupCorridorObjectData HQGCupdateInIn) {
    HQGCupdateIn = HQGCupdateInIn;
  }

  public void translateFromMap() {
    HQGCupdateIn = HqGroupCorridorObjectHelper.fromMap(inputMap, "HqGroupCorridor");
  }

/**
 *
 * Gets the HqGroupCorridor
 * @return Value of the HqGroupCorridor
 *
 */

  public HqGroupCorridorObjectData getHqGroupCorridor( ) {
    return HQGCupdateIn;
  }

}
