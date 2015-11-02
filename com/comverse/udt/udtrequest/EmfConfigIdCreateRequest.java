/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdCreateRequest.java
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
 * Class used to create a EmfConfigIdCreateRequest Udt Request
 *
 */

public class EmfConfigIdCreateRequest extends EmfConfigIdSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigIdCreateRequest
 * @param id Unique request name
 * @param ECICreateIn ECIObjectData for EmfConfigIdCreateRequest
 *
 */
@JsonCreator
  public EmfConfigIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigId")ECIObjectData ECICreateIn) {
    super(id, "EmfConfigIdCreate");
    if (ECICreateIn != null) {
      addInput("EmfConfigId", ECIObjectHelper.toMap(ECICreateIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }

/**
 *
 * Retrieves the ECIObjectData that results from the EmfConfigIdCreateRequest call
 * @return ECIObjectData resulting from udt call
 *
 */

  public ECIObjectData getOutput() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
}
