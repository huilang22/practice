/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceFindWithExtendedDataRequest.java
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
 * Class used to create a ServiceFindWithExtendedDataRequest Udt Request
 *
 */

public class ServiceFindWithExtendedDataRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceFindWithExtendedDataRequest
 * @param id Unique request name
 * @param ServiceFindWithIn ServiceObjectFilter for ServiceFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public ServiceFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectFilter ServiceFindWithIn) {
    super(id, "ServiceFindWithExtendedData");
    if (ServiceFindWithIn != null) {
      Integer index =  ServiceFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceFindWithIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectDataList that results from the ServiceFindWithExtendedDataRequest call
 * @return ServiceObjectDataList resulting from udt call
 *
 */

  public ServiceObjectDataList getOutput() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
}
