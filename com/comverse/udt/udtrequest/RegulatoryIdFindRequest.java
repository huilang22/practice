/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdFindRequest.java
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
 * Class used to create a RegulatoryIdFindRequest Udt Request
 *
 */

public class RegulatoryIdFindRequest extends RegulatoryIdRequest {
/**
 *
 * Constructor to create a  RegulatoryIdFindRequest
 * @param id Unique request name
 * @param RIFindIn RegulatoryIdObjectFilter for RegulatoryIdFindRequest
 *
 */
@JsonCreator
  public RegulatoryIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RegulatoryId")RegulatoryIdObjectFilter RIFindIn) {
    super(id, "RegulatoryIdFind");
    if (RIFindIn != null) {
      Integer index =  RIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(RIFindIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }

/**
 *
 * Retrieves the RegulatoryIdObjectDataList that results from the RegulatoryIdFindRequest call
 * @return RegulatoryIdObjectDataList resulting from udt call
 *
 */

  public RegulatoryIdObjectDataList getOutput() {
    return RegulatoryIdObjectHelper.fromMapList(outputMap, "RegulatoryIdList");
  }
}
