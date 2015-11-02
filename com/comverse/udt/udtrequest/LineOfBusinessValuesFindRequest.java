/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesFindRequest.java
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
 * Class used to create a LineOfBusinessValuesFindRequest Udt Request
 *
 */

public class LineOfBusinessValuesFindRequest extends LineOfBusinessValuesRequest {
/**
 *
 * Constructor to create a  LineOfBusinessValuesFindRequest
 * @param id Unique request name
 * @param LineOfBusinessValuesFindIn LineOfBusinessValuesObjectFilter for LineOfBusinessValuesFindRequest
 *
 */
@JsonCreator
  public LineOfBusinessValuesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LineOfBusinessValues")LineOfBusinessValuesObjectFilter LineOfBusinessValuesFindIn) {
    super(id, "LineOfBusinessValuesFind");
    if (LineOfBusinessValuesFindIn != null) {
      Integer index =  LineOfBusinessValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectHelper.toMap(LineOfBusinessValuesFindIn, new HashMap(), "LineOfBusinessValues").get("LineOfBusinessValues"));
    }
  }

/**
 *
 * Retrieves the LineOfBusinessValuesObjectDataList that results from the LineOfBusinessValuesFindRequest call
 * @return LineOfBusinessValuesObjectDataList resulting from udt call
 *
 */

  public LineOfBusinessValuesObjectDataList getOutput() {
    return LineOfBusinessValuesObjectHelper.fromMapList(outputMap, "LineOfBusinessValuesList");
  }
}
