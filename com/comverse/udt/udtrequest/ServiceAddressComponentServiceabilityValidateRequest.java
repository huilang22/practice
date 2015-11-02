/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressComponentServiceabilityValidateRequest.java
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
 * Class used to create a ServiceAddressComponentServiceabilityValidateRequest Udt Request
 *
 */

public class ServiceAddressComponentServiceabilityValidateRequest extends SvcAddrServiceabilityRequest {
/**
 *
 * Constructor to create a  ServiceAddressComponentServiceabilityValidateRequest
 * @param id Unique request name
 * @param ComponentValidateIn SvcAddrObjectData[] for ServiceAddressComponentServiceabilityValidateRequest
 * @param ComponentAddress_idIn BigInteger for ServiceAddressComponentServiceabilityValidateRequest
 *
 */
@JsonCreator
  public ServiceAddressComponentServiceabilityValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")SvcAddrObjectData[] ComponentValidateIn, @JsonProperty("AddressId")BigInteger ComponentAddress_idIn) {
    super(id, "ServiceAddressComponentServiceabilityValidate");
    if (ComponentValidateIn != null) {
      Object[] list = new Object[ComponentValidateIn.length];
      for (int i = 0; i < ComponentValidateIn.length; i++) {
        list[i] = SvcAddrObjectHelper.getMap(ComponentValidateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
    if (ComponentAddress_idIn != null) {
      addInput("AddressId", ComponentAddress_idIn);
    }
  }

/**
 *
 * Retrieves the ComponentObjectDataList that results from the ServiceAddressComponentServiceabilityValidateRequest call
 * @return ComponentObjectDataList resulting from udt call
 *
 */

  public ComponentObjectDataList getOutput() {
    return ComponentObjectHelper.fromMapList(outputMap, "ComponentList");
  }
}
