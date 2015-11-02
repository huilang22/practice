/*
 * Generated code DO NOT EDIT
 * Generated file: AbiAutoPayCmfMapGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AbiAutoPayCmfMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiAutoPayCmfMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiAutoPayCmfMapObjectData noOpIn;

/**
 *
 * Constructor to create a   AbiAutoPayCmfMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiAutoPayCmfMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiAutoPayCmfMapObjectData noOpInIn) {
    super(id, context, "AbiAutoPayCmfMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(noOpIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }
/**
 *
 * Sets the  AbiAutoPayCmfMap
 * @param noOpInIn AbiAutoPayCmfMapObjectData to set
 *
 */
  public void setAbiAutoPayCmfMap(AbiAutoPayCmfMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiAutoPayCmfMap passed into the constructor
 * @return Simulated response
 *
 */
  public AbiAutoPayCmfMapObjectData getAbiAutoPayCmfMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiAutoPayCmfMapObjectHelper.fromMap(inputMap, "AbiAutoPayCmfMap");
  }
}
