/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapCancelRequest.java
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
 * Class used to create a OpenItemIdMapCancelRequest Udt Request
 *
 */

public class OpenItemIdMapCancelRequest extends OpenItemIdMapRequest {
/**
 *
 * Constructor to create a  OpenItemIdMapCancelRequest
 * @param id Unique request name
 * @param OIIMCancelIn OpenItemIdMapObjectData for OpenItemIdMapCancelRequest
 *
 */
@JsonCreator
  public OpenItemIdMapCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectData OIIMCancelIn) {
    super(id, "OpenItemIdMapCancel");
    if (OIIMCancelIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMCancelIn, new HashMap(), "Void").get("Void"));
    }
  }

}
