/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtmParamFindRequest Udt Request
 *
 */

public class CtmParamFindRequest extends CtmParamRequest {
/**
 *
 * Constructor to create a  CtmParamFindRequest
 * @param id Unique request name
 * @param CtmParamFindIn CtmParamObjectFilter for CtmParamFindRequest
 *
 */
@JsonCreator
  public CtmParamFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParam")CtmParamObjectFilter CtmParamFindIn) {
    super(id, "CtmParamFind");
    if (CtmParamFindIn != null) {
      Integer index =  CtmParamFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmParam", CtmParamObjectHelper.toMap(CtmParamFindIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }

/**
 *
 * Retrieves the CtmParamObjectDataList that results from the CtmParamFindRequest call
 * @return CtmParamObjectDataList resulting from udt call
 *
 */

  public CtmParamObjectDataList getOutput() {
    return CtmParamObjectHelper.fromMapList(outputMap, "CtmParamList");
  }
}
