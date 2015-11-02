/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjFindRequest.java
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
 * Class used to create a MultiLinesAdjFindRequest Udt Request
 *
 */

public class MultiLinesAdjFindRequest extends MultiLinesAdjRequest {
/**
 *
 * Constructor to create a  MultiLinesAdjFindRequest
 * @param id Unique request name
 * @param MLA_Bill_Find_In MultiLinesAdjObjectFilter for MultiLinesAdjFindRequest
 *
 */
@JsonCreator
  public MultiLinesAdjFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MultiLinesAdj")MultiLinesAdjObjectFilter MLA_Bill_Find_In) {
    super(id, "MultiLinesAdjFind");
    if (MLA_Bill_Find_In != null) {
      Integer index =  MLA_Bill_Find_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MultiLinesAdj", MultiLinesAdjObjectHelper.toMap(MLA_Bill_Find_In, new HashMap(), "MultiLinesAdj").get("MultiLinesAdj"));
    }
  }

/**
 *
 * Retrieves the MultiLinesAdjObjectDataList that results from the MultiLinesAdjFindRequest call
 * @return MultiLinesAdjObjectDataList resulting from udt call
 *
 */

  public MultiLinesAdjObjectDataList getOutput() {
    return MultiLinesAdjObjectHelper.fromMapList(outputMap, "MultiLinesAdjList");
  }
}
