/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressCreateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a MasterAddressCreateRequest Udt Request
 *
 */

public class MasterAddressCreateRequest extends MasterAddressSubRequestParent {
/**
 *
 * Constructor to create a  MasterAddressCreateRequest
 * @param id Unique request name
 * @param MasterAddressCreateIn MasterAddressObjectData for MasterAddressCreateRequest
 *
 */
@JsonCreator
  public MasterAddressCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MasterAddress")MasterAddressObjectData MasterAddressCreateIn) {
    super(id, "MasterAddressCreate");
    if (MasterAddressCreateIn != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MasterAddressCreateIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }

/**
 *
 * Retrieves the MasterAddressObjectData that results from the MasterAddressCreateRequest call
 * @return MasterAddressObjectData resulting from udt call
 *
 */

  public MasterAddressObjectData getOutput() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
}
