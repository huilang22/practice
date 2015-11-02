/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapFindRequest.java
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
 * Class used to create a OpenItemIdMapFindRequest Udt Request
 *
 */

public class OpenItemIdMapFindRequest extends OpenItemIdMapRequest {
/**
 *
 * Constructor to create a  OpenItemIdMapFindRequest
 * @param id Unique request name
 * @param OIIMFindIn OpenItemIdMapObjectFilter for OpenItemIdMapFindRequest
 *
 */
@JsonCreator
  public OpenItemIdMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectFilter OIIMFindIn) {
    super(id, "OpenItemIdMapFind");
    if (OIIMFindIn != null) {
      Integer index =  OIIMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMFindIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the OpenItemIdMapObjectDataList that results from the OpenItemIdMapFindRequest call
 * @return OpenItemIdMapObjectDataList resulting from udt call
 *
 */

  public OpenItemIdMapObjectDataList getOutput() {
    return OpenItemIdMapObjectHelper.fromMapList(outputMap, "OpenItemIdMapList");
  }
}
