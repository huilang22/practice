/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapUpdateRequest.java
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
 * Class used to create a GlobalOpenItemIdMapUpdateRequest Udt Request
 *
 */

public class GlobalOpenItemIdMapUpdateRequest extends GlobalOpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapUpdateRequest
 * @param id Unique request name
 * @param GOIIMUpdateIn GlobalOpenItemIdMapObjectData for GlobalOpenItemIdMapUpdateRequest
 *
 */
@JsonCreator
  public GlobalOpenItemIdMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalOpenItemIdMap")GlobalOpenItemIdMapObjectData GOIIMUpdateIn) {
    super(id, "GlobalOpenItemIdMapUpdate");
    if (GOIIMUpdateIn != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(GOIIMUpdateIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectData that results from the GlobalOpenItemIdMapUpdateRequest call
 * @return GlobalOpenItemIdMapObjectData resulting from udt call
 *
 */

  public GlobalOpenItemIdMapObjectData getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
}
