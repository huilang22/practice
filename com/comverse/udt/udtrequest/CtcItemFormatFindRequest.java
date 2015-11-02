/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatFindRequest.java
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
 * Class used to create a CtcItemFormatFindRequest Udt Request
 *
 */

public class CtcItemFormatFindRequest extends CtcItemFormatRequest {
/**
 *
 * Constructor to create a  CtcItemFormatFindRequest
 * @param id Unique request name
 * @param FindIn CtcItemFormatObjectFilter for CtcItemFormatFindRequest
 *
 */
@JsonCreator
  public CtcItemFormatFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemFormat")CtcItemFormatObjectFilter FindIn) {
    super(id, "CtcItemFormatFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(FindIn, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }

/**
 *
 * Retrieves the CtcItemFormatObjectDataList that results from the CtcItemFormatFindRequest call
 * @return CtcItemFormatObjectDataList resulting from udt call
 *
 */

  public CtcItemFormatObjectDataList getOutput() {
    return CtcItemFormatObjectHelper.fromMapList(outputMap, "CtcItemFormatList");
  }
}
