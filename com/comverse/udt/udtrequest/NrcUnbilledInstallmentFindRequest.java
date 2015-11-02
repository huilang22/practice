/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcUnbilledInstallmentFindRequest.java
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
 * Class used to create a NrcUnbilledInstallmentFindRequest Udt Request
 *
 */

public class NrcUnbilledInstallmentFindRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcUnbilledInstallmentFindRequest
 * @param id Unique request name
 * @param disconnect_date Date for NrcUnbilledInstallmentFindRequest
 * @param account_no Integer for NrcUnbilledInstallmentFindRequest
 * @param subscr_no Integer for NrcUnbilledInstallmentFindRequest
 * @param subscr_no_resets Integer for NrcUnbilledInstallmentFindRequest
 *
 */
@JsonCreator
  public NrcUnbilledInstallmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DisconnectDate")Date disconnect_date, @JsonProperty("AccountInternalId")Integer account_no, @JsonProperty("ServiceInternalId")Integer subscr_no, @JsonProperty("ServiceInternalIdResets")Integer subscr_no_resets) {
    super(id, "NrcUnbilledInstallmentFind");
    if (disconnect_date != null) {
      addInput("DisconnectDate", disconnect_date);
    }
    if (account_no != null) {
      addInput("AccountInternalId", account_no);
    }
    if (subscr_no != null) {
      addInput("ServiceInternalId", subscr_no);
    }
    if (subscr_no_resets != null) {
      addInput("ServiceInternalIdResets", subscr_no_resets);
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseDataList that results from the NrcUnbilledInstallmentFindRequest call
 * @return NrcObjectBaseDataList resulting from udt call
 *
 */

  public NrcObjectBaseDataList getOutput() {
    return NrcObjectBaseHelper.fromMapList(outputMap, "NrcList");
  }
}
