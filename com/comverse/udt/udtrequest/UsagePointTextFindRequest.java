/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextFindRequest.java
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
 * Class used to create a UsagePointTextFindRequest Udt Request
 *
 */

public class UsagePointTextFindRequest extends UsagePointTextRequest {
/**
 *
 * Constructor to create a  UsagePointTextFindRequest
 * @param id Unique request name
 * @param UsagePointTextFindIn UsagePointTextObjectFilter for UsagePointTextFindRequest
 *
 */
@JsonCreator
  public UsagePointTextFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePointText")UsagePointTextObjectFilter UsagePointTextFindIn) {
    super(id, "UsagePointTextFind");
    if (UsagePointTextFindIn != null) {
      Integer index =  UsagePointTextFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(UsagePointTextFindIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }

/**
 *
 * Retrieves the UsagePointTextObjectDataList that results from the UsagePointTextFindRequest call
 * @return UsagePointTextObjectDataList resulting from udt call
 *
 */

  public UsagePointTextObjectDataList getOutput() {
    return UsagePointTextObjectHelper.fromMapList(outputMap, "UsagePointTextList");
  }
}
