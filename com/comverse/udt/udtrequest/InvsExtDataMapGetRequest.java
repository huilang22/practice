/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapGetRequest.java
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
 * Class used to create a InvsExtDataMapGetRequest Udt Request
 *
 */

public class InvsExtDataMapGetRequest extends InvsExtDataMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsExtDataMapGetRequest
 * @param id Unique request name
 * @param InvsExtDataMapGetIn InvsExtDataMapObjectKeyData for InvsExtDataMapGetRequest
 *
 */
@JsonCreator
  public InvsExtDataMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsExtDataMap")InvsExtDataMapObjectKeyData InvsExtDataMapGetIn) {
    super(id, "InvsExtDataMapGet");
    if (InvsExtDataMapGetIn != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectKeyHelper.toMap(InvsExtDataMapGetIn, new HashMap(), "InvsExtDataMapObjectKeyData").get("InvsExtDataMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsExtDataMapObjectData that results from the InvsExtDataMapGetRequest call
 * @return InvsExtDataMapObjectData resulting from udt call
 *
 */

  public InvsExtDataMapObjectData getOutput() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
}
