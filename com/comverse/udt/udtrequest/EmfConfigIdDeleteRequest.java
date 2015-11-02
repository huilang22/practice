/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdDeleteRequest.java
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
 * Class used to create a EmfConfigIdDeleteRequest Udt Request
 *
 */

public class EmfConfigIdDeleteRequest extends EmfConfigIdSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigIdDeleteRequest
 * @param id Unique request name
 * @param ECIDeleteIn ECIObjectKeyData for EmfConfigIdDeleteRequest
 *
 */
@JsonCreator
  public EmfConfigIdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigId")ECIObjectKeyData ECIDeleteIn) {
    super(id, "EmfConfigIdDelete");
    if (ECIDeleteIn != null) {
      addInput("EmfConfigId", ECIObjectKeyHelper.toMap(ECIDeleteIn, new HashMap(), "ECIObjectKeyData").get("ECIObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ECIObjectData that results from the EmfConfigIdDeleteRequest call
 * @return ECIObjectData resulting from udt call
 *
 */

  public ECIObjectData getOutput() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
}
