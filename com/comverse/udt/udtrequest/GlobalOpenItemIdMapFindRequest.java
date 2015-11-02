/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapFindRequest.java
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
 * Class used to create a GlobalOpenItemIdMapFindRequest Udt Request
 *
 */

public class GlobalOpenItemIdMapFindRequest extends GlobalOpenItemIdMapRequest {
/**
 *
 * Constructor to create a  GlobalOpenItemIdMapFindRequest
 * @param id Unique request name
 * @param GOIIMFindIn GlobalOpenItemIdMapObjectFilter for GlobalOpenItemIdMapFindRequest
 *
 */
@JsonCreator
  public GlobalOpenItemIdMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalOpenItemIdMap")GlobalOpenItemIdMapObjectFilter GOIIMFindIn) {
    super(id, "GlobalOpenItemIdMapFind");
    if (GOIIMFindIn != null) {
      Integer index =  GOIIMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(GOIIMFindIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectDataList that results from the GlobalOpenItemIdMapFindRequest call
 * @return GlobalOpenItemIdMapObjectDataList resulting from udt call
 *
 */

  public GlobalOpenItemIdMapObjectDataList getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMapList(outputMap, "GlobalOpenItemIdMapList");
  }
}
