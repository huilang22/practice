/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageActiveComponentCountRequest.java
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
 * Class used to create a ProductPackageActiveComponentCountRequest Udt Request
 *
 */

public class ProductPackageActiveComponentCountRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageActiveComponentCountRequest
 * @param id Unique request name
 * @param activeCountIn ProductPackageObjectKeyData for ProductPackageActiveComponentCountRequest
 * @param effective_date Date for ProductPackageActiveComponentCountRequest
 * @param component_id Integer for ProductPackageActiveComponentCountRequest
 *
 */
@JsonCreator
  public ProductPackageActiveComponentCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectKeyData activeCountIn, @JsonProperty("EffectiveDate")Date effective_date, @JsonProperty("ComponentId")Integer component_id) {
    super(id, "ProductPackageActiveComponentCount");
    if (activeCountIn != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(activeCountIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
    if (component_id != null) {
      addInput("ComponentId", component_id);
    }
  }

/**
 *
 * Retrieves the Integer that results from the ProductPackageActiveComponentCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("ActiveCount");
  }
}
