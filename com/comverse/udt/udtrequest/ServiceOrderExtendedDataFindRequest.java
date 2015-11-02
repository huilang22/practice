/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderExtendedDataFindRequest.java
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
 * Class used to create a ServiceOrderExtendedDataFindRequest Udt Request
 *
 */

public class ServiceOrderExtendedDataFindRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderExtendedDataFindRequest
 * @param id Unique request name
 * @param ServiceOrderEDFindIn ServiceOrderObjectBaseKeyData for ServiceOrderExtendedDataFindRequest
 *
 */
@JsonCreator
  public ServiceOrderExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseKeyData ServiceOrderEDFindIn) {
    super(id, "ServiceOrderExtendedDataFind");
    if (ServiceOrderEDFindIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderEDFindIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderEDObjectDataList that results from the ServiceOrderExtendedDataFindRequest call
 * @return ServiceOrderEDObjectDataList resulting from udt call
 *
 */

  public ServiceOrderEDObjectDataList getOutput() {
    return ServiceOrderEDObjectHelper.fromMapList(outputMap, "ServiceOrderExtendedDataList");
  }
}
