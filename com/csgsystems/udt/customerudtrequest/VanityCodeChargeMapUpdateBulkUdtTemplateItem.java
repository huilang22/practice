/*
 * Generated code DO NOT EDIT
 * Generated file: VanityCodeChargeMapUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a VanityCodeChargeMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VanityCodeChargeMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VanityCodeChargeObjData updateIn;
/**
 *
 * Constructor to create a  VanityCodeChargeMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VanityCodeChargeMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VanityCodeChargeObjData updateInIn) {
    super(id, context, "VanityCodeChargeMapUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(updateIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }


/**
 *
 * Sets the VanityCodeChargeMap
 * @param updateInIn Value of the updateIn
 *
 */

  public void setVanityCodeChargeMap(VanityCodeChargeObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = VanityCodeChargeObjHelper.fromMap(inputMap, "VanityCodeChargeMap");
  }

/**
 *
 * Gets the VanityCodeChargeMap
 * @return Value of the VanityCodeChargeMap
 *
 */

  public VanityCodeChargeObjData getVanityCodeChargeMap( ) {
    return updateIn;
  }

}
