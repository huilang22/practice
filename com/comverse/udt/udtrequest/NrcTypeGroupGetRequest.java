/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupGetRequest.java
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
 * Class used to create a NrcTypeGroupGetRequest Udt Request
 *
 */

public class NrcTypeGroupGetRequest extends NrcTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  NrcTypeGroupGetRequest
 * @param id Unique request name
 * @param NTGGetIn NrcTypeGroupObjectKeyData for NrcTypeGroupGetRequest
 *
 */
@JsonCreator
  public NrcTypeGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTypeGroup")NrcTypeGroupObjectKeyData NTGGetIn) {
    super(id, "NrcTypeGroupGet");
    if (NTGGetIn != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectKeyHelper.toMap(NTGGetIn, new HashMap(), "NrcTypeGroupObjectKeyData").get("NrcTypeGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcTypeGroupObjectData that results from the NrcTypeGroupGetRequest call
 * @return NrcTypeGroupObjectData resulting from udt call
 *
 */

  public NrcTypeGroupObjectData getOutput() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
}
