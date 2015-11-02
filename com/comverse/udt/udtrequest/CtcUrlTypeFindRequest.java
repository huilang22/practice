/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeFindRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcUrlTypeFindRequest Udt Request
 *
 */

public class CtcUrlTypeFindRequest extends CtcUrlTypeRequest {
/**
 *
 * Constructor to create a  CtcUrlTypeFindRequest
 * @param id Unique request name
 * @param FindIn CtcUrlTypeObjectFilter for CtcUrlTypeFindRequest
 *
 */
@JsonCreator
  public CtcUrlTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcUrlType")CtcUrlTypeObjectFilter FindIn) {
    super(id, "CtcUrlTypeFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }

/**
 *
 * Retrieves the CtcUrlTypeObjectDataList that results from the CtcUrlTypeFindRequest call
 * @return CtcUrlTypeObjectDataList resulting from udt call
 *
 */

  public CtcUrlTypeObjectDataList getOutput() {
    return CtcUrlTypeObjectHelper.fromMapList(outputMap, "CtcUrlTypeList");
  }
}
