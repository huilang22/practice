/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidProductChargeTotalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoicePrepaidProductChargeTotalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoicePrepaidProductChargeTotalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoicePrepaidProductChargeTotalOutputData noOpIn;

/**
 *
 * Constructor to create a   InvoicePrepaidProductChargeTotalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoicePrepaidProductChargeTotalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoicePrepaidProductChargeTotalOutputData noOpInIn) {
    super(id, context, "InvoicePrepaidProductChargeTotal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoicePrepaidProductChargeTotalOutputData", InvoicePrepaidProductChargeTotalOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  InvoicePrepaidProductChargeTotalOutputData
 * @param noOpInIn InvoicePrepaidProductChargeTotalOutputData to set
 *
 */
  public void setInvoicePrepaidProductChargeTotalOutputData(InvoicePrepaidProductChargeTotalOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoicePrepaidProductChargeTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePrepaidProductChargeTotalOutputData getInvoicePrepaidProductChargeTotalOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoicePrepaidProductChargeTotalOutputHelper.fromMap(inputMap);
  }
}
