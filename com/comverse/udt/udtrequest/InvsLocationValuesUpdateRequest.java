/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesUpdateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsLocationValuesUpdateRequest Udt Request
 *
 */

public class InvsLocationValuesUpdateRequest extends InvsLocationValuesSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationValuesUpdateRequest
 * @param id Unique request name
 * @param InvsLocationValuesUpdateIn InvsLocationValuesObjectData for InvsLocationValuesUpdateRequest
 *
 */
@JsonCreator
  public InvsLocationValuesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationValues")InvsLocationValuesObjectData InvsLocationValuesUpdateIn) {
    super(id, "InvsLocationValuesUpdate");
    if (InvsLocationValuesUpdateIn != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(InvsLocationValuesUpdateIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }

/**
 *
 * Retrieves the InvsLocationValuesObjectData that results from the InvsLocationValuesUpdateRequest call
 * @return InvsLocationValuesObjectData resulting from udt call
 *
 */

  public InvsLocationValuesObjectData getOutput() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
}
