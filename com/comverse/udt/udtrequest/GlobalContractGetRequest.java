/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractGetRequest.java
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
 * Class used to create a GlobalContractGetRequest Udt Request
 *
 */

public class GlobalContractGetRequest extends GlobalContractSubRequestParent {
/**
 *
 * Constructor to create a  GlobalContractGetRequest
 * @param id Unique request name
 * @param GlobalContractGetIn GlobalContractObjectKeyData for GlobalContractGetRequest
 *
 */
@JsonCreator
  public GlobalContractGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalContract")GlobalContractObjectKeyData GlobalContractGetIn) {
    super(id, "GlobalContractGet");
    if (GlobalContractGetIn != null) {
      addInput("GlobalContract", GlobalContractObjectKeyHelper.toMap(GlobalContractGetIn, new HashMap(), "GlobalContractObjectKeyData").get("GlobalContractObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GlobalContractObjectData that results from the GlobalContractGetRequest call
 * @return GlobalContractObjectData resulting from udt call
 *
 */

  public GlobalContractObjectData getOutput() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
}
