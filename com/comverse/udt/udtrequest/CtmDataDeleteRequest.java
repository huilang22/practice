/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataDeleteRequest.java
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
 * Class used to create a CtmDataDeleteRequest Udt Request
 *
 */

public class CtmDataDeleteRequest extends CtmDataRequest {
/**
 *
 * Constructor to create a  CtmDataDeleteRequest
 * @param id Unique request name
 * @param CtmDataDeleteIn CtmDataRowKeyData for CtmDataDeleteRequest
 * @param ____table_id Integer for CtmDataDeleteRequest
 *
 */
@JsonCreator
  public CtmDataDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmData")CtmDataRowKeyData CtmDataDeleteIn, @JsonProperty("TableId")Integer ____table_id) {
    super(id, "CtmDataDelete");
    if (CtmDataDeleteIn != null) {
      addInput("CtmData", CtmDataRowKeyHelper.toMap(CtmDataDeleteIn, new HashMap(), "CtmDataRowKeyData").get("CtmDataRowKeyData"));
    }
    if (____table_id != null) {
      addInput("TableId", ____table_id);
    }
  }

}
