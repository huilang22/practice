/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdUpdateRequest.java
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
 * Class used to create a EmfConfigIdUpdateRequest Udt Request
 *
 */

public class EmfConfigIdUpdateRequest extends EmfConfigIdSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigIdUpdateRequest
 * @param id Unique request name
 * @param ECIUpdateIn ECIObjectData for EmfConfigIdUpdateRequest
 *
 */
@JsonCreator
  public EmfConfigIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigId")ECIObjectData ECIUpdateIn) {
    super(id, "EmfConfigIdUpdate");
    if (ECIUpdateIn != null) {
      addInput("EmfConfigId", ECIObjectHelper.toMap(ECIUpdateIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }

/**
 *
 * Retrieves the ECIObjectData that results from the EmfConfigIdUpdateRequest call
 * @return ECIObjectData resulting from udt call
 *
 */

  public ECIObjectData getOutput() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
}
