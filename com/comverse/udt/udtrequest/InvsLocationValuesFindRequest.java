/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesFindRequest.java
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
 * Class used to create a InvsLocationValuesFindRequest Udt Request
 *
 */

public class InvsLocationValuesFindRequest extends InvsLocationValuesRequest {
/**
 *
 * Constructor to create a  InvsLocationValuesFindRequest
 * @param id Unique request name
 * @param InvsLocationValuesFindIn InvsLocationValuesObjectFilter for InvsLocationValuesFindRequest
 *
 */
@JsonCreator
  public InvsLocationValuesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationValues")InvsLocationValuesObjectFilter InvsLocationValuesFindIn) {
    super(id, "InvsLocationValuesFind");
    if (InvsLocationValuesFindIn != null) {
      Integer index =  InvsLocationValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(InvsLocationValuesFindIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }

/**
 *
 * Retrieves the InvsLocationValuesObjectDataList that results from the InvsLocationValuesFindRequest call
 * @return InvsLocationValuesObjectDataList resulting from udt call
 *
 */

  public InvsLocationValuesObjectDataList getOutput() {
    return InvsLocationValuesObjectHelper.fromMapList(outputMap, "InvsLocationValuesList");
  }
}
