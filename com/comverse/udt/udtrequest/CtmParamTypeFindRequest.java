/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeFindRequest.java
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
 * Class used to create a CtmParamTypeFindRequest Udt Request
 *
 */

public class CtmParamTypeFindRequest extends CtmParamTypeRequest {
/**
 *
 * Constructor to create a  CtmParamTypeFindRequest
 * @param id Unique request name
 * @param CtmParamTypeFindIn CtmParamTypeObjectFilter for CtmParamTypeFindRequest
 *
 */
@JsonCreator
  public CtmParamTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParamType")CtmParamTypeObjectFilter CtmParamTypeFindIn) {
    super(id, "CtmParamTypeFind");
    if (CtmParamTypeFindIn != null) {
      Integer index =  CtmParamTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(CtmParamTypeFindIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }

/**
 *
 * Retrieves the CtmParamTypeObjectDataList that results from the CtmParamTypeFindRequest call
 * @return CtmParamTypeObjectDataList resulting from udt call
 *
 */

  public CtmParamTypeObjectDataList getOutput() {
    return CtmParamTypeObjectHelper.fromMapList(outputMap, "CtmParamTypeList");
  }
}
