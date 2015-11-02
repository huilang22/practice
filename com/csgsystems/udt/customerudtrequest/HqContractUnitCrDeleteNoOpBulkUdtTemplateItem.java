/*
 * Generated code DO NOT EDIT
 * Generated file: HqContractUnitCrDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqContractUnitCrDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqContractUnitCrDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqContractUnitCrObjectData noOpIn;

/**
 *
 * Constructor to create a   HqContractUnitCrDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqContractUnitCrDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectData noOpInIn) {
    super(id, context, "HqContractUnitCrDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(noOpIn, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }
/**
 *
 * Sets the  HqContractUnitCr
 * @param noOpInIn HqContractUnitCrObjectData to set
 *
 */
  public void setHqContractUnitCr(HqContractUnitCrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqContractUnitCr passed into the constructor
 * @return Simulated response
 *
 */
  public HqContractUnitCrObjectData getHqContractUnitCr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqContractUnitCrObjectHelper.fromMap(inputMap, "HqContractUnitCr");
  }
}
