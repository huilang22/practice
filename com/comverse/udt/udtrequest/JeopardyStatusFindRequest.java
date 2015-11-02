/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusFindRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a JeopardyStatusFindRequest Udt Request
 *
 */

public class JeopardyStatusFindRequest extends JeopardyStatusRequest {
/**
 *
 * Constructor to create a  JeopardyStatusFindRequest
 * @param id Unique request name
 * @param JeopardyStatusFindIn JeopardyStatusObjectFilter for JeopardyStatusFindRequest
 *
 */
@JsonCreator
  public JeopardyStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("JeopardyStatus")JeopardyStatusObjectFilter JeopardyStatusFindIn) {
    super(id, "JeopardyStatusFind");
    if (JeopardyStatusFindIn != null) {
      Integer index =  JeopardyStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(JeopardyStatusFindIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }

/**
 *
 * Retrieves the JeopardyStatusObjectDataList that results from the JeopardyStatusFindRequest call
 * @return JeopardyStatusObjectDataList resulting from udt call
 *
 */

  public JeopardyStatusObjectDataList getOutput() {
    return JeopardyStatusObjectHelper.fromMapList(outputMap, "JeopardyStatusList");
  }
}
