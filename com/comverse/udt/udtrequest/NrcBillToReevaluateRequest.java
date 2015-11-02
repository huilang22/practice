/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcBillToReevaluateRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcBillToReevaluateRequest Udt Request
 *
 */

public class NrcBillToReevaluateRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a  NrcBillToReevaluateRequest
 * @param id Unique request name
 * @param NrcReIn NrcObjectBaseKeyData for NrcBillToReevaluateRequest
 * @param billing_account_internal_id Integer for NrcBillToReevaluateRequest
 * @param open_item_id Integer for NrcBillToReevaluateRequest
 * @param reevaluation_date Date for NrcBillToReevaluateRequest
 *
 */
@JsonCreator
  public NrcBillToReevaluateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseKeyData NrcReIn, @JsonProperty("BillingAccountInternalId")Integer billing_account_internal_id, @JsonProperty("OpenItemId")Integer open_item_id, @JsonProperty("ReevaluationDate")Date reevaluation_date) {
    super(id, "NrcBillToReevaluate");
    if (NrcReIn != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(NrcReIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
    if (billing_account_internal_id != null) {
      addInput("BillingAccountInternalId", billing_account_internal_id);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
    if (reevaluation_date != null) {
      addInput("ReevaluationDate", reevaluation_date);
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseData that results from the NrcBillToReevaluateRequest call
 * @return NrcObjectBaseData resulting from udt call
 *
 */

  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
