/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionPriceRequest.java
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
 * Class used to create a PackageDefinitionPriceRequest Udt Request
 *
 */

public class PackageDefinitionPriceRequest extends PackageDefinitionRequest {
/**
 *
 * Constructor to create a  PackageDefinitionPriceRequest
 * @param id Unique request name
 * @param pdpPackageDefinitionIn PDObjectKeyData for PackageDefinitionPriceRequest
 * @param pdpRatingKeyIn RatingKeyObjectData for PackageDefinitionPriceRequest
 *
 */
@JsonCreator
  public PackageDefinitionPriceRequest(@JsonProperty("RequestId") String id, @JsonProperty("Package")PDObjectKeyData pdpPackageDefinitionIn, @JsonProperty("RatingKey")RatingKeyObjectData pdpRatingKeyIn) {
    super(id, "PackageDefinitionPrice");
    if (pdpPackageDefinitionIn != null) {
      addInput("Package", PDObjectKeyHelper.toMap(pdpPackageDefinitionIn, new HashMap(), "PDObjectKeyData").get("PDObjectKeyData"));
    }
    if (pdpRatingKeyIn != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(pdpRatingKeyIn, new HashMap(), "PdPrice").get("PdPrice"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the PackageDefinitionPriceRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("PdPrice");
  }
}
