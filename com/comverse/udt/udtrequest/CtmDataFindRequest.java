/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataFindRequest.java
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
 * Class used to create a CtmDataFindRequest Udt Request
 *
 */

public class CtmDataFindRequest extends CtmDataRequest {
/**
 *
 * Constructor to create a  CtmDataFindRequest
 * @param id Unique request name
 * @param CtmDataFindIn CtmDataRowFilter for CtmDataFindRequest
 * @param __table_id Integer for CtmDataFindRequest
 *
 */
@JsonCreator
  public CtmDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmData")CtmDataRowFilter CtmDataFindIn, @JsonProperty("TableId")Integer __table_id) {
    super(id, "CtmDataFind");
    if (CtmDataFindIn != null) {
      Integer index =  CtmDataFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmData", CtmDataRowHelper.toMap(CtmDataFindIn, new HashMap(), "CtmData").get("CtmData"));
    }
    if (__table_id != null) {
      addInput("TableId", __table_id);
    }
  }

/**
 *
 * Retrieves the CtmDataRowDataList that results from the CtmDataFindRequest call
 * @return CtmDataRowDataList resulting from udt call
 *
 */

  public CtmDataRowDataList getOutput() {
    return CtmDataRowHelper.fromMapList(outputMap, "CtmDataList");
  }
}
