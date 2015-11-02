/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesCreateRequest.java
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
 * Class used to create a InvsLineValuesCreateRequest Udt Request
 *
 */

public class InvsLineValuesCreateRequest extends InvsLineValuesSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineValuesCreateRequest
 * @param id Unique request name
 * @param InvsLineValuesCreateIn InvsLineValuesObjectData for InvsLineValuesCreateRequest
 *
 */
@JsonCreator
  public InvsLineValuesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineValues")InvsLineValuesObjectData InvsLineValuesCreateIn) {
    super(id, "InvsLineValuesCreate");
    if (InvsLineValuesCreateIn != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(InvsLineValuesCreateIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }

/**
 *
 * Retrieves the InvsLineValuesObjectData that results from the InvsLineValuesCreateRequest call
 * @return InvsLineValuesObjectData resulting from udt call
 *
 */

  public InvsLineValuesObjectData getOutput() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
}
