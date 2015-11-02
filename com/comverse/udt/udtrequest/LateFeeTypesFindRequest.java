/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesFindRequest.java
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
 * Class used to create a LateFeeTypesFindRequest Udt Request
 *
 */

public class LateFeeTypesFindRequest extends LateFeeTypesRequest {
/**
 *
 * Constructor to create a  LateFeeTypesFindRequest
 * @param id Unique request name
 * @param LFTFindIn LFTObjectFilter for LateFeeTypesFindRequest
 *
 */
@JsonCreator
  public LateFeeTypesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LateFeeTypes")LFTObjectFilter LFTFindIn) {
    super(id, "LateFeeTypesFind");
    if (LFTFindIn != null) {
      Integer index =  LFTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LateFeeTypes", LFTObjectHelper.toMap(LFTFindIn, new HashMap(), "LateFeeTypes").get("LateFeeTypes"));
    }
  }

/**
 *
 * Retrieves the LFTObjectDataList that results from the LateFeeTypesFindRequest call
 * @return LFTObjectDataList resulting from udt call
 *
 */

  public LFTObjectDataList getOutput() {
    return LFTObjectHelper.fromMapList(outputMap, "LateFeeTypesList");
  }
}
