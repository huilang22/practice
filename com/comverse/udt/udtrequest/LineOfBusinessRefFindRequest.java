/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessRefFindRequest.java
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
 * Class used to create a LineOfBusinessRefFindRequest Udt Request
 *
 */

public class LineOfBusinessRefFindRequest extends LineOfBusinessRefRequest {
/**
 *
 * Constructor to create a  LineOfBusinessRefFindRequest
 * @param id Unique request name
 * @param LineOfBusinessRefFindIn LineOfBusinessRefObjectFilter for LineOfBusinessRefFindRequest
 *
 */
@JsonCreator
  public LineOfBusinessRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LineOfBusinessRef")LineOfBusinessRefObjectFilter LineOfBusinessRefFindIn) {
    super(id, "LineOfBusinessRefFind");
    if (LineOfBusinessRefFindIn != null) {
      Integer index =  LineOfBusinessRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectHelper.toMap(LineOfBusinessRefFindIn, new HashMap(), "LineOfBusinessRef").get("LineOfBusinessRef"));
    }
  }

/**
 *
 * Retrieves the LineOfBusinessRefObjectDataList that results from the LineOfBusinessRefFindRequest call
 * @return LineOfBusinessRefObjectDataList resulting from udt call
 *
 */

  public LineOfBusinessRefObjectDataList getOutput() {
    return LineOfBusinessRefObjectHelper.fromMapList(outputMap, "LineOfBusinessRefList");
  }
}
