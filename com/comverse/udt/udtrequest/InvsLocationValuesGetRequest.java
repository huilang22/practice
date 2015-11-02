/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesGetRequest.java
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
 * Class used to create a InvsLocationValuesGetRequest Udt Request
 *
 */

public class InvsLocationValuesGetRequest extends InvsLocationValuesSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationValuesGetRequest
 * @param id Unique request name
 * @param InvsLocationValuesGetIn InvsLocationValuesObjectKeyData for InvsLocationValuesGetRequest
 *
 */
@JsonCreator
  public InvsLocationValuesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationValues")InvsLocationValuesObjectKeyData InvsLocationValuesGetIn) {
    super(id, "InvsLocationValuesGet");
    if (InvsLocationValuesGetIn != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectKeyHelper.toMap(InvsLocationValuesGetIn, new HashMap(), "InvsLocationValuesObjectKeyData").get("InvsLocationValuesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLocationValuesObjectData that results from the InvsLocationValuesGetRequest call
 * @return InvsLocationValuesObjectData resulting from udt call
 *
 */

  public InvsLocationValuesObjectData getOutput() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
}
