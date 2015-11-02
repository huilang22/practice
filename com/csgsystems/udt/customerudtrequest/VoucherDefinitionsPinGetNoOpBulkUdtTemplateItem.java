/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherDefinitionsPinGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherDefinitionsPinGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherDefinitionsPinGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherDefinitionsPinGetOutputData noOpIn;

/**
 *
 * Constructor to create a   VoucherDefinitionsPinGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherDefinitionsPinGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsPinGetOutputData noOpInIn) {
    super(id, context, "VoucherDefinitionsPinGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherDefinitionsPinGetOutputData", VoucherDefinitionsPinGetOutputHelper.toMap(noOpIn).get("VoucherDefinitionsPinGetOutputData"));
    }
  }
/**
 *
 * Sets the  VoucherDefinitionsPinGetOutputData
 * @param noOpInIn VoucherDefinitionsPinGetOutputData to set
 *
 */
  public void setVoucherDefinitionsPinGetOutputData(VoucherDefinitionsPinGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherDefinitionsPinGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherDefinitionsPinGetOutputData getVoucherDefinitionsPinGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherDefinitionsPinGetOutputHelper.fromMap(inputMap);
  }
}
