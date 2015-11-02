/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupCorridorCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupCorridorCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupCorridorObjectData HQGCcreateIn;
/**
 *
 * Constructor to create a  HqGroupCorridorCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupCorridorCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectData HQGCcreateInIn) {
    super(id, context, "HqGroupCorridorCreate");
    HQGCcreateIn = HQGCcreateInIn;
  }

  public void translateToMap() {
    if (HQGCcreateIn != null) {
      HQGCcreateIn.resetFlags(true, true);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCcreateIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }


/**
 *
 * Sets the HqGroupCorridor
 * @param HQGCcreateInIn Value of the HQGCcreateIn
 *
 */

  public void setHqGroupCorridor(HqGroupCorridorObjectData HQGCcreateInIn) {
    HQGCcreateIn = HQGCcreateInIn;
  }

  public void translateFromMap() {
    HQGCcreateIn = HqGroupCorridorObjectHelper.fromMap(inputMap, "HqGroupCorridor");
  }

/**
 *
 * Gets the HqGroupCorridor
 * @return Value of the HqGroupCorridor
 *
 */

  public HqGroupCorridorObjectData getHqGroupCorridor( ) {
    return HQGCcreateIn;
  }

}
