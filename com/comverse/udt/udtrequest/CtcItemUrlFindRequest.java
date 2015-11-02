/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlFindRequest.java
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
 * Class used to create a CtcItemUrlFindRequest Udt Request
 *
 */

public class CtcItemUrlFindRequest extends CtcItemUrlRequest {
/**
 *
 * Constructor to create a  CtcItemUrlFindRequest
 * @param id Unique request name
 * @param FindIn CtcItemUrlObjectFilter for CtcItemUrlFindRequest
 *
 */
@JsonCreator
  public CtcItemUrlFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemUrl")CtcItemUrlObjectFilter FindIn) {
    super(id, "CtcItemUrlFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(FindIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }

/**
 *
 * Retrieves the CtcItemUrlObjectDataList that results from the CtcItemUrlFindRequest call
 * @return CtcItemUrlObjectDataList resulting from udt call
 *
 */

  public CtcItemUrlObjectDataList getOutput() {
    return CtcItemUrlObjectHelper.fromMapList(outputMap, "CtcItemUrlList");
  }
}
