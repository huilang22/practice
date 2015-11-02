/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractCreateRequest.java
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
 * Class used to create a GlobalContractCreateRequest Udt Request
 *
 */

public class GlobalContractCreateRequest extends GlobalContractSubRequestParent {
/**
 *
 * Constructor to create a  GlobalContractCreateRequest
 * @param id Unique request name
 * @param GlobalContractCreateIn GlobalContractObjectData for GlobalContractCreateRequest
 *
 */
@JsonCreator
  public GlobalContractCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalContract")GlobalContractObjectData GlobalContractCreateIn) {
    super(id, "GlobalContractCreate");
    if (GlobalContractCreateIn != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(GlobalContractCreateIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }

/**
 *
 * Retrieves the GlobalContractObjectData that results from the GlobalContractCreateRequest call
 * @return GlobalContractObjectData resulting from udt call
 *
 */

  public GlobalContractObjectData getOutput() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
}
