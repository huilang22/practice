/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapGetRequest.java
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
 * Class used to create a InvsTypePriceLookupMapGetRequest Udt Request
 *
 */

public class InvsTypePriceLookupMapGetRequest extends InvsTypePriceLookupMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapGetRequest
 * @param id Unique request name
 * @param ITPLMGetIn InvsTypePriceLookupMapObjectKeyData for InvsTypePriceLookupMapGetRequest
 *
 */
@JsonCreator
  public InvsTypePriceLookupMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypePriceLookupMap")InvsTypePriceLookupMapObjectKeyData ITPLMGetIn) {
    super(id, "InvsTypePriceLookupMapGet");
    if (ITPLMGetIn != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectKeyHelper.toMap(ITPLMGetIn, new HashMap(), "InvsTypePriceLookupMapObjectKeyData").get("InvsTypePriceLookupMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsTypePriceLookupMapObjectData that results from the InvsTypePriceLookupMapGetRequest call
 * @return InvsTypePriceLookupMapObjectData resulting from udt call
 *
 */

  public InvsTypePriceLookupMapObjectData getOutput() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
}
