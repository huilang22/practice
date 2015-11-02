/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapDeleteRequest.java
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
 * Class used to create a InvsTypePriceLookupMapDeleteRequest Udt Request
 *
 */

public class InvsTypePriceLookupMapDeleteRequest extends InvsTypePriceLookupMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapDeleteRequest
 * @param id Unique request name
 * @param ITPLMDeleteIn InvsTypePriceLookupMapObjectKeyData for InvsTypePriceLookupMapDeleteRequest
 *
 */
@JsonCreator
  public InvsTypePriceLookupMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypePriceLookupMap")InvsTypePriceLookupMapObjectKeyData ITPLMDeleteIn) {
    super(id, "InvsTypePriceLookupMapDelete");
    if (ITPLMDeleteIn != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectKeyHelper.toMap(ITPLMDeleteIn, new HashMap(), "InvsTypePriceLookupMapObjectKeyData").get("InvsTypePriceLookupMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsTypePriceLookupMapObjectData that results from the InvsTypePriceLookupMapDeleteRequest call
 * @return InvsTypePriceLookupMapObjectData resulting from udt call
 *
 */

  public InvsTypePriceLookupMapObjectData getOutput() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
}
