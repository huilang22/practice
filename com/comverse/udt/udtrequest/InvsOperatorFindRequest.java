/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorFindRequest.java
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
 * Class used to create a InvsOperatorFindRequest Udt Request
 *
 */

public class InvsOperatorFindRequest extends InvsOperatorRequest {
/**
 *
 * Constructor to create a  InvsOperatorFindRequest
 * @param id Unique request name
 * @param InvsOperatorFindIn InvsOperatorObjectFilter for InvsOperatorFindRequest
 *
 */
@JsonCreator
  public InvsOperatorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsOperator")InvsOperatorObjectFilter InvsOperatorFindIn) {
    super(id, "InvsOperatorFind");
    if (InvsOperatorFindIn != null) {
      Integer index =  InvsOperatorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(InvsOperatorFindIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }

/**
 *
 * Retrieves the InvsOperatorObjectDataList that results from the InvsOperatorFindRequest call
 * @return InvsOperatorObjectDataList resulting from udt call
 *
 */

  public InvsOperatorObjectDataList getOutput() {
    return InvsOperatorObjectHelper.fromMapList(outputMap, "InvsOperatorList");
  }
}
