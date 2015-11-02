/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExternalFindRequest.java
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
 * Class used to create a ServiceExternalFindRequest Udt Request
 *
 */

public class ServiceExternalFindRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceExternalFindRequest
 * @param id Unique request name
 * @param ServiceXIDFindIn ServiceObjectFilter for ServiceExternalFindRequest
 *
 */
@JsonCreator
  public ServiceExternalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectFilter ServiceXIDFindIn) {
    super(id, "ServiceExternalFind");
    if (ServiceXIDFindIn != null) {
      Integer index =  ServiceXIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceXIDFindIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectDataList that results from the ServiceExternalFindRequest call
 * @return ServiceObjectDataList resulting from udt call
 *
 */

  public ServiceObjectDataList getOutput() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
}
