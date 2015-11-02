/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GlobalContractUpdateRequest Udt Request
 *
 */

public class GlobalContractUpdateRequest extends GlobalContractSubRequestParent {
/**
 *
 * Constructor to create a  GlobalContractUpdateRequest
 * @param id Unique request name
 * @param GlobalContractUpdateIn GlobalContractObjectData for GlobalContractUpdateRequest
 *
 */
@JsonCreator
  public GlobalContractUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalContract")GlobalContractObjectData GlobalContractUpdateIn) {
    super(id, "GlobalContractUpdate");
    if (GlobalContractUpdateIn != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(GlobalContractUpdateIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }

/**
 *
 * Retrieves the GlobalContractObjectData that results from the GlobalContractUpdateRequest call
 * @return GlobalContractObjectData resulting from udt call
 *
 */

  public GlobalContractObjectData getOutput() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
}
