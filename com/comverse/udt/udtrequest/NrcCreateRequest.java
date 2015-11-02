/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcCreateRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcCreateRequest Udt Request
 *
 */

public class NrcCreateRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a  NrcCreateRequest
 * @param id Unique request name
 * @param NrcCreateIn NrcObjectBaseData for NrcCreateRequest
 *
 */
@JsonCreator
  public NrcCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseData NrcCreateIn) {
    super(id, "NrcCreate");
    if (NrcCreateIn != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcCreateIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseData that results from the NrcCreateRequest call
 * @return NrcObjectBaseData resulting from udt call
 *
 */

  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
