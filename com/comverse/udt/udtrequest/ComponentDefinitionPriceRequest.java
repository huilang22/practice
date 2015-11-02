/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionPriceRequest.java
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
 * Class used to create a ComponentDefinitionPriceRequest Udt Request
 *
 */

public class ComponentDefinitionPriceRequest extends ComponentDefinitionRequest {
/**
 *
 * Constructor to create a  ComponentDefinitionPriceRequest
 * @param id Unique request name
 * @param cdpComponentDefinitionIn CDObjectKeyData for ComponentDefinitionPriceRequest
 * @param cdpRatingKeyIn RatingKeyObjectData for ComponentDefinitionPriceRequest
 *
 */
@JsonCreator
  public ComponentDefinitionPriceRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")CDObjectKeyData cdpComponentDefinitionIn, @JsonProperty("RatingKey")RatingKeyObjectData cdpRatingKeyIn) {
    super(id, "ComponentDefinitionPrice");
    if (cdpComponentDefinitionIn != null) {
      addInput("Component", CDObjectKeyHelper.toMap(cdpComponentDefinitionIn, new HashMap(), "CDObjectKeyData").get("CDObjectKeyData"));
    }
    if (cdpRatingKeyIn != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(cdpRatingKeyIn, new HashMap(), "CdPrice").get("CdPrice"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the ComponentDefinitionPriceRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("CdPrice");
  }
}
