/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemUpdateRequest.java
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
 * Class used to create a OpenItemUpdateRequest Udt Request
 *
 */

public class OpenItemUpdateRequest extends OpenItemSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemUpdateRequest
 * @param id Unique request name
 * @param OIIUpdateIn OpenItemObjectData for OpenItemUpdateRequest
 *
 */
@JsonCreator
  public OpenItemUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItem")OpenItemObjectData OIIUpdateIn) {
    super(id, "OpenItemUpdate");
    if (OIIUpdateIn != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(OIIUpdateIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }

/**
 *
 * Retrieves the OpenItemObjectData that results from the OpenItemUpdateRequest call
 * @return OpenItemObjectData resulting from udt call
 *
 */

  public OpenItemObjectData getOutput() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
}
