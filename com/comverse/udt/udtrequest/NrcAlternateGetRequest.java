/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcAlternateGetRequest.java
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
 * Class used to create a NrcAlternateGetRequest Udt Request
 *
 */

public class NrcAlternateGetRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a  NrcAlternateGetRequest
 * @param id Unique request name
 * @param NrcAlternateGetIn NrcObjectBaseData for NrcAlternateGetRequest
 *
 */
@JsonCreator
  public NrcAlternateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseData NrcAlternateGetIn) {
    super(id, "NrcAlternateGet");
    if (NrcAlternateGetIn != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcAlternateGetIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseData that results from the NrcAlternateGetRequest call
 * @return NrcObjectBaseData resulting from udt call
 *
 */

  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
