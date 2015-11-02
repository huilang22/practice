/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqgroupsMapFindRequest.java
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
 * Class used to create a ExternalIdHqgroupsMapFindRequest Udt Request
 *
 */

public class ExternalIdHqgroupsMapFindRequest extends ExternalIdHqGroupsMapRequest {
/**
 *
 * Constructor to create a  ExternalIdHqgroupsMapFindRequest
 * @param id Unique request name
 * @param findIn EIHGMObjectFilter for ExternalIdHqgroupsMapFindRequest
 *
 */
@JsonCreator
  public ExternalIdHqgroupsMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdHqGroupsMap")EIHGMObjectFilter findIn) {
    super(id, "ExternalIdHqgroupsMapFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdHqGroupsMap", EIHGMObjectHelper.toMap(findIn, new HashMap(), "ExternalIdHqGroupsMap").get("ExternalIdHqGroupsMap"));
    }
  }

/**
 *
 * Retrieves the EIHGMObjectDataList that results from the ExternalIdHqgroupsMapFindRequest call
 * @return EIHGMObjectDataList resulting from udt call
 *
 */

  public EIHGMObjectDataList getOutput() {
    return EIHGMObjectHelper.fromMapList(outputMap, "ExternalIdHqGroupsMapList");
  }
}
