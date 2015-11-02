/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressInventoryServiceabilityValidateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceAddressInventoryServiceabilityValidateRequest Udt Request
 *
 */

public class ServiceAddressInventoryServiceabilityValidateRequest extends SvcAddrInvServiceabilityRequest {
/**
 *
 * Constructor to create a  ServiceAddressInventoryServiceabilityValidateRequest
 * @param id Unique request name
 * @param service ServiceKeyOnlyObjData[] for ServiceAddressInventoryServiceabilityValidateRequest
 * @param address_id BigInteger for ServiceAddressInventoryServiceabilityValidateRequest
 *
 */
@JsonCreator
  public ServiceAddressInventoryServiceabilityValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceKeyOnlyObjData[] service, @JsonProperty("AddressId")BigInteger address_id) {
    super(id, "ServiceAddressInventoryServiceabilityValidate");
    if (service != null) {
      Object[] list = new Object[service.length];
      for (int i = 0; i < service.length; i++) {
        list[i] = ServiceKeyOnlyObjHelper.getMap(service[i], (Map) list[i]);
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
 * Retrieves the InvElementObjDataList that results from the ServiceAddressInventoryServiceabilityValidateRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
