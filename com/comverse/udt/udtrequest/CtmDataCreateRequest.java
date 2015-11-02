/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataCreateRequest.java
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
 * Class used to create a CtmDataCreateRequest Udt Request
 *
 */

public class CtmDataCreateRequest extends CtmDataSubRequestParent {
/**
 *
 * Constructor to create a  CtmDataCreateRequest
 * @param id Unique request name
 * @param CtmDataCreateIn CtmDataRowData for CtmDataCreateRequest
 * @param table_id Integer for CtmDataCreateRequest
 *
 */
@JsonCreator
  public CtmDataCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmData")CtmDataRowData CtmDataCreateIn, @JsonProperty("TableId")Integer table_id) {
    super(id, "CtmDataCreate");
    if (CtmDataCreateIn != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(CtmDataCreateIn, new HashMap(), "CtmData").get("CtmData"));
    }
    if (table_id != null) {
      addInput("TableId", table_id);
    }
  }

/**
 *
 * Retrieves the CtmDataRowData that results from the CtmDataCreateRequest call
 * @return CtmDataRowData resulting from udt call
 *
 */

  public CtmDataRowData getOutput() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
}
