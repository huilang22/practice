/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCancelPendingRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PaymentCancelPendingRequest Udt Request
 *
 */

public class PaymentCancelPendingRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentCancelPendingRequest
 * @param id Unique request name
 * @param paypndcnl_tracking_id Integer for PaymentCancelPendingRequest
 * @param paypndcnl_tracking_id_serv Integer for PaymentCancelPendingRequest
 *
 */
@JsonCreator
  public PaymentCancelPendingRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaypndcnlTrackingId")Integer paypndcnl_tracking_id, @JsonProperty("PaypndcnlTrackingIdServ")Integer paypndcnl_tracking_id_serv) {
    super(id, "PaymentCancelPending");
    if (paypndcnl_tracking_id != null) {
      addInput("PaypndcnlTrackingId", paypndcnl_tracking_id);
    }
    if (paypndcnl_tracking_id_serv != null) {
      addInput("PaypndcnlTrackingIdServ", paypndcnl_tracking_id_serv);
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectData that results from the PaymentCancelPendingRequest call
 * @return PaymentTransObjectData resulting from udt call
 *
 */

  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
