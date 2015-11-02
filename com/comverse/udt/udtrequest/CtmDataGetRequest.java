/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataGetRequest.java
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
 * Class used to create a CtmDataGetRequest Udt Request
 *
 */

public class CtmDataGetRequest extends CtmDataSubRequestParent {
/**
 *
 * Constructor to create a  CtmDataGetRequest
 * @param id Unique request name
 * @param CtmDataGetIn CtmDataRowKeyData for CtmDataGetRequest
 * @param _table_id Integer for CtmDataGetRequest
 *
 */
@JsonCreator
  public CtmDataGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmData")CtmDataRowKeyData CtmDataGetIn, @JsonProperty("TableId")Integer _table_id) {
    super(id, "CtmDataGet");
    if (CtmDataGetIn != null) {
      addInput("CtmData", CtmDataRowKeyHelper.toMap(CtmDataGetIn, new HashMap(), "CtmDataRowKeyData").get("CtmDataRowKeyData"));
    }
    if (_table_id != null) {
      addInput("TableId", _table_id);
    }
  }

/**
 *
 * Retrieves the CtmDataRowData that results from the CtmDataGetRequest call
 * @return CtmDataRowData resulting from udt call
 *
 */

  public CtmDataRowData getOutput() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
}
