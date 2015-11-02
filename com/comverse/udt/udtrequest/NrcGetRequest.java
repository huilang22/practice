/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGetRequest.java
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
 * Class used to create a NrcGetRequest Udt Request
 *
 */

public class NrcGetRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a  NrcGetRequest
 * @param id Unique request name
 * @param NrcGetIn NrcObjectBaseKeyData for NrcGetRequest
 *
 */
@JsonCreator
  public NrcGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseKeyData NrcGetIn) {
    super(id, "NrcGet");
    if (NrcGetIn != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(NrcGetIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseData that results from the NrcGetRequest call
 * @return NrcObjectBaseData resulting from udt call
 *
 */

  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
