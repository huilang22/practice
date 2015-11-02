/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyJurisdictionDeriveRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductRateKeyJurisdictionDeriveRequest Udt Request
 *
 */

public class ProductRateKeyJurisdictionDeriveRequest extends ProductRateKeyRequest {
/**
 *
 * Constructor to create a  ProductRateKeyJurisdictionDeriveRequest
 * @param id Unique request name
 * @param TargetLocCode Integer for ProductRateKeyJurisdictionDeriveRequest
 * @param OriginLocCode Integer for ProductRateKeyJurisdictionDeriveRequest
 * @param ActiveDate Date for ProductRateKeyJurisdictionDeriveRequest
 * @param ElementId Integer for ProductRateKeyJurisdictionDeriveRequest
 *
 */
@JsonCreator
  public ProductRateKeyJurisdictionDeriveRequest(@JsonProperty("RequestId") String id, @JsonProperty("TargetLocCode")Integer TargetLocCode, @JsonProperty("OriginLocCode")Integer OriginLocCode, @JsonProperty("ActiveDate")Date ActiveDate, @JsonProperty("ElementId")Integer ElementId) {
    super(id, "ProductRateKeyJurisdictionDerive");
    if (TargetLocCode != null) {
      addInput("TargetLocCode", TargetLocCode);
    }
    if (OriginLocCode != null) {
      addInput("OriginLocCode", OriginLocCode);
    }
    if (ActiveDate != null) {
      addInput("ActiveDate", ActiveDate);
    }
    if (ElementId != null) {
      addInput("ElementId", ElementId);
    }
  }

/**
 *
 * Retrieves the Integer that results from the ProductRateKeyJurisdictionDeriveRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("JurisdictionCode");
  }
}
