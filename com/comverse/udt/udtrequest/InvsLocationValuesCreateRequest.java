/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesCreateRequest.java
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
 * Class used to create a InvsLocationValuesCreateRequest Udt Request
 *
 */

public class InvsLocationValuesCreateRequest extends InvsLocationValuesSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationValuesCreateRequest
 * @param id Unique request name
 * @param InvsLocationValuesCreateIn InvsLocationValuesObjectData for InvsLocationValuesCreateRequest
 *
 */
@JsonCreator
  public InvsLocationValuesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationValues")InvsLocationValuesObjectData InvsLocationValuesCreateIn) {
    super(id, "InvsLocationValuesCreate");
    if (InvsLocationValuesCreateIn != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(InvsLocationValuesCreateIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }

/**
 *
 * Retrieves the InvsLocationValuesObjectData that results from the InvsLocationValuesCreateRequest call
 * @return InvsLocationValuesObjectData resulting from udt call
 *
 */

  public InvsLocationValuesObjectData getOutput() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
}
