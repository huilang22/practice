/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NetActionFindRequest Udt Request
 *
 */

public class NetActionFindRequest extends NetActionRequest {
/**
 *
 * Constructor to create a  NetActionFindRequest
 * @param id Unique request name
 * @param NARFindIn NetActionObjectFilter for NetActionFindRequest
 *
 */
@JsonCreator
  public NetActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NetAction")NetActionObjectFilter NARFindIn) {
    super(id, "NetActionFind");
    if (NARFindIn != null) {
      Integer index =  NARFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NetAction", NetActionObjectHelper.toMap(NARFindIn, new HashMap(), "NetAction").get("NetAction"));
    }
  }

/**
 *
 * Retrieves the NetActionObjectDataList that results from the NetActionFindRequest call
 * @return NetActionObjectDataList resulting from udt call
 *
 */

  public NetActionObjectDataList getOutput() {
    return NetActionObjectHelper.fromMapList(outputMap, "NetActionList");
  }
}
