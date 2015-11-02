/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataUpdateRequest.java
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
 * Class used to create a CtmDataUpdateRequest Udt Request
 *
 */

public class CtmDataUpdateRequest extends CtmDataSubRequestParent {
/**
 *
 * Constructor to create a  CtmDataUpdateRequest
 * @param id Unique request name
 * @param CtmDataUpdateIn CtmDataRowData for CtmDataUpdateRequest
 * @param ___table_id Integer for CtmDataUpdateRequest
 *
 */
@JsonCreator
  public CtmDataUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmData")CtmDataRowData CtmDataUpdateIn, @JsonProperty("TableId")Integer ___table_id) {
    super(id, "CtmDataUpdate");
    if (CtmDataUpdateIn != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(CtmDataUpdateIn, new HashMap(), "CtmData").get("CtmData"));
    }
    if (___table_id != null) {
      addInput("TableId", ___table_id);
    }
  }

/**
 *
 * Retrieves the CtmDataRowData that results from the CtmDataUpdateRequest call
 * @return CtmDataRowData resulting from udt call
 *
 */

  public CtmDataRowData getOutput() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
}
