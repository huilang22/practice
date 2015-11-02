/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapCreateRequest.java
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
 * Class used to create a InvsTypePriceLookupMapCreateRequest Udt Request
 *
 */

public class InvsTypePriceLookupMapCreateRequest extends InvsTypePriceLookupMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapCreateRequest
 * @param id Unique request name
 * @param ITPLMCreateIn InvsTypePriceLookupMapObjectData for InvsTypePriceLookupMapCreateRequest
 *
 */
@JsonCreator
  public InvsTypePriceLookupMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypePriceLookupMap")InvsTypePriceLookupMapObjectData ITPLMCreateIn) {
    super(id, "InvsTypePriceLookupMapCreate");
    if (ITPLMCreateIn != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(ITPLMCreateIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }

/**
 *
 * Retrieves the InvsTypePriceLookupMapObjectData that results from the InvsTypePriceLookupMapCreateRequest call
 * @return InvsTypePriceLookupMapObjectData resulting from udt call
 *
 */

  public InvsTypePriceLookupMapObjectData getOutput() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
}
