/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjFindCountRequest.java
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
 * Class used to create a MultiLinesAdjFindCountRequest Udt Request
 *
 */

public class MultiLinesAdjFindCountRequest extends MultiLinesAdjRequest {
/**
 *
 * Constructor to create a  MultiLinesAdjFindCountRequest
 * @param id Unique request name
 * @param MLA_Bill_Count_In MultiLinesAdjObjectFilter for MultiLinesAdjFindCountRequest
 *
 */
@JsonCreator
  public MultiLinesAdjFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("MultiLinesAdj")MultiLinesAdjObjectFilter MLA_Bill_Count_In) {
    super(id, "MultiLinesAdjFindCount");
    if (MLA_Bill_Count_In != null) {
      Integer index =  MLA_Bill_Count_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MultiLinesAdj", MultiLinesAdjObjectHelper.toMap(MLA_Bill_Count_In, new HashMap(), "MLABillCountOut").get("MLABillCountOut"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the MultiLinesAdjFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("MLABillCountOut");
  }
}
