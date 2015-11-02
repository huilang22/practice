/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcTypeGroupUpdateRequest Udt Request
 *
 */

public class NrcTypeGroupUpdateRequest extends NrcTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  NrcTypeGroupUpdateRequest
 * @param id Unique request name
 * @param NTGUpdIn NrcTypeGroupObjectData for NrcTypeGroupUpdateRequest
 * @param NTGUpdateFilter NrcTypeGroupObjectFilter for NrcTypeGroupUpdateRequest
 * @param NTGUpdGet NrcTypeGroupObjectData for NrcTypeGroupUpdateRequest
 *
 */
@JsonCreator
  public NrcTypeGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTypeGroup")NrcTypeGroupObjectData NTGUpdIn, @JsonProperty("NTGUpdateFilter")NrcTypeGroupObjectFilter NTGUpdateFilter, @JsonProperty("NTGUpdGet")NrcTypeGroupObjectData NTGUpdGet) {
    super(id, "NrcTypeGroupUpdate");
    if (NTGUpdIn != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(NTGUpdIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
    if (NTGUpdateFilter != null) {
      Integer index =  NTGUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NTGUpdateFilter", NrcTypeGroupObjectHelper.toMap(NTGUpdateFilter, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
    if (NTGUpdGet != null) {
      addInput("NTGUpdGet", NrcTypeGroupObjectHelper.toMap(NTGUpdGet, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }

/**
 *
 * Retrieves the NrcTypeGroupObjectData that results from the NrcTypeGroupUpdateRequest call
 * @return NrcTypeGroupObjectData resulting from udt call
 *
 */

  public NrcTypeGroupObjectData getOutput() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
}
