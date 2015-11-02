/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcExtendedDataFindRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcExtendedDataFindRequest Udt Request
 *
 */

public class NrcExtendedDataFindRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcExtendedDataFindRequest
 * @param id Unique request name
 * @param nedfIn NrcObjectBaseKeyData for NrcExtendedDataFindRequest
 *
 */
@JsonCreator
  public NrcExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseKeyData nedfIn) {
    super(id, "NrcExtendedDataFind");
    if (nedfIn != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(nedfIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcEDObjectDataList that results from the NrcExtendedDataFindRequest call
 * @return NrcEDObjectDataList resulting from udt call
 *
 */

  public NrcEDObjectDataList getOutput() {
    return NrcEDObjectHelper.fromMapList(outputMap, "NrcExtendedDataList");
  }
}
