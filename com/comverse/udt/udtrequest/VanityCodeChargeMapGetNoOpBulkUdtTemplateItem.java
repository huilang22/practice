/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a VanityCodeChargeMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VanityCodeChargeMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VanityCodeChargeObjData noOpIn;

/**
 *
 * Constructor to create a   VanityCodeChargeMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VanityCodeChargeMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VanityCodeChargeObjData noOpInIn) {
    super(id, context, "VanityCodeChargeMapGet");
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
