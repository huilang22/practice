/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PlanIdCreditCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PlanIdCreditCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PlanIdCreditObjectData noOpIn;

/**
 *
 * Constructor to create a   PlanIdCreditCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PlanIdCreditCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PlanIdCreditObjectData noOpInIn) {
    super(id, context, "PlanIdCreditCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(noOpIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }
/**
 *
 * Sets the  PlanIdCredit
 * @param noOpInIn PlanIdCreditObjectData to set
 *
 */
  public void setPlanIdCredit(PlanIdCreditObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PlanIdCredit passed into the constructor
 * @return Simulated response
 *
 */
  public PlanIdCreditObjectData getPlanIdCredit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PlanIdCreditObjectHelper.fromMap(inputMap, "PlanIdCredit");
  }
}
