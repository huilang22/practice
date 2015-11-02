/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapUpdateRequest.java
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
 * Class used to create a InvsTypePriceLookupMapUpdateRequest Udt Request
 *
 */

public class InvsTypePriceLookupMapUpdateRequest extends InvsTypePriceLookupMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapUpdateRequest
 * @param id Unique request name
 * @param ITPLMUpdateIn InvsTypePriceLookupMapObjectData for InvsTypePriceLookupMapUpdateRequest
 *
 */
@JsonCreator
  public InvsTypePriceLookupMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypePriceLookupMap")InvsTypePriceLookupMapObjectData ITPLMUpdateIn) {
    super(id, "InvsTypePriceLookupMapUpdate");
    if (ITPLMUpdateIn != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(ITPLMUpdateIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }

/**
 *
 * Retrieves the InvsTypePriceLookupMapObjectData that results from the InvsTypePriceLookupMapUpdateRequest call
 * @return InvsTypePriceLookupMapObjectData resulting from udt call
 *
 */

  public InvsTypePriceLookupMapObjectData getOutput() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
}
