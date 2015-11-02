/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RtPaymentResponseGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RtPaymentResponseGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RtPaymentResponseGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RtPaymentResponseObjectData noOpIn;

/**
 *
 * Constructor to create a   RtPaymentResponseGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RtPaymentResponseGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RtPaymentResponseObjectData noOpInIn) {
    super(id, context, "RtPaymentResponseGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(noOpIn, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }
/**
 *
 * Sets the  RtPaymentResponse
 * @param noOpInIn RtPaymentResponseObjectData to set
 *
 */
  public void setRtPaymentResponse(RtPaymentResponseObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RtPaymentResponse passed into the constructor
 * @return Simulated response
 *
 */
  public RtPaymentResponseObjectData getRtPaymentResponse() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RtPaymentResponseObjectHelper.fromMap(inputMap, "RtPaymentResponse");
  }
}
