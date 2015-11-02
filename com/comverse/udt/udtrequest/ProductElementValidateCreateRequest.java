/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementValidateCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductElementValidateCreateRequest Udt Request
 *
 */

public class ProductElementValidateCreateRequest extends ProductElementValidateSubRequestParent {
/**
 *
 * Constructor to create a  ProductElementValidateCreateRequest
 * @param id Unique request name
 * @param ProductElementIn ProductElementObjectData for ProductElementValidateCreateRequest
 * @param ServiceInternalId Integer for ProductElementValidateCreateRequest
 * @param ServiceInternalIdResets Integer for ProductElementValidateCreateRequest
 *
 */
@JsonCreator
  public ProductElementValidateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductElementValidate")ProductElementObjectData ProductElementIn, @JsonProperty("ServiceInternalId")Integer ServiceInternalId, @JsonProperty("ServiceInternalIdResets")Integer ServiceInternalIdResets) {
    super(id, "ProductElementValidateCreate");
    if (ProductElementIn != null) {
      addInput("ProductElementValidate", ProductElementObjectHelper.toMap(ProductElementIn, new HashMap(), "ProductElementValidate").get("ProductElementValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }

/**
 *
 * Retrieves the ProductElementObjectData that results from the ProductElementValidateCreateRequest call
 * @return ProductElementObjectData resulting from udt call
 *
 */

  public ProductElementObjectData getOutput() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElementValidate");
  }
}
