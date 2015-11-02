/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGroupGetRequest.java
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
 * Class used to create a NrcGroupGetRequest Udt Request
 *
 */

public class NrcGroupGetRequest extends NrcGroupSubRequestParent {
/**
 *
 * Constructor to create a  NrcGroupGetRequest
 * @param id Unique request name
 * @param ngGetIn NrcGroupObjectKeyData for NrcGroupGetRequest
 *
 */
@JsonCreator
  public NrcGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcGroup")NrcGroupObjectKeyData ngGetIn) {
    super(id, "NrcGroupGet");
    if (ngGetIn != null) {
      addInput("NrcGroup", NrcGroupObjectKeyHelper.toMap(ngGetIn, new HashMap(), "NrcGroupObjectKeyData").get("NrcGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcGroupObjectData that results from the NrcGroupGetRequest call
 * @return NrcGroupObjectData resulting from udt call
 *
 */

  public NrcGroupObjectData getOutput() {
    return NrcGroupObjectHelper.fromMap(outputMap, "NrcGroup");
  }
}
