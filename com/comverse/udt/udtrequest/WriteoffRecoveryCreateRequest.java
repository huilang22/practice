/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffRecoveryCreateRequest.java
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
 * Class used to create a WriteoffRecoveryCreateRequest Udt Request
 *
 */

public class WriteoffRecoveryCreateRequest extends WriteoffSubRequestParent {
/**
 *
 * Constructor to create a  WriteoffRecoveryCreateRequest
 * @param id Unique request name
 * @param WRITEOFFcreateIn WriteoffObjectData for WriteoffRecoveryCreateRequest
 *
 */
@JsonCreator
  public WriteoffRecoveryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Writeoff")WriteoffObjectData WRITEOFFcreateIn) {
    super(id, "WriteoffRecoveryCreate");
    if (WRITEOFFcreateIn != null) {
      addInput("Writeoff", WriteoffObjectHelper.toMap(WRITEOFFcreateIn, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }

/**
 *
 * Retrieves the WriteoffObjectData that results from the WriteoffRecoveryCreateRequest call
 * @return WriteoffObjectData resulting from udt call
 *
 */

  public WriteoffObjectData getOutput() {
    return WriteoffObjectHelper.fromMap(outputMap, "Writeoff");
  }
}
