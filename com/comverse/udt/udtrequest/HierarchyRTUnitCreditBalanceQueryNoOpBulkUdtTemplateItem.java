/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HierarchyRTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HierarchyRTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HierarchyRTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HierarchyRTUnitCreditBalanceQueryOutputData noOpIn;

/**
 *
 * Constructor to create a   HierarchyRTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HierarchyRTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HierarchyRTUnitCreditBalanceQueryOutputData noOpInIn) {
    super(id, context, "HierarchyRTUnitCreditBalanceQuery");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HierarchyRTUnitCreditBalanceQueryOutputData", HierarchyRTUnitCreditBalanceQueryOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  HierarchyRTUnitCreditBalanceQueryOutputData
 * @param noOpInIn HierarchyRTUnitCreditBalanceQueryOutputData to set
 *
 */
  public void setHierarchyRTUnitCreditBalanceQueryOutputData(HierarchyRTUnitCreditBalanceQueryOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HierarchyRTUnitCreditBalanceQueryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public HierarchyRTUnitCreditBalanceQueryOutputData getHierarchyRTUnitCreditBalanceQueryOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HierarchyRTUnitCreditBalanceQueryOutputHelper.fromMap(inputMap);
  }
}
