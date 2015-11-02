/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServServiceTypeFindRequest.java
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
import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServServiceTypeFindRequest Udt Request
 *
 */

public class ServServiceTypeFindRequest extends ServServiceTypeRequest {
/**
 *
 * Constructor to create a  ServServiceTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServServiceTypeFindRequest
 * @param IndustryTypeId Integer for ServServiceTypeFindRequest
 * @param ServiceableDt Date for ServServiceTypeFindRequest
 *
 */
@JsonCreator
  public ServServiceTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn, @JsonProperty("IndustryTypeId")Integer IndustryTypeId, @JsonProperty("ServiceableDt")Date ServiceableDt) {
    super(id, "ServServiceTypeFind");
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
    if (IndustryTypeId != null) {
      addInput("IndustryTypeId", IndustryTypeId);
    }
    if (ServiceableDt != null) {
      addInput("ServiceableDt", ServiceableDt);
    }
  }

/**
 *
 * Retrieves the ServicePricingPlanObjectDataList that results from the ServServiceTypeFindRequest call
 * @return ServicePricingPlanObjectDataList resulting from udt call
 *
 */

  public ServicePricingPlanObjectDataList getOutput() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
}
