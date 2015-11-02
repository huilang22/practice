/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefFindRequest.java
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
 * Class used to create a InvsSimResellerRefFindRequest Udt Request
 *
 */

public class InvsSimResellerRefFindRequest extends InvsSimResellerRefRequest {
/**
 *
 * Constructor to create a  InvsSimResellerRefFindRequest
 * @param id Unique request name
 * @param InvsSimResellerRefFindIn InvsSimResellerRefObjectFilter for InvsSimResellerRefFindRequest
 *
 */
@JsonCreator
  public InvsSimResellerRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimResellerRef")InvsSimResellerRefObjectFilter InvsSimResellerRefFindIn) {
    super(id, "InvsSimResellerRefFind");
    if (InvsSimResellerRefFindIn != null) {
      Integer index =  InvsSimResellerRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(InvsSimResellerRefFindIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerRefObjectDataList that results from the InvsSimResellerRefFindRequest call
 * @return InvsSimResellerRefObjectDataList resulting from udt call
 *
 */

  public InvsSimResellerRefObjectDataList getOutput() {
    return InvsSimResellerRefObjectHelper.fromMapList(outputMap, "InvsSimResellerRefList");
  }
}
