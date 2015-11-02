/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupFindRequest.java
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
 * Class used to create a AdjTransGroupFindRequest Udt Request
 *
 */

public class AdjTransGroupFindRequest extends AdjTransGroupRequest {
/**
 *
 * Constructor to create a  AdjTransGroupFindRequest
 * @param id Unique request name
 * @param ADGFindIn ATGObjectFilter for AdjTransGroupFindRequest
 *
 */
@JsonCreator
  public AdjTransGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjTransGroup")ATGObjectFilter ADGFindIn) {
    super(id, "AdjTransGroupFind");
    if (ADGFindIn != null) {
      Integer index =  ADGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjTransGroup", ATGObjectHelper.toMap(ADGFindIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }

/**
 *
 * Retrieves the ATGObjectDataList that results from the AdjTransGroupFindRequest call
 * @return ATGObjectDataList resulting from udt call
 *
 */

  public ATGObjectDataList getOutput() {
    return ATGObjectHelper.fromMapList(outputMap, "AdjTransGroupList");
  }
}
