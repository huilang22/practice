/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapCreateRequest.java
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
 * Class used to create a InvsExtDataMapCreateRequest Udt Request
 *
 */

public class InvsExtDataMapCreateRequest extends InvsExtDataMapSubRequestParent {
/**
 *
 * Constructor to create a  InvsExtDataMapCreateRequest
 * @param id Unique request name
 * @param InvsExtDataMapCreateIn InvsExtDataMapObjectData for InvsExtDataMapCreateRequest
 *
 */
@JsonCreator
  public InvsExtDataMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsExtDataMap")InvsExtDataMapObjectData InvsExtDataMapCreateIn) {
    super(id, "InvsExtDataMapCreate");
    if (InvsExtDataMapCreateIn != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(InvsExtDataMapCreateIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }

/**
 *
 * Retrieves the InvsExtDataMapObjectData that results from the InvsExtDataMapCreateRequest call
 * @return InvsExtDataMapObjectData resulting from udt call
 *
 */

  public InvsExtDataMapObjectData getOutput() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
}
