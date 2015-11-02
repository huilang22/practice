/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesFindRequest.java
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
 * Class used to create a InvsLineValuesFindRequest Udt Request
 *
 */

public class InvsLineValuesFindRequest extends InvsLineValuesRequest {
/**
 *
 * Constructor to create a  InvsLineValuesFindRequest
 * @param id Unique request name
 * @param InvsLineValuesFindIn InvsLineValuesObjectFilter for InvsLineValuesFindRequest
 *
 */
@JsonCreator
  public InvsLineValuesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineValues")InvsLineValuesObjectFilter InvsLineValuesFindIn) {
    super(id, "InvsLineValuesFind");
    if (InvsLineValuesFindIn != null) {
      Integer index =  InvsLineValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(InvsLineValuesFindIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }

/**
 *
 * Retrieves the InvsLineValuesObjectDataList that results from the InvsLineValuesFindRequest call
 * @return InvsLineValuesObjectDataList resulting from udt call
 *
 */

  public InvsLineValuesObjectDataList getOutput() {
    return InvsLineValuesObjectHelper.fromMapList(outputMap, "InvsLineValuesList");
  }
}
