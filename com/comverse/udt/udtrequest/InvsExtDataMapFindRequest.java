/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapFindRequest.java
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
 * Class used to create a InvsExtDataMapFindRequest Udt Request
 *
 */

public class InvsExtDataMapFindRequest extends InvsExtDataMapRequest {
/**
 *
 * Constructor to create a  InvsExtDataMapFindRequest
 * @param id Unique request name
 * @param InvsExtDataMapFindIn InvsExtDataMapObjectFilter for InvsExtDataMapFindRequest
 *
 */
@JsonCreator
  public InvsExtDataMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsExtDataMap")InvsExtDataMapObjectFilter InvsExtDataMapFindIn) {
    super(id, "InvsExtDataMapFind");
    if (InvsExtDataMapFindIn != null) {
      Integer index =  InvsExtDataMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(InvsExtDataMapFindIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }

/**
 *
 * Retrieves the InvsExtDataMapObjectDataList that results from the InvsExtDataMapFindRequest call
 * @return InvsExtDataMapObjectDataList resulting from udt call
 *
 */

  public InvsExtDataMapObjectDataList getOutput() {
    return InvsExtDataMapObjectHelper.fromMapList(outputMap, "InvsExtDataMapList");
  }
}
