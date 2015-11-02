/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapPriorityUpdateRequest.java
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
 * Class used to create a OpenItemIdMapPriorityUpdateRequest Udt Request
 *
 */

public class OpenItemIdMapPriorityUpdateRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemIdMapPriorityUpdateRequest
 * @param id Unique request name
 * @param OIIMPrioUpdIn OpenItemIdMapObjectData for OpenItemIdMapPriorityUpdateRequest
 *
 */
@JsonCreator
  public OpenItemIdMapPriorityUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectData OIIMPrioUpdIn) {
    super(id, "OpenItemIdMapPriorityUpdate");
    if (OIIMPrioUpdIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMPrioUpdIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the OpenItemIdMapObjectData that results from the OpenItemIdMapPriorityUpdateRequest call
 * @return OpenItemIdMapObjectData resulting from udt call
 *
 */

  public OpenItemIdMapObjectData getOutput() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
}
