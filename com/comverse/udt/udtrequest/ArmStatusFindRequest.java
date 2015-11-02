/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusFindRequest.java
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
 * Class used to create a ArmStatusFindRequest Udt Request
 *
 */

public class ArmStatusFindRequest extends ArmStatusRequest {
/**
 *
 * Constructor to create a  ArmStatusFindRequest
 * @param id Unique request name
 * @param ASFindIn ASObjectFilter for ArmStatusFindRequest
 *
 */
@JsonCreator
  public ArmStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ArmStatus")ASObjectFilter ASFindIn) {
    super(id, "ArmStatusFind");
    if (ASFindIn != null) {
      Integer index =  ASFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ArmStatus", ASObjectHelper.toMap(ASFindIn, new HashMap(), "ArmStatus").get("ArmStatus"));
    }
  }

/**
 *
 * Retrieves the ASObjectDataList that results from the ArmStatusFindRequest call
 * @return ASObjectDataList resulting from udt call
 *
 */

  public ASObjectDataList getOutput() {
    return ASObjectHelper.fromMapList(outputMap, "ArmStatusList");
  }
}
