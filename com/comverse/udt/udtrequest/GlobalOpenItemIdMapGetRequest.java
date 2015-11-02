/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapGetRequest.java
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
 * Class used to create a GlobalOpenItemIdMapGetRequest Udt Request
 *
 */

public class GlobalOpenItemIdMapGetRequest extends GlobalOpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapGetRequest
 * @param id Unique request name
 * @param GOIIMGetIn GlobalOpenItemIdMapObjectKeyData for GlobalOpenItemIdMapGetRequest
 *
 */
@JsonCreator
  public GlobalOpenItemIdMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalOpenItemIdMap")GlobalOpenItemIdMapObjectKeyData GOIIMGetIn) {
    super(id, "GlobalOpenItemIdMapGet");
    if (GOIIMGetIn != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectKeyHelper.toMap(GOIIMGetIn, new HashMap(), "GlobalOpenItemIdMapObjectKeyData").get("GlobalOpenItemIdMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectData that results from the GlobalOpenItemIdMapGetRequest call
 * @return GlobalOpenItemIdMapObjectData resulting from udt call
 *
 */

  public GlobalOpenItemIdMapObjectData getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
}
