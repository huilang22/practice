/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsFindRequest.java
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
 * Class used to create a HqGroupsFindRequest Udt Request
 *
 */

public class HqGroupsFindRequest extends HqGroupsRequest {
/**
 *
 * Constructor to create a  HqGroupsFindRequest
 * @param id Unique request name
 * @param hgfIn HqGroupsObjectFilter for HqGroupsFindRequest
 *
 */
@JsonCreator
  public HqGroupsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroups")HqGroupsObjectFilter hgfIn) {
    super(id, "HqGroupsFind");
    if (hgfIn != null) {
      Integer index =  hgfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hgfIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }

/**
 *
 * Retrieves the HqGroupsObjectDataList that results from the HqGroupsFindRequest call
 * @return HqGroupsObjectDataList resulting from udt call
 *
 */

  public HqGroupsObjectDataList getOutput() {
    return HqGroupsObjectHelper.fromMapList(outputMap, "HqGroupsList");
  }
}
