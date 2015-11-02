/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesUpdateRequest.java
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
 * Class used to create a InvsLineValuesUpdateRequest Udt Request
 *
 */

public class InvsLineValuesUpdateRequest extends InvsLineValuesSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineValuesUpdateRequest
 * @param id Unique request name
 * @param InvsLineValuesUpdateIn InvsLineValuesObjectData for InvsLineValuesUpdateRequest
 *
 */
@JsonCreator
  public InvsLineValuesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineValues")InvsLineValuesObjectData InvsLineValuesUpdateIn) {
    super(id, "InvsLineValuesUpdate");
    if (InvsLineValuesUpdateIn != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(InvsLineValuesUpdateIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }

/**
 *
 * Retrieves the InvsLineValuesObjectData that results from the InvsLineValuesUpdateRequest call
 * @return InvsLineValuesObjectData resulting from udt call
 *
 */

  public InvsLineValuesObjectData getOutput() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
}
