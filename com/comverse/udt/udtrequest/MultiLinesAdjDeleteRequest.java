/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjDeleteRequest.java
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
 * Class used to create a MultiLinesAdjDeleteRequest Udt Request
 *
 */

public class MultiLinesAdjDeleteRequest extends MultiLinesAdjRequest {
/**
 *
 * Constructor to create a  MultiLinesAdjDeleteRequest
 * @param id Unique request name
 * @param MLA_Delete_In MultiLinesAdjKeyObjectFilter for MultiLinesAdjDeleteRequest
 *
 */
@JsonCreator
  public MultiLinesAdjDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("MultiLinesAdj")MultiLinesAdjKeyObjectFilter MLA_Delete_In) {
    super(id, "MultiLinesAdjDelete");
    if (MLA_Delete_In != null) {
      Integer index =  MLA_Delete_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MultiLinesAdj", MultiLinesAdjKeyObjectHelper.toMap(MLA_Delete_In, new HashMap(), "MultiLinesAdj").get("MultiLinesAdj"));
    }
  }

/**
 *
 * Retrieves the MultiLinesAdjObjectDataList that results from the MultiLinesAdjDeleteRequest call
 * @return MultiLinesAdjObjectDataList resulting from udt call
 *
 */

  public MultiLinesAdjObjectDataList getOutput() {
    return MultiLinesAdjObjectHelper.fromMapList(outputMap, "MultiLinesAdjList");
  }
}
