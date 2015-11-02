/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressServiceabilityValidateRequest.java
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
 * Class used to create a ServiceAddressServiceabilityValidateRequest Udt Request
 *
 */

public class ServiceAddressServiceabilityValidateRequest extends SvcAddrServiceabilityRequest {
/**
 *
 * Constructor to create a  ServiceAddressServiceabilityValidateRequest
 * @param id Unique request name
 * @param service ServiceObjectBaseData[] for ServiceAddressServiceabilityValidateRequest
 * @param address_id Integer for ServiceAddressServiceabilityValidateRequest
 *
 */
@JsonCreator
  public ServiceAddressServiceabilityValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseData[] service, @JsonProperty("AddressId")Integer address_id) {
    super(id, "ServiceAddressServiceabilityValidate");
    if (service != null) {
      Object[] list = new Object[service.length];
      for (int i = 0; i < service.length; i++) {
        list[i] = ServiceObjectBaseHelper.getMap(service[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
  }

/**
 *
 * Retrieves the SvcAddrObjectDataList that results from the ServiceAddressServiceabilityValidateRequest call
 * @return SvcAddrObjectDataList resulting from udt call
 *
 */

  public SvcAddrObjectDataList getOutput() {
    return SvcAddrObjectHelper.fromMapList(outputMap, "SvcAddrServiceabilityList");
  }
}
