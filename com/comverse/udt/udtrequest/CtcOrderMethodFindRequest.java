/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodFindRequest.java
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
 * Class used to create a CtcOrderMethodFindRequest Udt Request
 *
 */

public class CtcOrderMethodFindRequest extends CtcOrderMethodRequest {
/**
 *
 * Constructor to create a  CtcOrderMethodFindRequest
 * @param id Unique request name
 * @param FindIn CtcOrderMethodObjectFilter for CtcOrderMethodFindRequest
 *
 */
@JsonCreator
  public CtcOrderMethodFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOrderMethod")CtcOrderMethodObjectFilter FindIn) {
    super(id, "CtcOrderMethodFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(FindIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }

/**
 *
 * Retrieves the CtcOrderMethodObjectDataList that results from the CtcOrderMethodFindRequest call
 * @return CtcOrderMethodObjectDataList resulting from udt call
 *
 */

  public CtcOrderMethodObjectDataList getOutput() {
    return CtcOrderMethodObjectHelper.fromMapList(outputMap, "CtcOrderMethodList");
  }
}
