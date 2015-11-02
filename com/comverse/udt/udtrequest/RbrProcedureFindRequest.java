/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureFindRequest.java
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
 * Class used to create a RbrProcedureFindRequest Udt Request
 *
 */

public class RbrProcedureFindRequest extends RbrProcedureRequest {
/**
 *
 * Constructor to create a  RbrProcedureFindRequest
 * @param id Unique request name
 * @param RbrProcFindIn RbrProcObjectFilter for RbrProcedureFindRequest
 *
 */
@JsonCreator
  public RbrProcedureFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrProcedure")RbrProcObjectFilter RbrProcFindIn) {
    super(id, "RbrProcedureFind");
    if (RbrProcFindIn != null) {
      Integer index =  RbrProcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(RbrProcFindIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }

/**
 *
 * Retrieves the RbrProcObjectDataList that results from the RbrProcedureFindRequest call
 * @return RbrProcObjectDataList resulting from udt call
 *
 */

  public RbrProcObjectDataList getOutput() {
    return RbrProcObjectHelper.fromMapList(outputMap, "RbrProcedureList");
  }
}
