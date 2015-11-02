/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapDeleteRequest.java
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
 * Class used to create a GlobalOpenItemIdMapDeleteRequest Udt Request
 *
 */

public class GlobalOpenItemIdMapDeleteRequest extends GlobalOpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapDeleteRequest
 * @param id Unique request name
 * @param GOIIMDeleteIn GlobalOpenItemIdMapObjectKeyData for GlobalOpenItemIdMapDeleteRequest
 *
 */
@JsonCreator
  public GlobalOpenItemIdMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalOpenItemIdMap")GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn) {
    super(id, "GlobalOpenItemIdMapDelete");
    if (GOIIMDeleteIn != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectKeyHelper.toMap(GOIIMDeleteIn, new HashMap(), "GlobalOpenItemIdMapObjectKeyData").get("GlobalOpenItemIdMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectData that results from the GlobalOpenItemIdMapDeleteRequest call
 * @return GlobalOpenItemIdMapObjectData resulting from udt call
 *
 */

  public GlobalOpenItemIdMapObjectData getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
}
