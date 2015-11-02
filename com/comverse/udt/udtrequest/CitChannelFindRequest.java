/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelFindRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitChannelFindRequest Udt Request
 *
 */

public class CitChannelFindRequest extends CitChannelRequest {
/**
 *
 * Constructor to create a  CitChannelFindRequest
 * @param id Unique request name
 * @param citChannelFindIn CitChannelObjectFilter for CitChannelFindRequest
 *
 */
@JsonCreator
  public CitChannelFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitChannel")CitChannelObjectFilter citChannelFindIn) {
    super(id, "CitChannelFind");
    if (citChannelFindIn != null) {
      Integer index =  citChannelFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitChannel", CitChannelObjectHelper.toMap(citChannelFindIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }

/**
 *
 * Retrieves the CitChannelObjectDataList that results from the CitChannelFindRequest call
 * @return CitChannelObjectDataList resulting from udt call
 *
 */

  public CitChannelObjectDataList getOutput() {
    return CitChannelObjectHelper.fromMapList(outputMap, "CitChannelList");
  }
}
