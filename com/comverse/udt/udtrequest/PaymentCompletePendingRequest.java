/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCompletePendingRequest.java
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
 * Class used to create a PaymentCompletePendingRequest Udt Request
 *
 */

public class PaymentCompletePendingRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentCompletePendingRequest
 * @param id Unique request name
 * @param paypndcmp_tracking_id Integer for PaymentCompletePendingRequest
 * @param paypndcmp_tracking_id_serv Integer for PaymentCompletePendingRequest
 *
 */
@JsonCreator
  public PaymentCompletePendingRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaypndcmpTrackingId")Integer paypndcmp_tracking_id, @JsonProperty("PaypndcmpTrackingIdServ")Integer paypndcmp_tracking_id_serv) {
    super(id, "PaymentCompletePending");
    if (paypndcmp_tracking_id != null) {
      addInput("PaypndcmpTrackingId", paypndcmp_tracking_id);
    }
    if (paypndcmp_tracking_id_serv != null) {
      addInput("PaypndcmpTrackingIdServ", paypndcmp_tracking_id_serv);
    }
  }

/**
 *
 * Retrieves the PaymentObjectData that results from the PaymentCompletePendingRequest call
 * @return PaymentObjectData resulting from udt call
 *
 */

  public PaymentObjectData getOutput() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
}
