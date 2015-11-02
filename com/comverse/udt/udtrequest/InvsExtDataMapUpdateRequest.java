/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapUpdateRequest.java
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
 * Class used to create a InvsExtDataMapUpdateRequest Udt Request
 *
 */

public class InvsExtDataMapUpdateRequest extends InvsExtDataMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsExtDataMapUpdateRequest
 * @param id Unique request name
 * @param InvsExtDataMapUpdateIn InvsExtDataMapObjectData for InvsExtDataMapUpdateRequest
 *
 */
@JsonCreator
  public InvsExtDataMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsExtDataMap")InvsExtDataMapObjectData InvsExtDataMapUpdateIn) {
    super(id, "InvsExtDataMapUpdate");
    if (InvsExtDataMapUpdateIn != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(InvsExtDataMapUpdateIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }

/**
 *
 * Retrieves the InvsExtDataMapObjectData that results from the InvsExtDataMapUpdateRequest call
 * @return InvsExtDataMapObjectData resulting from udt call
 *
 */

  public InvsExtDataMapObjectData getOutput() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
}
