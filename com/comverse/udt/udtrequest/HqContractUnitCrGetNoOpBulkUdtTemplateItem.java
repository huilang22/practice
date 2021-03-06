/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqContractUnitCrGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqContractUnitCrGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqContractUnitCrObjectData noOpIn;

/**
 *
 * Constructor to create a   HqContractUnitCrGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqContractUnitCrGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectData noOpInIn) {
    super(id, context, "HqContractUnitCrGet");
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
