/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageTotalRequest.java
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
 * Class used to create a UnbilledUsageTotalRequest Udt Request
 *
 */

public class UnbilledUsageTotalRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageTotalRequest
 * @param id Unique request name
 * @param AccountExternalId String for UnbilledUsageTotalRequest
 * @param AccountExternalIdType Integer for UnbilledUsageTotalRequest
 * @param ServiceExternalId String for UnbilledUsageTotalRequest
 * @param ServiceExternalIdType Integer for UnbilledUsageTotalRequest
 *
 */
@JsonCreator
  public UnbilledUsageTotalRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountExternalId")String AccountExternalId, @JsonProperty("AccountExternalIdType")Integer AccountExternalIdType, @JsonProperty("ServiceExternalId")String ServiceExternalId, @JsonProperty("ServiceExternalIdType")Integer ServiceExternalIdType) {
    super(id, "UnbilledUsageTotal");
    if (AccountExternalId != null) {
      addInput("AccountExternalId", AccountExternalId);
    }
    if (AccountExternalIdType != null) {
      addInput("AccountExternalIdType", AccountExternalIdType);
    }
    if (ServiceExternalId != null) {
      addInput("ServiceExternalId", ServiceExternalId);
    }
    if (ServiceExternalIdType != null) {
      addInput("ServiceExternalIdType", ServiceExternalIdType);
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the UnbilledUsageTotalRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Total");
  }
}
