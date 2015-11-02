/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcUpdateRequest.java
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
 * Class used to create a NrcUpdateRequest Udt Request
 *
 */

public class NrcUpdateRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a  NrcUpdateRequest
 * @param id Unique request name
 * @param NrcUpdateIn NrcObjectBaseData for NrcUpdateRequest
 *
 */
@JsonCreator
  public NrcUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseData NrcUpdateIn) {
    super(id, "NrcUpdate");
    if (NrcUpdateIn != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcUpdateIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseData that results from the NrcUpdateRequest call
 * @return NrcObjectBaseData resulting from udt call
 *
 */

  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
