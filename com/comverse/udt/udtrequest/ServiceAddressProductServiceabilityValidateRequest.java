/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressProductServiceabilityValidateRequest.java
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
 * Class used to create a ServiceAddressProductServiceabilityValidateRequest Udt Request
 *
 */

public class ServiceAddressProductServiceabilityValidateRequest extends SvcAddrServiceabilityRequest {
/**
 *
 * Constructor to create a  ServiceAddressProductServiceabilityValidateRequest
 * @param id Unique request name
 * @param ProductValidateIn SvcAddrObjectData[] for ServiceAddressProductServiceabilityValidateRequest
 * @param ProductAddress_idIn BigInteger for ServiceAddressProductServiceabilityValidateRequest
 *
 */
@JsonCreator
  public ServiceAddressProductServiceabilityValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")SvcAddrObjectData[] ProductValidateIn, @JsonProperty("AddressId")BigInteger ProductAddress_idIn) {
    super(id, "ServiceAddressProductServiceabilityValidate");
    if (ProductValidateIn != null) {
      Object[] list = new Object[ProductValidateIn.length];
      for (int i = 0; i < ProductValidateIn.length; i++) {
        list[i] = SvcAddrObjectHelper.getMap(ProductValidateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
    if (ProductAddress_idIn != null) {
      addInput("AddressId", ProductAddress_idIn);
    }
  }

/**
 *
 * Retrieves the ProductObjectDataList that results from the ServiceAddressProductServiceabilityValidateRequest call
 * @return ProductObjectDataList resulting from udt call
 *
 */

  public ProductObjectDataList getOutput() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
}
