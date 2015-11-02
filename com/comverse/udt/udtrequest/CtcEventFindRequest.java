/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventFindRequest.java
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
 * Class used to create a CtcEventFindRequest Udt Request
 *
 */

public class CtcEventFindRequest extends CtcEventRequest {
/**
 *
 * Constructor to create a  CtcEventFindRequest
 * @param id Unique request name
 * @param FindIn CtcEventObjectFilter for CtcEventFindRequest
 *
 */
@JsonCreator
  public CtcEventFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcEvent")CtcEventObjectFilter FindIn) {
    super(id, "CtcEventFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcEvent", CtcEventObjectHelper.toMap(FindIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }

/**
 *
 * Retrieves the CtcEventObjectDataList that results from the CtcEventFindRequest call
 * @return CtcEventObjectDataList resulting from udt call
 *
 */

  public CtcEventObjectDataList getOutput() {
    return CtcEventObjectHelper.fromMapList(outputMap, "CtcEventList");
  }
}
