/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidBilledUsageTotalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoicePrepaidBilledUsageTotalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoicePrepaidBilledUsageTotalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BigInteger noOpIn;

/**
 *
 * Constructor to create a   InvoicePrepaidBilledUsageTotalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoicePrepaidBilledUsageTotalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger noOpInIn) {
    super(id, context, "InvoicePrepaidBilledUsageTotal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("TotalPrepaidBilledUsage", noOpIn);
    }
  }
/**
 *
 * Sets the  TotalPrepaidBilledUsage
 * @param noOpInIn BigInteger to set
 *
 */
  public void setTotalPrepaidBilledUsage(BigInteger noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TotalPrepaidBilledUsage passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getTotalPrepaidBilledUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BigInteger)inputMap.get("TotalPrepaidBilledUsage");
  }
}
