/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsUpdateRequest.java
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
 * Class used to create a HqGroupContractsUpdateRequest Udt Request
 *
 */

public class HqGroupContractsUpdateRequest extends HqGroupContractsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupContractsUpdateRequest
 * @param id Unique request name
 * @param HqGroupContractsupdate_In HqGroupContractsObjectData for HqGroupContractsUpdateRequest
 *
 */
@JsonCreator
  public HqGroupContractsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupContracts")HqGroupContractsObjectData HqGroupContractsupdate_In) {
    super(id, "HqGroupContractsUpdate");
    if (HqGroupContractsupdate_In != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HqGroupContractsupdate_In, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }

/**
 *
 * Retrieves the HqGroupContractsObjectData that results from the HqGroupContractsUpdateRequest call
 * @return HqGroupContractsObjectData resulting from udt call
 *
 */

  public HqGroupContractsObjectData getOutput() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
}
