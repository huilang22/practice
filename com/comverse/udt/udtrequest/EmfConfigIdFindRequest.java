/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdFindRequest.java
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
 * Class used to create a EmfConfigIdFindRequest Udt Request
 *
 */

public class EmfConfigIdFindRequest extends EmfConfigIdRequest {
/**
 *
 * Constructor to create a  EmfConfigIdFindRequest
 * @param id Unique request name
 * @param ECIFindIn ECIObjectFilter for EmfConfigIdFindRequest
 *
 */
@JsonCreator
  public EmfConfigIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigId")ECIObjectFilter ECIFindIn) {
    super(id, "EmfConfigIdFind");
    if (ECIFindIn != null) {
      Integer index =  ECIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EmfConfigId", ECIObjectHelper.toMap(ECIFindIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }

/**
 *
 * Retrieves the ECIObjectDataList that results from the EmfConfigIdFindRequest call
 * @return ECIObjectDataList resulting from udt call
 *
 */

  public ECIObjectDataList getOutput() {
    return ECIObjectHelper.fromMapList(outputMap, "EmfConfigIdList");
  }
}
