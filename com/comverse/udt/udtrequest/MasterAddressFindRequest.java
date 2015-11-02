/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressFindRequest.java
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
 * Class used to create a MasterAddressFindRequest Udt Request
 *
 */

public class MasterAddressFindRequest extends MasterAddressRequest {
/**
 *
 * Constructor to create a  MasterAddressFindRequest
 * @param id Unique request name
 * @param MasterAddressFindIn MasterAddressObjectFilter for MasterAddressFindRequest
 *
 */
@JsonCreator
  public MasterAddressFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MasterAddress")MasterAddressObjectFilter MasterAddressFindIn) {
    super(id, "MasterAddressFind");
    if (MasterAddressFindIn != null) {
      Integer index =  MasterAddressFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MasterAddressFindIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }

/**
 *
 * Retrieves the MasterAddressObjectDataList that results from the MasterAddressFindRequest call
 * @return MasterAddressObjectDataList resulting from udt call
 *
 */

  public MasterAddressObjectDataList getOutput() {
    return MasterAddressObjectHelper.fromMapList(outputMap, "MasterAddressList");
  }
}
