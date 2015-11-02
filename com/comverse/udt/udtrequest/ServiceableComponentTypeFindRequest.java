/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableComponentTypeFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceableComponentTypeFindRequest Udt Request
 *
 */

public class ServiceableComponentTypeFindRequest extends ServiceableComponentTypeRequest {
/**
 *
 * Constructor to create a  ServiceableComponentTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServiceableComponentTypeFindRequest
 * @param IndustryTypeId Integer for ServiceableComponentTypeFindRequest
 * @param ServiceableDt Date for ServiceableComponentTypeFindRequest
 *
 */
@JsonCreator
  public ServiceableComponentTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn, @JsonProperty("IndustryTypeId")Integer IndustryTypeId, @JsonProperty("ServiceableDt")Date ServiceableDt) {
    super(id, "ServiceableComponentTypeFind");
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
 * Retrieves the CDObjectDataList that results from the ServiceableComponentTypeFindRequest call
 * @return CDObjectDataList resulting from udt call
 *
 */

  public CDObjectDataList getOutput() {
    return CDObjectHelper.fromMapList(outputMap, "ComponentDefinitionList");
  }
}
