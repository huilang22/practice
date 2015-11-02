/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatFindRequest.java
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
 * Class used to create a CtcFormatFindRequest Udt Request
 *
 */

public class CtcFormatFindRequest extends CtcFormatRequest {
/**
 *
 * Constructor to create a  CtcFormatFindRequest
 * @param id Unique request name
 * @param FindIn CtcFormatObjectFilter for CtcFormatFindRequest
 *
 */
@JsonCreator
  public CtcFormatFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormat")CtcFormatObjectFilter FindIn) {
    super(id, "CtcFormatFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(FindIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }

/**
 *
 * Retrieves the CtcFormatObjectDataList that results from the CtcFormatFindRequest call
 * @return CtcFormatObjectDataList resulting from udt call
 *
 */

  public CtcFormatObjectDataList getOutput() {
    return CtcFormatObjectHelper.fromMapList(outputMap, "CtcFormatList");
  }
}
