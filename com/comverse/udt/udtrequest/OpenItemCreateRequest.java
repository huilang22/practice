/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemCreateRequest.java
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
 * Class used to create a OpenItemCreateRequest Udt Request
 *
 */

public class OpenItemCreateRequest extends OpenItemSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemCreateRequest
 * @param id Unique request name
 * @param OIICreateIn OpenItemObjectData for OpenItemCreateRequest
 *
 */
@JsonCreator
  public OpenItemCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItem")OpenItemObjectData OIICreateIn) {
    super(id, "OpenItemCreate");
    if (OIICreateIn != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(OIICreateIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }

/**
 *
 * Retrieves the OpenItemObjectData that results from the OpenItemCreateRequest call
 * @return OpenItemObjectData resulting from udt call
 *
 */

  public OpenItemObjectData getOutput() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
}
