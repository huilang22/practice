/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PlanIdCreditGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PlanIdCreditGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PlanIdCreditObjectData noOpIn;

/**
 *
 * Constructor to create a   PlanIdCreditGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PlanIdCreditGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PlanIdCreditObjectData noOpInIn) {
    super(id, context, "PlanIdCreditGet");
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
