/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapBestMatchRequest.java
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
 * Class used to create a OpenItemIdMapBestMatchRequest Udt Request
 *
 */

public class OpenItemIdMapBestMatchRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemIdMapBestMatchRequest
 * @param id Unique request name
 * @param OIIMBestIn OpenItemIdMapObjectData for OpenItemIdMapBestMatchRequest
 *
 */
@JsonCreator
  public OpenItemIdMapBestMatchRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectData OIIMBestIn) {
    super(id, "OpenItemIdMapBestMatch");
    if (OIIMBestIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMBestIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the OpenItemIdMapObjectData that results from the OpenItemIdMapBestMatchRequest call
 * @return OpenItemIdMapObjectData resulting from udt call
 *
 */

  public OpenItemIdMapObjectData getOutput() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
}
