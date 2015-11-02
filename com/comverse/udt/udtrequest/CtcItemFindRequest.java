/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFindRequest.java
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
 * Class used to create a CtcItemFindRequest Udt Request
 *
 */

public class CtcItemFindRequest extends CtcItemRequest {
/**
 *
 * Constructor to create a  CtcItemFindRequest
 * @param id Unique request name
 * @param FindIn CtcItemObjectFilter for CtcItemFindRequest
 *
 */
@JsonCreator
  public CtcItemFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItem")CtcItemObjectFilter FindIn) {
    super(id, "CtcItemFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItem", CtcItemObjectHelper.toMap(FindIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }

/**
 *
 * Retrieves the CtcItemObjectDataList that results from the CtcItemFindRequest call
 * @return CtcItemObjectDataList resulting from udt call
 *
 */

  public CtcItemObjectDataList getOutput() {
    return CtcItemObjectHelper.fromMapList(outputMap, "CtcItemList");
  }
}
