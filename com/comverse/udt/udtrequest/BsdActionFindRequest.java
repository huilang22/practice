/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionFindRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdActionFindRequest Udt Request
 *
 */

public class BsdActionFindRequest extends BsdActionRequest {
/**
 *
 * Constructor to create a  BsdActionFindRequest
 * @param id Unique request name
 * @param bsdActionFindIn BsdActionObjectFilter for BsdActionFindRequest
 *
 */
@JsonCreator
  public BsdActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAction")BsdActionObjectFilter bsdActionFindIn) {
    super(id, "BsdActionFind");
    if (bsdActionFindIn != null) {
      Integer index =  bsdActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAction", BsdActionObjectHelper.toMap(bsdActionFindIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }

/**
 *
 * Retrieves the BsdActionObjectDataList that results from the BsdActionFindRequest call
 * @return BsdActionObjectDataList resulting from udt call
 *
 */

  public BsdActionObjectDataList getOutput() {
    return BsdActionObjectHelper.fromMapList(outputMap, "BsdActionList");
  }
}
