/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RTUnitCreditBalanceQueryOutputData noOpIn;

/**
 *
 * Constructor to create a   RTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RTUnitCreditBalanceQueryNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RTUnitCreditBalanceQueryOutputData noOpInIn) {
    super(id, context, "RTUnitCreditBalanceQuery");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RTUnitCreditBalanceQueryOutputData", RTUnitCreditBalanceQueryOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  RTUnitCreditBalanceQueryOutputData
 * @param noOpInIn RTUnitCreditBalanceQueryOutputData to set
 *
 */
  public void setRTUnitCreditBalanceQueryOutputData(RTUnitCreditBalanceQueryOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RTUnitCreditBalanceQueryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public RTUnitCreditBalanceQueryOutputData getRTUnitCreditBalanceQueryOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RTUnitCreditBalanceQueryOutputHelper.fromMap(inputMap);
  }
}
