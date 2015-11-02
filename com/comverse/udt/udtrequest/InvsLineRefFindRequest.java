/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefFindRequest.java
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
 * Class used to create a InvsLineRefFindRequest Udt Request
 *
 */

public class InvsLineRefFindRequest extends InvsLineRefRequest {
/**
 *
 * Constructor to create a  InvsLineRefFindRequest
 * @param id Unique request name
 * @param InvsLineRefFindIn InvsLineRefObjectFilter for InvsLineRefFindRequest
 *
 */
@JsonCreator
  public InvsLineRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineRef")InvsLineRefObjectFilter InvsLineRefFindIn) {
    super(id, "InvsLineRefFind");
    if (InvsLineRefFindIn != null) {
      Integer index =  InvsLineRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(InvsLineRefFindIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }

/**
 *
 * Retrieves the InvsLineRefObjectDataList that results from the InvsLineRefFindRequest call
 * @return InvsLineRefObjectDataList resulting from udt call
 *
 */

  public InvsLineRefObjectDataList getOutput() {
    return InvsLineRefObjectHelper.fromMapList(outputMap, "InvsLineRefList");
  }
}
