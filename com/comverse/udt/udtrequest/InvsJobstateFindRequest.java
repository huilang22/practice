/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateFindRequest.java
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
 * Class used to create a InvsJobstateFindRequest Udt Request
 *
 */

public class InvsJobstateFindRequest extends InvsJobstateRequest {
/**
 *
 * Constructor to create a  InvsJobstateFindRequest
 * @param id Unique request name
 * @param InvsJobstateFindIn InvsJobstateObjectFilter for InvsJobstateFindRequest
 *
 */
@JsonCreator
  public InvsJobstateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobstate")InvsJobstateObjectFilter InvsJobstateFindIn) {
    super(id, "InvsJobstateFind");
    if (InvsJobstateFindIn != null) {
      Integer index =  InvsJobstateFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobstate", InvsJobstateObjectHelper.toMap(InvsJobstateFindIn, new HashMap(), "InvsJobstate").get("InvsJobstate"));
    }
  }

/**
 *
 * Retrieves the InvsJobstateObjectDataList that results from the InvsJobstateFindRequest call
 * @return InvsJobstateObjectDataList resulting from udt call
 *
 */

  public InvsJobstateObjectDataList getOutput() {
    return InvsJobstateObjectHelper.fromMapList(outputMap, "InvsJobstateList");
  }
}
