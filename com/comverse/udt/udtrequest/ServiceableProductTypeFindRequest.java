/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableProductTypeFindRequest.java
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
 * Class used to create a ServiceableProductTypeFindRequest Udt Request
 *
 */

public class ServiceableProductTypeFindRequest extends ServiceableProductTypeRequest {
/**
 *
 * Constructor to create a  ServiceableProductTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServiceableProductTypeFindRequest
 * @param IndustryTypeId Integer for ServiceableProductTypeFindRequest
 * @param ServiceableDt Date for ServiceableProductTypeFindRequest
 *
 */
@JsonCreator
  public ServiceableProductTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn, @JsonProperty("IndustryTypeId")Integer IndustryTypeId, @JsonProperty("ServiceableDt")Date ServiceableDt) {
    super(id, "ServiceableProductTypeFind");
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
 * Retrieves the ProductElementObjectDataList that results from the ServiceableProductTypeFindRequest call
 * @return ProductElementObjectDataList resulting from udt call
 *
 */

  public ProductElementObjectDataList getOutput() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
}
