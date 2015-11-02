/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapGetRequest.java
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
 * Class used to create a OpenItemIdMapGetRequest Udt Request
 *
 */

public class OpenItemIdMapGetRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemIdMapGetRequest
 * @param id Unique request name
 * @param OIIMGetIn OpenItemIdMapObjectKeyData for OpenItemIdMapGetRequest
 *
 */
@JsonCreator
  public OpenItemIdMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectKeyData OIIMGetIn) {
    super(id, "OpenItemIdMapGet");
    if (OIIMGetIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectKeyHelper.toMap(OIIMGetIn, new HashMap(), "OpenItemIdMapObjectKeyData").get("OpenItemIdMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OpenItemIdMapObjectData that results from the OpenItemIdMapGetRequest call
 * @return OpenItemIdMapObjectData resulting from udt call
 *
 */

  public OpenItemIdMapObjectData getOutput() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
}
