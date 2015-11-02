/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableFindRequest.java
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
 * Class used to create a RbrRateTableFindRequest Udt Request
 *
 */

public class RbrRateTableFindRequest extends RbrRateTableRequest {
/**
 *
 * Constructor to create a  RbrRateTableFindRequest
 * @param id Unique request name
 * @param RbrRtTblFndIn RbrRateTableObjectFilter for RbrRateTableFindRequest
 *
 */
@JsonCreator
  public RbrRateTableFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTable")RbrRateTableObjectFilter RbrRtTblFndIn) {
    super(id, "RbrRateTableFind");
    if (RbrRtTblFndIn != null) {
      Integer index =  RbrRtTblFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(RbrRtTblFndIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }

/**
 *
 * Retrieves the RbrRateTableObjectDataList that results from the RbrRateTableFindRequest call
 * @return RbrRateTableObjectDataList resulting from udt call
 *
 */

  public RbrRateTableObjectDataList getOutput() {
    return RbrRateTableObjectHelper.fromMapList(outputMap, "RbrRateTableList");
  }
}
