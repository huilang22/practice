/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesGetRequest.java
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
 * Class used to create a InvsLineValuesGetRequest Udt Request
 *
 */

public class InvsLineValuesGetRequest extends InvsLineValuesSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineValuesGetRequest
 * @param id Unique request name
 * @param InvsLineValuesGetIn InvsLineValuesObjectKeyData for InvsLineValuesGetRequest
 *
 */
@JsonCreator
  public InvsLineValuesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineValues")InvsLineValuesObjectKeyData InvsLineValuesGetIn) {
    super(id, "InvsLineValuesGet");
    if (InvsLineValuesGetIn != null) {
      addInput("InvsLineValues", InvsLineValuesObjectKeyHelper.toMap(InvsLineValuesGetIn, new HashMap(), "InvsLineValuesObjectKeyData").get("InvsLineValuesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLineValuesObjectData that results from the InvsLineValuesGetRequest call
 * @return InvsLineValuesObjectData resulting from udt call
 *
 */

  public InvsLineValuesObjectData getOutput() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
}
