/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServProductTypeFindRequest.java
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
import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServProductTypeFindRequest Udt Request
 *
 */

public class ServProductTypeFindRequest extends ServProductTypeRequest {
/**
 *
 * Constructor to create a  ServProductTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServProductTypeFindRequest
 * @param IndustryTypeId Integer for ServProductTypeFindRequest
 * @param ServiceableDt Date for ServProductTypeFindRequest
 *
 */
@JsonCreator
  public ServProductTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn, @JsonProperty("IndustryTypeId")Integer IndustryTypeId, @JsonProperty("ServiceableDt")Date ServiceableDt) {
    super(id, "ServProductTypeFind");
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
 * Retrieves the ProductElementObjectDataList that results from the ServProductTypeFindRequest call
 * @return ProductElementObjectDataList resulting from udt call
 *
 */

  public ProductElementObjectDataList getOutput() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
}
