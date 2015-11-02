/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolFindRequest.java
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
 * Class used to create a RbrSymbolFindRequest Udt Request
 *
 */

public class RbrSymbolFindRequest extends RbrSymbolRequest {
/**
 *
 * Constructor to create a  RbrSymbolFindRequest
 * @param id Unique request name
 * @param RbrSymbolFindIn RbrSymbolObjectFilter for RbrSymbolFindRequest
 *
 */
@JsonCreator
  public RbrSymbolFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrSymbol")RbrSymbolObjectFilter RbrSymbolFindIn) {
    super(id, "RbrSymbolFind");
    if (RbrSymbolFindIn != null) {
      Integer index =  RbrSymbolFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(RbrSymbolFindIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }

/**
 *
 * Retrieves the RbrSymbolObjectDataList that results from the RbrSymbolFindRequest call
 * @return RbrSymbolObjectDataList resulting from udt call
 *
 */

  public RbrSymbolObjectDataList getOutput() {
    return RbrSymbolObjectHelper.fromMapList(outputMap, "RbrSymbolList");
  }
}
