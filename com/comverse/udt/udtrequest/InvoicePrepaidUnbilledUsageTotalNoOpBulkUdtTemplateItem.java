/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidUnbilledUsageTotalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoicePrepaidUnbilledUsageTotalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoicePrepaidUnbilledUsageTotalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoicePrepaidUnbilledUsageTotalOutputData noOpIn;

/**
 *
 * Constructor to create a   InvoicePrepaidUnbilledUsageTotalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoicePrepaidUnbilledUsageTotalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoicePrepaidUnbilledUsageTotalOutputData noOpInIn) {
    super(id, context, "InvoicePrepaidUnbilledUsageTotal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoicePrepaidUnbilledUsageTotalOutputData", InvoicePrepaidUnbilledUsageTotalOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  InvoicePrepaidUnbilledUsageTotalOutputData
 * @param noOpInIn InvoicePrepaidUnbilledUsageTotalOutputData to set
 *
 */
  public void setInvoicePrepaidUnbilledUsageTotalOutputData(InvoicePrepaidUnbilledUsageTotalOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoicePrepaidUnbilledUsageTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePrepaidUnbilledUsageTotalOutputData getInvoicePrepaidUnbilledUsageTotalOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoicePrepaidUnbilledUsageTotalOutputHelper.fromMap(inputMap);
  }
}
