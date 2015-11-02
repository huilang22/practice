/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailBulkAdjustmentGetNoOpRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a InvoiceDetailBulkAdjustmentGetNoOpRequest Udt Request/Response
 *
 */
public class InvoiceDetailBulkAdjustmentGetNoOpRequest extends InvoiceDetailBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   InvoiceDetailBulkAdjustmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceDetailBulkAdjustmentGetNoOpRequest(String id, InvoiceDetailBulkAdjustmentGetOutputData noOpIn) {
    super(id, "InvoiceDetailBulkAdjustmentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoiceDetailBulkAdjustmentGetOutputData", InvoiceDetailBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("InvoiceDetailBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Retrieves the InvoiceDetailBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceDetailBulkAdjustmentGetOutputData getOutput() {
    return InvoiceDetailBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
