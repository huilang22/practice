/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapDeleteRequest.java
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
 * Class used to create a OpenItemIdMapDeleteRequest Udt Request
 *
 */

public class OpenItemIdMapDeleteRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemIdMapDeleteRequest
 * @param id Unique request name
 * @param OIIMDeleteIn OpenItemIdMapObjectKeyData for OpenItemIdMapDeleteRequest
 * @param OIIMDCeaseDate Date for OpenItemIdMapDeleteRequest
 *
 */
@JsonCreator
  public OpenItemIdMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectKeyData OIIMDeleteIn, @JsonProperty("InactiveDate")Date OIIMDCeaseDate) {
    super(id, "OpenItemIdMapDelete");
    if (OIIMDeleteIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectKeyHelper.toMap(OIIMDeleteIn, new HashMap(), "OpenItemIdMapObjectKeyData").get("OpenItemIdMapObjectKeyData"));
    }
    if (OIIMDCeaseDate != null) {
      addInput("InactiveDate", OIIMDCeaseDate);
    }
  }

/**
 *
 * Retrieves the OpenItemIdMapObjectData that results from the OpenItemIdMapDeleteRequest call
 * @return OpenItemIdMapObjectData resulting from udt call
 *
 */

  public OpenItemIdMapObjectData getOutput() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
}
