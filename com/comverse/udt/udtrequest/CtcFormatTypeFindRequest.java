/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeFindRequest.java
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
 * Class used to create a CtcFormatTypeFindRequest Udt Request
 *
 */

public class CtcFormatTypeFindRequest extends CtcFormatTypeRequest {
/**
 *
 * Constructor to create a  CtcFormatTypeFindRequest
 * @param id Unique request name
 * @param FindIn CtcFormatTypeObjectFilter for CtcFormatTypeFindRequest
 *
 */
@JsonCreator
  public CtcFormatTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormatType")CtcFormatTypeObjectFilter FindIn) {
    super(id, "CtcFormatTypeFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }

/**
 *
 * Retrieves the CtcFormatTypeObjectDataList that results from the CtcFormatTypeFindRequest call
 * @return CtcFormatTypeObjectDataList resulting from udt call
 *
 */

  public CtcFormatTypeObjectDataList getOutput() {
    return CtcFormatTypeObjectHelper.fromMapList(outputMap, "CtcFormatTypeList");
  }
}
