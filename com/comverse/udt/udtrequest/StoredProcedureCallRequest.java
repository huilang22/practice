/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StoredProcedureCallRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a StoredProcedureCallRequest Udt Request
 *
 */

public class StoredProcedureCallRequest extends StoredProcedureRequest {
/**
 *
 * Constructor to create a  StoredProcedureCallRequest
 * @param id Unique request name
 * @param stored_procedure_call StoredProcedureObjectData for StoredProcedureCallRequest
 *
 */
@JsonCreator
  public StoredProcedureCallRequest(@JsonProperty("RequestId") String id, @JsonProperty("StoredProcedureCall")StoredProcedureObjectData stored_procedure_call) {
    super(id, "StoredProcedureCall");
    if (stored_procedure_call != null) {
      addInput("StoredProcedureCall", StoredProcedureObjectHelper.toMap(stored_procedure_call, new HashMap(), "StoredProcedureResult").get("StoredProcedureResult"));
    }
  }

/**
 *
 * Retrieves the Map[] that results from the StoredProcedureCallRequest call
 * @return Map[] resulting from udt call
 *
 */

  public Map[] getOutput() {
    return  (Map[])outputMap.get("StoredProcedureResult");
  }
}
