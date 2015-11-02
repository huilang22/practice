/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapCreateRequest.java
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
 * Class used to create a OpenItemIdMapCreateRequest Udt Request
 *
 */

public class OpenItemIdMapCreateRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemIdMapCreateRequest
 * @param id Unique request name
 * @param OIIMCreateIn OpenItemIdMapObjectData for OpenItemIdMapCreateRequest
 *
 */
@JsonCreator
  public OpenItemIdMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectData OIIMCreateIn) {
    super(id, "OpenItemIdMapCreate");
    if (OIIMCreateIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMCreateIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }

/**
 *
 * Retrieves the OpenItemIdMapObjectData that results from the OpenItemIdMapCreateRequest call
 * @return OpenItemIdMapObjectData resulting from udt call
 *
 */

  public OpenItemIdMapObjectData getOutput() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
}
