/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapUpdateRequest.java
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
 * Class used to create a OpenItemIdMapUpdateRequest Udt Request
 *
 */

public class OpenItemIdMapUpdateRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemIdMapUpdateRequest
 * @param id Unique request name
 * @param OIIMUpdateIn OpenItemIdMapObjectData for OpenItemIdMapUpdateRequest
 *
 */
@JsonCreator
  public OpenItemIdMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectData OIIMUpdateIn) {
    super(id, "OpenItemIdMapUpdate");
    if (OIIMUpdateIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMUpdateIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the OpenItemIdMapObjectData that results from the OpenItemIdMapUpdateRequest call
 * @return OpenItemIdMapObjectData resulting from udt call
 *
 */

  public OpenItemIdMapObjectData getOutput() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
}
