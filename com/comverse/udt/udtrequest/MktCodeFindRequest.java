/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeFindRequest.java
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
 * Class used to create a MktCodeFindRequest Udt Request
 *
 */

public class MktCodeFindRequest extends MktCodeRequest {
/**
 *
 * Constructor to create a  MktCodeFindRequest
 * @param id Unique request name
 * @param MCFindIn MCObjectFilter for MktCodeFindRequest
 *
 */
@JsonCreator
  public MktCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MktCode")MCObjectFilter MCFindIn) {
    super(id, "MktCodeFind");
    if (MCFindIn != null) {
      Integer index =  MCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MktCode", MCObjectHelper.toMap(MCFindIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }

/**
 *
 * Retrieves the MCObjectDataList that results from the MktCodeFindRequest call
 * @return MCObjectDataList resulting from udt call
 *
 */

  public MCObjectDataList getOutput() {
    return MCObjectHelper.fromMapList(outputMap, "MktCodeList");
  }
}
