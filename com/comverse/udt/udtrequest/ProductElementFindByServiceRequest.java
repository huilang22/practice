/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementFindByServiceRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductElementFindByServiceRequest Udt Request
 *
 */

public class ProductElementFindByServiceRequest extends ProductElementRequest {
/**
 *
 * Constructor to create a  ProductElementFindByServiceRequest
 * @param id Unique request name
 * @param LanguageCode Integer for ProductElementFindByServiceRequest
 * @param service_internal_id Integer for ProductElementFindByServiceRequest
 * @param service_internal_id_resets Integer for ProductElementFindByServiceRequest
 *
 */
@JsonCreator
  public ProductElementFindByServiceRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer LanguageCode, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets) {
    super(id, "ProductElementFindByService");
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
  }

/**
 *
 * Retrieves the ProductElementObjectDataList that results from the ProductElementFindByServiceRequest call
 * @return ProductElementObjectDataList resulting from udt call
 *
 */

  public ProductElementObjectDataList getOutput() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
}
