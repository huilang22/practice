/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressServiceServiceabilityValidateRequest.java
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
 * Class used to create a ServiceAddressServiceServiceabilityValidateRequest Udt Request
 *
 */

public class ServiceAddressServiceServiceabilityValidateRequest extends SvcAddrServiceabilityRequest {
/**
 *
 * Constructor to create a  ServiceAddressServiceServiceabilityValidateRequest
 * @param id Unique request name
 * @param ServiceValidateIn SvcAddrObjectData[] for ServiceAddressServiceServiceabilityValidateRequest
 * @param ServiceAddress_id BigInteger for ServiceAddressServiceServiceabilityValidateRequest
 *
 */
@JsonCreator
  public ServiceAddressServiceServiceabilityValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")SvcAddrObjectData[] ServiceValidateIn, @JsonProperty("AddressId")BigInteger ServiceAddress_id) {
    super(id, "ServiceAddressServiceServiceabilityValidate");
    if (ServiceValidateIn != null) {
      Object[] list = new Object[ServiceValidateIn.length];
      for (int i = 0; i < ServiceValidateIn.length; i++) {
        list[i] = SvcAddrObjectHelper.getMap(ServiceValidateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
    if (ServiceAddress_id != null) {
      addInput("AddressId", ServiceAddress_id);
    }
  }

/**
 *
 * Retrieves the ServiceObjectDataList that results from the ServiceAddressServiceServiceabilityValidateRequest call
 * @return ServiceObjectDataList resulting from udt call
 *
 */

  public ServiceObjectDataList getOutput() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
}
