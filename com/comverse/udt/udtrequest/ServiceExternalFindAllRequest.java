/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExternalFindAllRequest.java
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
 * Class used to create a ServiceExternalFindAllRequest Udt Request
 *
 */

public class ServiceExternalFindAllRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceExternalFindAllRequest
 * @param id Unique request name
 * @param ServiceXIDFindAIn ServiceObjectFilter for ServiceExternalFindAllRequest
 *
 */
@JsonCreator
  public ServiceExternalFindAllRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectFilter ServiceXIDFindAIn) {
    super(id, "ServiceExternalFindAll");
    if (ServiceXIDFindAIn != null) {
      Integer index =  ServiceXIDFindAIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceXIDFindAIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectDataList that results from the ServiceExternalFindAllRequest call
 * @return ServiceObjectDataList resulting from udt call
 *
 */

  public ServiceObjectDataList getOutput() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
}
