/*
 * Generated code DO NOT EDIT
 * Generated file: VanityCodeChargeMapCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VanityCodeChargeMapCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VanityCodeChargeMapCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VanityCodeChargeObjData noOpIn;

/**
 *
 * Constructor to create a   VanityCodeChargeMapCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VanityCodeChargeMapCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VanityCodeChargeObjData noOpInIn) {
    super(id, context, "VanityCodeChargeMapCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(noOpIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }
/**
 *
 * Sets the  VanityCodeChargeMap
 * @param noOpInIn VanityCodeChargeObjData to set
 *
 */
  public void setVanityCodeChargeMap(VanityCodeChargeObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VanityCodeChargeMap passed into the constructor
 * @return Simulated response
 *
 */
  public VanityCodeChargeObjData getVanityCodeChargeMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VanityCodeChargeObjHelper.fromMap(inputMap, "VanityCodeChargeMap");
  }
}
