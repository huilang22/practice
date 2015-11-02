/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefFindRequest.java
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
 * Class used to create a InvsSimCardConfigRefFindRequest Udt Request
 *
 */

public class InvsSimCardConfigRefFindRequest extends InvsSimCardConfigRefRequest {
/**
 *
 * Constructor to create a  InvsSimCardConfigRefFindRequest
 * @param id Unique request name
 * @param InvsSimCardConfigRefFindIn InvsSimCardConfigRefObjectFilter for InvsSimCardConfigRefFindRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfigRef")InvsSimCardConfigRefObjectFilter InvsSimCardConfigRefFindIn) {
    super(id, "InvsSimCardConfigRefFind");
    if (InvsSimCardConfigRefFindIn != null) {
      Integer index =  InvsSimCardConfigRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(InvsSimCardConfigRefFindIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigRefObjectDataList that results from the InvsSimCardConfigRefFindRequest call
 * @return InvsSimCardConfigRefObjectDataList resulting from udt call
 *
 */

  public InvsSimCardConfigRefObjectDataList getOutput() {
    return InvsSimCardConfigRefObjectHelper.fromMapList(outputMap, "InvsSimCardConfigRefList");
  }
}
