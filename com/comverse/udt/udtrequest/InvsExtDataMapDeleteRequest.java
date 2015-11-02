/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapDeleteRequest.java
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
 * Class used to create a InvsExtDataMapDeleteRequest Udt Request
 *
 */

public class InvsExtDataMapDeleteRequest extends InvsExtDataMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsExtDataMapDeleteRequest
 * @param id Unique request name
 * @param deleteIn InvsExtDataMapObjectKeyData for InvsExtDataMapDeleteRequest
 *
 */
@JsonCreator
  public InvsExtDataMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsExtDataMap")InvsExtDataMapObjectKeyData deleteIn) {
    super(id, "InvsExtDataMapDelete");
    if (deleteIn != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectKeyHelper.toMap(deleteIn, new HashMap(), "InvsExtDataMapObjectKeyData").get("InvsExtDataMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsExtDataMapObjectData that results from the InvsExtDataMapDeleteRequest call
 * @return InvsExtDataMapObjectData resulting from udt call
 *
 */

  public InvsExtDataMapObjectData getOutput() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
}
