/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RTUnitCreditBalanceQueryRequest.java
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
 * Class used to create a RTUnitCreditBalanceQueryRequest Udt Request
 *
 */

public class RTUnitCreditBalanceQueryRequest extends RTUnitCreditBalanceSubRequestParent {
/**
 *
 * Constructor to create a  RTUnitCreditBalanceQueryRequest
 * @param id Unique request name
 * @param is_prepaid Integer for RTUnitCreditBalanceQueryRequest
 * @param service_internal_id Integer for RTUnitCreditBalanceQueryRequest
 * @param service_internal_id_resets Integer for RTUnitCreditBalanceQueryRequest
 * @param granularity Integer for RTUnitCreditBalanceQueryRequest
 *
 */
@JsonCreator
  public RTUnitCreditBalanceQueryRequest(@JsonProperty("RequestId") String id, @JsonProperty("IsPrepaid")Integer is_prepaid, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets, @JsonProperty("Granularity")Integer granularity) {
    super(id, "RTUnitCreditBalanceQuery");
    if (is_prepaid != null) {
      addInput("IsPrepaid", is_prepaid);
    }
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
    if (granularity != null) {
      addInput("Granularity", granularity);
    }
  }

/**
 *
 * Retrieves the RTUnitCreditBalanceQueryOutputData that results from the RTUnitCreditBalanceQueryRequest call
 * @return RTUnitCreditBalanceQueryOutputData resulting from udt call
 *
 */

  public RTUnitCreditBalanceQueryOutputData getOutput() {
    return RTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
  }
}
