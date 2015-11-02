/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapCreateRequest.java
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
 * Class used to create a GlobalOpenItemIdMapCreateRequest Udt Request
 *
 */

public class GlobalOpenItemIdMapCreateRequest extends GlobalOpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapCreateRequest
 * @param id Unique request name
 * @param GOIIMCreateIn GlobalOpenItemIdMapObjectData for GlobalOpenItemIdMapCreateRequest
 *
 */
@JsonCreator
  public GlobalOpenItemIdMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalOpenItemIdMap")GlobalOpenItemIdMapObjectData GOIIMCreateIn) {
    super(id, "GlobalOpenItemIdMapCreate");
    if (GOIIMCreateIn != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(GOIIMCreateIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectData that results from the GlobalOpenItemIdMapCreateRequest call
 * @return GlobalOpenItemIdMapObjectData resulting from udt call
 *
 */

  public GlobalOpenItemIdMapObjectData getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
}
