/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcDeleteRequest.java
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
 * Class used to create a NrcDeleteRequest Udt Request
 *
 */

public class NrcDeleteRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a  NrcDeleteRequest
 * @param id Unique request name
 * @param NrcDeleteIn NrcObjectBaseKeyData for NrcDeleteRequest
 *
 */
@JsonCreator
  public NrcDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseKeyData NrcDeleteIn) {
    super(id, "NrcDelete");
    if (NrcDeleteIn != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(NrcDeleteIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseData that results from the NrcDeleteRequest call
 * @return NrcObjectBaseData resulting from udt call
 *
 */

  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
