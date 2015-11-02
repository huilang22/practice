/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdAcctMapFindRequest.java
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
 * Class used to create a ExternalIdAcctMapFindRequest Udt Request
 *
 */

public class ExternalIdAcctMapFindRequest extends ExternalIdAcctMapRequest {
/**
 *
 * Constructor to create a  ExternalIdAcctMapFindRequest
 * @param id Unique request name
 * @param findIn EIAMObjectFilter for ExternalIdAcctMapFindRequest
 *
 */
@JsonCreator
  public ExternalIdAcctMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdAcctMap")EIAMObjectFilter findIn) {
    super(id, "ExternalIdAcctMapFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdAcctMap", EIAMObjectHelper.toMap(findIn, new HashMap(), "ExternalIdAcctMap").get("ExternalIdAcctMap"));
    }
  }

/**
 *
 * Retrieves the EIAMObjectDataList that results from the ExternalIdAcctMapFindRequest call
 * @return EIAMObjectDataList resulting from udt call
 *
 */

  public EIAMObjectDataList getOutput() {
    return EIAMObjectHelper.fromMapList(outputMap, "ExternalIdAcctMapList");
  }
}
