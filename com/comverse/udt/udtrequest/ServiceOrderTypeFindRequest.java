/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeFindRequest.java
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
 * Class used to create a ServiceOrderTypeFindRequest Udt Request
 *
 */

public class ServiceOrderTypeFindRequest extends ServiceOrderTypeRequest {
/**
 *
 * Constructor to create a  ServiceOrderTypeFindRequest
 * @param id Unique request name
 * @param ServiceOrderTypeFindIn ServiceOrderTypeObjectFilter for ServiceOrderTypeFindRequest
 *
 */
@JsonCreator
  public ServiceOrderTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderType")ServiceOrderTypeObjectFilter ServiceOrderTypeFindIn) {
    super(id, "ServiceOrderTypeFind");
    if (ServiceOrderTypeFindIn != null) {
      Integer index =  ServiceOrderTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(ServiceOrderTypeFindIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderTypeObjectDataList that results from the ServiceOrderTypeFindRequest call
 * @return ServiceOrderTypeObjectDataList resulting from udt call
 *
 */

  public ServiceOrderTypeObjectDataList getOutput() {
    return ServiceOrderTypeObjectHelper.fromMapList(outputMap, "ServiceOrderTypeList");
  }
}
