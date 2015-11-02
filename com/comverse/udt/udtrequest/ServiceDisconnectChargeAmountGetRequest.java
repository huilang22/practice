/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceDisconnectChargeAmountGetRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceDisconnectChargeAmountGetRequest Udt Request
 *
 */

public class ServiceDisconnectChargeAmountGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  ServiceDisconnectChargeAmountGetRequest
 * @param id Unique request name
 * @param service_internal_id Integer for ServiceDisconnectChargeAmountGetRequest
 * @param service_internal_id_resets Integer for ServiceDisconnectChargeAmountGetRequest
 * @param _effective_date Date for ServiceDisconnectChargeAmountGetRequest
 *
 */
@JsonCreator
  public ServiceDisconnectChargeAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets, @JsonProperty("EffectiveDate")Date _effective_date) {
    super(id, "ServiceDisconnectChargeAmountGet");
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
    if (_effective_date != null) {
      addInput("EffectiveDate", _effective_date);
    }
  }

/**
 *
 * Retrieves the ServiceDisconnectChargeAmountGetOutputData that results from the ServiceDisconnectChargeAmountGetRequest call
 * @return ServiceDisconnectChargeAmountGetOutputData resulting from udt call
 *
 */

  public ServiceDisconnectChargeAmountGetOutputData getOutput() {
    return ServiceDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
