/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationFindRequest.java
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
 * Class used to create a InvsLocationFindRequest Udt Request
 *
 */

public class InvsLocationFindRequest extends InvsLocationRequest {
/**
 *
 * Constructor to create a  InvsLocationFindRequest
 * @param id Unique request name
 * @param InvsLocationFindIn InvsLocationObjectFilter for InvsLocationFindRequest
 *
 */
@JsonCreator
  public InvsLocationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocation")InvsLocationObjectFilter InvsLocationFindIn) {
    super(id, "InvsLocationFind");
    if (InvsLocationFindIn != null) {
      Integer index =  InvsLocationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(InvsLocationFindIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }

/**
 *
 * Retrieves the InvsLocationObjectDataList that results from the InvsLocationFindRequest call
 * @return InvsLocationObjectDataList resulting from udt call
 *
 */

  public InvsLocationObjectDataList getOutput() {
    return InvsLocationObjectHelper.fromMapList(outputMap, "InvsLocationList");
  }
}
