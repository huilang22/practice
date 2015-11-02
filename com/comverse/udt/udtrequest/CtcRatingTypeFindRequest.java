/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeFindRequest.java
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
 * Class used to create a CtcRatingTypeFindRequest Udt Request
 *
 */

public class CtcRatingTypeFindRequest extends CtcRatingTypeRequest {
/**
 *
 * Constructor to create a  CtcRatingTypeFindRequest
 * @param id Unique request name
 * @param FindIn CtcRatingTypeObjectFilter for CtcRatingTypeFindRequest
 *
 */
@JsonCreator
  public CtcRatingTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingType")CtcRatingTypeObjectFilter FindIn) {
    super(id, "CtcRatingTypeFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }

/**
 *
 * Retrieves the CtcRatingTypeObjectDataList that results from the CtcRatingTypeFindRequest call
 * @return CtcRatingTypeObjectDataList resulting from udt call
 *
 */

  public CtcRatingTypeObjectDataList getOutput() {
    return CtcRatingTypeObjectHelper.fromMapList(outputMap, "CtcRatingTypeList");
  }
}
