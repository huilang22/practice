/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemFindRequest.java
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
 * Class used to create a OpenItemFindRequest Udt Request
 *
 */

public class OpenItemFindRequest extends OpenItemRequest {
/**
 *
 * Constructor to create a  OpenItemFindRequest
 * @param id Unique request name
 * @param OIIFindIn OpenItemObjectFilter for OpenItemFindRequest
 *
 */
@JsonCreator
  public OpenItemFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItem")OpenItemObjectFilter OIIFindIn) {
    super(id, "OpenItemFind");
    if (OIIFindIn != null) {
      Integer index =  OIIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OpenItem", OpenItemObjectHelper.toMap(OIIFindIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }

/**
 *
 * Retrieves the OpenItemObjectDataList that results from the OpenItemFindRequest call
 * @return OpenItemObjectDataList resulting from udt call
 *
 */

  public OpenItemObjectDataList getOutput() {
    return OpenItemObjectHelper.fromMapList(outputMap, "OpenItemList");
  }
}
