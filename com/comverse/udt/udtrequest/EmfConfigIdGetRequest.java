/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdGetRequest.java
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
 * Class used to create a EmfConfigIdGetRequest Udt Request
 *
 */

public class EmfConfigIdGetRequest extends EmfConfigIdSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigIdGetRequest
 * @param id Unique request name
 * @param ECIGetIn ECIObjectKeyData for EmfConfigIdGetRequest
 *
 */
@JsonCreator
  public EmfConfigIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigId")ECIObjectKeyData ECIGetIn) {
    super(id, "EmfConfigIdGet");
    if (ECIGetIn != null) {
      addInput("EmfConfigId", ECIObjectKeyHelper.toMap(ECIGetIn, new HashMap(), "ECIObjectKeyData").get("ECIObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ECIObjectData that results from the EmfConfigIdGetRequest call
 * @return ECIObjectData resulting from udt call
 *
 */

  public ECIObjectData getOutput() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
}
